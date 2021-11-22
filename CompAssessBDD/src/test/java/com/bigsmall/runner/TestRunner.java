package com.bigsmall.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		glue="com.bigsmall.stepDefinitions")
public class TestRunner extends AbstractTestNGCucumberTests{

}
