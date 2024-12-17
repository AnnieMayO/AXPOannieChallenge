package com.AXPOannieChallenge.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/failed-html-report"},
        features = "@target/rerun.txt",
        glue = "com/AXPOannieChallenge/stepDefs"
)
public class FailedTestRunner {

}
