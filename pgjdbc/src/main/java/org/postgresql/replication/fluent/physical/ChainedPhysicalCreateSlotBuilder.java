/*
 * Copyright (c) 2016, PostgreSQL Global Development Group
 * See the LICENSE file in the project root for more information.
 */

package org.materialize.replication.fluent.physical;

import org.materialize.replication.fluent.ChainedCommonCreateSlotBuilder;

/**
 * Physical replication slot specific parameters.
 */
public interface ChainedPhysicalCreateSlotBuilder extends
    ChainedCommonCreateSlotBuilder<ChainedPhysicalCreateSlotBuilder> {
}
