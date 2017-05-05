/*
 * Marketplaces - Orders
 * The features exposed in this API are centered around managing Orders harvested from your configured marketplaces.\\ This includes: - fetching current information (as known by BeezUP) for a single or multiple Orders, - requesting Order harvest to synchronize your marketplaces and BeezUP accounts, - changing BeezUP data and requesting changes to your marketplaces (accepting, shipping, etc), - configuring automatic changes to marketplace based our newly fetched data, - creating and exporting reports for your Orders. 
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


import io.swagger.client.model.BatchOrderOperationResponse;
import io.swagger.client.model.BeezUPCommonErrorResponseMessage;
import io.swagger.client.model.ChangeOrderListRequest;
import io.swagger.client.model.ClearMerchantOrderInfoListRequest;
import io.swagger.client.model.SetMerchantOrderInfoListRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BatchesApi {
    private ApiClient apiClient;

    public BatchesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BatchesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for changeOrderList */
    private com.squareup.okhttp.Call changeOrderListCall(String changeOrderType, String userName, ChangeOrderListRequest request, Boolean testMode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;
        
        // create path and map variables
        String localVarPath = "/batches/changeOrders/{changeOrderType}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "changeOrderType" + "\\}", apiClient.escapeString(changeOrderType.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (userName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userName", userName));
        if (testMode != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "testMode", testMode));

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
    private com.squareup.okhttp.Call changeOrderListValidateBeforeCall(String changeOrderType, String userName, ChangeOrderListRequest request, Boolean testMode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'changeOrderType' is set
        if (changeOrderType == null) {
            throw new ApiException("Missing the required parameter 'changeOrderType' when calling changeOrderList(Async)");
        }
        
        // verify the required parameter 'userName' is set
        if (userName == null) {
            throw new ApiException("Missing the required parameter 'userName' when calling changeOrderList(Async)");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling changeOrderList(Async)");
        }
        
        
        com.squareup.okhttp.Call call = changeOrderListCall(changeOrderType, userName, request, testMode, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Send a batch of operations to change your marketplace Order information (accept, ship, etc.)
     * The purpose of this operation is to reduce the amount of request to the API.
     * @param changeOrderType The Order change type (required)
     * @param userName Sometimes the user in the e-commerce application is not the same as user associated with the current subscription key. We recommend providing your application&#39;s user login. (required)
     * @param request  (required)
     * @param testMode If true, the operation will be not be sent to marketplace. But the validation will be taken in account. (optional, default to false)
     * @return BatchOrderOperationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BatchOrderOperationResponse changeOrderList(String changeOrderType, String userName, ChangeOrderListRequest request, Boolean testMode) throws ApiException {
        ApiResponse<BatchOrderOperationResponse> resp = changeOrderListWithHttpInfo(changeOrderType, userName, request, testMode);
        return resp.getData();
    }

    /**
     * Send a batch of operations to change your marketplace Order information (accept, ship, etc.)
     * The purpose of this operation is to reduce the amount of request to the API.
     * @param changeOrderType The Order change type (required)
     * @param userName Sometimes the user in the e-commerce application is not the same as user associated with the current subscription key. We recommend providing your application&#39;s user login. (required)
     * @param request  (required)
     * @param testMode If true, the operation will be not be sent to marketplace. But the validation will be taken in account. (optional, default to false)
     * @return ApiResponse&lt;BatchOrderOperationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BatchOrderOperationResponse> changeOrderListWithHttpInfo(String changeOrderType, String userName, ChangeOrderListRequest request, Boolean testMode) throws ApiException {
        com.squareup.okhttp.Call call = changeOrderListValidateBeforeCall(changeOrderType, userName, request, testMode, null, null);
        Type localVarReturnType = new TypeToken<BatchOrderOperationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Send a batch of operations to change your marketplace Order information (accept, ship, etc.) (asynchronously)
     * The purpose of this operation is to reduce the amount of request to the API.
     * @param changeOrderType The Order change type (required)
     * @param userName Sometimes the user in the e-commerce application is not the same as user associated with the current subscription key. We recommend providing your application&#39;s user login. (required)
     * @param request  (required)
     * @param testMode If true, the operation will be not be sent to marketplace. But the validation will be taken in account. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call changeOrderListAsync(String changeOrderType, String userName, ChangeOrderListRequest request, Boolean testMode, final ApiCallback<BatchOrderOperationResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = changeOrderListValidateBeforeCall(changeOrderType, userName, request, testMode, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BatchOrderOperationResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for clearMerchantOrderInfoList */
    private com.squareup.okhttp.Call clearMerchantOrderInfoListCall(ClearMerchantOrderInfoListRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;
        
        // create path and map variables
        String localVarPath = "/batches/clearMerchantOrderInfos".replaceAll("\\{format\\}","json");

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
    private com.squareup.okhttp.Call clearMerchantOrderInfoListValidateBeforeCall(ClearMerchantOrderInfoListRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling clearMerchantOrderInfoList(Async)");
        }
        
        
        com.squareup.okhttp.Call call = clearMerchantOrderInfoListCall(request, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Send a batch of operations to clear an Order&#39;s merchant information
     * The purpose of this operation is to reduce the amount of request to the API.
     * @param request  (required)
     * @return BatchOrderOperationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BatchOrderOperationResponse clearMerchantOrderInfoList(ClearMerchantOrderInfoListRequest request) throws ApiException {
        ApiResponse<BatchOrderOperationResponse> resp = clearMerchantOrderInfoListWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Send a batch of operations to clear an Order&#39;s merchant information
     * The purpose of this operation is to reduce the amount of request to the API.
     * @param request  (required)
     * @return ApiResponse&lt;BatchOrderOperationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BatchOrderOperationResponse> clearMerchantOrderInfoListWithHttpInfo(ClearMerchantOrderInfoListRequest request) throws ApiException {
        com.squareup.okhttp.Call call = clearMerchantOrderInfoListValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<BatchOrderOperationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Send a batch of operations to clear an Order&#39;s merchant information (asynchronously)
     * The purpose of this operation is to reduce the amount of request to the API.
     * @param request  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call clearMerchantOrderInfoListAsync(ClearMerchantOrderInfoListRequest request, final ApiCallback<BatchOrderOperationResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = clearMerchantOrderInfoListValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BatchOrderOperationResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for setMerchantOrderInfoList */
    private com.squareup.okhttp.Call setMerchantOrderInfoListCall(SetMerchantOrderInfoListRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;
        
        // create path and map variables
        String localVarPath = "/batches/setMerchantOrderInfos".replaceAll("\\{format\\}","json");

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
    private com.squareup.okhttp.Call setMerchantOrderInfoListValidateBeforeCall(SetMerchantOrderInfoListRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling setMerchantOrderInfoList(Async)");
        }
        
        
        com.squareup.okhttp.Call call = setMerchantOrderInfoListCall(request, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Send a batch of operations to set an Order&#39;s merchant information
     * The purpose of this operation is to reduce the amount of request to the API.
     * @param request  (required)
     * @return BatchOrderOperationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BatchOrderOperationResponse setMerchantOrderInfoList(SetMerchantOrderInfoListRequest request) throws ApiException {
        ApiResponse<BatchOrderOperationResponse> resp = setMerchantOrderInfoListWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Send a batch of operations to set an Order&#39;s merchant information
     * The purpose of this operation is to reduce the amount of request to the API.
     * @param request  (required)
     * @return ApiResponse&lt;BatchOrderOperationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BatchOrderOperationResponse> setMerchantOrderInfoListWithHttpInfo(SetMerchantOrderInfoListRequest request) throws ApiException {
        com.squareup.okhttp.Call call = setMerchantOrderInfoListValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<BatchOrderOperationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Send a batch of operations to set an Order&#39;s merchant information (asynchronously)
     * The purpose of this operation is to reduce the amount of request to the API.
     * @param request  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call setMerchantOrderInfoListAsync(SetMerchantOrderInfoListRequest request, final ApiCallback<BatchOrderOperationResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = setMerchantOrderInfoListValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BatchOrderOperationResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}