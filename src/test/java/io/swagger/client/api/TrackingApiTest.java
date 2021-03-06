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
import io.swagger.client.model.BeezUPCommonErrorResponseMessage;
import io.swagger.client.model.StoreTrackingStatus;
import io.swagger.client.model.TrackedClicks;
import io.swagger.client.model.TrackedExternalOrders;
import io.swagger.client.model.TrackedOrders;
import io.swagger.client.model.TrackingStatus;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TrackingApi
 */
@Ignore
public class TrackingApiTest {

    private final TrackingApi api = new TrackingApi();

    
    /**
     * Get the latest clicks tracked
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoreTrackedClicksTest() throws ApiException {
        String storeId = null;
        Integer count = null;
        TrackedClicks response = api.getStoreTrackedClicks(storeId, count);

        // TODO: test validations
    }
    
    /**
     * Get the latest external orders tracked
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoreTrackedExternalOrdersTest() throws ApiException {
        String storeId = null;
        Integer count = null;
        TrackedExternalOrders response = api.getStoreTrackedExternalOrders(storeId, count);

        // TODO: test validations
    }
    
    /**
     * Get the latest orders tracked
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoreTrackedOrdersTest() throws ApiException {
        String storeId = null;
        Integer count = null;
        TrackedOrders response = api.getStoreTrackedOrders(storeId, count);

        // TODO: test validations
    }
    
    /**
     * Get store tracking synchronization status
     *
     * Your clicks and orders are eventually consistent. \\ This operation indicates you at which date the projections are for this store. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoreTrackingStatusTest() throws ApiException {
        String storeId = null;
        StoreTrackingStatus response = api.getStoreTrackingStatus(storeId);

        // TODO: test validations
    }
    
    /**
     * Display the synchronization status of the clicks and orders
     *
     * Your clicks and orders are eventually consistent. \\ This operation indicates you at which date the projections are. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTrackingStatusTest() throws ApiException {
        TrackingStatus response = api.getTrackingStatus();

        // TODO: test validations
    }
    
}
