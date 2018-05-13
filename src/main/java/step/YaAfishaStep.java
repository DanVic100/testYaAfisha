package step;

import pages.YaAfishaPage;
import ru.yandex.qatools.allure.annotations.Step;

public class YaAfishaStep {

    @Step("Нажатие на кнопку Кино")
    public void clickMenuFilm()
    {
        new YaAfishaPage().clickMenuFilm();
    }
}
