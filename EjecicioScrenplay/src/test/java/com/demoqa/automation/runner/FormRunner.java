package com.demoqa.automation.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/forms.feature",
        glue = "",
        tags = "",
        snippets = SnippetType.CAMELCASE


)
public class FormRunner {
}
