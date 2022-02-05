package apiTest;

import newTasksAutomation.rest.RestClient;
import okhttp3.Response;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class StoreTests {
    @Test(priority = 10)
    public void successOrderCreation() throws IOException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 1);
        jsonObject.put("petId", 0);
        jsonObject.put("quantity", 0);
        jsonObject.put("shipDate", "2022-02-03T14:36:53.024+0000");
        jsonObject.put("status", "placed");
        jsonObject.put("complete", true);

        RestClient restClient = new RestClient();

        Response response = restClient.postOrder(jsonObject);

        Assert.assertEquals(response.code(), 200, "Status code is wrong");


    }

    @Test(priority = 20)
    public void successGetOrder() throws IOException {
        JSONObject expectedJson = new JSONObject();
        expectedJson.put("id", 1);
        expectedJson.put("petId", 0);
        expectedJson.put("quantity", 0);
        expectedJson.put("shipDate", "2022-02-05T18:35:08.972+0000");
        expectedJson.put("status", "placed");
        expectedJson.put("complete", true);

        RestClient restClient = new RestClient();
        Response response = restClient.getValidOrder();

        JSONObject actualJson = new JSONObject(response.body().string());
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.code(), 200, "Status code is wrong");
        softAssert.assertEquals(actualJson.toString(), expectedJson.toString(), "Response is not equal to expected json");

        softAssert.assertAll();

    }

    @Test(priority = 30)
    public void failedGetOrder() throws IOException, InterruptedException {
        JSONObject expectedErrorJson = new JSONObject();
        expectedErrorJson.put("code", 1);
        expectedErrorJson.put("type", "error");
        expectedErrorJson.put("message", "Order not found");

        RestClient restClient = new RestClient();
        Response response = restClient.getInvalidOrder();

        JSONObject actualJson = new JSONObject(response.body().string());

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.code(), 404, "Status code is wrong");
        softAssert.assertEquals(actualJson.toString(), expectedErrorJson.toString(), "Response is not equal to expected json");
        softAssert.assertAll();

    }

    @Test(priority = 35)
    public void successOrderDeletion() throws IOException {
        JSONObject creationJson = new JSONObject();
        creationJson.put("id", 9);
        creationJson.put("petId", 0);
        creationJson.put("quantity", 0);
        creationJson.put("shipDate", "1970-01-01T00:00:00.001+0000");
        creationJson.put("status", "placed");
        creationJson.put("complete", true);

        RestClient restClient = new RestClient();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(restClient.postOrder(creationJson).code(), 200, "Order not created");

        Response deletionResponse = restClient.deleteValidOrder(9);
        softAssert.assertEquals(deletionResponse.code(), 200, "Status code is wrong");
        softAssert.assertAll();
    }

    @Test(priority = 40)
    public void deleteOrderInvalidId() throws IOException {
        RestClient restClient = new RestClient();
        Response deletionResponse = restClient.deleteOrderInvalidId();

        Assert.assertEquals(deletionResponse.code(), 404, "Status code is wrong");

    }

    @Test(priority = 50)
    public void getStoreInventory() throws IOException {
        RestClient restClient = new RestClient();
        Response response = restClient.storeInventory();

        Assert.assertEquals((response.code()), 200, "Status code is wrong");
    }
}







