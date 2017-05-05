/*
 * Public - List of Values
 * This API gives you public list of values.
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
import io.swagger.client.model.BeezUPCommonLOVLink2;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupsApi
 */
@Ignore
public class GroupsApiTest {

    private final GroupsApi api = new GroupsApi();

    
    /**
     * Get list of values related to this group name
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPublicListGroupTest() throws ApiException {
        String listGroupName = null;
        List<BeezUPCommonLOVLink2> response = api.getPublicListGroup(listGroupName);

        // TODO: test validations
    }
    
    /**
     * Get list of group of list name
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPublicListGroupNamesTest() throws ApiException {
        List<BeezUPCommonLOVLink2> response = api.getPublicListGroupNames();

        // TODO: test validations
    }
    
}
