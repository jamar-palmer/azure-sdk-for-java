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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** sectionGroup. */
@Fluent
public final class MicrosoftGraphSectionGroup extends MicrosoftGraphOnenoteEntityHierarchyModel {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphSectionGroup.class);

    /*
     * The URL for the sectionGroups navigation property, which returns all the
     * section groups in the section group. Read-only.
     */
    @JsonProperty(value = "sectionGroupsUrl")
    private String sectionGroupsUrl;

    /*
     * The URL for the sections navigation property, which returns all the
     * sections in the section group. Read-only.
     */
    @JsonProperty(value = "sectionsUrl")
    private String sectionsUrl;

    /*
     * notebook
     */
    @JsonProperty(value = "parentNotebook")
    private MicrosoftGraphNotebook parentNotebook;

    /*
     * sectionGroup
     */
    @JsonProperty(value = "parentSectionGroup")
    private MicrosoftGraphSectionGroup parentSectionGroup;

    /*
     * The section groups in the section. Read-only. Nullable.
     */
    @JsonProperty(value = "sectionGroups")
    private List<MicrosoftGraphSectionGroup> sectionGroups;

    /*
     * The sections in the section group. Read-only. Nullable.
     */
    @JsonProperty(value = "sections")
    private List<MicrosoftGraphOnenoteSection> sections;

    /*
     * sectionGroup
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the sectionGroupsUrl property: The URL for the sectionGroups navigation property, which returns all the
     * section groups in the section group. Read-only.
     *
     * @return the sectionGroupsUrl value.
     */
    public String sectionGroupsUrl() {
        return this.sectionGroupsUrl;
    }

    /**
     * Set the sectionGroupsUrl property: The URL for the sectionGroups navigation property, which returns all the
     * section groups in the section group. Read-only.
     *
     * @param sectionGroupsUrl the sectionGroupsUrl value to set.
     * @return the MicrosoftGraphSectionGroup object itself.
     */
    public MicrosoftGraphSectionGroup withSectionGroupsUrl(String sectionGroupsUrl) {
        this.sectionGroupsUrl = sectionGroupsUrl;
        return this;
    }

    /**
     * Get the sectionsUrl property: The URL for the sections navigation property, which returns all the sections in the
     * section group. Read-only.
     *
     * @return the sectionsUrl value.
     */
    public String sectionsUrl() {
        return this.sectionsUrl;
    }

    /**
     * Set the sectionsUrl property: The URL for the sections navigation property, which returns all the sections in the
     * section group. Read-only.
     *
     * @param sectionsUrl the sectionsUrl value to set.
     * @return the MicrosoftGraphSectionGroup object itself.
     */
    public MicrosoftGraphSectionGroup withSectionsUrl(String sectionsUrl) {
        this.sectionsUrl = sectionsUrl;
        return this;
    }

    /**
     * Get the parentNotebook property: notebook.
     *
     * @return the parentNotebook value.
     */
    public MicrosoftGraphNotebook parentNotebook() {
        return this.parentNotebook;
    }

    /**
     * Set the parentNotebook property: notebook.
     *
     * @param parentNotebook the parentNotebook value to set.
     * @return the MicrosoftGraphSectionGroup object itself.
     */
    public MicrosoftGraphSectionGroup withParentNotebook(MicrosoftGraphNotebook parentNotebook) {
        this.parentNotebook = parentNotebook;
        return this;
    }

    /**
     * Get the parentSectionGroup property: sectionGroup.
     *
     * @return the parentSectionGroup value.
     */
    public MicrosoftGraphSectionGroup parentSectionGroup() {
        return this.parentSectionGroup;
    }

    /**
     * Set the parentSectionGroup property: sectionGroup.
     *
     * @param parentSectionGroup the parentSectionGroup value to set.
     * @return the MicrosoftGraphSectionGroup object itself.
     */
    public MicrosoftGraphSectionGroup withParentSectionGroup(MicrosoftGraphSectionGroup parentSectionGroup) {
        this.parentSectionGroup = parentSectionGroup;
        return this;
    }

    /**
     * Get the sectionGroups property: The section groups in the section. Read-only. Nullable.
     *
     * @return the sectionGroups value.
     */
    public List<MicrosoftGraphSectionGroup> sectionGroups() {
        return this.sectionGroups;
    }

    /**
     * Set the sectionGroups property: The section groups in the section. Read-only. Nullable.
     *
     * @param sectionGroups the sectionGroups value to set.
     * @return the MicrosoftGraphSectionGroup object itself.
     */
    public MicrosoftGraphSectionGroup withSectionGroups(List<MicrosoftGraphSectionGroup> sectionGroups) {
        this.sectionGroups = sectionGroups;
        return this;
    }

    /**
     * Get the sections property: The sections in the section group. Read-only. Nullable.
     *
     * @return the sections value.
     */
    public List<MicrosoftGraphOnenoteSection> sections() {
        return this.sections;
    }

    /**
     * Set the sections property: The sections in the section group. Read-only. Nullable.
     *
     * @param sections the sections value to set.
     * @return the MicrosoftGraphSectionGroup object itself.
     */
    public MicrosoftGraphSectionGroup withSections(List<MicrosoftGraphOnenoteSection> sections) {
        this.sections = sections;
        return this;
    }

    /**
     * Get the additionalProperties property: sectionGroup.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: sectionGroup.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphSectionGroup object itself.
     */
    public MicrosoftGraphSectionGroup withAdditionalProperties(Map<String, Object> additionalProperties) {
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

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphSectionGroup withCreatedBy(MicrosoftGraphIdentitySet createdBy) {
        super.withCreatedBy(createdBy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphSectionGroup withDisplayName(String displayName) {
        super.withDisplayName(displayName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphSectionGroup withLastModifiedBy(MicrosoftGraphIdentitySet lastModifiedBy) {
        super.withLastModifiedBy(lastModifiedBy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphSectionGroup withLastModifiedDateTime(OffsetDateTime lastModifiedDateTime) {
        super.withLastModifiedDateTime(lastModifiedDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphSectionGroup withCreatedDateTime(OffsetDateTime createdDateTime) {
        super.withCreatedDateTime(createdDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphSectionGroup withSelf(String self) {
        super.withSelf(self);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphSectionGroup withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (parentNotebook() != null) {
            parentNotebook().validate();
        }
        if (parentSectionGroup() != null) {
            parentSectionGroup().validate();
        }
        if (sectionGroups() != null) {
            sectionGroups().forEach(e -> e.validate());
        }
        if (sections() != null) {
            sections().forEach(e -> e.validate());
        }
    }
}