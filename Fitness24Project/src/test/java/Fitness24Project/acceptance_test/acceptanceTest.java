package Fitness24Project.acceptance_test;

import  io.cucumber.junit.Cucumber;
import  io.cucumber.junit.CucumberOptions;
import  io.cucumber.junit.CucumberOptions.SnippetType;
import  org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="use_cases",
		plugin ={"html:target/cucumber/wikipedia.html"},
		monochrome=true,
		snippets=SnippetType.CAMELCASE,
        glue= {"Fitness24Project.acceptance_test"}
)



public class acceptanceTest {
	
}