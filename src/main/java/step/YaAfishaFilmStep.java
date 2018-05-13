package step;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.YaAfishaFilmPage;
import ru.yandex.qatools.allure.annotations.Step;

import static step.BaseStep.webDriver;


public class YaAfishaFilmStep {



    @Step("Нажата кнопка закрытия рекламы")
    public void clickReklama()
    {
        new WebDriverWait(webDriver,3).until(ExpectedConditions.visibilityOf(new YaAfishaFilmPage().closeB));
        new YaAfishaFilmPage().closeB.click();

    }


    @Step("Проверен заголовок")
    public void aasertTitle()
    {
        new YaAfishaFilmPage().aasertTitle();

    }

    @Step("Нажата кнопка Завтра")
    public void clickDate()
    {
        new YaAfishaFilmPage().dateWhen.click();
        new YaAfishaFilmPage().dateTomorrow.click();
    }
}
