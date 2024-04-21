package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import static utilities.ConfigReader.getProperty;
import static io.restassured.RestAssured.given;
import static stepDefinitions.Hooks.requestSpec;

public class statusCheckStepDef {
    Response response;

    @Given("Status Code degerini {int} olarak ayarla ve {string} metodu ile istek at")
    public void endpointIstekAtilir(int statusCodeValue, String requestMethod) {
        switch (requestMethod) {
            case "GET":
                response = given()
                        .spec(requestSpec)
                        .when()
                        .get(getProperty("statusEndpoint") + statusCodeValue);
                break;
            case "POST":
                response = given()
                        .spec(requestSpec)
                        .when()
                        .post(getProperty("statusEndpoint") + statusCodeValue);
                break;
        }
    }

    @Then("Status Code degerinin {int} oldugu dogrulanir")
    public void statusCodeDegeriniDogrular(int expectedStatusCode) {
        Assert.assertEquals(expectedStatusCode, response.getStatusCode());
        System.out.println("Beklenen Status Code degeri : " + expectedStatusCode + "\n" + "Gerceklesen Sonuc : " + response.getStatusCode());
    }

    @Then("Status Code degerinin {int} oldugu dogrulanir ve test basarisiz kabul edilir")
    public void statusCodeDegeriBasarisiz(int expectedStatusCode) {
        Assert.assertEquals(expectedStatusCode, response.getStatusCode());
        Assert.assertEquals(getProperty("expectedSuccesStatusCode"), response.getStatusCode());
        System.out.println("Beklenen Status Code degeri : " + 200 + "\n" + "Gerceklesen Sonuc : " + response.getStatusCode());
    }
}
