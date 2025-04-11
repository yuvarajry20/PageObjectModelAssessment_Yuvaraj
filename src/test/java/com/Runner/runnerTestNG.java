package com.Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(plugin = {"pretty",
		"json:target/cucumber-reports/Cucumber.json",
		"html:target/cucumber-reports/Cucumber.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
features={"src/test/resources/Features/Login.feature",
		"src/test/resources/Features/Register.feature",
//		"src/test/resources/Features/Product Purchase (HP LP3065).feature"
		},
glue="com.Definitions")
public class runnerTestNG extends AbstractTestNGCucumberTests {

}
