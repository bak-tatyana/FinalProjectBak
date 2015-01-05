package thucydidesTest.steps;

import thucydidesTest.webDriver.WebDriverFactory;
import org.jbehave.core.annotations.AfterStory;
import org.jbehave.core.annotations.BeforeStory;
import org.apache.log4j.Logger;
/**
 * Created by Tanya on 05.01.2015.
 */
public class LifecycleSteps {
    private static final Logger LOG = Logger.getLogger(LifecycleSteps.class);

    @BeforeStory
    public void initWebDrover() {
        LOG.info("BeforeStory init web driver");
        WebDriverFactory.getWebDriver();
    }

    @AfterStory
    public void quiteBrowser() {
        LOG.info("AfterStory quit driver");
        WebDriverFactory.quit();
    }
}
