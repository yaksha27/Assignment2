package stepImplementations;

import org.junit.runner.RunWith;

import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(format={"pretty","html:reports/test-report"},
features = "src/main/resources/SourceFeature.feature",
glue = "RegisterUser", monochrome = true,
tags="@smokeTest")
public class Runner {

}
	