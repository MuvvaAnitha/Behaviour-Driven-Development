package com.sg.fb.runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/Facebook.feature",
		glue="com.sg.fb.tests",
		plugin={"html:target/cucumber-html-report", "json:target/cucumber.json",

				"pretty:target/cucumber-pretty.txt","usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml"},

				dryRun = false,
				monochrome = true
				
		)

public class Runner{

}