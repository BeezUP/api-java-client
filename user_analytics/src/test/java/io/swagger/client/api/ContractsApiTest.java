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
import io.swagger.client.model.BeezUPCommonInfoSummaries;
import io.swagger.client.model.BeezUPCommonLink2;
import io.swagger.client.model.BillingPeriods;
import io.swagger.client.model.ContractInfo;
import io.swagger.client.model.CreateContract;
import io.swagger.client.model.Offer;
import io.swagger.client.model.OfferRequest;
import io.swagger.client.model.StandardOffers;
import io.swagger.client.model.TerminateContract;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContractsApi
 */
@Ignore
public class ContractsApiTest {

    private final ContractsApi api = new ContractsApi();

    
    /**
     * Create a new contract
     *
     * Now you are ready to create your contract. Before that, please ensure that you check the offer with the same request parameterts. /offers 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createContractTest() throws ApiException {
        CreateContract request = null;
        BeezUPCommonInfoSummaries response = api.createContract(request);

        // TODO: test validations
    }
    
    /**
     * Delete your next contract
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNextContractTest() throws ApiException {
        api.deleteNextContract();

        // TODO: test validations
    }
    
    /**
     * Get billing periods conditions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBillingPeriodsTest() throws ApiException {
        BillingPeriods response = api.getBillingPeriods();

        // TODO: test validations
    }
    
    /**
     * Get contracts links
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContractsLinksTest() throws ApiException {
        List<BeezUPCommonLink2> response = api.getContractsLinks();

        // TODO: test validations
    }
    
    /**
     * Get the conditions of your current contract
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrentContractTest() throws ApiException {
        ContractInfo response = api.getCurrentContract();

        // TODO: test validations
    }
    
    /**
     * Get the conditions of your next contract
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNextContractTest() throws ApiException {
        ContractInfo response = api.getNextContract();

        // TODO: test validations
    }
    
    /**
     * Get offer pricing
     *
     * Get the offer pricing then you can create your contract with the same request parameters. /v2/user/customer/contracts 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOfferTest() throws ApiException {
        OfferRequest request = null;
        Offer response = api.getOffer(request);

        // TODO: test validations
    }
    
    /**
     * Get all standard offers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStandardOffersTest() throws ApiException {
        StandardOffers response = api.getStandardOffers();

        // TODO: test validations
    }
    
    /**
     * Reactivate your terminated contract.
     *
     * By calling this operation you can re-enable the auto renewal.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reactivateCurrentContractTest() throws ApiException {
        api.reactivateCurrentContract();

        // TODO: test validations
    }
    
    /**
     * Schedule termination of your current contract at the end of the commitment.
     *
     * By default your contract are automatically renew. By calling this operation you can disable the auto renewal.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void terminateCurrentContractTest() throws ApiException {
        TerminateContract request = null;
        api.terminateCurrentContract(request);

        // TODO: test validations
    }
    
}
