/*
 * Copyright (c) 2014, PostgreSQL Global Development Group
 * See the LICENSE file in the project root for more information.
 */

package io.materialize.hostchooser;

/**
 * Known state of a server.
 */
public enum HostStatus {
  ConnectFail,
  ConnectOK,
  Master,
  Secondary
}
