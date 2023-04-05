package com.resources;

import cucumber.deps.difflib.Patch;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BassClassTest {
	RequestSpecification reqspec;
	Response res;
	private String string;
	
	
	public void url() {
		RestAssured.baseURI="";

	}

	public void get() {
		res=reqspec.get();

	}
	
	public void post() {
		res=reqspec.post();

	}
	
	public void Patch() {
		res=reqspec.patch();

	}
	
	public void put() {
		res=reqspec.put();

	}
	
	public void delete() {
		res=reqspec.delete();

	}
	
	
}
