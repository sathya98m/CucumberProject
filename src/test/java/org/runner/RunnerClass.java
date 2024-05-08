package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.GenerateReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\LoginPage.feature",
glue="org.step",
plugin= {
		"html:target\\htmlReport",
		"junit:target\\xmlReport.xml",
		"json:target\\jsonReport.json"
})
public class RunnerClass {
	
	@AfterClass
	public static void report() {
		GenerateReport.generateJVMReport("target\\jsonReport.json");
	}

}
