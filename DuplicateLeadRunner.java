package runner;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClassCucumber;

@CucumberOptions(features="src/test/java/features/DuplicateLeadFeatures.feature" ,glue="steps" ,monochrome=true,publish=true)
public class DuplicateLeadRunner extends BaseClassCucumber{

}
