/*
 * Copyright (c) 2016, PostgreSQL Global Development Group
 * See the LICENSE file in the project root for more information.
 */

package org.materialize.replication;

import org.materialize.core.BaseConnection;
import org.materialize.replication.fluent.ChainedCreateReplicationSlotBuilder;
import org.materialize.replication.fluent.ChainedStreamBuilder;
import org.materialize.replication.fluent.ReplicationCreateSlotBuilder;
import org.materialize.replication.fluent.ReplicationStreamBuilder;

import java.sql.SQLException;
import java.sql.Statement;

public class PGReplicationConnectionImpl implements PGReplicationConnection {
  private BaseConnection connection;

  public PGReplicationConnectionImpl(BaseConnection connection) {
    this.connection = connection;
  }

  @Override
  public ChainedStreamBuilder replicationStream() {
    return new ReplicationStreamBuilder(connection);
  }

  @Override
  public ChainedCreateReplicationSlotBuilder createReplicationSlot() {
    return new ReplicationCreateSlotBuilder(connection);
  }

  @Override
  public void dropReplicationSlot(String slotName) throws SQLException {
    if (slotName == null || slotName.isEmpty()) {
      throw new IllegalArgumentException("Replication slot name can't be null or empty");
    }

    Statement statement = connection.createStatement();
    try {
      statement.execute("DROP_REPLICATION_SLOT " + slotName);
    } finally {
      statement.close();
    }
  }
}
