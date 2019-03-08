package com.bookit.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(
		tags= "@temp",
		features = "src/test/resources/features",
		glue = "com/bookit/step_definitions",
		dryRun = false,
		plugin = {
				"json:target/cucumber.json",
				"pretty"
				
		}
		
		)
public class CukesRunner {

}
