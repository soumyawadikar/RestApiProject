package day1;

import static io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import  org.testng.annotations.Test;

public class HTTPRequests {
	
	int id;
	
	//@Test(priority=1)
	public void getUsers() {
		given()
		.when()
		  .get("https://reqres.in/api/users?page=2")
		  
		 .then()
		   .statusCode(200)
		   .body("page", equalTo(2))
		   .log().all();
		   
	}
	
	//@Test(priority=2)
	void createUsers() {
		
		HashMap hm=new HashMap();
		hm.put("name", "sou");
		hm.put("company", "vmware");
		
		given()
		.contentType("application/json")
		.body(hm)
		
		.when()
         .post("https://reqres.in/api/users")
         .jsonPath().getInt("id");
         
        // .then()
		  //.statusCode(201)
		  //.log().all();
		
		
	}
	@Test(priority=3, dependsOnMethods= {"createUsers"})
void updateUsers() {
		
		HashMap hm=new HashMap();
		hm.put("name", "sou");
		hm.put("company", "vmware");
		
		given()
		.contentType("application/json")
		.body(hm)
		
		.when()
         .put("https://reqres.in/api/users/"+id)
        
         
         .then()
		  .statusCode(200)
		  .log().all();
	}
}
