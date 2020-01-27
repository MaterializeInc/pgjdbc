/*
 * Copyright (c) 2016, PostgreSQL Global Development Group
 * See the LICENSE file in the project root for more information.
 */

package io.materialize.replication.fluent.physical;

import io.materialize.core.BaseConnection;
import io.materialize.replication.LogSequenceNumber;
import io.materialize.replication.ReplicationSlotInfo;
import io.materialize.replication.ReplicationType;
import io.materialize.replication.fluent.AbstractCreateSlotBuilder;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PhysicalCreateSlotBuilder
    extends AbstractCreateSlotBuilder<ChainedPhysicalCreateSlotBuilder>
    implements ChainedPhysicalCreateSlotBuilder {

  public PhysicalCreateSlotBuilder(BaseConnection connection) {
    super(connection);
  }

  @Override
  protected ChainedPhysicalCreateSlotBuilder self() {
    return this;
  }

  @Override
  public ReplicationSlotInfo make() throws SQLException {
    if (slotName == null || slotName.isEmpty()) {
      throw new IllegalArgumentException("Replication slotName can't be null");
    }

    Statement statement = connection.createStatement();
    ResultSet result = null;
    ReplicationSlotInfo slotInfo = null;
    try {
      statement.execute(String.format(
          "CREATE_REPLICATION_SLOT %s %s PHYSICAL",
          slotName,
          temporaryOption ? "TEMPORARY" : ""
      ));
      result = statement.getResultSet();
      if (result != null && result.next()) {
        slotInfo = new ReplicationSlotInfo(
            result.getString("slot_name"),
            ReplicationType.PHYSICAL,
            LogSequenceNumber.valueOf(result.getString("consistent_point")),
            result.getString("snapshot_name"),
            result.getString("output_plugin"));
      }
    } finally {
      if (result != null) {
        result.close();
      }
      statement.close();
    }
    return slotInfo;
  }
}
