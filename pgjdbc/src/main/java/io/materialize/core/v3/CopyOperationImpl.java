/*
 * Copyright (c) 2009, PostgreSQL Global Development Group
 * See the LICENSE file in the project root for more information.
 */

package io.materialize.core.v3;

import io.materialize.copy.CopyOperation;
import io.materialize.util.GT;
import io.materialize.util.PSQLException;
import io.materialize.util.PSQLState;

import java.sql.SQLException;

public abstract class CopyOperationImpl implements CopyOperation {
  QueryExecutorImpl queryExecutor;
  int rowFormat;
  int[] fieldFormats;
  long handledRowCount = -1;

  void init(QueryExecutorImpl q, int fmt, int[] fmts) {
    queryExecutor = q;
    rowFormat = fmt;
    fieldFormats = fmts;
  }

  public void cancelCopy() throws SQLException {
    queryExecutor.cancelCopy(this);
  }

  public int getFieldCount() {
    return fieldFormats.length;
  }

  public int getFieldFormat(int field) {
    return fieldFormats[field];
  }

  public int getFormat() {
    return rowFormat;
  }

  public boolean isActive() {
    synchronized (queryExecutor) {
      return queryExecutor.hasLock(this);
    }
  }

  public void handleCommandStatus(String status) throws PSQLException {
    if (status.startsWith("COPY")) {
      int i = status.lastIndexOf(' ');
      handledRowCount = i > 3 ? Long.parseLong(status.substring(i + 1)) : -1;
    } else {
      throw new PSQLException(GT.tr("CommandComplete expected COPY but got: " + status),
          PSQLState.COMMUNICATION_ERROR);
    }
  }

  /**
   * Consume received copy data.
   *
   * @param data data that was receive by copy protocol
   * @throws PSQLException if some internal problem occurs
   */
  protected abstract void handleCopydata(byte[] data) throws PSQLException;

  public long getHandledRowCount() {
    return handledRowCount;
  }
}
