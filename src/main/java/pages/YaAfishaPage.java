package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class YaAfishaPage extends BasePage
{


    @FindBy(xpath = "//a[contains(text(),'Кино')]")
    public WebElement menuFilm;



    public YaAfishaFilmPage clickMenuFilm()
    {
        menuFilm.click();
        return new YaAfishaFilmPage();
    }
}
