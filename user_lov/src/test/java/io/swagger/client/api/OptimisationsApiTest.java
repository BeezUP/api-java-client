/*
 * Analytics
 * This API will help you to manage the tracking of your clicks and your sales, get reporting on this trackings and put in place rules based on this reporting to automatically optimize your channel catalogs. \\ Also, you will be able to consult the rule execution reporting. 
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
import io.swagger.client.model.OptimiseRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OptimisationsApi
 */
@Ignore
public class OptimisationsApiTest {

    private final OptimisationsApi api = new OptimisationsApi();

    
    /**
     * Optimise products
     *
     * /!\\ WARNING /!\\ \\ Apply the operation on every product related to this request. \\ This operation is used at the bottom of the analytics page result. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void optimiseTest() throws ApiException {
        String storeId = null;
        String actionName = null;
        OptimiseRequest request = null;
        api.optimise(storeId, actionName, request);

        // TODO: test validations
    }
    
    /**
     * Optimise products&#39;s category
     *
     * /!\\ WARNING /!\\ \\ This operation will reenable or disable products&#39;s category for every channel indicated in the body.  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void optimiseByCategoryTest() throws ApiException {
        String storeId = null;
        String catalogCategoryId = null;
        String actionName = null;
        List<String> request = null;
        api.optimiseByCategory(storeId, catalogCategoryId, actionName, request);

        // TODO: test validations
    }
    
    /**
     * Optimise products&#39;s category
     *
     * /!\\ WARNING /!\\ \\ Apply the operation on every product on this channel. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void optimiseByChannelTest() throws ApiException {
        String storeId = null;
        String channelId = null;
        String actionName = null;
        api.optimiseByChannel(storeId, channelId, actionName);

        // TODO: test validations
    }
    
    /**
     * Optimise products
     *
     * /!\\ WARNING /!\\ \\ This operation will reenable or disable this product for every channel indicated in the body.  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void optimiseByProductTest() throws ApiException {
        String storeId = null;
        String productId = null;
        String actionName = null;
        List<String> request = null;
        api.optimiseByProduct(storeId, productId, actionName, request);

        // TODO: test validations
    }
    
}