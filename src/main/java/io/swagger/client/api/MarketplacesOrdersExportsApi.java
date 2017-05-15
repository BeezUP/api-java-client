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
import io.swagger.client.model.ExportOrderListRequest;
import io.swagger.client.model.OrderExportations;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarketplacesOrdersExportsApi {
    private ApiClient apiClient;

    public MarketplacesOrdersExportsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MarketplacesOrdersExportsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for exportOrders */
    private com.squareup.okhttp.Call exportOrdersCall(ExportOrderListRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;
        
        // create path and map variables
        String localVarPath = "/user/marketplaces/orders/exportations".replaceAll("\\{format\\}","json");

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
    private com.squareup.okhttp.Call exportOrdersValidateBeforeCall(ExportOrderListRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling exportOrders(Async)");
        }
        
        
        com.squareup.okhttp.Call call = exportOrdersCall(request, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Request a new Order report exportation to be generated
     * A new file will be generated containing a summary of all the Orders matching the requested filter settings.
     * @param request  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void exportOrders(ExportOrderListRequest request) throws ApiException {
        exportOrdersWithHttpInfo(request);
    }

    /**
     * Request a new Order report exportation to be generated
     * A new file will be generated containing a summary of all the Orders matching the requested filter settings.
     * @param request  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> exportOrdersWithHttpInfo(ExportOrderListRequest request) throws ApiException {
        com.squareup.okhttp.Call call = exportOrdersValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Request a new Order report exportation to be generated (asynchronously)
     * A new file will be generated containing a summary of all the Orders matching the requested filter settings.
     * @param request  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call exportOrdersAsync(ExportOrderListRequest request, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = exportOrdersValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getOrderExportations */
    private com.squareup.okhttp.Call getOrderExportationsCall(Integer pageNumber, Integer pageSize, String storeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/user/marketplaces/orders/exportations".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (pageNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageNumber", pageNumber));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
        if (storeId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "storeId", storeId));

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
    private com.squareup.okhttp.Call getOrderExportationsValidateBeforeCall(Integer pageNumber, Integer pageSize, String storeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'pageNumber' is set
        if (pageNumber == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling getOrderExportations(Async)");
        }
        
        // verify the required parameter 'pageSize' is set
        if (pageSize == null) {
            throw new ApiException("Missing the required parameter 'pageSize' when calling getOrderExportations(Async)");
        }
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new ApiException("Missing the required parameter 'storeId' when calling getOrderExportations(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getOrderExportationsCall(pageNumber, pageSize, storeId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a paginated list of Order report exportations
     * 
     * @param pageNumber The page number you want to get (required)
     * @param pageSize The entry count you want to get (required)
     * @param storeId The store identifier to regroup the order exportations (required)
     * @return OrderExportations
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OrderExportations getOrderExportations(Integer pageNumber, Integer pageSize, String storeId) throws ApiException {
        ApiResponse<OrderExportations> resp = getOrderExportationsWithHttpInfo(pageNumber, pageSize, storeId);
        return resp.getData();
    }

    /**
     * Get a paginated list of Order report exportations
     * 
     * @param pageNumber The page number you want to get (required)
     * @param pageSize The entry count you want to get (required)
     * @param storeId The store identifier to regroup the order exportations (required)
     * @return ApiResponse&lt;OrderExportations&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OrderExportations> getOrderExportationsWithHttpInfo(Integer pageNumber, Integer pageSize, String storeId) throws ApiException {
        com.squareup.okhttp.Call call = getOrderExportationsValidateBeforeCall(pageNumber, pageSize, storeId, null, null);
        Type localVarReturnType = new TypeToken<OrderExportations>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a paginated list of Order report exportations (asynchronously)
     * 
     * @param pageNumber The page number you want to get (required)
     * @param pageSize The entry count you want to get (required)
     * @param storeId The store identifier to regroup the order exportations (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOrderExportationsAsync(Integer pageNumber, Integer pageSize, String storeId, final ApiCallback<OrderExportations> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOrderExportationsValidateBeforeCall(pageNumber, pageSize, storeId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OrderExportations>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
