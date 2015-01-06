package thucydidesTest.jbehave;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import thucydidesTest.steps.AddingAFieldUserSteps;

/**
 * Created by Tanya on 06.01.2015.
 */
public class DefinitionStepsLoadDefaultTable {
    @Steps
    AddingAFieldUserSteps addingAFieldUserSteps;

    @Given("the user is on the Ranorex web page")
    public void givenTheUserIsOnTheRanorexWebPage() {
        addingAFieldUserSteps.is_the_web_page();
    }

    @When("the user press button 'Load'")
    public void whenTheUserPressButtonLoad() {
        addingAFieldUserSteps.pushLoadButton();
    }

    @Then("vip count should be 6")
    public void thenVipCountShouldBe6() {
        addingAFieldUserSteps.vipCount_should_be_6();
    }

}
