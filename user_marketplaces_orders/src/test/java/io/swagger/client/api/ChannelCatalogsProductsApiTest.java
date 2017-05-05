/*
 * Channel Catalogs
 * This api allows you to manage your channel catalogs.   A channel catalog is an association between your store and a channel.  You will be able to: - map your catalog colums to channel columns. - map your catalog categories to the channel categories and define a cost of this category - configure the general and cost settings of the channel - enable or disable a channel - exclude products using filters for a channel - override product values for a channel - disable or reenable a product on a channel 
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
import io.swagger.client.model.ChannelCatalogProductInfo;
import io.swagger.client.model.ChannelCatalogProductInfoList;
import io.swagger.client.model.GetChannelCatalogProductInfoListRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ChannelCatalogsProductsApi
 */
@Ignore
public class ChannelCatalogsProductsApiTest {

    private final ChannelCatalogsProductsApi api = new ChannelCatalogsProductsApi();

    
    /**
     * Get channel catalog product information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChannelCatalogProductInfoTest() throws ApiException {
        String channelCatalogId = null;
        String productId = null;
        ChannelCatalogProductInfo response = api.getChannelCatalogProductInfo(channelCatalogId, productId);

        // TODO: test validations
    }
    
    /**
     * Get channel catalog product information list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChannelCatalogProductInfoListTest() throws ApiException {
        String channelCatalogId = null;
        GetChannelCatalogProductInfoListRequest request = null;
        ChannelCatalogProductInfoList response = api.getChannelCatalogProductInfoList(channelCatalogId, request);

        // TODO: test validations
    }
    
}
