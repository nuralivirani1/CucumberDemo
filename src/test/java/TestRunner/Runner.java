package TestRunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features="FeaturesF",
glue="StepDefination",
plugin={"html:target/cucumber-html-report","json:target/cucumber-json-report","pretty:target/cucumber-pretty-report","usage:target/cucumber-usage-report","junit:target/cucumber-junit-report"},
tags="@login"

)
public class Runner 
{

}
