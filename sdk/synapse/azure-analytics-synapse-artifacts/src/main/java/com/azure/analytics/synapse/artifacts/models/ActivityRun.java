// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** Information about an activity run in a pipeline. */
@Fluent
public final class ActivityRun {
    /*
     * The name of the pipeline.
     */
    @JsonProperty(value = "pipelineName", access = JsonProperty.Access.WRITE_ONLY)
    private String pipelineName;

    /*
     * The id of the pipeline run.
     */
    @JsonProperty(value = "pipelineRunId", access = JsonProperty.Access.WRITE_ONLY)
    private String pipelineRunId;

    /*
     * The name of the activity.
     */
    @JsonProperty(value = "activityName", access = JsonProperty.Access.WRITE_ONLY)
    private String activityName;

    /*
     * The type of the activity.
     */
    @JsonProperty(value = "activityType", access = JsonProperty.Access.WRITE_ONLY)
    private String activityType;

    /*
     * The id of the activity run.
     */
    @JsonProperty(value = "activityRunId", access = JsonProperty.Access.WRITE_ONLY)
    private String activityRunId;

    /*
     * The name of the compute linked service.
     */
    @JsonProperty(value = "linkedServiceName", access = JsonProperty.Access.WRITE_ONLY)
    private String linkedServiceName;

    /*
     * The status of the activity run.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /*
     * The start time of the activity run in 'ISO 8601' format.
     */
    @JsonProperty(value = "activityRunStart", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime activityRunStart;

    /*
     * The end time of the activity run in 'ISO 8601' format.
     */
    @JsonProperty(value = "activityRunEnd", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime activityRunEnd;

    /*
     * The duration of the activity run.
     */
    @JsonProperty(value = "durationInMs", access = JsonProperty.Access.WRITE_ONLY)
    private Integer durationInMs;

    /*
     * The input for the activity.
     */
    @JsonProperty(value = "input", access = JsonProperty.Access.WRITE_ONLY)
    private Object input;

    /*
     * The output for the activity.
     */
    @JsonProperty(value = "output", access = JsonProperty.Access.WRITE_ONLY)
    private Object output;

    /*
     * The error if any from the activity run.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private Object error;

    /*
     * Information about an activity run in a pipeline.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the pipelineName property: The name of the pipeline.
     *
     * @return the pipelineName value.
     */
    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * Get the pipelineRunId property: The id of the pipeline run.
     *
     * @return the pipelineRunId value.
     */
    public String getPipelineRunId() {
        return this.pipelineRunId;
    }

    /**
     * Get the activityName property: The name of the activity.
     *
     * @return the activityName value.
     */
    public String getActivityName() {
        return this.activityName;
    }

    /**
     * Get the activityType property: The type of the activity.
     *
     * @return the activityType value.
     */
    public String getActivityType() {
        return this.activityType;
    }

    /**
     * Get the activityRunId property: The id of the activity run.
     *
     * @return the activityRunId value.
     */
    public String getActivityRunId() {
        return this.activityRunId;
    }

    /**
     * Get the linkedServiceName property: The name of the compute linked service.
     *
     * @return the linkedServiceName value.
     */
    public String getLinkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Get the status property: The status of the activity run.
     *
     * @return the status value.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Get the activityRunStart property: The start time of the activity run in 'ISO 8601' format.
     *
     * @return the activityRunStart value.
     */
    public OffsetDateTime getActivityRunStart() {
        return this.activityRunStart;
    }

    /**
     * Get the activityRunEnd property: The end time of the activity run in 'ISO 8601' format.
     *
     * @return the activityRunEnd value.
     */
    public OffsetDateTime getActivityRunEnd() {
        return this.activityRunEnd;
    }

    /**
     * Get the durationInMs property: The duration of the activity run.
     *
     * @return the durationInMs value.
     */
    public Integer getDurationInMs() {
        return this.durationInMs;
    }

    /**
     * Get the input property: The input for the activity.
     *
     * @return the input value.
     */
    public Object getInput() {
        return this.input;
    }

    /**
     * Get the output property: The output for the activity.
     *
     * @return the output value.
     */
    public Object getOutput() {
        return this.output;
    }

    /**
     * Get the error property: The error if any from the activity run.
     *
     * @return the error value.
     */
    public Object getError() {
        return this.error;
    }

    /**
     * Get the additionalProperties property: Information about an activity run in a pipeline.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Information about an activity run in a pipeline.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the ActivityRun object itself.
     */
    public ActivityRun setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}