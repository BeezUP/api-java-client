/*
 * BeezUP API
 * This is the RESTful API of BeezUP which allows you to manage everything related to BeezUP
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
import io.swagger.client.model.AccountSynchronizations;
import io.swagger.client.model.AutomaticTransitionInfos;
import io.swagger.client.model.BatchOrderOperationResponse;
import io.swagger.client.model.BeezUPCommonErrorResponseMessage;
import io.swagger.client.model.ChangeOrderListRequest;
import io.swagger.client.model.ChangeOrderRequest;
import io.swagger.client.model.ClearMerchantOrderInfoListRequest;
import io.swagger.client.model.ExportOrderListRequest;
import io.swagger.client.model.Order;
import io.swagger.client.model.OrderExportations;
import io.swagger.client.model.OrderHistory;
import io.swagger.client.model.OrderListFull;
import io.swagger.client.model.OrderListLight;
import io.swagger.client.model.OrderListRequest;
import io.swagger.client.model.SaveAutomaticTransitionRequest;
import io.swagger.client.model.SetMerchantOrderInfoListRequest;
import io.swagger.client.model.SetMerchantOrderInfoRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for V2UserMarketplacesOrdersApi
 */
@Ignore
public class V2UserMarketplacesOrdersApiTest {

    private final V2UserMarketplacesOrdersApi api = new V2UserMarketplacesOrdersApi();

    
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
        String beezUPOrderId = null;
        String changeOrderType = null;
        String userName = null;
        ChangeOrderRequest request = null;
        String ifMatch = null;
        Boolean testMode = null;
        api.changeOrder(marketplaceTechnicalCode, accountId, beezUPOrderId, changeOrderType, userName, request, ifMatch, testMode);

        // TODO: test validations
    }
    
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
        String beezUPOrderId = null;
        api.clearMerchantOrderInfo(marketplaceTechnicalCode, accountId, beezUPOrderId);

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
     * Configure new or existing automatic Order status transition
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void configureAutomaticTransitionsTest() throws ApiException {
        SaveAutomaticTransitionRequest request = null;
        api.configureAutomaticTransitions(request);

        // TODO: test validations
    }
    
    /**
     * Request a new Order report exportation to be generated
     *
     * A new file will be generated containing a summary of all the Orders matching the requested filter settings.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void exportOrdersTest() throws ApiException {
        String format = null;
        ExportOrderListRequest request = null;
        api.exportOrders(format, request);

        // TODO: test validations
    }
    
    /**
     * Get list of configured automatic Order status transitions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAutomaticTransitionsTest() throws ApiException {
        AutomaticTransitionInfos response = api.getAutomaticTransitions();

        // TODO: test validations
    }
    
    /**
     * Get current synchronization status between your marketplaces and BeezUP accounts
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMarketplaceAccountsSynchronizationTest() throws ApiException {
        AccountSynchronizations response = api.getMarketplaceAccountsSynchronization();

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
        String beezUPOrderId = null;
        String ifNoneMatch = null;
        Order response = api.getOrder(marketplaceTechnicalCode, accountId, beezUPOrderId, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Get a paginated list of Order report exportations
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderExportationsTest() throws ApiException {
        Integer pageNumber = null;
        Integer pageSize = null;
        OrderExportations response = api.getOrderExportations(pageNumber, pageSize);

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
        String beezUPOrderId = null;
        OrderHistory response = api.getOrderHistory(marketplaceTechnicalCode, accountId, beezUPOrderId);

        // TODO: test validations
    }
    
    /**
     * Get a paginated list of all Orders with all Order and Order Item(s) properties
     *
     * The purpose of this operation is to reduce the amount of request to the API.\\ \\ Previous implmentation of this feature only returned a partial (light) version of the Orders. The purpose of this API is to reduce the number of incoming requests by returning the complete (full) Order and Order Item(s) properties. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderListFullTest() throws ApiException {
        List<String> acceptEncoding = null;
        OrderListRequest request = null;
        OrderListFull response = api.getOrderListFull(acceptEncoding, request);

        // TODO: test validations
    }
    
    /**
     * Get a paginated list of all Orders without details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderListLightTest() throws ApiException {
        OrderListRequest request = null;
        OrderListLight response = api.getOrderListLight(request);

        // TODO: test validations
    }
    
    /**
     * Send harvest request to all your marketplaces
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void harvestAllTest() throws ApiException {
        api.harvestAll();

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
        String beezUPOrderId = null;
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
        String beezUPOrderId = null;
        SetMerchantOrderInfoRequest request = null;
        api.setMerchantOrderInfo(marketplaceTechnicalCode, accountId, beezUPOrderId, request);

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
