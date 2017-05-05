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
import io.swagger.client.model.ApiCredentials;
import io.swagger.client.model.BeezUPCommonEmail;
import io.swagger.client.model.BeezUPCommonErrorResponseMessage;
import io.swagger.client.model.LoginRequest;
import io.swagger.client.model.RegisterRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SecurityApi
 */
@Ignore
public class SecurityApiTest {

    private final SecurityApi api = new SecurityApi();

    
    /**
     * Login
     *
     * User Login - The login will give your tokens
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void loginTest() throws ApiException {
        LoginRequest request = null;
        ApiCredentials response = api.login(request);

        // TODO: test validations
    }
    
    /**
     * Lost password
     *
     * Lost password - Your password will be regenerated and sent to your email
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void lostPasswordTest() throws ApiException {
        BeezUPCommonEmail email = null;
        api.lostPassword(email);

        // TODO: test validations
    }
    
    /**
     * User Registration
     *
     * User Registration - Create a new user on BeezUP
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerTest() throws ApiException {
        RegisterRequest request = null;
        api.register(request);

        // TODO: test validations
    }
    
}
