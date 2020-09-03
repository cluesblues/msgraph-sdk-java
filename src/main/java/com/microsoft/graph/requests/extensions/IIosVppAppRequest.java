// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.IosVppApp;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Ios Vpp App Request.
 */
public interface IIosVppAppRequest extends IHttpRequest {

    /**
     * Gets the IosVppApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<IosVppApp> callback);

    /**
     * Gets the IosVppApp from the service
     *
     * @return the IosVppApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosVppApp get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<IosVppApp> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this IosVppApp with a source
     *
     * @param sourceIosVppApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final IosVppApp sourceIosVppApp, final ICallback<IosVppApp> callback);

    /**
     * Patches this IosVppApp with a source
     *
     * @param sourceIosVppApp the source object with updates
     * @return the updated IosVppApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosVppApp patch(final IosVppApp sourceIosVppApp) throws ClientException;

    /**
     * Posts a IosVppApp with a new object
     *
     * @param newIosVppApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final IosVppApp newIosVppApp, final ICallback<IosVppApp> callback);

    /**
     * Posts a IosVppApp with a new object
     *
     * @param newIosVppApp the new object to create
     * @return the created IosVppApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosVppApp post(final IosVppApp newIosVppApp) throws ClientException;

    /**
     * Posts a IosVppApp with a new object
     *
     * @param newIosVppApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final IosVppApp newIosVppApp, final ICallback<IosVppApp> callback);

    /**
     * Posts a IosVppApp with a new object
     *
     * @param newIosVppApp the object to create/update
     * @return the created IosVppApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosVppApp put(final IosVppApp newIosVppApp) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IIosVppAppRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IIosVppAppRequest expand(final String value);

}

