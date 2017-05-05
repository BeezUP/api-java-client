/*
 * Marketplaces - Channel catalogs
 * This API allows you to manage your channel catalogs\\' marketplace settings and fetch your account\\'s catalog publication history
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
import io.swagger.client.model.AccountPublications;
import io.swagger.client.model.BeezUPCommonErrorResponseMessage;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MarketplacesChannelCatalogsPublicationsApi
 */
@Ignore
public class MarketplacesChannelCatalogsPublicationsApiTest {

    private final MarketplacesChannelCatalogsPublicationsApi api = new MarketplacesChannelCatalogsPublicationsApi();

    
    /**
     * Fetch the publication history for an account, sorted by descending start date
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPublicationsTest() throws ApiException {
        String marketplaceTechnicalCode = null;
        Integer accountId = null;
        String channelCatalogId = null;
        Integer count = null;
        List<String> publicationTypes = null;
        AccountPublications response = api.getPublications(marketplaceTechnicalCode, accountId, channelCatalogId, count, publicationTypes);

        // TODO: test validations
    }
    
}
