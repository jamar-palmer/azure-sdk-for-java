/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Rule of type application.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ruleType", defaultImpl = ApplicationRule.class)
@JsonTypeName("ApplicationRule")
public class ApplicationRule extends FirewallPolicyRule {
    /**
     * List of source IP addresses for this rule.
     */
    @JsonProperty(value = "sourceAddresses")
    private List<String> sourceAddresses;

    /**
     * List of destination IP addresses or Service Tags.
     */
    @JsonProperty(value = "destinationAddresses")
    private List<String> destinationAddresses;

    /**
     * Array of Application Protocols.
     */
    @JsonProperty(value = "protocols")
    private List<FirewallPolicyRuleApplicationProtocol> protocols;

    /**
     * List of FQDNs for this rule.
     */
    @JsonProperty(value = "targetFqdns")
    private List<String> targetFqdns;

    /**
     * List of Urls for this rule condition.
     */
    @JsonProperty(value = "targetUrls")
    private List<String> targetUrls;

    /**
     * List of FQDN Tags for this rule.
     */
    @JsonProperty(value = "fqdnTags")
    private List<String> fqdnTags;

    /**
     * List of source IpGroups for this rule.
     */
    @JsonProperty(value = "sourceIpGroups")
    private List<String> sourceIpGroups;

    /**
     * Terminate TLS connections for this rule.
     */
    @JsonProperty(value = "terminateTLS")
    private Boolean terminateTLS;

    /**
     * List of destination azure web categories.
     */
    @JsonProperty(value = "webCategories")
    private List<String> webCategories;

    /**
     * Get list of source IP addresses for this rule.
     *
     * @return the sourceAddresses value
     */
    public List<String> sourceAddresses() {
        return this.sourceAddresses;
    }

    /**
     * Set list of source IP addresses for this rule.
     *
     * @param sourceAddresses the sourceAddresses value to set
     * @return the ApplicationRule object itself.
     */
    public ApplicationRule withSourceAddresses(List<String> sourceAddresses) {
        this.sourceAddresses = sourceAddresses;
        return this;
    }

    /**
     * Get list of destination IP addresses or Service Tags.
     *
     * @return the destinationAddresses value
     */
    public List<String> destinationAddresses() {
        return this.destinationAddresses;
    }

    /**
     * Set list of destination IP addresses or Service Tags.
     *
     * @param destinationAddresses the destinationAddresses value to set
     * @return the ApplicationRule object itself.
     */
    public ApplicationRule withDestinationAddresses(List<String> destinationAddresses) {
        this.destinationAddresses = destinationAddresses;
        return this;
    }

    /**
     * Get array of Application Protocols.
     *
     * @return the protocols value
     */
    public List<FirewallPolicyRuleApplicationProtocol> protocols() {
        return this.protocols;
    }

    /**
     * Set array of Application Protocols.
     *
     * @param protocols the protocols value to set
     * @return the ApplicationRule object itself.
     */
    public ApplicationRule withProtocols(List<FirewallPolicyRuleApplicationProtocol> protocols) {
        this.protocols = protocols;
        return this;
    }

    /**
     * Get list of FQDNs for this rule.
     *
     * @return the targetFqdns value
     */
    public List<String> targetFqdns() {
        return this.targetFqdns;
    }

    /**
     * Set list of FQDNs for this rule.
     *
     * @param targetFqdns the targetFqdns value to set
     * @return the ApplicationRule object itself.
     */
    public ApplicationRule withTargetFqdns(List<String> targetFqdns) {
        this.targetFqdns = targetFqdns;
        return this;
    }

    /**
     * Get list of Urls for this rule condition.
     *
     * @return the targetUrls value
     */
    public List<String> targetUrls() {
        return this.targetUrls;
    }

    /**
     * Set list of Urls for this rule condition.
     *
     * @param targetUrls the targetUrls value to set
     * @return the ApplicationRule object itself.
     */
    public ApplicationRule withTargetUrls(List<String> targetUrls) {
        this.targetUrls = targetUrls;
        return this;
    }

    /**
     * Get list of FQDN Tags for this rule.
     *
     * @return the fqdnTags value
     */
    public List<String> fqdnTags() {
        return this.fqdnTags;
    }

    /**
     * Set list of FQDN Tags for this rule.
     *
     * @param fqdnTags the fqdnTags value to set
     * @return the ApplicationRule object itself.
     */
    public ApplicationRule withFqdnTags(List<String> fqdnTags) {
        this.fqdnTags = fqdnTags;
        return this;
    }

    /**
     * Get list of source IpGroups for this rule.
     *
     * @return the sourceIpGroups value
     */
    public List<String> sourceIpGroups() {
        return this.sourceIpGroups;
    }

    /**
     * Set list of source IpGroups for this rule.
     *
     * @param sourceIpGroups the sourceIpGroups value to set
     * @return the ApplicationRule object itself.
     */
    public ApplicationRule withSourceIpGroups(List<String> sourceIpGroups) {
        this.sourceIpGroups = sourceIpGroups;
        return this;
    }

    /**
     * Get terminate TLS connections for this rule.
     *
     * @return the terminateTLS value
     */
    public Boolean terminateTLS() {
        return this.terminateTLS;
    }

    /**
     * Set terminate TLS connections for this rule.
     *
     * @param terminateTLS the terminateTLS value to set
     * @return the ApplicationRule object itself.
     */
    public ApplicationRule withTerminateTLS(Boolean terminateTLS) {
        this.terminateTLS = terminateTLS;
        return this;
    }

    /**
     * Get list of destination azure web categories.
     *
     * @return the webCategories value
     */
    public List<String> webCategories() {
        return this.webCategories;
    }

    /**
     * Set list of destination azure web categories.
     *
     * @param webCategories the webCategories value to set
     * @return the ApplicationRule object itself.
     */
    public ApplicationRule withWebCategories(List<String> webCategories) {
        this.webCategories = webCategories;
        return this;
    }

}