package com.stepdefinit;

import org.testng.Assert;

import com.resources.BassClassTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo extends BassClassTest{
	
	RequestSpecification reqspec;
	Response res;
	
	@Given("User should load the page")
	public void user_should_load_the_page() {
		RestAssured.baseURI = "https://ergast.com/api/f1/2017/circuits.json";
		reqspec = RestAssured.given();		
		
	}
	

	@When("User should get the responce code")
	public void user_should_get_the_responce_code() {
	     res=reqspec.get();
	    
	}

	
	@Then("User should verify the responce code")
	public void user_should_verify_the_responce_code() {
		 int statusCode = res.statusCode();
		 System.out.println(statusCode);
	
		Assert.assertEquals(200 ,statusCode);
		
	}
	
	
	@Then("User should verify the ID")
	public void user_should_verify_the_id() {
		String Id = "albert_park";
		String string = res.jsonPath().getString("MRData.CircuitTable.Circuits[0].circuitId");
		Assert.assertEquals(Id, string);
	}
	

	@Then("User should verify the series")
	public void user_should_verify_the_series() {
		String  Data ="f1";
		 Object object = res.jsonPath().get("MRData.series");
		Assert.assertEquals(Data,object);
	}
	

	@Then("User should verify the Name")
	public void user_should_verify_the_name() {
		String Name = "Albert Park Grand Prix Circuit";
		String string = res.jsonPath().getString("MRData.CircuitTable.Circuits[0].circuitName");
		Assert.assertEquals(Name,string);
	}
	

	@Then("User should verify the Exlocality")
	public void user_should_verify_the_exlocality() {
		String Exloc = "Melbourne";
		String string = res.jsonPath().getString("MRData.CircuitTable.Circuits[0].Location.locality");
		Assert.assertEquals(Exloc,string);	
	}
	

	@Then("User should verify the Data")
	public void user_should_verify_the_data() {
	    String url = "http://ergast.com/api/f1/2017/circuits.json";
	    String string = res.jsonPath().getString("MRData.url");
	    Assert.assertEquals(url,string);
	}
	
	
	@Then("User should verify the year")
	public void user_should_verify_the_year() {
		String year = "2017";
		String string = res.jsonPath().getString("MRData.CircuitTable.season");
		Assert.assertEquals(year,string );
	}

	@Then("User should view in console")
	public void user_should_view_in_console() {
		String prettyPrint = res.prettyPrint();
		//System.out.println(prettyPrint);
	}
	

}
