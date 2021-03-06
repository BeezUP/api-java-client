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
import io.swagger.client.model.FriendEmail;
import io.swagger.client.model.StoreShares;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomerSharesApi
 */
@Ignore
public class CustomerSharesApiTest {

    private final CustomerSharesApi api = new CustomerSharesApi();

    
    /**
     * Delete a share to another user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteShareTest() throws ApiException {
        String storeId = null;
        String userId = null;
        api.deleteShare(storeId, userId);

        // TODO: test validations
    }
    
    /**
     * Get shares related to this store
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSharesTest() throws ApiException {
        String storeId = null;
        StoreShares response = api.getShares(storeId);

        // TODO: test validations
    }
    
    /**
     * Share a store to another user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void shareTest() throws ApiException {
        String storeId = null;
        FriendEmail email = null;
        api.share(storeId, email);

        // TODO: test validations
    }
    
}
