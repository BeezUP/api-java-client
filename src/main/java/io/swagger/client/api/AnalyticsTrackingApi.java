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
import io.swagger.client.model.StoreTrackingStatus;
import io.swagger.client.model.TrackedClicks;
import io.swagger.client.model.TrackedExternalOrders;
import io.swagger.client.model.TrackedOrders;
import io.swagger.client.model.TrackingStatus;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyticsTrackingApi {
    private ApiClient apiClient;

    public AnalyticsTrackingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AnalyticsTrackingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getStoreTrackedClicks */
    private com.squareup.okhttp.Call getStoreTrackedClicksCall(String storeId, Integer count, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/user/analytics/{storeId}/tracking/clicks".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "storeId" + "\\}", apiClient.escapeString(storeId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (count != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));

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
    private com.squareup.okhttp.Call getStoreTrackedClicksValidateBeforeCall(String storeId, Integer count, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new ApiException("Missing the required parameter 'storeId' when calling getStoreTrackedClicks(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getStoreTrackedClicksCall(storeId, count, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get the latest clicks tracked
     * 
     * @param storeId Your store identifier (required)
     * @param count The click&#39;s count you want to get (optional, default to 100)
     * @return TrackedClicks
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TrackedClicks getStoreTrackedClicks(String storeId, Integer count) throws ApiException {
        ApiResponse<TrackedClicks> resp = getStoreTrackedClicksWithHttpInfo(storeId, count);
        return resp.getData();
    }

    /**
     * Get the latest clicks tracked
     * 
     * @param storeId Your store identifier (required)
     * @param count The click&#39;s count you want to get (optional, default to 100)
     * @return ApiResponse&lt;TrackedClicks&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TrackedClicks> getStoreTrackedClicksWithHttpInfo(String storeId, Integer count) throws ApiException {
        com.squareup.okhttp.Call call = getStoreTrackedClicksValidateBeforeCall(storeId, count, null, null);
        Type localVarReturnType = new TypeToken<TrackedClicks>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the latest clicks tracked (asynchronously)
     * 
     * @param storeId Your store identifier (required)
     * @param count The click&#39;s count you want to get (optional, default to 100)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStoreTrackedClicksAsync(String storeId, Integer count, final ApiCallback<TrackedClicks> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStoreTrackedClicksValidateBeforeCall(storeId, count, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TrackedClicks>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getStoreTrackedExternalOrders */
    private com.squareup.okhttp.Call getStoreTrackedExternalOrdersCall(String storeId, Integer count, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/user/analytics/{storeId}/tracking/externalorders".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "storeId" + "\\}", apiClient.escapeString(storeId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (count != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));

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
    private com.squareup.okhttp.Call getStoreTrackedExternalOrdersValidateBeforeCall(String storeId, Integer count, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new ApiException("Missing the required parameter 'storeId' when calling getStoreTrackedExternalOrders(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getStoreTrackedExternalOrdersCall(storeId, count, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get the latest external orders tracked
     * 
     * @param storeId Your store identifier (required)
     * @param count The external order&#39;s count you want to get (optional, default to 100)
     * @return TrackedExternalOrders
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TrackedExternalOrders getStoreTrackedExternalOrders(String storeId, Integer count) throws ApiException {
        ApiResponse<TrackedExternalOrders> resp = getStoreTrackedExternalOrdersWithHttpInfo(storeId, count);
        return resp.getData();
    }

    /**
     * Get the latest external orders tracked
     * 
     * @param storeId Your store identifier (required)
     * @param count The external order&#39;s count you want to get (optional, default to 100)
     * @return ApiResponse&lt;TrackedExternalOrders&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TrackedExternalOrders> getStoreTrackedExternalOrdersWithHttpInfo(String storeId, Integer count) throws ApiException {
        com.squareup.okhttp.Call call = getStoreTrackedExternalOrdersValidateBeforeCall(storeId, count, null, null);
        Type localVarReturnType = new TypeToken<TrackedExternalOrders>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the latest external orders tracked (asynchronously)
     * 
     * @param storeId Your store identifier (required)
     * @param count The external order&#39;s count you want to get (optional, default to 100)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStoreTrackedExternalOrdersAsync(String storeId, Integer count, final ApiCallback<TrackedExternalOrders> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStoreTrackedExternalOrdersValidateBeforeCall(storeId, count, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TrackedExternalOrders>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getStoreTrackedOrders */
    private com.squareup.okhttp.Call getStoreTrackedOrdersCall(String storeId, Integer count, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/user/analytics/{storeId}/tracking/orders".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "storeId" + "\\}", apiClient.escapeString(storeId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (count != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));

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
    private com.squareup.okhttp.Call getStoreTrackedOrdersValidateBeforeCall(String storeId, Integer count, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new ApiException("Missing the required parameter 'storeId' when calling getStoreTrackedOrders(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getStoreTrackedOrdersCall(storeId, count, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get the latest orders tracked
     * 
     * @param storeId Your store identifier (required)
     * @param count The order&#39;s count you want to get (optional, default to 100)
     * @return TrackedOrders
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TrackedOrders getStoreTrackedOrders(String storeId, Integer count) throws ApiException {
        ApiResponse<TrackedOrders> resp = getStoreTrackedOrdersWithHttpInfo(storeId, count);
        return resp.getData();
    }

    /**
     * Get the latest orders tracked
     * 
     * @param storeId Your store identifier (required)
     * @param count The order&#39;s count you want to get (optional, default to 100)
     * @return ApiResponse&lt;TrackedOrders&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TrackedOrders> getStoreTrackedOrdersWithHttpInfo(String storeId, Integer count) throws ApiException {
        com.squareup.okhttp.Call call = getStoreTrackedOrdersValidateBeforeCall(storeId, count, null, null);
        Type localVarReturnType = new TypeToken<TrackedOrders>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the latest orders tracked (asynchronously)
     * 
     * @param storeId Your store identifier (required)
     * @param count The order&#39;s count you want to get (optional, default to 100)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStoreTrackedOrdersAsync(String storeId, Integer count, final ApiCallback<TrackedOrders> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStoreTrackedOrdersValidateBeforeCall(storeId, count, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TrackedOrders>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getStoreTrackingStatus */
    private com.squareup.okhttp.Call getStoreTrackingStatusCall(String storeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/user/analytics/{storeId}/tracking/status".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "storeId" + "\\}", apiClient.escapeString(storeId.toString()));

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
    private com.squareup.okhttp.Call getStoreTrackingStatusValidateBeforeCall(String storeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new ApiException("Missing the required parameter 'storeId' when calling getStoreTrackingStatus(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getStoreTrackingStatusCall(storeId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get store tracking synchronization status
     * Your clicks and orders are eventually consistent. \\ This operation indicates you at which date the projections are for this store. 
     * @param storeId Your store identifier (required)
     * @return StoreTrackingStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StoreTrackingStatus getStoreTrackingStatus(String storeId) throws ApiException {
        ApiResponse<StoreTrackingStatus> resp = getStoreTrackingStatusWithHttpInfo(storeId);
        return resp.getData();
    }

    /**
     * Get store tracking synchronization status
     * Your clicks and orders are eventually consistent. \\ This operation indicates you at which date the projections are for this store. 
     * @param storeId Your store identifier (required)
     * @return ApiResponse&lt;StoreTrackingStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StoreTrackingStatus> getStoreTrackingStatusWithHttpInfo(String storeId) throws ApiException {
        com.squareup.okhttp.Call call = getStoreTrackingStatusValidateBeforeCall(storeId, null, null);
        Type localVarReturnType = new TypeToken<StoreTrackingStatus>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get store tracking synchronization status (asynchronously)
     * Your clicks and orders are eventually consistent. \\ This operation indicates you at which date the projections are for this store. 
     * @param storeId Your store identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStoreTrackingStatusAsync(String storeId, final ApiCallback<StoreTrackingStatus> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStoreTrackingStatusValidateBeforeCall(storeId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<StoreTrackingStatus>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTrackingStatus */
    private com.squareup.okhttp.Call getTrackingStatusCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/user/analytics/tracking/status".replaceAll("\\{format\\}","json");

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
    private com.squareup.okhttp.Call getTrackingStatusValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getTrackingStatusCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Display the synchronization status of the clicks and orders
     * Your clicks and orders are eventually consistent. \\ This operation indicates you at which date the projections are. 
     * @return TrackingStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TrackingStatus getTrackingStatus() throws ApiException {
        ApiResponse<TrackingStatus> resp = getTrackingStatusWithHttpInfo();
        return resp.getData();
    }

    /**
     * Display the synchronization status of the clicks and orders
     * Your clicks and orders are eventually consistent. \\ This operation indicates you at which date the projections are. 
     * @return ApiResponse&lt;TrackingStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TrackingStatus> getTrackingStatusWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getTrackingStatusValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<TrackingStatus>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Display the synchronization status of the clicks and orders (asynchronously)
     * Your clicks and orders are eventually consistent. \\ This operation indicates you at which date the projections are. 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTrackingStatusAsync(final ApiCallback<TrackingStatus> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTrackingStatusValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TrackingStatus>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}