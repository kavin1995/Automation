package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@tags",features = "src\\main\\resources\\feature", glue = "com.stepdefinit", 
dryRun = false,   plugin = {"json:target/cucumber.json" })
public class RunnerClass {

}
