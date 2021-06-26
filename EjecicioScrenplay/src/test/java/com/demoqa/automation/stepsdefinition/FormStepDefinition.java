package com.demoqa.automation.stepsdefinition;

import com.demoqa.automation.task.ClosePublicityTask;
import com.demoqa.automation.task.OpenBrowserTask;
import com.demoqa.automation.userinterfaces.FormHomePage;
import com.demoqa.automation.userinterfaces.PublicityClosePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FormStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver Browser;

    private Actor zair = Actor.named("zair");


    private OpenBrowserTask openBrowser;
    private FormHomePage formHomePage;
    private ClosePublicityTask closePublicity;



    @Given("^we user is on the page$")
    public void weUserIsOnThePage() {
        zair.can(BrowseTheWeb.with(Browser));
        zair.wasAbleTo(OpenBrowserTask.on(openBrowser));



        Browser.manage().window().maximize();
     Browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     zair.wasAbleTo(Click.on(PublicityClosePage.BUTTON_CLOSE_PUBLICITY));

    }

    @Then("^enter the data$")
    public void enterTheData() {


    }

    @When("^it filled form$")
    public void itFilledForm() {


    }

    @When("^send$")
    public void send() {


    }


}
