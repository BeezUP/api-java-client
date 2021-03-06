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
import io.swagger.client.model.PublicListOfValuesResponse;
import io.swagger.client.model.PublicLovIndex;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PublicListOfValuesLOVApi
 */
@Ignore
public class PublicListOfValuesLOVApiTest {

    private final PublicListOfValuesLOVApi api = new PublicListOfValuesLOVApi();

    
    /**
     * Get the list of values related to this list name
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPublicListOfValuesTest() throws ApiException {
        String listName = null;
        List<String> acceptLanguage = null;
        String ifNoneMatch = null;
        PublicListOfValuesResponse response = api.getPublicListOfValues(listName, acceptLanguage, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Get all list names
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPublicLovIndexTest() throws ApiException {
        String ifNoneMatch = null;
        PublicLovIndex response = api.getPublicLovIndex(ifNoneMatch);

        // TODO: test validations
    }
    
}
