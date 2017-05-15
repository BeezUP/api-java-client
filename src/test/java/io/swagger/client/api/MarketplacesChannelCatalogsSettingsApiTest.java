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
import io.swagger.client.model.ChannelCatalogMarketplaceProperties;
import io.swagger.client.model.ChannelCatalogMarketplaceSettings;
import io.swagger.client.model.SetChannelCatalogMarketplaceSettingsRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MarketplacesChannelCatalogsSettingsApi
 */
@Ignore
public class MarketplacesChannelCatalogsSettingsApiTest {

    private final MarketplacesChannelCatalogsSettingsApi api = new MarketplacesChannelCatalogsSettingsApi();

    
    /**
     * Get the marketplace properties for a channel catalog
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChannelCatalogMarketplacePropertiesTest() throws ApiException {
        String channelCatalogId = null;
        ChannelCatalogMarketplaceProperties response = api.getChannelCatalogMarketplaceProperties(channelCatalogId);

        // TODO: test validations
    }
    
    /**
     * Get the marketplace settings for a channel catalog
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChannelCatalogMarketplaceSettingsTest() throws ApiException {
        String channelCatalogId = null;
        ChannelCatalogMarketplaceSettings response = api.getChannelCatalogMarketplaceSettings(channelCatalogId);

        // TODO: test validations
    }
    
    /**
     * Save new marketplace settings for a channel catalog
     *
     * Allow you to configure your marketplace settings.  Partial update accepted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setChannelCatalogMarketplaceSettingsTest() throws ApiException {
        String channelCatalogId = null;
        SetChannelCatalogMarketplaceSettingsRequest model = null;
        api.setChannelCatalogMarketplaceSettings(channelCatalogId, model);

        // TODO: test validations
    }
    
}
