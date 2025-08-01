package runnerfiels;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"C:\\Users\\SURYA\\eclipse-workspace\\cucumberBDDproject\\Allfeaturefile\\Login.feature","C:\\Users\\SURYA\\eclipse-workspace\\cucumberBDDproject\\Allfeaturefile\\login1.feature"},
glue= {"Stepdefinition"},
plugin = {"pretty", "html:target/cucumber-reports"},
monochrome = true,
dryRun=false,
publish = true)

 public class Runnerfunctionality extends AbstractTestNGCucumberTests {
	
 }

	
