/*
 * Copyright (c) 2018, PostgreSQL Global Development Group
 * See the LICENSE file in the project root for more information.
 */

package io.materialize.util;

public interface Gettable<K,V> {
  V get(K key);
}
