// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IExtensionPropertyRequest;
import com.microsoft.graph.requests.extensions.ExtensionPropertyRequest;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Extension Property Request Builder.
 */
public class ExtensionPropertyRequestBuilder extends BaseRequestBuilder implements IExtensionPropertyRequestBuilder {

    /**
     * The request builder for the ExtensionProperty
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ExtensionPropertyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IExtensionPropertyRequest instance
     */
    public IExtensionPropertyRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IExtensionPropertyRequest instance
     */
    public IExtensionPropertyRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new ExtensionPropertyRequest(getRequestUrl(), getClient(), requestOptions);
    }


}

