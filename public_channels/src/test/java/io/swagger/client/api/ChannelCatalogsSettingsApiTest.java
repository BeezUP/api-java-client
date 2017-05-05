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
import io.swagger.client.model.CostSettings;
import io.swagger.client.model.GeneralSettings;
import io.swagger.client.model.UpgradeOfferRequired;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ChannelCatalogsSettingsApi
 */
@Ignore
public class ChannelCatalogsSettingsApiTest {

    private final ChannelCatalogsSettingsApi api = new ChannelCatalogsSettingsApi();

    
    /**
     * Disable a channel catalog
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void configureChannelCatalogCostSettingsTest() throws ApiException {
        String channelCatalogId = null;
        CostSettings request = null;
        api.configureChannelCatalogCostSettings(channelCatalogId, request);

        // TODO: test validations
    }
    
    /**
     * Disable a channel catalog
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void configureChannelCatalogGeneralSettingsTest() throws ApiException {
        String channelCatalogId = null;
        GeneralSettings request = null;
        api.configureChannelCatalogGeneralSettings(channelCatalogId, request);

        // TODO: test validations
    }
    
    /**
     * Disable a channel catalog
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void disableChannelCatalogTest() throws ApiException {
        String channelCatalogId = null;
        api.disableChannelCatalog(channelCatalogId);

        // TODO: test validations
    }
    
    /**
     * Enable a channel catalog
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enableChannelCatalogTest() throws ApiException {
        String channelCatalogId = null;
        api.enableChannelCatalog(channelCatalogId);

        // TODO: test validations
    }
    
}