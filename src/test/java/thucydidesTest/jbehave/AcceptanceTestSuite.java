package thucydidesTest.jbehave;

import net.thucydides.core.ThucydidesSystemProperty;
import net.thucydides.jbehave.ThucydidesJUnitStories;

/**
 * Created by Администратор on 29.12.14.
 */
public class AcceptanceTestSuite extends ThucydidesJUnitStories {
    private static final int THREADS = 5;

    public AcceptanceTestSuite() throws InterruptedException {
        super();

        configuredEmbedder().embedderControls()
                .useStoryTimeoutInSecs(15 * 60)
                .doIgnoreFailureInStories(true)
                .doIgnoreFailureInView(false)
                .useThreads(THREADS);



//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
//        getSystemConfiguration().setIfUndefined("webdriver.driver", "chrome");

        getSystemConfiguration().setIfUndefined(ThucydidesSystemProperty.THUCYDIDES_STORE_HTML_SOURCE.getPropertyName(), "true");
        getSystemConfiguration().setIfUndefined(ThucydidesSystemProperty.THUCYDIDES_TAKE_SCREENSHOTS.getPropertyName(), "FOR_FAILURES");
    }


}
//        configuration()
//                .usePendingStepStrategy( new FailingUponPendingStep() )
//                .useStepPatternParser( new RegexPrefixCapturingPatternParser( "%" ) )
//                .storyReporterBuilder().withMultiThreading( THREADS > 1 );
//        configuration()
//                .storyReporterBuilder().withReporters(
//                new ThucydidesReporter( getSystemConfiguration() ) );
//    }

