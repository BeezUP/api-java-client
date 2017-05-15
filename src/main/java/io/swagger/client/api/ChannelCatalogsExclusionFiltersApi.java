/*
 * BeezUP API
 * This API will allow you to create your account and to get your tokens. \\ If you lost your password, you have an operation to get it back. 
 *
 * OpenAPI spec version: 2.0
 * Contact: support@beezup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.BeezUPCommonErrorResponseMessage;
import io.swagger.client.model.ExclusionFilterOperator;
import io.swagger.client.model.ExclusionFilters;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChannelCatalogsExclusionFiltersApi {
    private ApiClient apiClient;

    public ChannelCatalogsExclusionFiltersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ChannelCatalogsExclusionFiltersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for configureChannelCatalogExclusionFilters */
    private com.squareup.okhttp.Call configureChannelCatalogExclusionFiltersCall(String channelCatalogId, ExclusionFilters request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;
        
        // create path and map variables
        String localVarPath = "/user/channelCatalogs/{channelCatalogId}/exclusionFilters".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "channelCatalogId" + "\\}", apiClient.escapeString(channelCatalogId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call configureChannelCatalogExclusionFiltersValidateBeforeCall(String channelCatalogId, ExclusionFilters request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'channelCatalogId' is set
        if (channelCatalogId == null) {
            throw new ApiException("Missing the required parameter 'channelCatalogId' when calling configureChannelCatalogExclusionFilters(Async)");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling configureChannelCatalogExclusionFilters(Async)");
        }
        
        
        com.squareup.okhttp.Call call = configureChannelCatalogExclusionFiltersCall(channelCatalogId, request, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Configure channel catalog exclusion filters
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param request  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void configureChannelCatalogExclusionFilters(String channelCatalogId, ExclusionFilters request) throws ApiException {
        configureChannelCatalogExclusionFiltersWithHttpInfo(channelCatalogId, request);
    }

    /**
     * Configure channel catalog exclusion filters
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param request  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> configureChannelCatalogExclusionFiltersWithHttpInfo(String channelCatalogId, ExclusionFilters request) throws ApiException {
        com.squareup.okhttp.Call call = configureChannelCatalogExclusionFiltersValidateBeforeCall(channelCatalogId, request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Configure channel catalog exclusion filters (asynchronously)
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param request  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call configureChannelCatalogExclusionFiltersAsync(String channelCatalogId, ExclusionFilters request, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = configureChannelCatalogExclusionFiltersValidateBeforeCall(channelCatalogId, request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getChannelCatalogExclusionFilterOperators */
    private com.squareup.okhttp.Call getChannelCatalogExclusionFilterOperatorsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/user/channelCatalogs/exclusionFilterOperators".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getChannelCatalogExclusionFilterOperatorsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getChannelCatalogExclusionFilterOperatorsCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get channel catalog exclusion filter operators
     * 
     * @return List&lt;ExclusionFilterOperator&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ExclusionFilterOperator> getChannelCatalogExclusionFilterOperators() throws ApiException {
        ApiResponse<List<ExclusionFilterOperator>> resp = getChannelCatalogExclusionFilterOperatorsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get channel catalog exclusion filter operators
     * 
     * @return ApiResponse&lt;List&lt;ExclusionFilterOperator&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ExclusionFilterOperator>> getChannelCatalogExclusionFilterOperatorsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getChannelCatalogExclusionFilterOperatorsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<ExclusionFilterOperator>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get channel catalog exclusion filter operators (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getChannelCatalogExclusionFilterOperatorsAsync(final ApiCallback<List<ExclusionFilterOperator>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getChannelCatalogExclusionFilterOperatorsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ExclusionFilterOperator>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
