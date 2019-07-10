package com.accenture.api.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/feature", 
		tags= {"@Feature1","@tag1,@tag2"},
		glue = {"com.accenture.api.steps.definitions"},
		snippets = SnippetType.UNDERSCORE,
		monochrome = true,
		dryRun = false,
		plugin = {"json:reportJson/cucumber.json"}
)
public class RunnerApiUsuario {
	
}