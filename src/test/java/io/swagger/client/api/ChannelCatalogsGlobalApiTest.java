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
import io.swagger.client.model.BeezUPCommonLink2;
import io.swagger.client.model.ChannelCatalog;
import io.swagger.client.model.ChannelCatalogList;
import io.swagger.client.model.CreateChannelCatalogRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ChannelCatalogsGlobalApi
 */
@Ignore
public class ChannelCatalogsGlobalApiTest {

    private final ChannelCatalogsGlobalApi api = new ChannelCatalogsGlobalApi();

    
    /**
     * Create a new channel catalog
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createChannelCatalogTest() throws ApiException {
        CreateChannelCatalogRequest request = null;
        List<BeezUPCommonLink2> response = api.createChannelCatalog(request);

        // TODO: test validations
    }
    
    /**
     * Delete the channel catalog
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteChannelCatalogTest() throws ApiException {
        String channelCatalogId = null;
        api.deleteChannelCatalog(channelCatalogId);

        // TODO: test validations
    }
    
    /**
     * Get the channel catalog information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChannelCatalogTest() throws ApiException {
        String channelCatalogId = null;
        ChannelCatalog response = api.getChannelCatalog(channelCatalogId);

        // TODO: test validations
    }
    
    /**
     * List all your current channel catalogs
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChannelCatalogsTest() throws ApiException {
        String storeId = null;
        ChannelCatalogList response = api.getChannelCatalogs(storeId);

        // TODO: test validations
    }
    
}
