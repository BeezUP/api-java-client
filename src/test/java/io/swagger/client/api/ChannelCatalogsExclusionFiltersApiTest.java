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
import io.swagger.client.model.ExclusionFilterOperator;
import io.swagger.client.model.ExclusionFilters;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ChannelCatalogsExclusionFiltersApi
 */
@Ignore
public class ChannelCatalogsExclusionFiltersApiTest {

    private final ChannelCatalogsExclusionFiltersApi api = new ChannelCatalogsExclusionFiltersApi();

    
    /**
     * Configure channel catalog exclusion filters
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void configureChannelCatalogExclusionFiltersTest() throws ApiException {
        String channelCatalogId = null;
        ExclusionFilters request = null;
        api.configureChannelCatalogExclusionFilters(channelCatalogId, request);

        // TODO: test validations
    }
    
    /**
     * Get channel catalog exclusion filter operators
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChannelCatalogExclusionFilterOperatorsTest() throws ApiException {
        List<ExclusionFilterOperator> response = api.getChannelCatalogExclusionFilterOperators();

        // TODO: test validations
    }
    
}
