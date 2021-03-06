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
