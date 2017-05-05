/*
 * BeezUP API
 * This is the RESTful API of BeezUP which allows you to manage everything related to BeezUP
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



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChannelCatalogsProductsOptimisationApi {
    private ApiClient apiClient;

    public ChannelCatalogsProductsOptimisationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ChannelCatalogsProductsOptimisationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for disableChannelCatalogProduct */
    private com.squareup.okhttp.Call disableChannelCatalogProductCall(String channelCatalogId, String productId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v2/user/channelCatalogs/{channelCatalogId}/products/{productId}/disable".replaceAll("\\{format\\}","json")
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call disableChannelCatalogProductValidateBeforeCall(String channelCatalogId, String productId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'channelCatalogId' is set
        if (channelCatalogId == null) {
            throw new ApiException("Missing the required parameter 'channelCatalogId' when calling disableChannelCatalogProduct(Async)");
        }
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException("Missing the required parameter 'productId' when calling disableChannelCatalogProduct(Async)");
        }
        
        
        com.squareup.okhttp.Call call = disableChannelCatalogProductCall(channelCatalogId, productId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Disable channel catalog product
     * By default a all your catalog products are exposed to the channel. You can disable a product by using this operation. /!\\ In case of massive optimisation we recommand you to use the analytics api 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param productId The product identifier (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void disableChannelCatalogProduct(String channelCatalogId, String productId) throws ApiException {
        disableChannelCatalogProductWithHttpInfo(channelCatalogId, productId);
    }

    /**
     * Disable channel catalog product
     * By default a all your catalog products are exposed to the channel. You can disable a product by using this operation. /!\\ In case of massive optimisation we recommand you to use the analytics api 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param productId The product identifier (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> disableChannelCatalogProductWithHttpInfo(String channelCatalogId, String productId) throws ApiException {
        com.squareup.okhttp.Call call = disableChannelCatalogProductValidateBeforeCall(channelCatalogId, productId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Disable channel catalog product (asynchronously)
     * By default a all your catalog products are exposed to the channel. You can disable a product by using this operation. /!\\ In case of massive optimisation we recommand you to use the analytics api 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param productId The product identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call disableChannelCatalogProductAsync(String channelCatalogId, String productId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = disableChannelCatalogProductValidateBeforeCall(channelCatalogId, productId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for reenableChannelCatalogProduct */
    private com.squareup.okhttp.Call reenableChannelCatalogProductCall(String channelCatalogId, String productId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v2/user/channelCatalogs/{channelCatalogId}/products/{productId}/reenable".replaceAll("\\{format\\}","json")
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call reenableChannelCatalogProductValidateBeforeCall(String channelCatalogId, String productId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'channelCatalogId' is set
        if (channelCatalogId == null) {
            throw new ApiException("Missing the required parameter 'channelCatalogId' when calling reenableChannelCatalogProduct(Async)");
        }
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException("Missing the required parameter 'productId' when calling reenableChannelCatalogProduct(Async)");
        }
        
        
        com.squareup.okhttp.Call call = reenableChannelCatalogProductCall(channelCatalogId, productId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Reenable channel catalog product
     * By default a all your catalog products are exposed to the channel. You can reenable a product by using this operation. /!\\ In case of massive optimisation we recommand you to use the analytics api 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param productId The product identifier (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void reenableChannelCatalogProduct(String channelCatalogId, String productId) throws ApiException {
        reenableChannelCatalogProductWithHttpInfo(channelCatalogId, productId);
    }

    /**
     * Reenable channel catalog product
     * By default a all your catalog products are exposed to the channel. You can reenable a product by using this operation. /!\\ In case of massive optimisation we recommand you to use the analytics api 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param productId The product identifier (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> reenableChannelCatalogProductWithHttpInfo(String channelCatalogId, String productId) throws ApiException {
        com.squareup.okhttp.Call call = reenableChannelCatalogProductValidateBeforeCall(channelCatalogId, productId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Reenable channel catalog product (asynchronously)
     * By default a all your catalog products are exposed to the channel. You can reenable a product by using this operation. /!\\ In case of massive optimisation we recommand you to use the analytics api 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param productId The product identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call reenableChannelCatalogProductAsync(String channelCatalogId, String productId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = reenableChannelCatalogProductValidateBeforeCall(channelCatalogId, productId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
