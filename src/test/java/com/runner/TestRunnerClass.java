package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions(features = "C://Users//Ch Dharma//eclipse-workspace//CucumberProject2//src//test//resources//Features//loginTask2.feature", glue= {"com.stepdefinition"})

public class TestRunnerClass {

}