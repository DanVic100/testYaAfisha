package step;


import org.junit.Assert;
import pages.FilmPage;
import ru.yandex.qatools.allure.annotations.Step;
import utils.Film;

public class FilmStep {

    @Step("Проверка имени и кинотеатров")
    public void assertT()
    {
        Assert.assertEquals("Количество театров не совпадает",Film.getTeathre(),new FilmPage().numT.getText());
        Assert.assertEquals("Название не совпадает",Film.getName(),new FilmPage().name.getText());
    }
}
