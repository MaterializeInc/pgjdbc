/*
 * Copyright (c) 2007, PostgreSQL Global Development Group
 * See the LICENSE file in the project root for more information.
 */

package io.materialize.test.extensions;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/*
 * Executes all known tests for PostgreSQL extensions supported by JDBC driver
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(HStoreTest.class)
public class ExtensionsTestSuite {
}

