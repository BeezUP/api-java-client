/*
 * User - List of Values
 * This API gives you access to list of values.
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


import io.swagger.client.model.BeezUPCommonLOVLink2;
import io.swagger.client.model.BeezUPCommonListOfValueItem;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LOVApi {
    private ApiClient apiClient;

    public LOVApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LOVApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getUserListNames */
    private com.squareup.okhttp.Call getUserListNamesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/".replaceAll("\\{format\\}","json");

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
    private com.squareup.okhttp.Call getUserListNamesValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getUserListNamesCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get all list names
     * 
     * @return List&lt;BeezUPCommonLOVLink2&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<BeezUPCommonLOVLink2> getUserListNames() throws ApiException {
        ApiResponse<List<BeezUPCommonLOVLink2>> resp = getUserListNamesWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get all list names
     * 
     * @return ApiResponse&lt;List&lt;BeezUPCommonLOVLink2&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<BeezUPCommonLOVLink2>> getUserListNamesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getUserListNamesValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<BeezUPCommonLOVLink2>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all list names (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUserListNamesAsync(final ApiCallback<List<BeezUPCommonLOVLink2>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUserListNamesValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<BeezUPCommonLOVLink2>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getUserListOfValues */
    private com.squareup.okhttp.Call getUserListOfValuesCall(String listName, List<String> acceptLanguage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/{listName}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "listName" + "\\}", apiClient.escapeString(listName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (acceptLanguage != null)
        localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));

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
    private com.squareup.okhttp.Call getUserListOfValuesValidateBeforeCall(String listName, List<String> acceptLanguage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'listName' is set
        if (listName == null) {
            throw new ApiException("Missing the required parameter 'listName' when calling getUserListOfValues(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getUserListOfValuesCall(listName, acceptLanguage, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get the list of values related to this list name
     * 
     * @param listName The list of value name your want to get (required)
     * @param acceptLanguage Indicates that the client accepts the following languages. (optional)
     * @return List&lt;BeezUPCommonListOfValueItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<BeezUPCommonListOfValueItem> getUserListOfValues(String listName, List<String> acceptLanguage) throws ApiException {
        ApiResponse<List<BeezUPCommonListOfValueItem>> resp = getUserListOfValuesWithHttpInfo(listName, acceptLanguage);
        return resp.getData();
    }

    /**
     * Get the list of values related to this list name
     * 
     * @param listName The list of value name your want to get (required)
     * @param acceptLanguage Indicates that the client accepts the following languages. (optional)
     * @return ApiResponse&lt;List&lt;BeezUPCommonListOfValueItem&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<BeezUPCommonListOfValueItem>> getUserListOfValuesWithHttpInfo(String listName, List<String> acceptLanguage) throws ApiException {
        com.squareup.okhttp.Call call = getUserListOfValuesValidateBeforeCall(listName, acceptLanguage, null, null);
        Type localVarReturnType = new TypeToken<List<BeezUPCommonListOfValueItem>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the list of values related to this list name (asynchronously)
     * 
     * @param listName The list of value name your want to get (required)
     * @param acceptLanguage Indicates that the client accepts the following languages. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUserListOfValuesAsync(String listName, List<String> acceptLanguage, final ApiCallback<List<BeezUPCommonListOfValueItem>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUserListOfValuesValidateBeforeCall(listName, acceptLanguage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<BeezUPCommonListOfValueItem>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
