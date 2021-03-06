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
import io.swagger.client.model.ChannelCatalogExportCacheInfoResponse;
import io.swagger.client.model.ChannelCatalogExportationHistory;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ChannelCatalogsExportationsApi
 */
@Ignore
public class ChannelCatalogsExportationsApiTest {

    private final ChannelCatalogsExportationsApi api = new ChannelCatalogsExportationsApi();

    
    /**
     * Delete the exportation cache
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteChannelCatalogExportationCacheTest() throws ApiException {
        String channelCatalogId = null;
        api.deleteChannelCatalogExportationCache(channelCatalogId);

        // TODO: test validations
    }
    
    /**
     * Get the exportation cache information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChannelCatalogExportationCacheInfoTest() throws ApiException {
        String channelCatalogId = null;
        ChannelCatalogExportCacheInfoResponse response = api.getChannelCatalogExportationCacheInfo(channelCatalogId);

        // TODO: test validations
    }
    
    /**
     * Get the exportation history
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChannelCatalogExportationHistoryTest() throws ApiException {
        String channelCatalogId = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        ChannelCatalogExportationHistory response = api.getChannelCatalogExportationHistory(channelCatalogId, pageNumber, pageSize);

        // TODO: test validations
    }
    
}
