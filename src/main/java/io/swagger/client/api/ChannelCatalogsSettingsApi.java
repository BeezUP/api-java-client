/*
 * BeezUP API
 * # The REST API of BeezUP system ## Overview The REST APIs provide programmatic access to read and write BeezUP data.  Basically, with this API you will be able to do everything like you were with your browser on https://go.beezup.com !  The main features are: - Register and manage your account - Create and manage and share your stores with your friends/co-workers. - Import your product catalog and schedule the auto importation - Search the channels your want to use - Configure your channels for your catalogs to export your product information:     - cost and general settings     - category and columns mappings     - your will be able to create and manage your custom column     - put in place exlusion filters based on simple conditions on your product data     - override product values     - get product vision for a channel catalog scope - Analyze and optimize your performance of your catalogs on all yours channels with different type of reportings by day, channel, category and by product. - Automatize your optimisation by using rules! - And of course... Manage your orders harvested from all your marketplaces:     - Synchronize your orders in an uniformized way     - Get the available actions and update the order status - ...and more!  ## Authentication credentials The public API with the base path **_/v2/public** have been put in place to give you an entry point to our system for the user registration, login and lost password. The public API does not require any credentials. We give you the some public list of values and public channels for our public commercial web site [www.beezup.com](http://www.beezup.com).  The user API with the base path **_/v2/user** requires a token which is available on this page: https://go.beezup.com/Account/MyAccount  ## Things to keep in mind ### API Rate Limits - The BeezUP REST API is limited to 100 calls/minute.  ### Media type The default media type for requests and responses is application/json. Where noted, some operations support other content types. If no additional content type is mentioned for a specific operation, then the media type is application/json.  ### Required content type The required and default encoding for the request and responses is UTF8.  ### Required date time format All our date time are formatted in ISO 8601 format: 2014-06-24T16:25:00Z.  ### Base URL The Base URL of the BeezUP API Order Management REST API conforms to the following template.  https://api.beezup.com  All URLs returned by the BeezUP API are relative to this base URL, and all requests to the REST API must use this base URL template.  You can test our API on https://api-docs.beezup.com/swagger-ui\\ You can contact us on [gitter, #BeezUP/API](https://gitter.im/beezUP/API) 
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
import io.swagger.client.model.CostSettings;
import io.swagger.client.model.GeneralSettings;
import io.swagger.client.model.UpgradeOfferRequired;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChannelCatalogsSettingsApi {
    private ApiClient apiClient;

    public ChannelCatalogsSettingsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ChannelCatalogsSettingsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for configureChannelCatalogCostSettings */
    private com.squareup.okhttp.Call configureChannelCatalogCostSettingsCall(String channelCatalogId, CostSettings request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;
        
        // create path and map variables
        String localVarPath = "/user/channelCatalogs/{channelCatalogId}/settings/cost".replaceAll("\\{format\\}","json")
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
    private com.squareup.okhttp.Call configureChannelCatalogCostSettingsValidateBeforeCall(String channelCatalogId, CostSettings request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'channelCatalogId' is set
        if (channelCatalogId == null) {
            throw new ApiException("Missing the required parameter 'channelCatalogId' when calling configureChannelCatalogCostSettings(Async)");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling configureChannelCatalogCostSettings(Async)");
        }
        
        
        com.squareup.okhttp.Call call = configureChannelCatalogCostSettingsCall(channelCatalogId, request, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Disable a channel catalog
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param request  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void configureChannelCatalogCostSettings(String channelCatalogId, CostSettings request) throws ApiException {
        configureChannelCatalogCostSettingsWithHttpInfo(channelCatalogId, request);
    }

    /**
     * Disable a channel catalog
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param request  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> configureChannelCatalogCostSettingsWithHttpInfo(String channelCatalogId, CostSettings request) throws ApiException {
        com.squareup.okhttp.Call call = configureChannelCatalogCostSettingsValidateBeforeCall(channelCatalogId, request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Disable a channel catalog (asynchronously)
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param request  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call configureChannelCatalogCostSettingsAsync(String channelCatalogId, CostSettings request, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = configureChannelCatalogCostSettingsValidateBeforeCall(channelCatalogId, request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for configureChannelCatalogGeneralSettings */
    private com.squareup.okhttp.Call configureChannelCatalogGeneralSettingsCall(String channelCatalogId, GeneralSettings request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;
        
        // create path and map variables
        String localVarPath = "/user/channelCatalogs/{channelCatalogId}/settings/general".replaceAll("\\{format\\}","json")
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
    private com.squareup.okhttp.Call configureChannelCatalogGeneralSettingsValidateBeforeCall(String channelCatalogId, GeneralSettings request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'channelCatalogId' is set
        if (channelCatalogId == null) {
            throw new ApiException("Missing the required parameter 'channelCatalogId' when calling configureChannelCatalogGeneralSettings(Async)");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling configureChannelCatalogGeneralSettings(Async)");
        }
        
        
        com.squareup.okhttp.Call call = configureChannelCatalogGeneralSettingsCall(channelCatalogId, request, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Disable a channel catalog
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param request  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void configureChannelCatalogGeneralSettings(String channelCatalogId, GeneralSettings request) throws ApiException {
        configureChannelCatalogGeneralSettingsWithHttpInfo(channelCatalogId, request);
    }

    /**
     * Disable a channel catalog
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param request  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> configureChannelCatalogGeneralSettingsWithHttpInfo(String channelCatalogId, GeneralSettings request) throws ApiException {
        com.squareup.okhttp.Call call = configureChannelCatalogGeneralSettingsValidateBeforeCall(channelCatalogId, request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Disable a channel catalog (asynchronously)
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param request  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call configureChannelCatalogGeneralSettingsAsync(String channelCatalogId, GeneralSettings request, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = configureChannelCatalogGeneralSettingsValidateBeforeCall(channelCatalogId, request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for disableChannelCatalog */
    private com.squareup.okhttp.Call disableChannelCatalogCall(String channelCatalogId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/user/channelCatalogs/{channelCatalogId}/disable".replaceAll("\\{format\\}","json")
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
    private com.squareup.okhttp.Call disableChannelCatalogValidateBeforeCall(String channelCatalogId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'channelCatalogId' is set
        if (channelCatalogId == null) {
            throw new ApiException("Missing the required parameter 'channelCatalogId' when calling disableChannelCatalog(Async)");
        }
        
        
        com.squareup.okhttp.Call call = disableChannelCatalogCall(channelCatalogId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Disable a channel catalog
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void disableChannelCatalog(String channelCatalogId) throws ApiException {
        disableChannelCatalogWithHttpInfo(channelCatalogId);
    }

    /**
     * Disable a channel catalog
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> disableChannelCatalogWithHttpInfo(String channelCatalogId) throws ApiException {
        com.squareup.okhttp.Call call = disableChannelCatalogValidateBeforeCall(channelCatalogId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Disable a channel catalog (asynchronously)
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call disableChannelCatalogAsync(String channelCatalogId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = disableChannelCatalogValidateBeforeCall(channelCatalogId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for enableChannelCatalog */
    private com.squareup.okhttp.Call enableChannelCatalogCall(String channelCatalogId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/user/channelCatalogs/{channelCatalogId}/enable".replaceAll("\\{format\\}","json")
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
    private com.squareup.okhttp.Call enableChannelCatalogValidateBeforeCall(String channelCatalogId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'channelCatalogId' is set
        if (channelCatalogId == null) {
            throw new ApiException("Missing the required parameter 'channelCatalogId' when calling enableChannelCatalog(Async)");
        }
        
        
        com.squareup.okhttp.Call call = enableChannelCatalogCall(channelCatalogId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Enable a channel catalog
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void enableChannelCatalog(String channelCatalogId) throws ApiException {
        enableChannelCatalogWithHttpInfo(channelCatalogId);
    }

    /**
     * Enable a channel catalog
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> enableChannelCatalogWithHttpInfo(String channelCatalogId) throws ApiException {
        com.squareup.okhttp.Call call = enableChannelCatalogValidateBeforeCall(channelCatalogId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Enable a channel catalog (asynchronously)
     * 
     * @param channelCatalogId The channel catalog identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call enableChannelCatalogAsync(String channelCatalogId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = enableChannelCatalogValidateBeforeCall(channelCatalogId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
