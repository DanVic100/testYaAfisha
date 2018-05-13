package step;


import pages.YaMainPage;
import ru.yandex.qatools.allure.annotations.Step;


public class YaMainStep  {

    @Step("Выполнено нажатие на Афиша в Москве")
     public void clickLebel(){

         new YaMainPage().afisha.click();

     }

}
