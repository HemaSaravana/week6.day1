package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClassCucumber;
@CucumberOptions(features="src/test/java/features/Login.feature" 
                 ,glue="steps" 
                 ,monochrome=true
                 ,publish=true
                 ,tags="@functional and @regression")
public class CucumberRunner extends BaseClassCucumber{

}
