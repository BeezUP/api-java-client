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
import io.swagger.client.model.ChannelCatalogCategoryMappings;
import io.swagger.client.model.MapCategoryRequest;
import io.swagger.client.model.UnmapCategoryRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ChannelCatalogsCategoryMappingsApi
 */
@Ignore
public class ChannelCatalogsCategoryMappingsApiTest {

    private final ChannelCatalogsCategoryMappingsApi api = new ChannelCatalogsCategoryMappingsApi();

    
    /**
     * Get channel catalog categories
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChannelCatalogCategoriesTest() throws ApiException {
        String channelCatalogId = null;
        ChannelCatalogCategoryMappings response = api.getChannelCatalogCategories(channelCatalogId);

        // TODO: test validations
    }
    
    /**
     * Map channel catalog category
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mapChannelCatalogCategoryTest() throws ApiException {
        String channelCatalogId = null;
        MapCategoryRequest request = null;
        api.mapChannelCatalogCategory(channelCatalogId, request);

        // TODO: test validations
    }
    
    /**
     * Unmap channel catalog category
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void unmapChannelCatalogCategoryTest() throws ApiException {
        String channelCatalogId = null;
        UnmapCategoryRequest request = null;
        api.unmapChannelCatalogCategory(channelCatalogId, request);

        // TODO: test validations
    }
    
}