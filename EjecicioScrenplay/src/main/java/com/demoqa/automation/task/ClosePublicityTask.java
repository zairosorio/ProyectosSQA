package com.demoqa.automation.task;

import com.demoqa.automation.userinterfaces.PublicityClosePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;


public class ClosePublicityTask implements Task {





    @Override
    @Step("close Publicity")
    public <T extends Actor> void performAs(T actor) {
        if (Visibility.of(PublicityClosePage.BUTTON_CLOSE_PUBLICITY).viewedBy(actor).asBoolean()) ;

    }





}

