package com.edp.cucumber;

import org.junit.runner.RunWith;

import com.edp.testbase.TestBase;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature")
public class EDPRunner extends TestBase{
	
}
