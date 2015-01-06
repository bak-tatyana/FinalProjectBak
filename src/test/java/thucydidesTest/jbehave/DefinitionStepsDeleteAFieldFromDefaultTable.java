package thucydidesTest.jbehave;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import thucydidesTest.steps.AddingAFieldUserSteps;

/**
 * Created by Tanya on 06.01.2015.
 */
public class DefinitionStepsDeleteAFieldFromDefaultTable {
    @Steps
    AddingAFieldUserSteps addingAFieldUserSteps;

    @Given("the user is on the Ranorex web page")
    public void givenTheUserIsOnTheRanorexWebPage() {
        addingAFieldUserSteps.is_the_web_page();
    }
    @Given("the user press button 'Load'")
            public void whenTheUserPressButtonLoad() {
            addingAFieldUserSteps.pushLoadButton();
            }
    @When("the user press button 'Delete'")
    public void whenTheUserPressButtonDelete() {
        addingAFieldUserSteps.pushDeleteButton();
    }

    @Then("vip count should be 5")
    public void thenVipCountShouldBe5() {
        addingAFieldUserSteps.vipCount_should_be_5();
    }

}
