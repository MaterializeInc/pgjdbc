/*
 * Copyright (c) 2016, PostgreSQL Global Development Group
 * See the LICENSE file in the project root for more information.
 */

package org.materialize.replication.fluent.logical;

import org.materialize.replication.PGReplicationStream;

import java.sql.SQLException;

public interface StartLogicalReplicationCallback {
  PGReplicationStream start(LogicalReplicationOptions options) throws SQLException;
}
