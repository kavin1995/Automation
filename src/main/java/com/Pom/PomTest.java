package com.Pom;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PomTest {
	
	private RequestSpecification reqspe;
	private Response re;
	private String strin;


	public RequestSpecification getReqspe() {
		return reqspe;
	}

	public void setReqspe(RequestSpecification reqspe) {
		this.reqspe = reqspe;
	}

	public Response getRe() {
		return re;
	}

	public void setRe(Response re) {
		this.re = re;
	}

	public String getStrin() {
		return strin;
	}

	public void setStrin(String strin) {
		this.strin = strin;
	}

}
