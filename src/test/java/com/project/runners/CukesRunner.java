package com.project.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/ features", // from content root
        glue = "com/project/step_definitions", // from source root
        dryRun = true,
        tags = "@student or @admin"


)
public class CukesRunner {
}
