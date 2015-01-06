package thucydidesTest.steps;

import thucydidesTest.WebDriver.WebDriverFactory;
import org.apache.log4j.Logger;
import org.jbehave.core.annotations.AfterStory;
import org.jbehave.core.annotations.BeforeStory;
import thucydidesTest.pages.WebTestingExamplesPage;

/**
 * Created by Tanya on 06.01.2015.
 */
public class LifecycleSteps {
    private static final Logger LOG = Logger.getLogger(LifecycleSteps.class);
    WebTestingExamplesPage webTestingExamplesPage;
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
