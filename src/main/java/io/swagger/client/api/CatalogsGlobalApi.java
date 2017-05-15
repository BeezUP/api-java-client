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


import io.swagger.client.model.BeezUPColumnConfiguration;
import io.swagger.client.model.BeezUPCommonErrorResponseMessage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CatalogsGlobalApi {
    private ApiClient apiClient;

    public CatalogsGlobalApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CatalogsGlobalApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for catalogGetBeezUPColumns */
    private com.squareup.okhttp.Call catalogGetBeezUPColumnsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/user/catalogs/beezupColumns".replaceAll("\\{format\\}","json");

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
    private com.squareup.okhttp.Call catalogGetBeezUPColumnsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = catalogGetBeezUPColumnsCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get the BeezUP columns
     * Get the BeezUP columns, this columns are used for mapping during the manual catalog importation process.
     * @return List&lt;BeezUPColumnConfiguration&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<BeezUPColumnConfiguration> catalogGetBeezUPColumns() throws ApiException {
        ApiResponse<List<BeezUPColumnConfiguration>> resp = catalogGetBeezUPColumnsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get the BeezUP columns
     * Get the BeezUP columns, this columns are used for mapping during the manual catalog importation process.
     * @return ApiResponse&lt;List&lt;BeezUPColumnConfiguration&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<BeezUPColumnConfiguration>> catalogGetBeezUPColumnsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = catalogGetBeezUPColumnsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<BeezUPColumnConfiguration>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the BeezUP columns (asynchronously)
     * Get the BeezUP columns, this columns are used for mapping during the manual catalog importation process.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call catalogGetBeezUPColumnsAsync(final ApiCallback<List<BeezUPColumnConfiguration>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = catalogGetBeezUPColumnsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<BeezUPColumnConfiguration>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
