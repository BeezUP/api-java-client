/*
 * Channel Catalogs
 * This api allows you to manage your channel catalogs.   A channel catalog is an association between your store and a channel.  You will be able to: - map your catalog colums to channel columns. - map your catalog categories to the channel categories and define a cost of this category - configure the general and cost settings of the channel - enable or disable a channel - exclude products using filters for a channel - override product values for a channel - disable or reenable a product on a channel 
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


import io.swagger.client.model.ChannelCatalogCategoryMappings;
import io.swagger.client.model.MapCategoryRequest;
import io.swagger.client.model.UnmapCategoryRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChannelCatalogsCategoryMappingsApi {
    private ApiClient apiClient;

    public ChannelCatalogsCategoryMappingsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ChannelCatalogsCategoryMappingsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getChannelCatalogCategories */
    private com.squareup.okhttp.Call getChannelCatalogCategoriesCall(String channelCatalogId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/{channelCatalogId}/categoryMappings".replaceAll("\\{format\\}","json")
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getChannelCatalogCategoriesValidateBeforeCall(String channelCatalogId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'channelCatalogId' is set
        if (channelCatalogId == null) {
            throw new ApiException("Missing the required parameter 'channelCatalogId' when calling getChannelCatalogCategories(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getChannelCatalogCategoriesCall(channelCatalogId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get channel catalog categories
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @return ChannelCatalogCategoryMappings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ChannelCatalogCategoryMappings getChannelCatalogCategories(String channelCatalogId) throws ApiException {
        ApiResponse<ChannelCatalogCategoryMappings> resp = getChannelCatalogCategoriesWithHttpInfo(channelCatalogId);
        return resp.getData();
    }

    /**
     * Get channel catalog categories
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @return ApiResponse&lt;ChannelCatalogCategoryMappings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ChannelCatalogCategoryMappings> getChannelCatalogCategoriesWithHttpInfo(String channelCatalogId) throws ApiException {
        com.squareup.okhttp.Call call = getChannelCatalogCategoriesValidateBeforeCall(channelCatalogId, null, null);
        Type localVarReturnType = new TypeToken<ChannelCatalogCategoryMappings>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get channel catalog categories (asynchronously)
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getChannelCatalogCategoriesAsync(String channelCatalogId, final ApiCallback<ChannelCatalogCategoryMappings> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getChannelCatalogCategoriesValidateBeforeCall(channelCatalogId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ChannelCatalogCategoryMappings>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for mapChannelCatalogCategory */
    private com.squareup.okhttp.Call mapChannelCatalogCategoryCall(String channelCatalogId, MapCategoryRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;
        
        // create path and map variables
        String localVarPath = "/{channelCatalogId}/categoryMappings/map".replaceAll("\\{format\\}","json")
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call mapChannelCatalogCategoryValidateBeforeCall(String channelCatalogId, MapCategoryRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'channelCatalogId' is set
        if (channelCatalogId == null) {
            throw new ApiException("Missing the required parameter 'channelCatalogId' when calling mapChannelCatalogCategory(Async)");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling mapChannelCatalogCategory(Async)");
        }
        
        
        com.squareup.okhttp.Call call = mapChannelCatalogCategoryCall(channelCatalogId, request, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Map channel catalog category
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param request  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void mapChannelCatalogCategory(String channelCatalogId, MapCategoryRequest request) throws ApiException {
        mapChannelCatalogCategoryWithHttpInfo(channelCatalogId, request);
    }

    /**
     * Map channel catalog category
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param request  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> mapChannelCatalogCategoryWithHttpInfo(String channelCatalogId, MapCategoryRequest request) throws ApiException {
        com.squareup.okhttp.Call call = mapChannelCatalogCategoryValidateBeforeCall(channelCatalogId, request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Map channel catalog category (asynchronously)
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param request  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call mapChannelCatalogCategoryAsync(String channelCatalogId, MapCategoryRequest request, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = mapChannelCatalogCategoryValidateBeforeCall(channelCatalogId, request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for unmapChannelCatalogCategory */
    private com.squareup.okhttp.Call unmapChannelCatalogCategoryCall(String channelCatalogId, UnmapCategoryRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;
        
        // create path and map variables
        String localVarPath = "/{channelCatalogId}/categoryMappings/unmap".replaceAll("\\{format\\}","json")
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call unmapChannelCatalogCategoryValidateBeforeCall(String channelCatalogId, UnmapCategoryRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'channelCatalogId' is set
        if (channelCatalogId == null) {
            throw new ApiException("Missing the required parameter 'channelCatalogId' when calling unmapChannelCatalogCategory(Async)");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling unmapChannelCatalogCategory(Async)");
        }
        
        
        com.squareup.okhttp.Call call = unmapChannelCatalogCategoryCall(channelCatalogId, request, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Unmap channel catalog category
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param request  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void unmapChannelCatalogCategory(String channelCatalogId, UnmapCategoryRequest request) throws ApiException {
        unmapChannelCatalogCategoryWithHttpInfo(channelCatalogId, request);
    }

    /**
     * Unmap channel catalog category
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param request  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> unmapChannelCatalogCategoryWithHttpInfo(String channelCatalogId, UnmapCategoryRequest request) throws ApiException {
        com.squareup.okhttp.Call call = unmapChannelCatalogCategoryValidateBeforeCall(channelCatalogId, request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Unmap channel catalog category (asynchronously)
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param request  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call unmapChannelCatalogCategoryAsync(String channelCatalogId, UnmapCategoryRequest request, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = unmapChannelCatalogCategoryValidateBeforeCall(channelCatalogId, request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}