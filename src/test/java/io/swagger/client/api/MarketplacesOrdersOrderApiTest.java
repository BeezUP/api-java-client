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

import io.swagger.client.ApiException;
import io.swagger.client.model.BeezUPCommonErrorResponseMessage;
import io.swagger.client.model.ChangeOrderRequest;
import io.swagger.client.model.Order;
import io.swagger.client.model.OrderHistory;
import io.swagger.client.model.SetMerchantOrderInfoRequest;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MarketplacesOrdersOrderApi
 */
@Ignore
public class MarketplacesOrdersOrderApiTest {

    private final MarketplacesOrdersOrderApi api = new MarketplacesOrdersOrderApi();

    
    /**
     * Change your marketplace Order Information (accept, ship, etc.)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void changeOrderTest() throws ApiException {
        String marketplaceTechnicalCode = null;
        Integer accountId = null;
        UUID beezUPOrderId = null;
        String changeOrderType = null;
        String userName = null;
        ChangeOrderRequest request = null;
        String ifMatch = null;
        Boolean testMode = null;
        api.changeOrder(marketplaceTechnicalCode, accountId, beezUPOrderId, changeOrderType, userName, request, ifMatch, testMode);

        // TODO: test validations
    }
    
    /**
     * Clear an Order&#39;s merchant information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clearMerchantOrderInfoTest() throws ApiException {
        String marketplaceTechnicalCode = null;
        Integer accountId = null;
        UUID beezUPOrderId = null;
        api.clearMerchantOrderInfo(marketplaceTechnicalCode, accountId, beezUPOrderId);

        // TODO: test validations
    }
    
    /**
     * Get full Order and Order Item(s) properties
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderTest() throws ApiException {
        String marketplaceTechnicalCode = null;
        Integer accountId = null;
        UUID beezUPOrderId = null;
        String ifNoneMatch = null;
        Order response = api.getOrder(marketplaceTechnicalCode, accountId, beezUPOrderId, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Get an Order&#39;s harvest and change history
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderHistoryTest() throws ApiException {
        String marketplaceTechnicalCode = null;
        Integer accountId = null;
        UUID beezUPOrderId = null;
        OrderHistory response = api.getOrderHistory(marketplaceTechnicalCode, accountId, beezUPOrderId);

        // TODO: test validations
    }
    
    /**
     * Send harvest request for a single Order
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void harvestOrderTest() throws ApiException {
        String marketplaceTechnicalCode = null;
        Integer accountId = null;
        UUID beezUPOrderId = null;
        api.harvestOrder(marketplaceTechnicalCode, accountId, beezUPOrderId);

        // TODO: test validations
    }
    
    /**
     * Set an Order&#39;s merchant information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setMerchantOrderInfoTest() throws ApiException {
        String marketplaceTechnicalCode = null;
        Integer accountId = null;
        UUID beezUPOrderId = null;
        SetMerchantOrderInfoRequest request = null;
        api.setMerchantOrderInfo(marketplaceTechnicalCode, accountId, beezUPOrderId, request);

        // TODO: test validations
    }
    
}
