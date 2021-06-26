package com.demoqa.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.poi.ss.formula.functions.T;

public class PublicityClosePage {


    public static final Target BUTTON_CLOSE_PUBLICITY = Target.the("button_publicity")
            .locatedBy("//img[@alt='adplus-dvertising'or @src='https://ad.plus/adplus-advertising.svg']");


}
