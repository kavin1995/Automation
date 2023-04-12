package com.stepdefinit;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Testscript {
	
	RequestSpecification reqspec;
	Response res;
	private String string;
	
	@Given("User should URL the Demo")
	public void user_should_url_the_demo() {
	   RestAssured.baseURI="https://petstore.swagger.io/v2/user/Manoj";
	   reqspec=RestAssured.given().headers("accept","application/json");
		
	}

	@When("User should get the responce Demo")
	public void user_should_get_the_responce_demo() {
		res=reqspec.get();
	    res.prettyPrint();
	}

	@Then("User should verify the responce Demo")
	public void user_should_verify_the_responce_demo() {
	    int statusCode = res.statusCode();
	    System.out.println("verify the status "+statusCode);
	    Assert.assertEquals(statusCode, 404);
	}

	@Then("User should verify the ID Demo")
	public void user_should_verify_the_id_demo() {
		int code = res.jsonPath().getInt("code");
		System.out.println("verify the code "+code);
		Assert.assertEquals(code, 1,"verify the code ");
	   
	}
	
	@Given("User should URL post the Demo")
	public void user_should_url_post_the_demo() {
	    RestAssured.baseURI="https://petstore.swagger.io/v2/user";
	    reqspec=RestAssured.given().headers("accept","application/json","Content-Type","application/json").
	    		body("{\r\n"
	    				+ "  \"code\": 200,\r\n"
	    				+ "  \"type\": \"Manoj\",\r\n"
	    				+ "  \"message\": \"9223372036854744728\"\r\n"
	    				+ "}");
	}

	@When("User should post the responce Demo")
	public void user_should_post_the_responce_demo() {
	    res=reqspec.post();
	    res.prettyPrint();
	}

	@Then("User should verify the post responce Demo")
	public void user_should_verify_the_post_responce_demo() {
		 int statusCode = res.statusCode();
		    System.out.println("verify the status "+statusCode);
		    Assert.assertEquals(statusCode, 200);
	}

	@Then("User should verify the post code")
	public void user_should_verify_the_post_code() {
	   int code = res.jsonPath().getInt("code");
	   System.out.println("verify the code :"+code);
	   Assert.assertEquals(code, 200,"verify the code ");
	}

	@Then("User should verify the post message")
	public void user_should_verify_the_post_message() {
	    int msg = res.jsonPath().getInt("message");
	    System.out.println("verify the message"+msg);
	    Assert.assertEquals(msg,0,"verify the Message ");
	}

	@Then("User should verify the post type")
	public void user_should_verify_the_post_type() {
	    String type = res.jsonPath().getString("type");
	    System.out.println("verify the type"+type);
	    Assert.assertEquals(type,"unknown","verify the Type ");
	}
	
	@Given("User should URL post")
	public void user_should_url_post() {
	    RestAssured.baseURI="https://petstore.swagger.io/v2/user";
	    reqspec=RestAssured.given().headers("accept","application/json","Content-Type","application/json").
	    		body("{\r\n"
	    				+ "  \"code\": 200,\r\n"
	    				+ "  \"type\": \"kumar\",\r\n"
	    				+ "  \"message\": \"9223372036854744728\"\r\n"
	    				+ "}");
	}

	@When("User should post the responce")
	public void user_should_post_the_responce() {
		 res=reqspec.post();
		    res.prettyPrint();
	}

	@Then("User should verify the post responce")
	public void user_should_verify_the_post_responce() {
		 int statusCode = res.statusCode();
		    System.out.println("verify the status "+statusCode);
		    Assert.assertEquals(statusCode, 200);
	}

	@Then("User should verify the post")
	public void user_should_verify_the_post() {
	  int msg = res.jsonPath().getInt("message");
	    System.out.println("verify the message"+msg);
	    Assert.assertEquals(msg,0,"verify the Message ");
	}


}
