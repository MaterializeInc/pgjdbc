/*
 * Copyright (c) 2016, PostgreSQL Global Development Group
 * See the LICENSE file in the project root for more information.
 */

package org.materialize.replication.fluent;

import org.materialize.core.BaseConnection;
import org.materialize.replication.fluent.logical.ChainedLogicalCreateSlotBuilder;
import org.materialize.replication.fluent.logical.LogicalCreateSlotBuilder;
import org.materialize.replication.fluent.physical.ChainedPhysicalCreateSlotBuilder;
import org.materialize.replication.fluent.physical.PhysicalCreateSlotBuilder;

public class ReplicationCreateSlotBuilder implements ChainedCreateReplicationSlotBuilder {
  private final BaseConnection baseConnection;

  public ReplicationCreateSlotBuilder(BaseConnection baseConnection) {
    this.baseConnection = baseConnection;
  }

  @Override
  public ChainedLogicalCreateSlotBuilder logical() {
    return new LogicalCreateSlotBuilder(baseConnection);
  }

  @Override
  public ChainedPhysicalCreateSlotBuilder physical() {
    return new PhysicalCreateSlotBuilder(baseConnection);
  }
}
