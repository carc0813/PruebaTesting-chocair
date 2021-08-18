package com.sophossolutions.certification.newtours.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/newtours_register.feature",
			glue = "com.sophossolutions.certification.newtours.stepdefinitions",
			snippets = SnippetType.CAMELCASE,
			tags = "@register")

public class NewtoursRegisterRunner {}