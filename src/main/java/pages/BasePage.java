package pages;

import org.openqa.selenium.support.PageFactory;
import step.BaseStep;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(BaseStep.getDriver(), this);
    }
}
