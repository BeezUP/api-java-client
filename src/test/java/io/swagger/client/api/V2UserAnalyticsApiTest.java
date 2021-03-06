/*
 * BeezUP API
 * This is the RESTful API of BeezUP which allows you to manage everything related to BeezUP
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
import io.swagger.client.model.BeezUPCommonLink2;
import io.swagger.client.model.CreateRuleRequest;
import io.swagger.client.model.OptimiseRequest;
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
import io.swagger.client.model.Rule;
import io.swagger.client.model.RuleExecutionReportings;
import io.swagger.client.model.Rules;
import io.swagger.client.model.SaveReportFilterRequest;
import io.swagger.client.model.StoreTrackingStatus;
import io.swagger.client.model.TrackedClicks;
import io.swagger.client.model.TrackedExternalOrders;
import io.swagger.client.model.TrackedOrders;
import io.swagger.client.model.TrackingStatus;
import io.swagger.client.model.UpdateRuleRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for V2UserAnalyticsApi
 */
@Ignore
public class V2UserAnalyticsApiTest {

    private final V2UserAnalyticsApi api = new V2UserAnalyticsApi();

    
    /**
     * Rule creation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRuleTest() throws ApiException {
        String storeId = null;
        CreateRuleRequest request = null;
        api.createRule(storeId, request);

        // TODO: test validations
    }
    
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
     * Delete Rule
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRuleTest() throws ApiException {
        String storeId = null;
        String ruleId = null;
        api.deleteRule(storeId, ruleId);

        // TODO: test validations
    }
    
    /**
     * Disable rule
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void disableRuleTest() throws ApiException {
        String storeId = null;
        String ruleId = null;
        api.disableRule(storeId, ruleId);

        // TODO: test validations
    }
    
    /**
     * Enable rule
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enableRuleTest() throws ApiException {
        String storeId = null;
        String ruleId = null;
        api.enableRule(storeId, ruleId);

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
        List<BeezUPCommonLink2> response = api.exportStoreReportByCategory(storeId, format, request);

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
        List<BeezUPCommonLink2> response = api.exportStoreReportByChannel(storeId, format, request);

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
        List<BeezUPCommonLink2> response = api.exportStoreReportByProduct(storeId, format, request);

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
     * Gets the rule
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRuleTest() throws ApiException {
        String storeId = null;
        String ruleId = null;
        Rule response = api.getRule(storeId, ruleId);

        // TODO: test validations
    }
    
    /**
     * Gets the list of rules for a given store
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRulesTest() throws ApiException {
        String storeId = null;
        Rules response = api.getRules(storeId);

        // TODO: test validations
    }
    
    /**
     * Get the rules execution history
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRulesExecutionsTest() throws ApiException {
        String storeId = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        RuleExecutionReportings response = api.getRulesExecutions(storeId, pageNumber, pageSize);

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
        List<BeezUPCommonLink2> response = api.getStoreReportByDayExport(storeId, format, request);

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
     * Get the latest clicks tracked
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoreTrackedClicksTest() throws ApiException {
        String storeId = null;
        Integer count = null;
        TrackedClicks response = api.getStoreTrackedClicks(storeId, count);

        // TODO: test validations
    }
    
    /**
     * Get the latest external orders tracked
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoreTrackedExternalOrdersTest() throws ApiException {
        String storeId = null;
        Integer count = null;
        TrackedExternalOrders response = api.getStoreTrackedExternalOrders(storeId, count);

        // TODO: test validations
    }
    
    /**
     * Get the latest orders tracked
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoreTrackedOrdersTest() throws ApiException {
        String storeId = null;
        Integer count = null;
        TrackedOrders response = api.getStoreTrackedOrders(storeId, count);

        // TODO: test validations
    }
    
    /**
     * Get store tracking synchronization status
     *
     * Your clicks and orders are eventually consistent. \\ This operation indicates you at which date the projections are for this store. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStoreTrackingStatusTest() throws ApiException {
        String storeId = null;
        StoreTrackingStatus response = api.getStoreTrackingStatus(storeId);

        // TODO: test validations
    }
    
    /**
     * Display the synchronization status of the clicks and orders
     *
     * Your clicks and orders are eventually consistent. \\ This operation indicates you at which date the projections are. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTrackingStatusTest() throws ApiException {
        TrackingStatus response = api.getTrackingStatus();

        // TODO: test validations
    }
    
    /**
     * Move the rule down
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void moveDownRuleTest() throws ApiException {
        String storeId = null;
        String ruleId = null;
        api.moveDownRule(storeId, ruleId);

        // TODO: test validations
    }
    
    /**
     * Move the rule up
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void moveUpRuleTest() throws ApiException {
        String storeId = null;
        String ruleId = null;
        api.moveUpRule(storeId, ruleId);

        // TODO: test validations
    }
    
    /**
     * Optimise products
     *
     * /!\\ WARNING /!\\ \\ Apply the operation on every product related to this request. \\ This operation is used at the bottom of the analytics page result. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void optimiseTest() throws ApiException {
        String storeId = null;
        String actionName = null;
        OptimiseRequest request = null;
        api.optimise(storeId, actionName, request);

        // TODO: test validations
    }
    
    /**
     * Optimise products&#39;s category
     *
     * /!\\ WARNING /!\\ \\ This operation will reenable or disable products&#39;s category for every channel indicated in the body.  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void optimiseByCategoryTest() throws ApiException {
        String storeId = null;
        String catalogCategoryId = null;
        String actionName = null;
        List<String> request = null;
        api.optimiseByCategory(storeId, catalogCategoryId, actionName, request);

        // TODO: test validations
    }
    
    /**
     * Optimise products&#39;s category
     *
     * /!\\ WARNING /!\\ \\ Apply the operation on every product on this channel. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void optimiseByChannelTest() throws ApiException {
        String storeId = null;
        String channelId = null;
        String actionName = null;
        api.optimiseByChannel(storeId, channelId, actionName);

        // TODO: test validations
    }
    
    /**
     * Optimise products
     *
     * /!\\ WARNING /!\\ \\ This operation will reenable or disable this product for every channel indicated in the body.  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void optimiseByProductTest() throws ApiException {
        String storeId = null;
        String productId = null;
        String actionName = null;
        List<String> request = null;
        api.optimiseByProduct(storeId, productId, actionName, request);

        // TODO: test validations
    }
    
    /**
     * Run rule
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void runRuleTest() throws ApiException {
        String storeId = null;
        String ruleId = null;
        api.runRule(storeId, ruleId);

        // TODO: test validations
    }
    
    /**
     * Run all rules for this store
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void runRulesTest() throws ApiException {
        String storeId = null;
        api.runRules(storeId);

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
    
    /**
     * Update Rule
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRuleTest() throws ApiException {
        String storeId = null;
        String ruleId = null;
        UpdateRuleRequest request = null;
        api.updateRule(storeId, ruleId, request);

        // TODO: test validations
    }
    
}
