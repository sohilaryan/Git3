package com.hrms.runners;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features"
		,glue="com/hrms/steps"
		,dryRun=true
		,plugin= {"pretty", "html:target/html/cucumber-default-report"}
		,monochrome=true
		//,tags= {"@smoke"}
		)

public class TestRunner {

}
