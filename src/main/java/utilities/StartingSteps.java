package utilities;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
//import org.apache.commons.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class StartingSteps extends DriverFactory {

    @Before
    public void beforeScenario(Scenario scenario){
        driver = new DriverFactory().getDriver();
        System.out.println("Executing Scenario :=> " + scenario.getName());
    }

    @After
    public void afterScenario(Scenario scenario){

        if (scenario.isFailed())
        {
            Date date = new Date();
            String screenShotFile = date.toString().replace(":", "_").replace(" ", "_") + ".png";
            File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try {
                FileHandler.copy(srcFile, new File(System.getProperty("user.dir") + "/screenshots/" + screenShotFile));
            } catch (IOException e) {
                e.printStackTrace();
            }
            embedScreenShotToScenario(scenario);
        }
        System.out.println();
        System.out.println("Execution Status :=> " + scenario.getStatus());
        new DriverFactory().destroyDriver();
    }
    private void embedScreenShotToScenario(Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot)driver)
                .getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
    }
}
