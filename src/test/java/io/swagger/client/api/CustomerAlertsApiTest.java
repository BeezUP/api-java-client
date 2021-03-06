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
import io.swagger.client.model.SaveStoreAlertRequest;
import io.swagger.client.model.StoreAlerts;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomerAlertsApi
 */
@Ignore
public class CustomerAlertsApiTest {

    private final CustomerAlertsApi api = new CustomerAlertsApi();

    
    /**
     * Get store&#39;s alerts
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoreAlertsTest() throws ApiException {
        String storeId = null;
        StoreAlerts response = api.getStoreAlerts(storeId);

        // TODO: test validations
    }
    
    /**
     * Save store alert
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveStoreAlertTest() throws ApiException {
        String storeId = null;
        Integer alertId = null;
        List<SaveStoreAlertRequest> request = null;
        api.saveStoreAlert(storeId, alertId, request);

        // TODO: test validations
    }
    
}
