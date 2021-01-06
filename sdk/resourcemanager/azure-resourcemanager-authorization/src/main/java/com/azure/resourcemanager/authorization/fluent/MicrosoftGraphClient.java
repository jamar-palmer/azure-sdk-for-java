// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for MicrosoftGraphClient class. */
public interface MicrosoftGraphClient {
    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the ApplicationsApplicationsClient object to access its operations.
     *
     * @return the ApplicationsApplicationsClient object.
     */
    ApplicationsApplicationsClient getApplicationsApplications();

    /**
     * Gets the ApplicationsClient object to access its operations.
     *
     * @return the ApplicationsClient object.
     */
    ApplicationsClient getApplications();

    /**
     * Gets the GroupsClient object to access its operations.
     *
     * @return the GroupsClient object.
     */
    GroupsClient getGroups();

    /**
     * Gets the ServicePrincipalsServicePrincipalsClient object to access its operations.
     *
     * @return the ServicePrincipalsServicePrincipalsClient object.
     */
    ServicePrincipalsServicePrincipalsClient getServicePrincipalsServicePrincipals();

    /**
     * Gets the ServicePrincipalsClient object to access its operations.
     *
     * @return the ServicePrincipalsClient object.
     */
    ServicePrincipalsClient getServicePrincipals();

    /**
     * Gets the UsersClient object to access its operations.
     *
     * @return the UsersClient object.
     */
    UsersClient getUsers();

    /**
     * Gets the GroupLifecyclePoliciesGroupLifecyclePoliciesClient object to access its operations.
     *
     * @return the GroupLifecyclePoliciesGroupLifecyclePoliciesClient object.
     */
    GroupLifecyclePoliciesGroupLifecyclePoliciesClient getGroupLifecyclePoliciesGroupLifecyclePolicies();

    /**
     * Gets the GroupLifecyclePoliciesClient object to access its operations.
     *
     * @return the GroupLifecyclePoliciesClient object.
     */
    GroupLifecyclePoliciesClient getGroupLifecyclePolicies();

    /**
     * Gets the GroupsGroupsClient object to access its operations.
     *
     * @return the GroupsGroupsClient object.
     */
    GroupsGroupsClient getGroupsGroups();

    /**
     * Gets the UsersUsersClient object to access its operations.
     *
     * @return the UsersUsersClient object.
     */
    UsersUsersClient getUsersUsers();

    /**
     * Gets the UsersOutlooksClient object to access its operations.
     *
     * @return the UsersOutlooksClient object.
     */
    UsersOutlooksClient getUsersOutlooks();

    /**
     * Gets the UsersSettingsClient object to access its operations.
     *
     * @return the UsersSettingsClient object.
     */
    UsersSettingsClient getUsersSettings();

    /**
     * Gets the UsersTodosClient object to access its operations.
     *
     * @return the UsersTodosClient object.
     */
    UsersTodosClient getUsersTodos();

    /**
     * Gets the UsersTodoListsClient object to access its operations.
     *
     * @return the UsersTodoListsClient object.
     */
    UsersTodoListsClient getUsersTodoLists();

    /**
     * Gets the UsersTodoListsTasksClient object to access its operations.
     *
     * @return the UsersTodoListsTasksClient object.
     */
    UsersTodoListsTasksClient getUsersTodoListsTasks();

    /**
     * Gets the ContactsOrgContactsClient object to access its operations.
     *
     * @return the ContactsOrgContactsClient object.
     */
    ContactsOrgContactsClient getContactsOrgContacts();

    /**
     * Gets the ContactsClient object to access its operations.
     *
     * @return the ContactsClient object.
     */
    ContactsClient getContacts();

    /**
     * Gets the ContractsContractsClient object to access its operations.
     *
     * @return the ContractsContractsClient object.
     */
    ContractsContractsClient getContractsContracts();

    /**
     * Gets the ContractsClient object to access its operations.
     *
     * @return the ContractsClient object.
     */
    ContractsClient getContracts();

    /**
     * Gets the DevicesDevicesClient object to access its operations.
     *
     * @return the DevicesDevicesClient object.
     */
    DevicesDevicesClient getDevicesDevices();

    /**
     * Gets the DevicesClient object to access its operations.
     *
     * @return the DevicesClient object.
     */
    DevicesClient getDevices();

    /**
     * Gets the DirectoryDirectoriesClient object to access its operations.
     *
     * @return the DirectoryDirectoriesClient object.
     */
    DirectoryDirectoriesClient getDirectoryDirectories();

    /**
     * Gets the DirectoriesClient object to access its operations.
     *
     * @return the DirectoriesClient object.
     */
    DirectoriesClient getDirectories();

    /**
     * Gets the DirectoryAdministrativeUnitsClient object to access its operations.
     *
     * @return the DirectoryAdministrativeUnitsClient object.
     */
    DirectoryAdministrativeUnitsClient getDirectoryAdministrativeUnits();

    /**
     * Gets the DirectoryRolesDirectoryRolesClient object to access its operations.
     *
     * @return the DirectoryRolesDirectoryRolesClient object.
     */
    DirectoryRolesDirectoryRolesClient getDirectoryRolesDirectoryRoles();

    /**
     * Gets the DirectoryRolesClient object to access its operations.
     *
     * @return the DirectoryRolesClient object.
     */
    DirectoryRolesClient getDirectoryRoles();

    /**
     * Gets the DirectoryRoleTemplatesDirectoryRoleTemplatesClient object to access its operations.
     *
     * @return the DirectoryRoleTemplatesDirectoryRoleTemplatesClient object.
     */
    DirectoryRoleTemplatesDirectoryRoleTemplatesClient getDirectoryRoleTemplatesDirectoryRoleTemplates();

    /**
     * Gets the DirectoryRoleTemplatesClient object to access its operations.
     *
     * @return the DirectoryRoleTemplatesClient object.
     */
    DirectoryRoleTemplatesClient getDirectoryRoleTemplates();

    /**
     * Gets the DomainsDomainsClient object to access its operations.
     *
     * @return the DomainsDomainsClient object.
     */
    DomainsDomainsClient getDomainsDomains();

    /**
     * Gets the DomainsClient object to access its operations.
     *
     * @return the DomainsClient object.
     */
    DomainsClient getDomains();

    /**
     * Gets the OrganizationOrganizationsClient object to access its operations.
     *
     * @return the OrganizationOrganizationsClient object.
     */
    OrganizationOrganizationsClient getOrganizationOrganizations();

    /**
     * Gets the OrganizationsClient object to access its operations.
     *
     * @return the OrganizationsClient object.
     */
    OrganizationsClient getOrganizations();

    /**
     * Gets the SubscribedSkusSubscribedSkusClient object to access its operations.
     *
     * @return the SubscribedSkusSubscribedSkusClient object.
     */
    SubscribedSkusSubscribedSkusClient getSubscribedSkusSubscribedSkus();
}