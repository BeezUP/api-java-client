/*
 * Marketplaces - Channel catalogs
 * This API allows you to manage your channel catalogs\\' marketplace settings and fetch your account\\'s catalog publication history
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
import io.swagger.client.model.ChannelCatalogMarketplaceProperties;
import io.swagger.client.model.ChannelCatalogMarketplaceSettings;
import io.swagger.client.model.SetChannelCatalogMarketplaceSettingsRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarketplacesChannelCatalogsSettingsApi {
    private ApiClient apiClient;

    public MarketplacesChannelCatalogsSettingsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MarketplacesChannelCatalogsSettingsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getChannelCatalogMarketplaceProperties */
    private com.squareup.okhttp.Call getChannelCatalogMarketplacePropertiesCall(String channelCatalogId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/{channelCatalogId}/properties".replaceAll("\\{format\\}","json")
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
    private com.squareup.okhttp.Call getChannelCatalogMarketplacePropertiesValidateBeforeCall(String channelCatalogId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'channelCatalogId' is set
        if (channelCatalogId == null) {
            throw new ApiException("Missing the required parameter 'channelCatalogId' when calling getChannelCatalogMarketplaceProperties(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getChannelCatalogMarketplacePropertiesCall(channelCatalogId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get the marketplace properties for a channel catalog
     * 
     * @param channelCatalogId  (required)
     * @return ChannelCatalogMarketplaceProperties
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ChannelCatalogMarketplaceProperties getChannelCatalogMarketplaceProperties(String channelCatalogId) throws ApiException {
        ApiResponse<ChannelCatalogMarketplaceProperties> resp = getChannelCatalogMarketplacePropertiesWithHttpInfo(channelCatalogId);
        return resp.getData();
    }

    /**
     * Get the marketplace properties for a channel catalog
     * 
     * @param channelCatalogId  (required)
     * @return ApiResponse&lt;ChannelCatalogMarketplaceProperties&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ChannelCatalogMarketplaceProperties> getChannelCatalogMarketplacePropertiesWithHttpInfo(String channelCatalogId) throws ApiException {
        com.squareup.okhttp.Call call = getChannelCatalogMarketplacePropertiesValidateBeforeCall(channelCatalogId, null, null);
        Type localVarReturnType = new TypeToken<ChannelCatalogMarketplaceProperties>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the marketplace properties for a channel catalog (asynchronously)
     * 
     * @param channelCatalogId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getChannelCatalogMarketplacePropertiesAsync(String channelCatalogId, final ApiCallback<ChannelCatalogMarketplaceProperties> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getChannelCatalogMarketplacePropertiesValidateBeforeCall(channelCatalogId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ChannelCatalogMarketplaceProperties>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getChannelCatalogMarketplaceSettings */
    private com.squareup.okhttp.Call getChannelCatalogMarketplaceSettingsCall(String channelCatalogId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/{channelCatalogId}/settings".replaceAll("\\{format\\}","json")
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
    private com.squareup.okhttp.Call getChannelCatalogMarketplaceSettingsValidateBeforeCall(String channelCatalogId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'channelCatalogId' is set
        if (channelCatalogId == null) {
            throw new ApiException("Missing the required parameter 'channelCatalogId' when calling getChannelCatalogMarketplaceSettings(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getChannelCatalogMarketplaceSettingsCall(channelCatalogId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get the marketplace settings for a channel catalog
     * 
     * @param channelCatalogId Channel Catalog Id to query (required) (required)
     * @return ChannelCatalogMarketplaceSettings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ChannelCatalogMarketplaceSettings getChannelCatalogMarketplaceSettings(String channelCatalogId) throws ApiException {
        ApiResponse<ChannelCatalogMarketplaceSettings> resp = getChannelCatalogMarketplaceSettingsWithHttpInfo(channelCatalogId);
        return resp.getData();
    }

    /**
     * Get the marketplace settings for a channel catalog
     * 
     * @param channelCatalogId Channel Catalog Id to query (required) (required)
     * @return ApiResponse&lt;ChannelCatalogMarketplaceSettings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ChannelCatalogMarketplaceSettings> getChannelCatalogMarketplaceSettingsWithHttpInfo(String channelCatalogId) throws ApiException {
        com.squareup.okhttp.Call call = getChannelCatalogMarketplaceSettingsValidateBeforeCall(channelCatalogId, null, null);
        Type localVarReturnType = new TypeToken<ChannelCatalogMarketplaceSettings>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the marketplace settings for a channel catalog (asynchronously)
     * 
     * @param channelCatalogId Channel Catalog Id to query (required) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getChannelCatalogMarketplaceSettingsAsync(String channelCatalogId, final ApiCallback<ChannelCatalogMarketplaceSettings> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getChannelCatalogMarketplaceSettingsValidateBeforeCall(channelCatalogId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ChannelCatalogMarketplaceSettings>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for setChannelCatalogMarketplaceSettings */
    private com.squareup.okhttp.Call setChannelCatalogMarketplaceSettingsCall(String channelCatalogId, SetChannelCatalogMarketplaceSettingsRequest model, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = model;
        
        // create path and map variables
        String localVarPath = "/{channelCatalogId}/settings".replaceAll("\\{format\\}","json")
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
    private com.squareup.okhttp.Call setChannelCatalogMarketplaceSettingsValidateBeforeCall(String channelCatalogId, SetChannelCatalogMarketplaceSettingsRequest model, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'channelCatalogId' is set
        if (channelCatalogId == null) {
            throw new ApiException("Missing the required parameter 'channelCatalogId' when calling setChannelCatalogMarketplaceSettings(Async)");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new ApiException("Missing the required parameter 'model' when calling setChannelCatalogMarketplaceSettings(Async)");
        }
        
        
        com.squareup.okhttp.Call call = setChannelCatalogMarketplaceSettingsCall(channelCatalogId, model, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Save new marketplace settings for a channel catalog
     * Allow you to configure your marketplace settings.  Partial update accepted. 
     * @param channelCatalogId Channel Catalog Id to query (required)
     * @param model Settings to save (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void setChannelCatalogMarketplaceSettings(String channelCatalogId, SetChannelCatalogMarketplaceSettingsRequest model) throws ApiException {
        setChannelCatalogMarketplaceSettingsWithHttpInfo(channelCatalogId, model);
    }

    /**
     * Save new marketplace settings for a channel catalog
     * Allow you to configure your marketplace settings.  Partial update accepted. 
     * @param channelCatalogId Channel Catalog Id to query (required)
     * @param model Settings to save (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> setChannelCatalogMarketplaceSettingsWithHttpInfo(String channelCatalogId, SetChannelCatalogMarketplaceSettingsRequest model) throws ApiException {
        com.squareup.okhttp.Call call = setChannelCatalogMarketplaceSettingsValidateBeforeCall(channelCatalogId, model, null, null);
        return apiClient.execute(call);
    }

    /**
     * Save new marketplace settings for a channel catalog (asynchronously)
     * Allow you to configure your marketplace settings.  Partial update accepted. 
     * @param channelCatalogId Channel Catalog Id to query (required)
     * @param model Settings to save (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call setChannelCatalogMarketplaceSettingsAsync(String channelCatalogId, SetChannelCatalogMarketplaceSettingsRequest model, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = setChannelCatalogMarketplaceSettingsValidateBeforeCall(channelCatalogId, model, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
