/*
 * Copyright (c) 2016, PostgreSQL Global Development Group
 * See the LICENSE file in the project root for more information.
 */

package io.materialize.jdbc;

import io.materialize.core.Field;
import io.materialize.core.ParameterList;
import io.materialize.core.Query;
import io.materialize.core.ResultCursor;

import java.util.List;

class CallableBatchResultHandler extends BatchResultHandler {
  CallableBatchResultHandler(PgStatement statement, Query[] queries, ParameterList[] parameterLists) {
    super(statement, queries, parameterLists, false);
  }

  public void handleResultRows(Query fromQuery, Field[] fields, List<byte[][]> tuples, ResultCursor cursor) {
    /* ignore */
  }
}
