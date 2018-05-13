package step;

import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.allure.annotations.Attachment;


import java.util.concurrent.TimeUnit;

public class BaseStep {

    static WebDriver webDriver;

    public static WebDriver getDriver(){
        return webDriver;
    }


    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        webDriver = new ChromeDriver();
        webDriver.get("http://yandex.ru");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        webDriver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);


    }

    @AfterClass
    public static void afterMethod(){
        webDriver .quit();
    }

    @Attachment(type = "image/png", value = "Screenshot")
    public static byte[] takeScreenshot() {
        return ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
    }


}
