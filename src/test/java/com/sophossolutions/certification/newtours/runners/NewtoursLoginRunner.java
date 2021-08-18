package com.sophossolutions.certification.newtours.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/newtours_login.feature",
			glue = "com.sophossolutions.certification.newtours.stepdefinitions",
			snippets = SnippetType.CAMELCASE,
			tags = "@login")

public class NewtoursLoginRunner {}
