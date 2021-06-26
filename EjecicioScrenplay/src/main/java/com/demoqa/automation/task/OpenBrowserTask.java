package com.demoqa.automation.task;



import com.demoqa.automation.userinterfaces.FormHomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;


public class OpenBrowserTask implements Task {

private PageObject page;


    @Override
    @Step("OPEN BROWSER")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(new FormHomePage()));

    }
    public static OpenBrowserTask on(OpenBrowserTask page) {

        return instrumented(OpenBrowserTask.class, page);
    }
    public OpenBrowserTask(PageObject page){
        this.page = page;
    }


}


