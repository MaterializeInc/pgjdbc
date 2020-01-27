/*
 * Copyright (c) 2016, PostgreSQL Global Development Group
 * See the LICENSE file in the project root for more information.
 */

package io.materialize.replication.fluent;

import io.materialize.core.BaseConnection;
import io.materialize.core.ReplicationProtocol;
import io.materialize.replication.PGReplicationStream;
import io.materialize.replication.fluent.logical.ChainedLogicalStreamBuilder;
import io.materialize.replication.fluent.logical.LogicalReplicationOptions;
import io.materialize.replication.fluent.logical.LogicalStreamBuilder;
import io.materialize.replication.fluent.logical.StartLogicalReplicationCallback;
import io.materialize.replication.fluent.physical.ChainedPhysicalStreamBuilder;
import io.materialize.replication.fluent.physical.PhysicalReplicationOptions;
import io.materialize.replication.fluent.physical.PhysicalStreamBuilder;
import io.materialize.replication.fluent.physical.StartPhysicalReplicationCallback;

import java.sql.SQLException;

public class ReplicationStreamBuilder implements ChainedStreamBuilder {
  private final BaseConnection baseConnection;

  /**
   * @param connection not null connection with that will be associate replication
   */
  public ReplicationStreamBuilder(final BaseConnection connection) {
    this.baseConnection = connection;
  }

  @Override
  public ChainedLogicalStreamBuilder logical() {
    return new LogicalStreamBuilder(new StartLogicalReplicationCallback() {
      @Override
      public PGReplicationStream start(LogicalReplicationOptions options) throws SQLException {
        ReplicationProtocol protocol = baseConnection.getReplicationProtocol();
        return protocol.startLogical(options);
      }
    });
  }

  @Override
  public ChainedPhysicalStreamBuilder physical() {
    return new PhysicalStreamBuilder(new StartPhysicalReplicationCallback() {
      @Override
      public PGReplicationStream start(PhysicalReplicationOptions options) throws SQLException {
        ReplicationProtocol protocol = baseConnection.getReplicationProtocol();
        return protocol.startPhysical(options);
      }
    });
  }
}
