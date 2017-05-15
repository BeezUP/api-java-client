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

import io.swagger.client.ApiException;
import io.swagger.client.model.BatchOrderOperationResponse;
import io.swagger.client.model.BeezUPCommonErrorResponseMessage;
import io.swagger.client.model.ChangeOrderListRequest;
import io.swagger.client.model.ClearMerchantOrderInfoListRequest;
import io.swagger.client.model.SetMerchantOrderInfoListRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MarketplacesOrdersBatchesApi
 */
@Ignore
public class MarketplacesOrdersBatchesApiTest {

    private final MarketplacesOrdersBatchesApi api = new MarketplacesOrdersBatchesApi();

    
    /**
     * Send a batch of operations to change your marketplace Order information (accept, ship, etc.)
     *
     * The purpose of this operation is to reduce the amount of request to the API.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void changeOrderListTest() throws ApiException {
        String changeOrderType = null;
        String userName = null;
        ChangeOrderListRequest request = null;
        Boolean testMode = null;
        BatchOrderOperationResponse response = api.changeOrderList(changeOrderType, userName, request, testMode);

        // TODO: test validations
    }
    
    /**
     * Send a batch of operations to clear an Order&#39;s merchant information
     *
     * The purpose of this operation is to reduce the amount of request to the API.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clearMerchantOrderInfoListTest() throws ApiException {
        ClearMerchantOrderInfoListRequest request = null;
        BatchOrderOperationResponse response = api.clearMerchantOrderInfoList(request);

        // TODO: test validations
    }
    
    /**
     * Send a batch of operations to set an Order&#39;s merchant information
     *
     * The purpose of this operation is to reduce the amount of request to the API.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setMerchantOrderInfoListTest() throws ApiException {
        SetMerchantOrderInfoListRequest request = null;
        BatchOrderOperationResponse response = api.setMerchantOrderInfoList(request);

        // TODO: test validations
    }
    
}
