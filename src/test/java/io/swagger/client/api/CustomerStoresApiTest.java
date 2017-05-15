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
import io.swagger.client.model.CreateStoreRequest;
import io.swagger.client.model.LinksGetStoresLink;
import io.swagger.client.model.StoreHeader;
import io.swagger.client.model.Stores;
import io.swagger.client.model.UpdateStoreRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomerStoresApi
 */
@Ignore
public class CustomerStoresApiTest {

    private final CustomerStoresApi api = new CustomerStoresApi();

    
    /**
     * Create a new store
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createStoreTest() throws ApiException {
        CreateStoreRequest request = null;
        LinksGetStoresLink response = api.createStore(request);

        // TODO: test validations
    }
    
    /**
     * Delete a store
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteStoreTest() throws ApiException {
        String storeId = null;
        api.deleteStore(storeId);

        // TODO: test validations
    }
    
    /**
     * Get store&#39;s information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoreTest() throws ApiException {
        String storeId = null;
        StoreHeader response = api.getStore(storeId);

        // TODO: test validations
    }
    
    /**
     * Get store list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoresTest() throws ApiException {
        Stores response = api.getStores();

        // TODO: test validations
    }
    
    /**
     * Update some store&#39;s information.
     *
     * Update some store&#39;s information. FYI, you cannot change the country. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateStoreTest() throws ApiException {
        String storeId = null;
        UpdateStoreRequest request = null;
        api.updateStore(storeId, request);

        // TODO: test validations
    }
    
}
