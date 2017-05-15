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
import io.swagger.client.model.BeezUPCommonErrorResponseMessage;
import io.swagger.client.model.OrderListFull;
import io.swagger.client.model.OrderListLight;
import io.swagger.client.model.OrderListRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MarketplacesOrdersListApi
 */
@Ignore
public class MarketplacesOrdersListApiTest {

    private final MarketplacesOrdersListApi api = new MarketplacesOrdersListApi();

    
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
    
}
