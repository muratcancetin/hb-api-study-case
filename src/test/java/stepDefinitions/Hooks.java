package stepDefinitions;

import io.cucumber.java.Before;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

import java.util.Arrays;

import static utilities.ConfigReader.getProperty;

public class Hooks {
    public static RequestSpecification requestSpec;

    @Before
    public void setup() {

        requestSpec = new RequestSpecBuilder()
                .setBaseUri(getProperty("baseURL"))
                .addFilters(Arrays.asList(new RequestLoggingFilter(), new ResponseLoggingFilter()))
                .build();
    }
}
