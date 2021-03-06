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
import io.swagger.client.model.AutomaticTransitionInfos;
import io.swagger.client.model.BeezUPCommonErrorResponseMessage;
import io.swagger.client.model.SaveAutomaticTransitionRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AutoTransitionsApi
 */
@Ignore
public class AutoTransitionsApiTest {

    private final AutoTransitionsApi api = new AutoTransitionsApi();

    
    /**
     * Configure automatic order status transitions
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
     * Get automatic order status transition list
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
    
}
