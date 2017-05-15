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
import io.swagger.client.model.PublicListOfValuesResponse;
import io.swagger.client.model.PublicLovIndex;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PublicListOfValuesLOVApi {
    private ApiClient apiClient;

    public PublicListOfValuesLOVApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PublicListOfValuesLOVApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getPublicListOfValues */
    private com.squareup.okhttp.Call getPublicListOfValuesCall(String listName, List<String> acceptLanguage, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/public/lov/{listName}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "listName" + "\\}", apiClient.escapeString(listName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (acceptLanguage != null)
        localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
        if (ifNoneMatch != null)
        localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPublicListOfValuesValidateBeforeCall(String listName, List<String> acceptLanguage, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'listName' is set
        if (listName == null) {
            throw new ApiException("Missing the required parameter 'listName' when calling getPublicListOfValues(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getPublicListOfValuesCall(listName, acceptLanguage, ifNoneMatch, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get the list of values related to this list name
     * 
     * @param listName The list of value name your want to get (required)
     * @param acceptLanguage Indicates that the client accepts the following languages. (optional)
     * @param ifNoneMatch ETag value to identify the last known version of requested resource.\\ To avoid useless exchange, we recommend you to indicate the ETag you previously got from this operation.\\ If the ETag value does not match the response will be 200 to give you a new content, otherwise the response will be: 304 Not Modified, without any content.\\ For more details go to this link: http://tools.ietf.org/html/rfc7232#section-2.3  (optional)
     * @return PublicListOfValuesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PublicListOfValuesResponse getPublicListOfValues(String listName, List<String> acceptLanguage, String ifNoneMatch) throws ApiException {
        ApiResponse<PublicListOfValuesResponse> resp = getPublicListOfValuesWithHttpInfo(listName, acceptLanguage, ifNoneMatch);
        return resp.getData();
    }

    /**
     * Get the list of values related to this list name
     * 
     * @param listName The list of value name your want to get (required)
     * @param acceptLanguage Indicates that the client accepts the following languages. (optional)
     * @param ifNoneMatch ETag value to identify the last known version of requested resource.\\ To avoid useless exchange, we recommend you to indicate the ETag you previously got from this operation.\\ If the ETag value does not match the response will be 200 to give you a new content, otherwise the response will be: 304 Not Modified, without any content.\\ For more details go to this link: http://tools.ietf.org/html/rfc7232#section-2.3  (optional)
     * @return ApiResponse&lt;PublicListOfValuesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PublicListOfValuesResponse> getPublicListOfValuesWithHttpInfo(String listName, List<String> acceptLanguage, String ifNoneMatch) throws ApiException {
        com.squareup.okhttp.Call call = getPublicListOfValuesValidateBeforeCall(listName, acceptLanguage, ifNoneMatch, null, null);
        Type localVarReturnType = new TypeToken<PublicListOfValuesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the list of values related to this list name (asynchronously)
     * 
     * @param listName The list of value name your want to get (required)
     * @param acceptLanguage Indicates that the client accepts the following languages. (optional)
     * @param ifNoneMatch ETag value to identify the last known version of requested resource.\\ To avoid useless exchange, we recommend you to indicate the ETag you previously got from this operation.\\ If the ETag value does not match the response will be 200 to give you a new content, otherwise the response will be: 304 Not Modified, without any content.\\ For more details go to this link: http://tools.ietf.org/html/rfc7232#section-2.3  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPublicListOfValuesAsync(String listName, List<String> acceptLanguage, String ifNoneMatch, final ApiCallback<PublicListOfValuesResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPublicListOfValuesValidateBeforeCall(listName, acceptLanguage, ifNoneMatch, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PublicListOfValuesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getPublicLovIndex */
    private com.squareup.okhttp.Call getPublicLovIndexCall(String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/public/lov/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null)
        localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPublicLovIndexValidateBeforeCall(String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getPublicLovIndexCall(ifNoneMatch, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get all list names
     * 
     * @param ifNoneMatch ETag value to identify the last known version of requested resource.\\ To avoid useless exchange, we recommend you to indicate the ETag you previously got from this operation.\\ If the ETag value does not match the response will be 200 to give you a new content, otherwise the response will be: 304 Not Modified, without any content.\\ For more details go to this link: http://tools.ietf.org/html/rfc7232#section-2.3  (optional)
     * @return PublicLovIndex
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PublicLovIndex getPublicLovIndex(String ifNoneMatch) throws ApiException {
        ApiResponse<PublicLovIndex> resp = getPublicLovIndexWithHttpInfo(ifNoneMatch);
        return resp.getData();
    }

    /**
     * Get all list names
     * 
     * @param ifNoneMatch ETag value to identify the last known version of requested resource.\\ To avoid useless exchange, we recommend you to indicate the ETag you previously got from this operation.\\ If the ETag value does not match the response will be 200 to give you a new content, otherwise the response will be: 304 Not Modified, without any content.\\ For more details go to this link: http://tools.ietf.org/html/rfc7232#section-2.3  (optional)
     * @return ApiResponse&lt;PublicLovIndex&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PublicLovIndex> getPublicLovIndexWithHttpInfo(String ifNoneMatch) throws ApiException {
        com.squareup.okhttp.Call call = getPublicLovIndexValidateBeforeCall(ifNoneMatch, null, null);
        Type localVarReturnType = new TypeToken<PublicLovIndex>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all list names (asynchronously)
     * 
     * @param ifNoneMatch ETag value to identify the last known version of requested resource.\\ To avoid useless exchange, we recommend you to indicate the ETag you previously got from this operation.\\ If the ETag value does not match the response will be 200 to give you a new content, otherwise the response will be: 304 Not Modified, without any content.\\ For more details go to this link: http://tools.ietf.org/html/rfc7232#section-2.3  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPublicLovIndexAsync(String ifNoneMatch, final ApiCallback<PublicLovIndex> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPublicLovIndexValidateBeforeCall(ifNoneMatch, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PublicLovIndex>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
