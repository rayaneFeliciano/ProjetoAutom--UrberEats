package br.com.acc.uberEats.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/features", glue = "", snippets = SnippetType.CAMELCASE, plugin = { "pretty",
		"html:target/report" }, monochrome = true)
public class Runner {

}
