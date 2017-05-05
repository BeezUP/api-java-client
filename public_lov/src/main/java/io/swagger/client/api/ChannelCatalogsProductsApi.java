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


import io.swagger.client.model.ChannelCatalogProductInfo;
import io.swagger.client.model.ChannelCatalogProductInfoList;
import io.swagger.client.model.GetChannelCatalogProductInfoListRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChannelCatalogsProductsApi {
    private ApiClient apiClient;

    public ChannelCatalogsProductsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ChannelCatalogsProductsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getChannelCatalogProductInfo */
    private com.squareup.okhttp.Call getChannelCatalogProductInfoCall(String channelCatalogId, String productId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/{channelCatalogId}/products/{productId}".replaceAll("\\{format\\}","json")
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getChannelCatalogProductInfoValidateBeforeCall(String channelCatalogId, String productId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'channelCatalogId' is set
        if (channelCatalogId == null) {
            throw new ApiException("Missing the required parameter 'channelCatalogId' when calling getChannelCatalogProductInfo(Async)");
        }
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException("Missing the required parameter 'productId' when calling getChannelCatalogProductInfo(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getChannelCatalogProductInfoCall(channelCatalogId, productId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get channel catalog product information
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param productId The product identifier (required)
     * @return ChannelCatalogProductInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ChannelCatalogProductInfo getChannelCatalogProductInfo(String channelCatalogId, String productId) throws ApiException {
        ApiResponse<ChannelCatalogProductInfo> resp = getChannelCatalogProductInfoWithHttpInfo(channelCatalogId, productId);
        return resp.getData();
    }

    /**
     * Get channel catalog product information
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param productId The product identifier (required)
     * @return ApiResponse&lt;ChannelCatalogProductInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ChannelCatalogProductInfo> getChannelCatalogProductInfoWithHttpInfo(String channelCatalogId, String productId) throws ApiException {
        com.squareup.okhttp.Call call = getChannelCatalogProductInfoValidateBeforeCall(channelCatalogId, productId, null, null);
        Type localVarReturnType = new TypeToken<ChannelCatalogProductInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get channel catalog product information (asynchronously)
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param productId The product identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getChannelCatalogProductInfoAsync(String channelCatalogId, String productId, final ApiCallback<ChannelCatalogProductInfo> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getChannelCatalogProductInfoValidateBeforeCall(channelCatalogId, productId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ChannelCatalogProductInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getChannelCatalogProductInfoList */
    private com.squareup.okhttp.Call getChannelCatalogProductInfoListCall(String channelCatalogId, GetChannelCatalogProductInfoListRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;
        
        // create path and map variables
        String localVarPath = "/{channelCatalogId}/products".replaceAll("\\{format\\}","json")
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
    private com.squareup.okhttp.Call getChannelCatalogProductInfoListValidateBeforeCall(String channelCatalogId, GetChannelCatalogProductInfoListRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'channelCatalogId' is set
        if (channelCatalogId == null) {
            throw new ApiException("Missing the required parameter 'channelCatalogId' when calling getChannelCatalogProductInfoList(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getChannelCatalogProductInfoListCall(channelCatalogId, request, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get channel catalog product information list
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param request The channel catalog product list filter (optional)
     * @return ChannelCatalogProductInfoList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ChannelCatalogProductInfoList getChannelCatalogProductInfoList(String channelCatalogId, GetChannelCatalogProductInfoListRequest request) throws ApiException {
        ApiResponse<ChannelCatalogProductInfoList> resp = getChannelCatalogProductInfoListWithHttpInfo(channelCatalogId, request);
        return resp.getData();
    }

    /**
     * Get channel catalog product information list
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param request The channel catalog product list filter (optional)
     * @return ApiResponse&lt;ChannelCatalogProductInfoList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ChannelCatalogProductInfoList> getChannelCatalogProductInfoListWithHttpInfo(String channelCatalogId, GetChannelCatalogProductInfoListRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getChannelCatalogProductInfoListValidateBeforeCall(channelCatalogId, request, null, null);
        Type localVarReturnType = new TypeToken<ChannelCatalogProductInfoList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get channel catalog product information list (asynchronously)
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param request The channel catalog product list filter (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getChannelCatalogProductInfoListAsync(String channelCatalogId, GetChannelCatalogProductInfoListRequest request, final ApiCallback<ChannelCatalogProductInfoList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getChannelCatalogProductInfoListValidateBeforeCall(channelCatalogId, request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ChannelCatalogProductInfoList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
