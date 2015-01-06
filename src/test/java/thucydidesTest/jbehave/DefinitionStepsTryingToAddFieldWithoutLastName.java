package thucydidesTest.jbehave;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import thucydidesTest.steps.AddingAFieldUserSteps;

/**
 * Created by Tanya on 06.01.2015.
 */
public class DefinitionStepsTryingToAddFieldWithoutLastName {
    @Steps
    AddingAFieldUserSteps addingAFieldUserSteps;

    @Given("the user is on the Ranorex web page")
    public void givenTheUserIsOnTheRanorexWebPage() {
        addingAFieldUserSteps.is_the_web_page();
    }

    @Given("the user enter first name $name")
    public void givenTheUserEnterFirstName1(String name) {
        addingAFieldUserSteps.entersFirstName(name);
    }

    @When("the user press button 'Add'")
    public void whenTheUserPressButtonAdd1() {
        addingAFieldUserSteps.pushAddButton();
    }


    @Then("name of popup window ModalDialogOK is $lastNamePopUpWindow")
    public void thenPleaseSpecifyLastNameValue(String lastNamePopUpWindow) {
        addingAFieldUserSteps.popupWindow_should_be_correct(lastNamePopUpWindow);
    }
}
