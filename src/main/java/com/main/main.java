package com.main;

import io.cucumber.core.cli.Main;

public class main {

	public static void main(String[] args) {
		try {
			Main.main(new String[]{"-g","com.stepdefinit","-g","com.main","-g","com.resources","-g","com.runner","-g","com.Pom","classpath:feature","-p","json:target/cucumber-reports/cucumber.json","-m"});
		}
        catch(Exception e)
		{
	     System.out.println("Main method exception : "+e);
		}
	}

}
