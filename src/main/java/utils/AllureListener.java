package utils;

import org.junit.runner.notification.Failure;
import ru.yandex.qatools.allure.junit.AllureRunListener;
import step.BaseStep;

public class AllureListener extends AllureRunListener {

    @Override
    public void testFailure(Failure failure){
        BaseStep.takeScreenshot();
        super.testFailure(failure);
    }
}
