/*
 * Copyright (c) 2004, PostgreSQL Global Development Group
 * See the LICENSE file in the project root for more information.
 */

package org.materialize.test.jdbc2;

import org.materialize.core.CommandCompleteParserNegativeTest;
import org.materialize.core.CommandCompleteParserTest;
import org.materialize.core.OidToStringTest;
import org.materialize.core.OidValueOfTest;
import org.materialize.core.ParserTest;
import org.materialize.core.ReturningParserTest;
import org.materialize.core.v3.V3ParameterListTests;
import org.materialize.jdbc.DeepBatchedInsertStatementTest;
import org.materialize.jdbc.PrimitiveArraySupportTest;
import org.materialize.test.core.JavaVersionTest;
import org.materialize.test.core.NativeQueryBindLengthTest;
import org.materialize.test.core.OptionsPropertyTest;
import org.materialize.test.util.ExpressionPropertiesTest;
import org.materialize.test.util.HostSpecTest;
import org.materialize.test.util.LruCacheTest;
import org.materialize.test.util.ServerVersionParseTest;
import org.materialize.test.util.ServerVersionTest;
import org.materialize.util.ReaderInputStreamTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/*
 * Executes all known tests for JDBC2 and includes some utility methods.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    ANTTest.class,
    ArrayTest.class,
    BatchedInsertReWriteEnabledTest.class,
    BatchExecuteTest.class,
    BatchFailureTest.class,
    BlobTest.class,
    BlobTransactionTest.class,
    CallableStmtTest.class,
    ClientEncodingTest.class,
    ColumnSanitiserDisabledTest.class,
    ColumnSanitiserEnabledTest.class,
    CommandCompleteParserNegativeTest.class,
    CommandCompleteParserTest.class,
    ConcurrentStatementFetch.class,
    ConnectionTest.class,
    ConnectTimeoutTest.class,
    CopyLargeFileTest.class,
    CopyTest.class,
    CursorFetchTest.class,
    DatabaseEncodingTest.class,
    DatabaseMetaDataPropertiesTest.class,
    DatabaseMetaDataTest.class,
    DateStyleTest.class,
    DateTest.class,
    DeepBatchedInsertStatementTest.class,
    DriverTest.class,
    EncodingTest.class,
    ExpressionPropertiesTest.class,
    GeometricTest.class,
    GetXXXTest.class,
    HostSpecTest.class,
    IntervalTest.class,
    JavaVersionTest.class,
    JBuilderTest.class,
    LoginTimeoutTest.class,
    LruCacheTest.class,
    MiscTest.class,
    NativeQueryBindLengthTest.class,
    NotifyTest.class,
    OidToStringTest.class,
    OidValueOfTest.class,
    OptionsPropertyTest.class,
    OuterJoinSyntaxTest.class,
    ParameterStatusTest.class,
    ParserTest.class,
    PGPropertyTest.class,
    PGTimestampTest.class,
    PGTimeTest.class,
    PreparedStatementTest.class,
    PrimitiveArraySupportTest.class,
    QuotationTest.class,
    ReaderInputStreamTest.class,
    RefCursorTest.class,
    ReplaceProcessingTest.class,
    ResultSetMetaDataTest.class,
    ResultSetTest.class,
    ReturningParserTest.class,
    SearchPathLookupTest.class,
    ServerCursorTest.class,
    ServerErrorTest.class,
    ServerPreparedStmtTest.class,
    ServerVersionParseTest.class,
    ServerVersionTest.class,
    StatementTest.class,
    StringTypeUnspecifiedArrayTest.class,
    TestACL.class,
    TimestampTest.class,
    TimeTest.class,
    TimezoneCachingTest.class,
    TimezoneTest.class,
    TypeCacheDLLStressTest.class,
    UpdateableResultTest.class,
    UpsertTest.class,
    V3ParameterListTests.class,
})
public class Jdbc2TestSuite {
}
