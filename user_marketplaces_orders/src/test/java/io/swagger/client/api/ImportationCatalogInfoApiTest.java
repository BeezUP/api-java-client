/*
 * Catalogs
 * This API allows you to manage your catalogs
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
import io.swagger.client.model.ChangeCustomColumnRequest;
import io.swagger.client.model.ConfigureCatalogColumnCatalogRequest;
import io.swagger.client.model.CustomColumns;
import io.swagger.client.model.DetectedCatalogColumns;
import io.swagger.client.model.MapBeezUPColumnRequest;
import io.swagger.client.model.ProductSample;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ImportationCatalogInfoApi
 */
@Ignore
public class ImportationCatalogInfoApiTest {

    private final ImportationCatalogInfoApi api = new ImportationCatalogInfoApi();

    
    /**
     * Configure catalog column
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importationConfigureCatalogColumnTest() throws ApiException {
        String storeId = null;
        String executionId = null;
        String columnId = null;
        ConfigureCatalogColumnCatalogRequest request = null;
        api.importationConfigureCatalogColumn(storeId, executionId, columnId, request);

        // TODO: test validations
    }
    
    /**
     * Delete Custom Column
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importationDeleteCustomColumnTest() throws ApiException {
        String storeId = null;
        String executionId = null;
        String columnId = null;
        api.importationDeleteCustomColumn(storeId, executionId, columnId);

        // TODO: test validations
    }
    
    /**
     * Get the encrypted custom column expression in this importation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importationGetCustomColumnExpressionTest() throws ApiException {
        String storeId = null;
        String executionId = null;
        String columnId = null;
        String response = api.importationGetCustomColumnExpression(storeId, executionId, columnId);

        // TODO: test validations
    }
    
    /**
     * Get custom columns currently place in this importation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importationGetCustomColumnsTest() throws ApiException {
        String storeId = null;
        String executionId = null;
        CustomColumns response = api.importationGetCustomColumns(storeId, executionId);

        // TODO: test validations
    }
    
    /**
     * Get detected catalog columns during this importation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importationGetDetectedCatalogColumnsTest() throws ApiException {
        String storeId = null;
        String executionId = null;
        DetectedCatalogColumns response = api.importationGetDetectedCatalogColumns(storeId, executionId);

        // TODO: test validations
    }
    
    /**
     * Get the product sample related to this importation with all columns (catalog and custom)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importationGetProductSampleTest() throws ApiException {
        String storeId = null;
        String executionId = null;
        Integer productSampleIndex = null;
        ProductSample response = api.importationGetProductSample(storeId, executionId, productSampleIndex);

        // TODO: test validations
    }
    
    /**
     * Get product sample custom column value related to this importation.
     *
     * /!\\ Use this operation only when you just changed the custom column expression and you want to get a precise the property value. Otherwise use the operation Importation_GetProductSample which will give you all property values
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importationGetProductSampleCustomColumnValueTest() throws ApiException {
        String storeId = null;
        String executionId = null;
        Integer productSampleIndex = null;
        String columnId = null;
        String response = api.importationGetProductSampleCustomColumnValue(storeId, executionId, productSampleIndex, columnId);

        // TODO: test validations
    }
    
    /**
     * Ignore Column
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importationIgnoreColumnTest() throws ApiException {
        String storeId = null;
        String executionId = null;
        String columnId = null;
        api.importationIgnoreColumn(storeId, executionId, columnId);

        // TODO: test validations
    }
    
    /**
     * Map catalog column to a BeezUP column
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importationMapCatalogColumnTest() throws ApiException {
        String storeId = null;
        String executionId = null;
        String columnId = null;
        MapBeezUPColumnRequest request = null;
        api.importationMapCatalogColumn(storeId, executionId, columnId, request);

        // TODO: test validations
    }
    
    /**
     * Map custom column to a BeezUP column
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importationMapCustomColumnTest() throws ApiException {
        String storeId = null;
        String executionId = null;
        String columnId = null;
        MapBeezUPColumnRequest request = null;
        api.importationMapCustomColumn(storeId, executionId, columnId, request);

        // TODO: test validations
    }
    
    /**
     * Reattend Column
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importationReattendColumnTest() throws ApiException {
        String storeId = null;
        String executionId = null;
        String columnId = null;
        api.importationReattendColumn(storeId, executionId, columnId);

        // TODO: test validations
    }
    
    /**
     * Create or replace a custom column
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importationSaveCustomColumnTest() throws ApiException {
        String storeId = null;
        String executionId = null;
        String columnId = null;
        ChangeCustomColumnRequest request = null;
        api.importationSaveCustomColumn(storeId, executionId, columnId, request);

        // TODO: test validations
    }
    
    /**
     * Unmap catalog column
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importationUnmapCatalogColumnTest() throws ApiException {
        String storeId = null;
        String executionId = null;
        String columnId = null;
        api.importationUnmapCatalogColumn(storeId, executionId, columnId);

        // TODO: test validations
    }
    
    /**
     * Unmap custom column
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importationUnmapCustomColumnTest() throws ApiException {
        String storeId = null;
        String executionId = null;
        String columnId = null;
        api.importationUnmapCustomColumn(storeId, executionId, columnId);

        // TODO: test validations
    }
    
}