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


import io.swagger.client.model.AccountPublications;
import io.swagger.client.model.BeezUPCommonErrorResponseMessage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarketplacesChannelCatalogsPublicationsApi {
    private ApiClient apiClient;

    public MarketplacesChannelCatalogsPublicationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MarketplacesChannelCatalogsPublicationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getPublications */
    private com.squareup.okhttp.Call getPublicationsCall(String marketplaceTechnicalCode, Integer accountId, String channelCatalogId, Integer count, List<String> publicationTypes, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/user/marketplaces/channelcatalogs/publications/{marketplaceTechnicalCode}/{accountId}/history".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "marketplaceTechnicalCode" + "\\}", apiClient.escapeString(marketplaceTechnicalCode.toString()))
        .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (channelCatalogId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "channelCatalogId", channelCatalogId));
        if (count != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
        if (publicationTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "publicationTypes", publicationTypes));

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
    private com.squareup.okhttp.Call getPublicationsValidateBeforeCall(String marketplaceTechnicalCode, Integer accountId, String channelCatalogId, Integer count, List<String> publicationTypes, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'marketplaceTechnicalCode' is set
        if (marketplaceTechnicalCode == null) {
            throw new ApiException("Missing the required parameter 'marketplaceTechnicalCode' when calling getPublications(Async)");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling getPublications(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getPublicationsCall(marketplaceTechnicalCode, accountId, channelCatalogId, count, publicationTypes, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Fetch the publication history for an account, sorted by descending start date
     * 
     * @param marketplaceTechnicalCode Marketplace Technical Code to query (required) (required)
     * @param accountId Account Id to query (required) (required)
     * @param channelCatalogId Channel Catalog Id by which to filter (optional) (optional)
     * @param count Amount of entries to fetch (optional, default set to 10) (optional, default to 10)
     * @param publicationTypes Publication types by which to filter (optional) (optional)
     * @return AccountPublications
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccountPublications getPublications(String marketplaceTechnicalCode, Integer accountId, String channelCatalogId, Integer count, List<String> publicationTypes) throws ApiException {
        ApiResponse<AccountPublications> resp = getPublicationsWithHttpInfo(marketplaceTechnicalCode, accountId, channelCatalogId, count, publicationTypes);
        return resp.getData();
    }

    /**
     * Fetch the publication history for an account, sorted by descending start date
     * 
     * @param marketplaceTechnicalCode Marketplace Technical Code to query (required) (required)
     * @param accountId Account Id to query (required) (required)
     * @param channelCatalogId Channel Catalog Id by which to filter (optional) (optional)
     * @param count Amount of entries to fetch (optional, default set to 10) (optional, default to 10)
     * @param publicationTypes Publication types by which to filter (optional) (optional)
     * @return ApiResponse&lt;AccountPublications&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AccountPublications> getPublicationsWithHttpInfo(String marketplaceTechnicalCode, Integer accountId, String channelCatalogId, Integer count, List<String> publicationTypes) throws ApiException {
        com.squareup.okhttp.Call call = getPublicationsValidateBeforeCall(marketplaceTechnicalCode, accountId, channelCatalogId, count, publicationTypes, null, null);
        Type localVarReturnType = new TypeToken<AccountPublications>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Fetch the publication history for an account, sorted by descending start date (asynchronously)
     * 
     * @param marketplaceTechnicalCode Marketplace Technical Code to query (required) (required)
     * @param accountId Account Id to query (required) (required)
     * @param channelCatalogId Channel Catalog Id by which to filter (optional) (optional)
     * @param count Amount of entries to fetch (optional, default set to 10) (optional, default to 10)
     * @param publicationTypes Publication types by which to filter (optional) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPublicationsAsync(String marketplaceTechnicalCode, Integer accountId, String channelCatalogId, Integer count, List<String> publicationTypes, final ApiCallback<AccountPublications> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPublicationsValidateBeforeCall(marketplaceTechnicalCode, accountId, channelCatalogId, count, publicationTypes, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AccountPublications>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
