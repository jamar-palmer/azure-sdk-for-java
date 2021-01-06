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

/** timeZoneBase. */
@Fluent
public final class MicrosoftGraphTimeZoneBase {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphTimeZoneBase.class);

    /*
     * The name of a time zone. It can be a standard time zone name such as
     * 'Hawaii-Aleutian Standard Time', or 'Customized Time Zone' for a custom
     * time zone.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * timeZoneBase
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the name property: The name of a time zone. It can be a standard time zone name such as 'Hawaii-Aleutian
     * Standard Time', or 'Customized Time Zone' for a custom time zone.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of a time zone. It can be a standard time zone name such as 'Hawaii-Aleutian
     * Standard Time', or 'Customized Time Zone' for a custom time zone.
     *
     * @param name the name value to set.
     * @return the MicrosoftGraphTimeZoneBase object itself.
     */
    public MicrosoftGraphTimeZoneBase withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the additionalProperties property: timeZoneBase.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: timeZoneBase.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphTimeZoneBase object itself.
     */
    public MicrosoftGraphTimeZoneBase withAdditionalProperties(Map<String, Object> additionalProperties) {
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