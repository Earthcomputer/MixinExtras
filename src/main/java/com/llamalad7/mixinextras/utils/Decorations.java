package com.llamalad7.mixinextras.utils;

import com.llamalad7.mixinextras.expression.Expression;
import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;

public class Decorations {
    /**
     * "Persistent" decorations will be copied to handler method calls which targeted the original instruction.
     * This should be used as a prefix to an existing decoration key.
     */
    public static final String PERSISTENT = "mixinextras_persistent_";
    /**
     * Stores that a non-void operation has its result immediately popped and so can be treated as void by someone
     * using {@link WrapWithCondition} on it.
     */
    public static final String POPPED_OPERATION = "mixinextras_operationIsImmediatelyPopped";
    /**
     * Stores a map of LVT index of target local -&gt; LVT index of applicable {@link LocalRef}.
     * References should be shared by injectors that wrap/replace the same target instruction.
     */
    public static final String LOCAL_REF_MAP = "mixinextras_localRefMap";
    /**
     * Stores that a NEW instruction is immediately DUPed so that {@link WrapOperation} can handle it properly.
     */
    public static final String NEW_IS_DUPED = "mixinextras_newIsDuped";
    /**
     * Stores the types that a NEW's &lt;init&gt; takes as its parameters.
     */
    public static final String NEW_ARG_TYPES = "mixinextras_newArgTypes";

    /**
     * Stores that this node has been wrapped by a {@link WrapOperation}.
     */
    public static final String WRAPPED = "mixinextras_wrappedOperation";

    /**
     * Stores the type of a simple expression targeted by an {@link Expression}.
     */
    public static final String SIMPLE_EXPRESSION_TYPE = "mixinextras_simpleExpressionType";

    /**
     * Stores injector-specific information about modified comparisons.
     */
    public static final String COMPARISON_INFO = "mixinextras_comparisonInfo";

    /**
     * Stores whether this comparison wrapper returning true means the jump will go ahead.
     */
    public static final String JUMPS_ON_TRUE = "mixinextras_jumpsOnTrue";

    /**
     * Stores the outermost wrapping InjectionInfo for this node.
     */
    public static final String OUTERMOST_WRAPPER = "mixinextras_outermostWrapper";
}
