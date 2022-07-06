package RestClasses;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Random;

public class APITestClass {
    String baseURI;
    int petId;

    public APITestClass(){
         baseURI = "https://petstore.swagger.io";
         Random rand = new Random();
         petId = rand.nextInt(300);

    }

    public Response getMethod(){
        petId = postMethod();
        RestAssured.baseURI = baseURI+"/v2/pet/"+petId;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, "");
        System.out.println("Get Status received => " + response.getStatusCode());
        System.out.println("Get Response=>" + response.prettyPrint());
        return response;
    }

    public void putMethod(){
        RestAssured.baseURI = baseURI;
        JSONObject petStore = new JSONObject();
        JSONObject categoryChar=  new JSONObject();
        categoryChar.put("id",0);
        categoryChar.put("name","string");
        JSONObject tagsChar=  new JSONObject();
        tagsChar.put("id",0);
        tagsChar.put("name","string");
        ArrayList photoUrls = new ArrayList();
        photoUrls.add("string");
        ArrayList tags = new ArrayList();
        tags.add(tagsChar);
        petStore.put("id", petId);
        petStore.put("category", categoryChar);
        petStore.put("name", "Goofy");
        petStore.put("photoUrls",photoUrls);
        petStore.put("tags",tags);
        petStore.put("status","available");
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(petStore.toString());
        Response response = httpRequest.post("/v2/pet");
        System.out.println("Put Status received => " + response.getStatusCode());
        System.out.println("Put Response=>" + response.prettyPrint());

    }

    public int postMethod(){

        RestAssured.baseURI = baseURI;
        JSONObject petStore = new JSONObject();
        JSONObject categoryChar=  new JSONObject();
        categoryChar.put("id",0);
        categoryChar.put("name","string");
        JSONObject tagsChar=  new JSONObject();
        tagsChar.put("id",0);
        tagsChar.put("name","string");
        ArrayList photoUrls = new ArrayList();
        photoUrls.add("string");
        ArrayList tags = new ArrayList();
        tags.add(tagsChar);
        petStore.put("id", petId);
        petStore.put("category", categoryChar);
        petStore.put("name", "doggie");
        petStore.put("photoUrls",photoUrls);
        petStore.put("tags",tags);
        petStore.put("status","available");
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(petStore.toString());
        Response response = httpRequest.post("/v2/pet");
        System.out.println("Post Status received => " + response.getStatusCode());
        System.out.println("Post Response=>" + response.prettyPrint());
        return petId;
    }

    public void deleteMethod(){
        RestAssured.baseURI = baseURI+"/v2/pet/"+petId;
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.header("Content-Type", "application/json");
        httpRequest.header("api_key","special-key");
        Response response = httpRequest.request(Method.DELETE, "");
        System.out.println("Delete Status received => " + response.getStatusCode());
        System.out.println("Delete Response=>" + response.prettyPrint());
    }
}
