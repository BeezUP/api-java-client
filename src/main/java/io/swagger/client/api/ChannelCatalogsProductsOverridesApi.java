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
import io.swagger.client.model.ProductOverrides;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChannelCatalogsProductsOverridesApi {
    private ApiClient apiClient;

    public ChannelCatalogsProductsOverridesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ChannelCatalogsProductsOverridesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for deleteChannelCatalogProductValueOverride */
    private com.squareup.okhttp.Call deleteChannelCatalogProductValueOverrideCall(String channelCatalogId, String productId, String channelColumnId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/user/channelCatalogs/{channelCatalogId}/products/{productId}/overrides/{channelColumnId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "channelCatalogId" + "\\}", apiClient.escapeString(channelCatalogId.toString()))
        .replaceAll("\\{" + "productId" + "\\}", apiClient.escapeString(productId.toString()))
        .replaceAll("\\{" + "channelColumnId" + "\\}", apiClient.escapeString(channelColumnId.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteChannelCatalogProductValueOverrideValidateBeforeCall(String channelCatalogId, String productId, String channelColumnId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'channelCatalogId' is set
        if (channelCatalogId == null) {
            throw new ApiException("Missing the required parameter 'channelCatalogId' when calling deleteChannelCatalogProductValueOverride(Async)");
        }
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException("Missing the required parameter 'productId' when calling deleteChannelCatalogProductValueOverride(Async)");
        }
        
        // verify the required parameter 'channelColumnId' is set
        if (channelColumnId == null) {
            throw new ApiException("Missing the required parameter 'channelColumnId' when calling deleteChannelCatalogProductValueOverride(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteChannelCatalogProductValueOverrideCall(channelCatalogId, productId, channelColumnId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete a specific channel catalog product value override
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param productId The product identifier (required)
     * @param channelColumnId The channel column identifier (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteChannelCatalogProductValueOverride(String channelCatalogId, String productId, String channelColumnId) throws ApiException {
        deleteChannelCatalogProductValueOverrideWithHttpInfo(channelCatalogId, productId, channelColumnId);
    }

    /**
     * Delete a specific channel catalog product value override
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param productId The product identifier (required)
     * @param channelColumnId The channel column identifier (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteChannelCatalogProductValueOverrideWithHttpInfo(String channelCatalogId, String productId, String channelColumnId) throws ApiException {
        com.squareup.okhttp.Call call = deleteChannelCatalogProductValueOverrideValidateBeforeCall(channelCatalogId, productId, channelColumnId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete a specific channel catalog product value override (asynchronously)
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param productId The product identifier (required)
     * @param channelColumnId The channel column identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteChannelCatalogProductValueOverrideAsync(String channelCatalogId, String productId, String channelColumnId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteChannelCatalogProductValueOverrideValidateBeforeCall(channelCatalogId, productId, channelColumnId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for overrideChannelCatalogProductOverrides */
    private com.squareup.okhttp.Call overrideChannelCatalogProductOverridesCall(String channelCatalogId, String productId, ProductOverrides request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;
        
        // create path and map variables
        String localVarPath = "/user/channelCatalogs/{channelCatalogId}/products/{productId}/overrides".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "channelCatalogId" + "\\}", apiClient.escapeString(channelCatalogId.toString()))
        .replaceAll("\\{" + "productId" + "\\}", apiClient.escapeString(productId.toString()));

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
    private com.squareup.okhttp.Call overrideChannelCatalogProductOverridesValidateBeforeCall(String channelCatalogId, String productId, ProductOverrides request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'channelCatalogId' is set
        if (channelCatalogId == null) {
            throw new ApiException("Missing the required parameter 'channelCatalogId' when calling overrideChannelCatalogProductOverrides(Async)");
        }
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException("Missing the required parameter 'productId' when calling overrideChannelCatalogProductOverrides(Async)");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling overrideChannelCatalogProductOverrides(Async)");
        }
        
        
        com.squareup.okhttp.Call call = overrideChannelCatalogProductOverridesCall(channelCatalogId, productId, request, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Override channel catalog product values
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param productId The product identifier (required)
     * @param request  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void overrideChannelCatalogProductOverrides(String channelCatalogId, String productId, ProductOverrides request) throws ApiException {
        overrideChannelCatalogProductOverridesWithHttpInfo(channelCatalogId, productId, request);
    }

    /**
     * Override channel catalog product values
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param productId The product identifier (required)
     * @param request  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> overrideChannelCatalogProductOverridesWithHttpInfo(String channelCatalogId, String productId, ProductOverrides request) throws ApiException {
        com.squareup.okhttp.Call call = overrideChannelCatalogProductOverridesValidateBeforeCall(channelCatalogId, productId, request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Override channel catalog product values (asynchronously)
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param productId The product identifier (required)
     * @param request  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call overrideChannelCatalogProductOverridesAsync(String channelCatalogId, String productId, ProductOverrides request, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = overrideChannelCatalogProductOverridesValidateBeforeCall(channelCatalogId, productId, request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
