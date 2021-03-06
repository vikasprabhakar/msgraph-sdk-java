// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookChartSeriesItemAtRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Chart Series Item At Request Builder.
 */
public interface IWorkbookChartSeriesItemAtRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookChartSeriesItemAtRequest
     *
     * @return the IWorkbookChartSeriesItemAtRequest instance
     */
    IWorkbookChartSeriesItemAtRequest buildRequest();

    /**
     * Creates the IWorkbookChartSeriesItemAtRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookChartSeriesItemAtRequest instance
     */
    IWorkbookChartSeriesItemAtRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
