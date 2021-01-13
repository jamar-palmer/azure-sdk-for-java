/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for FirewallPolicyRuleApplicationProtocolType.
 */
public final class FirewallPolicyRuleApplicationProtocolType extends ExpandableStringEnum<FirewallPolicyRuleApplicationProtocolType> {
    /** Static value Http for FirewallPolicyRuleApplicationProtocolType. */
    public static final FirewallPolicyRuleApplicationProtocolType HTTP = fromString("Http");

    /** Static value Https for FirewallPolicyRuleApplicationProtocolType. */
    public static final FirewallPolicyRuleApplicationProtocolType HTTPS = fromString("Https");

    /**
     * Creates or finds a FirewallPolicyRuleApplicationProtocolType from its string representation.
     * @param name a name to look for
     * @return the corresponding FirewallPolicyRuleApplicationProtocolType
     */
    @JsonCreator
    public static FirewallPolicyRuleApplicationProtocolType fromString(String name) {
        return fromString(name, FirewallPolicyRuleApplicationProtocolType.class);
    }

    /**
     * @return known FirewallPolicyRuleApplicationProtocolType values
     */
    public static Collection<FirewallPolicyRuleApplicationProtocolType> values() {
        return values(FirewallPolicyRuleApplicationProtocolType.class);
    }
}