package com.resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import cucumber.deps.difflib.Patch;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BassClassTest {
	RequestSpecification reqspec;
	Response res;
	private String string;
	
	public String getproperty(String value) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream(System.getProperty("user.dir")+"\\Endpoint\\Endpoint.properties"));
		Object object = properties.get(value);
		String key =(String) object;
		return key;
		
	}
	
	
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
