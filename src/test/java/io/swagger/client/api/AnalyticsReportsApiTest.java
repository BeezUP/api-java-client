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
import io.swagger.client.model.BeezUPCommonLink3;
import io.swagger.client.model.ReportByCategoryRequest;
import io.swagger.client.model.ReportByCategoryResponse;
import io.swagger.client.model.ReportByChannelRequest;
import io.swagger.client.model.ReportByChannelResponse;
import io.swagger.client.model.ReportByDayRequest;
import io.swagger.client.model.ReportByDayResponse;
import io.swagger.client.model.ReportByProductRequest;
import io.swagger.client.model.ReportByProductResponse;
import io.swagger.client.model.ReportFilter;
import io.swagger.client.model.ReportFilters;
import io.swagger.client.model.SaveReportFilterRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AnalyticsReportsApi
 */
@Ignore
public class AnalyticsReportsApiTest {

    private final AnalyticsReportsApi api = new AnalyticsReportsApi();

    
    /**
     * Delete the report filter
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteReportFilterTest() throws ApiException {
        String storeId = null;
        String reportFilterId = null;
        api.deleteReportFilter(storeId, reportFilterId);

        // TODO: test validations
    }
    
    /**
     * Export the report by category
     *
     * Export the report by category
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void exportStoreReportByCategoryTest() throws ApiException {
        String storeId = null;
        String format = null;
        ReportByCategoryRequest request = null;
        BeezUPCommonLink3 response = api.exportStoreReportByCategory(storeId, format, request);

        // TODO: test validations
    }
    
    /**
     * Export the report by channel
     *
     * Export the report by channel
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void exportStoreReportByChannelTest() throws ApiException {
        String storeId = null;
        String format = null;
        ReportByChannelRequest request = null;
        BeezUPCommonLink3 response = api.exportStoreReportByChannel(storeId, format, request);

        // TODO: test validations
    }
    
    /**
     * Export the report by product
     *
     * Export the report by product
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void exportStoreReportByProductTest() throws ApiException {
        String storeId = null;
        String format = null;
        ReportByProductRequest request = null;
        BeezUPCommonLink3 response = api.exportStoreReportByProduct(storeId, format, request);

        // TODO: test validations
    }
    
    /**
     * Get the report filter description
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReportFilterTest() throws ApiException {
        String storeId = null;
        String reportFilterId = null;
        ReportFilter response = api.getReportFilter(storeId, reportFilterId);

        // TODO: test validations
    }
    
    /**
     * Get report filter list for the given store
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReportFiltersTest() throws ApiException {
        String storeId = null;
        ReportFilters response = api.getReportFilters(storeId);

        // TODO: test validations
    }
    
    /**
     * Get the report by category
     *
     * Get the report by category
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoreReportByCategoryTest() throws ApiException {
        String storeId = null;
        ReportByCategoryRequest request = null;
        ReportByCategoryResponse response = api.getStoreReportByCategory(storeId, request);

        // TODO: test validations
    }
    
    /**
     * Get the report by channel
     *
     * Get the report by channel
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoreReportByChannelTest() throws ApiException {
        String storeId = null;
        ReportByChannelRequest request = null;
        ReportByChannelResponse response = api.getStoreReportByChannel(storeId, request);

        // TODO: test validations
    }
    
    /**
     * Get the report by day
     *
     * Get the report by day
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoreReportByDayTest() throws ApiException {
        String storeId = null;
        ReportByDayRequest request = null;
        ReportByDayResponse response = api.getStoreReportByDay(storeId, request);

        // TODO: test validations
    }
    
    /**
     * Get the report by day
     *
     * Get the report by day
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoreReportByDayExportTest() throws ApiException {
        String storeId = null;
        String format = null;
        ReportByDayRequest request = null;
        BeezUPCommonLink3 response = api.getStoreReportByDayExport(storeId, format, request);

        // TODO: test validations
    }
    
    /**
     * Get the report by product
     *
     * Get the report by product
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoreReportByProductTest() throws ApiException {
        String storeId = null;
        ReportByProductRequest request = null;
        ReportByProductResponse response = api.getStoreReportByProduct(storeId, request);

        // TODO: test validations
    }
    
    /**
     * Save the report filter
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveReportFilterTest() throws ApiException {
        String storeId = null;
        String reportFilterId = null;
        SaveReportFilterRequest reportFilter = null;
        api.saveReportFilter(storeId, reportFilterId, reportFilter);

        // TODO: test validations
    }
    
}
