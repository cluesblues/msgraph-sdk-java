// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.NotificationMessageTemplate;
import com.microsoft.graph.requests.extensions.ILocalizedNotificationMessageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ILocalizedNotificationMessageRequestBuilder;
import com.microsoft.graph.requests.extensions.LocalizedNotificationMessageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.LocalizedNotificationMessageRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Notification Message Template Request.
 */
public class NotificationMessageTemplateRequest extends BaseRequest implements INotificationMessageTemplateRequest {
	
    /**
     * The request for the NotificationMessageTemplate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public NotificationMessageTemplateRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, NotificationMessageTemplate.class);
    }

    /**
     * Gets the NotificationMessageTemplate from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<NotificationMessageTemplate> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the NotificationMessageTemplate from the service
     *
     * @return the NotificationMessageTemplate from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public NotificationMessageTemplate get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<NotificationMessageTemplate> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this NotificationMessageTemplate with a source
     *
     * @param sourceNotificationMessageTemplate the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final NotificationMessageTemplate sourceNotificationMessageTemplate, final ICallback<NotificationMessageTemplate> callback) {
        send(HttpMethod.PATCH, callback, sourceNotificationMessageTemplate);
    }

    /**
     * Patches this NotificationMessageTemplate with a source
     *
     * @param sourceNotificationMessageTemplate the source object with updates
     * @return the updated NotificationMessageTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public NotificationMessageTemplate patch(final NotificationMessageTemplate sourceNotificationMessageTemplate) throws ClientException {
        return send(HttpMethod.PATCH, sourceNotificationMessageTemplate);
    }

    /**
     * Creates a NotificationMessageTemplate with a new object
     *
     * @param newNotificationMessageTemplate the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final NotificationMessageTemplate newNotificationMessageTemplate, final ICallback<NotificationMessageTemplate> callback) {
        send(HttpMethod.POST, callback, newNotificationMessageTemplate);
    }

    /**
     * Creates a NotificationMessageTemplate with a new object
     *
     * @param newNotificationMessageTemplate the new object to create
     * @return the created NotificationMessageTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public NotificationMessageTemplate post(final NotificationMessageTemplate newNotificationMessageTemplate) throws ClientException {
        return send(HttpMethod.POST, newNotificationMessageTemplate);
    }

    /**
     * Creates a NotificationMessageTemplate with a new object
     *
     * @param newNotificationMessageTemplate the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final NotificationMessageTemplate newNotificationMessageTemplate, final ICallback<NotificationMessageTemplate> callback) {
        send(HttpMethod.PUT, callback, newNotificationMessageTemplate);
    }

    /**
     * Creates a NotificationMessageTemplate with a new object
     *
     * @param newNotificationMessageTemplate the object to create/update
     * @return the created NotificationMessageTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public NotificationMessageTemplate put(final NotificationMessageTemplate newNotificationMessageTemplate) throws ClientException {
        return send(HttpMethod.PUT, newNotificationMessageTemplate);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public INotificationMessageTemplateRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (NotificationMessageTemplateRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public INotificationMessageTemplateRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (NotificationMessageTemplateRequest)this;
     }

}

