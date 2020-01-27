/*
 * Copyright (c) 2016, PostgreSQL Global Development Group
 * See the LICENSE file in the project root for more information.
 */

package io.materialize.replication.fluent.physical;

import io.materialize.replication.LogSequenceNumber;
import io.materialize.replication.PGReplicationStream;
import io.materialize.replication.fluent.AbstractStreamBuilder;

import java.sql.SQLException;

public class PhysicalStreamBuilder extends AbstractStreamBuilder<ChainedPhysicalStreamBuilder>
    implements ChainedPhysicalStreamBuilder, PhysicalReplicationOptions {

  private final StartPhysicalReplicationCallback startCallback;

  /**
   * @param startCallback not null callback that should be execute after build parameters for start
   *                      replication
   */
  public PhysicalStreamBuilder(StartPhysicalReplicationCallback startCallback) {
    this.startCallback = startCallback;
  }

  @Override
  protected ChainedPhysicalStreamBuilder self() {
    return this;
  }

  @Override
  public PGReplicationStream start() throws SQLException {
    return this.startCallback.start(this);
  }

  @Override
  public String getSlotName() {
    return slotName;
  }

  @Override
  public LogSequenceNumber getStartLSNPosition() {
    return startPosition;
  }

  @Override
  public int getStatusInterval() {
    return statusIntervalMs;
  }
}
