package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClassCucumber;
@CucumberOptions(features="src/test/java/features/CreateLeadFeatures.feature" ,glue="steps" ,monochrome=true,publish=true)
public class CreateLeadRunner extends BaseClassCucumber {

}
