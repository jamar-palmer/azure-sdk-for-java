/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cdn.v2020_09_01.implementation.CdnManager;
import com.microsoft.azure.management.cdn.v2020_09_01.implementation.ManagedRuleSetDefinitionInner;
import java.util.List;

/**
 * Type representing ManagedRuleSetDefinition.
 */
public interface ManagedRuleSetDefinition extends HasInner<ManagedRuleSetDefinitionInner>, HasManager<CdnManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the ruleGroups value.
     */
    List<ManagedRuleGroupDefinition> ruleGroups();

    /**
     * @return the ruleSetType value.
     */
    String ruleSetType();

    /**
     * @return the ruleSetVersion value.
     */
    String ruleSetVersion();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the type value.
     */
    String type();

}