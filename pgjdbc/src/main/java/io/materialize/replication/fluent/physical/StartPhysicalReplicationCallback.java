/*
 * Copyright (c) 2016, PostgreSQL Global Development Group
 * See the LICENSE file in the project root for more information.
 */

package io.materialize.replication.fluent.physical;

import io.materialize.replication.PGReplicationStream;

import java.sql.SQLException;

public interface StartPhysicalReplicationCallback {
  PGReplicationStream start(PhysicalReplicationOptions options) throws SQLException;
}
