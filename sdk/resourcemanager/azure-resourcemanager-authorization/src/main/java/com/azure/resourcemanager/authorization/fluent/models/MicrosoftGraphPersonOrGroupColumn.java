// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** personOrGroupColumn. */
@Fluent
public final class MicrosoftGraphPersonOrGroupColumn {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphPersonOrGroupColumn.class);

    /*
     * Indicates whether multiple values can be selected from the source.
     */
    @JsonProperty(value = "allowMultipleSelection")
    private Boolean allowMultipleSelection;

    /*
     * Whether to allow selection of people only, or people and groups. Must be
     * one of peopleAndGroups or peopleOnly.
     */
    @JsonProperty(value = "chooseFromType")
    private String chooseFromType;

    /*
     * How to display the information about the person or group chosen. See
     * below.
     */
    @JsonProperty(value = "displayAs")
    private String displayAs;

    /*
     * personOrGroupColumn
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the allowMultipleSelection property: Indicates whether multiple values can be selected from the source.
     *
     * @return the allowMultipleSelection value.
     */
    public Boolean allowMultipleSelection() {
        return this.allowMultipleSelection;
    }

    /**
     * Set the allowMultipleSelection property: Indicates whether multiple values can be selected from the source.
     *
     * @param allowMultipleSelection the allowMultipleSelection value to set.
     * @return the MicrosoftGraphPersonOrGroupColumn object itself.
     */
    public MicrosoftGraphPersonOrGroupColumn withAllowMultipleSelection(Boolean allowMultipleSelection) {
        this.allowMultipleSelection = allowMultipleSelection;
        return this;
    }

    /**
     * Get the chooseFromType property: Whether to allow selection of people only, or people and groups. Must be one of
     * peopleAndGroups or peopleOnly.
     *
     * @return the chooseFromType value.
     */
    public String chooseFromType() {
        return this.chooseFromType;
    }

    /**
     * Set the chooseFromType property: Whether to allow selection of people only, or people and groups. Must be one of
     * peopleAndGroups or peopleOnly.
     *
     * @param chooseFromType the chooseFromType value to set.
     * @return the MicrosoftGraphPersonOrGroupColumn object itself.
     */
    public MicrosoftGraphPersonOrGroupColumn withChooseFromType(String chooseFromType) {
        this.chooseFromType = chooseFromType;
        return this;
    }

    /**
     * Get the displayAs property: How to display the information about the person or group chosen. See below.
     *
     * @return the displayAs value.
     */
    public String displayAs() {
        return this.displayAs;
    }

    /**
     * Set the displayAs property: How to display the information about the person or group chosen. See below.
     *
     * @param displayAs the displayAs value to set.
     * @return the MicrosoftGraphPersonOrGroupColumn object itself.
     */
    public MicrosoftGraphPersonOrGroupColumn withDisplayAs(String displayAs) {
        this.displayAs = displayAs;
        return this;
    }

    /**
     * Get the additionalProperties property: personOrGroupColumn.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: personOrGroupColumn.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphPersonOrGroupColumn object itself.
     */
    public MicrosoftGraphPersonOrGroupColumn withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}