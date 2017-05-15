/*
 * Public - Security
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
import io.swagger.client.model.ChannelInfoList;
import io.swagger.client.model.PublicChannelIndex;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PublicChannelsPublicChannelsApi {
    private ApiClient apiClient;

    public PublicChannelsPublicChannelsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PublicChannelsPublicChannelsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getChannels */
    private com.squareup.okhttp.Call getChannelsCall(String countryIsoCode, List<String> acceptEncoding, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/public/channels/{countryIsoCode}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "countryIsoCode" + "\\}", apiClient.escapeString(countryIsoCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (acceptEncoding != null)
        localVarHeaderParams.put("Accept-Encoding", apiClient.parameterToString(acceptEncoding));

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
    private com.squareup.okhttp.Call getChannelsValidateBeforeCall(String countryIsoCode, List<String> acceptEncoding, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'countryIsoCode' is set
        if (countryIsoCode == null) {
            throw new ApiException("Missing the required parameter 'countryIsoCode' when calling getChannels(Async)");
        }
        
        // verify the required parameter 'acceptEncoding' is set
        if (acceptEncoding == null) {
            throw new ApiException("Missing the required parameter 'acceptEncoding' when calling getChannels(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getChannelsCall(countryIsoCode, acceptEncoding, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * The channel list for one country
     * 
     * @param countryIsoCode The country iso code alpha 3 based on this: https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3#Decoding_table \\ To know which country are available you have to use the operation: GetChannelsByCountry  (required)
     * @param acceptEncoding Allows the client to indicate wether it accepts a compressed encoding to reduce traffic size. (required)
     * @return ChannelInfoList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ChannelInfoList getChannels(String countryIsoCode, List<String> acceptEncoding) throws ApiException {
        ApiResponse<ChannelInfoList> resp = getChannelsWithHttpInfo(countryIsoCode, acceptEncoding);
        return resp.getData();
    }

    /**
     * The channel list for one country
     * 
     * @param countryIsoCode The country iso code alpha 3 based on this: https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3#Decoding_table \\ To know which country are available you have to use the operation: GetChannelsByCountry  (required)
     * @param acceptEncoding Allows the client to indicate wether it accepts a compressed encoding to reduce traffic size. (required)
     * @return ApiResponse&lt;ChannelInfoList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ChannelInfoList> getChannelsWithHttpInfo(String countryIsoCode, List<String> acceptEncoding) throws ApiException {
        com.squareup.okhttp.Call call = getChannelsValidateBeforeCall(countryIsoCode, acceptEncoding, null, null);
        Type localVarReturnType = new TypeToken<ChannelInfoList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * The channel list for one country (asynchronously)
     * 
     * @param countryIsoCode The country iso code alpha 3 based on this: https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3#Decoding_table \\ To know which country are available you have to use the operation: GetChannelsByCountry  (required)
     * @param acceptEncoding Allows the client to indicate wether it accepts a compressed encoding to reduce traffic size. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getChannelsAsync(String countryIsoCode, List<String> acceptEncoding, final ApiCallback<ChannelInfoList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getChannelsValidateBeforeCall(countryIsoCode, acceptEncoding, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ChannelInfoList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getChannelsIndex */
    private com.squareup.okhttp.Call getChannelsIndexCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/public/channels/".replaceAll("\\{format\\}","json");

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getChannelsIndexValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getChannelsIndexCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get public channel index
     * Use this operation to get the correct link to the channels and to the list of values
     * @return PublicChannelIndex
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PublicChannelIndex getChannelsIndex() throws ApiException {
        ApiResponse<PublicChannelIndex> resp = getChannelsIndexWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get public channel index
     * Use this operation to get the correct link to the channels and to the list of values
     * @return ApiResponse&lt;PublicChannelIndex&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PublicChannelIndex> getChannelsIndexWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getChannelsIndexValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<PublicChannelIndex>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get public channel index (asynchronously)
     * Use this operation to get the correct link to the channels and to the list of values
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getChannelsIndexAsync(final ApiCallback<PublicChannelIndex> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getChannelsIndexValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PublicChannelIndex>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
