package com.stepdefinit;

import org.testng.Assert;

import com.resources.BassClassTest;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestData extends BassClassTest{
	RequestSpecification reqspec;
	Response res;
	private String string;
	
	@Given("User should login the page")
	public void user_should_login_the_page() {
	 RestAssured.baseURI="https://api.github.com/repos/kavin1995/Testcases";
	 reqspec= RestAssured.given().header("Authorization","Bearer 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");

	}

	@When("User should get the responce")
	public void user_should_get_the_responce() {
		res=reqspec.get();
		res.prettyPrint();
	}

	@Then("User should verify the responce")
	public void user_should_verify_the_responce() {
		int statusCode = res.statusCode();
		 System.out.println(statusCode);
	    Assert.assertEquals(200 ,statusCode);
		
	}
	
	@Then("User should verify the responce id")
	public void user_should_verify_the_responce_id() {
		int id = res.jsonPath().getInt("id");
		System.out.println(id);
		Assert.assertEquals(id , 621267527);
	}

	@Then("User should verify the responce name")
	public void user_should_verify_the_responce_name() {
	    String privat = res.jsonPath().getString("private");
	    System.out.println(privat);
	    Assert.assertEquals(privat, "false");
	}

	@Then("User should verify the private")
	public void user_should_verify_the_private() {
	   String name = res.jsonPath().getString("name");
	   System.out.println(name);
	   Assert.assertEquals(name, "Testcases");
	}

	@Then("User should verify the fullname")
	public void user_should_verify_the_fullname() {
		 String full = res.jsonPath().getString("full_name");
		   System.out.println(full);
		   Assert.assertEquals(full, "kavin1995/Testcases");
	}

	@Given("User should login the page s")
	public void user_should_login_the_page_s() {
	 RestAssured.baseURI="https://api.github.com/user/repos";
	 reqspec=RestAssured.given().header("Authorization","Bearer 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")
			 .body("{\"name\":\"Rest\",\"description\":\"This is your first repo!\",\"homepage\":\"https://github.com\",\"private\":false,\"is_template\":true}");
	 
	}

	@When("User should create the responce")
	public void user_should_create_the_responce() {
	    res=reqspec.post();
	    res.prettyPrint();
	}

	@Then("User should verify the create reponce")
	public void user_should_verify_the_create_reponce() {
		int statusCode = res.statusCode();
		 System.out.println(statusCode);
	    Assert.assertEquals(201 ,statusCode);
	}
	
	
	@Given("User should get the page s")
	public void user_should_get_the_page_s() {
		RestAssured.baseURI="https://api.github.com/repos/kavin1995/Rest";
		 reqspec= RestAssured.given().header("Authorization","Bearer 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");
		
	}

	@When("User should create get the responce")
	public void user_should_create_get_the_responce() {
	res=reqspec.get();
	
	}

	@Then("User should verify the get reponce")
	public void user_should_verify_the_get_reponce() {
	  int code = res.statusCode();
	  System.out.println(code);
	  Assert.assertEquals(200, code, "value");
	}

		@Then("User should verify the created reponce name")
	public void user_should_verify_the_created_reponce_name() {
	  String name = res.jsonPath().getString("name");
	  System.out.println(name);
	  Assert.assertEquals("Rest", name, "name");
	}

	@Then("User should verify the create reponce private")
	public void user_should_verify_the_create_reponce_private() {
	  String pri = res.jsonPath().getString("private");
	  System.out.println(pri);
	  Assert.assertEquals("false", pri, "private");
	}

	@Then("User should verify the create reponce fullname")
	public void user_should_verify_the_create_reponce_fullname() {
		String full = res.jsonPath().getString("full_name");
		   System.out.println(full);
		   Assert.assertEquals(full, "kavin1995/Rest");
	}

	@Then("User should verify the create avatar_url")
	public void user_should_verify_the_create_avatar_url() {
	    String url = res.jsonPath().getString("owner.avatar_url");
	    System.out.println(url);
	    Assert.assertEquals(url, "https://avatars.githubusercontent.com/u/127470271?v=4");
	}
	
	@Given("User should patch the name")
	public void user_should_patch_the_name() {
	   RestAssured.baseURI="https://api.github.com/repos/kavin1995/Rest";
	   reqspec=RestAssured.given().header("Authorization","Bearer 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")
			   .body("{\"name\":\"APIRest\",\"description\":\"This is your first repository\",\"homepage\":\"https://github.com\",\"private\":true,\"has_issues\":true,\"has_projects\":true,\"has_wiki\":true}");
	   
	}

	@When("User should create patch the responce")
	public void user_should_create_patch_the_responce() {
	    res=reqspec.patch();
	    
	}

	@Given("User should  get patch the name")
	public void user_should_get_patch_the_name() {
		RestAssured.baseURI="https://api.github.com/repos/kavin1995/APIRest";
		 reqspec= RestAssured.given().header("Authorization","Bearer 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");
	}

	@When("User should get patch the responce")
	public void user_should_get_patch_the_responce() {
	    res=reqspec.get();
	    res.prettyPrint();
	}

	@Then("User should verify the responce of patch")
	public void user_should_verify_the_responce_of_patch() {
	    int update = res.statusCode();
	    System.out.println(update);
	    Assert.assertEquals(200, update, "responce code");
	}

	@Then("User should verify the responce of patch name")
	public void user_should_verify_the_responce_of_patch_name() {
		String name = res.jsonPath().getString("name");
		System.out.println(name);
		Assert.assertEquals("APIRest", name,"verify the name");		
	   
	}

	@Then("User should verify the responce of patch avatarurl")
	public void user_should_verify_the_responce_of_patch_avatarurl() {
	    String url = res.jsonPath().getString("owner.avatar_url");
	    System.out.println(url);
	    Assert.assertEquals("https://avatars.githubusercontent.com/u/127470271?v=4", url,"verify the url");	
	}

	@Then("User should verify the responce of patch fullname")
	public void user_should_verify_the_responce_of_patch_fullname() {
		String fname = res.jsonPath().getString("full_name");
		System.out.println(fname);
		Assert.assertEquals("kavin1995/APIRest", fname,"verify the fullname");	
	}

	@Then("User should verify the responce of patch path")
	public void user_should_verify_the_responce_of_patch_path() {
		String html = res.jsonPath().getString("owner.html_url");
		System.out.println(html);
		Assert.assertEquals("https://github.com/kavin1995", html,"verify the html");	
	}
	
	
	@Given("User should  delete the name")
	public void user_should_delete_the_name() {
	   RestAssured.baseURI="https://api.github.com/repos/kavin1995/APIRest";
	   reqspec=RestAssured.given().header("Authorization","Bearer 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");
	}

	@When("User should get delete the responce")
	public void user_should_get_delete_the_responce() {
	   res=reqspec.delete();
	}

	@Then("User should verify the delete code")
	public void user_should_verify_the_delete_code() {
		   int delete = res.statusCode();
		    System.out.println(delete);
		    Assert.assertEquals(204, delete, "responce code");
		
	}

	@Given("User should  get deleted the name")
	public void user_should_get_deleted_the_name() {
		 RestAssured.baseURI="https://api.github.com/repos/kavin1995/APIRest";
		   reqspec=RestAssured.given().header("Authorization","Bearer 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");
	}

	@When("User should get deleted the responce")
	public void user_should_get_deleted_the_responce() {
	   res=reqspec.get();
	}

	@Then("User should verify the responce of deleted")
	public void user_should_verify_the_responce_of_deleted() {
		int delete = res.statusCode();
	    System.out.println(delete);
	    Assert.assertEquals(delete, 404, "responce code");
	}
	
	
	
	
}
