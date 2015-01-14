package thucydidesTest.jbehave;

import net.thucydides.core.ThucydidesSystemProperty;
import net.thucydides.jbehave.ThucydidesJUnitStory;

/**
* Created by Tanya on 13.01.2015.
*/
public class DeleteAFieldFromDefaultTableTestSuite extends ThucydidesJUnitStory {
    public DeleteAFieldFromDefaultTableTestSuite() throws InterruptedException {
        super();
        getSystemConfiguration().setIfUndefined(ThucydidesSystemProperty.THUCYDIDES_STORE_HTML_SOURCE.getPropertyName(), "true");
        getSystemConfiguration().setIfUndefined(ThucydidesSystemProperty.THUCYDIDES_TAKE_SCREENSHOTS.getPropertyName(), "FOR_FAILURES");
    }
}
