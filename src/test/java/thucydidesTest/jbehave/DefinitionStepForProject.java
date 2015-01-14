package thucydidesTest.jbehave;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import thucydidesTest.steps.AddingAFieldUserSteps;

/**
 * Created by Tanya on 14.01.2015.
 */
public class DefinitionStepForProject {

    @Steps
    AddingAFieldUserSteps addingAFieldUserSteps;

    @Given("the user is on the Ranorex web page")
    public void givenTheUserIsOnTheRanorexWebPage() {
        addingAFieldUserSteps.is_the_web_page();
    }

    @When("the user press on Ranorex logotype")
    public void whenTheUserPressOnRanorexLogotype() {
        addingAFieldUserSteps.pushRanorexLogotype();
    }

    @When("the user enter first name $first1Name")
    public void givenTheUserEnterFirstName1(String first1Name) {
        addingAFieldUserSteps.entersFirstName(first1Name);
    }

    @When("the user enter last name $last1Name")
    public void givenTheUserEnterLastName1(String last1Name) {
        addingAFieldUserSteps.entersLastName(last1Name);
    }

    @When("the user press button 'Add' first time")
    public void whenTheUserPressButtonAdd1() {
        addingAFieldUserSteps.pushAddButton();
    }

    @When("user enter first name $first2Name")
    public void givenTheUserEnterFirstName2(String first2Name) {
        addingAFieldUserSteps.entersFirstName(first2Name);
    }

    @When("user enter first name $last2Name")
    public void givenTheUserEnterLastName2(String last2Name) {
        addingAFieldUserSteps.entersLastName(last2Name);
    }

    @When("the user press button 'Add' second time")
    public void whenTheUserPressButtonAdd2() {
        addingAFieldUserSteps.pushAddButton();
    }

    @When("the user enter <firstName> into First Name field, <lastName> into Last Name field, chose <category> from the list Category and choose <gender> from Gender")
    public void givenTheUserEnterAllParams(@Named("firstName") String firstName, @Named("lastName") String lastName, @Named("category") String category, @Named("gender") String gender) {
        addingAFieldUserSteps.entersFirstName(firstName);
        addingAFieldUserSteps.entersLastName(lastName);
        addingAFieldUserSteps.chooseCategory(category);
        addingAFieldUserSteps.chooseGender(gender);
    }

    @When("the user press button Add")
    public void whenTheUserPressButtonAdd() {
        addingAFieldUserSteps.pushAddButton();
    }

    @When("the user press button 'Load'")
    public void whenTheUserPressButtonLoad() {
        addingAFieldUserSteps.pushLoadButton();
    }

    @When("the user press button 'Clear'")
    public void whenTheUserPressButtonClear() {
        addingAFieldUserSteps.pushClearButton();
    }

    @When("the user press button 'Delete'")
    public void whenTheUserPressButtonDelete() {
        addingAFieldUserSteps.pushDeleteButton();
    }

    @Then("vip count should be $sum")
    public void thenVipCountShouldBe(String sum) {
        addingAFieldUserSteps.vipCount_should_be_correct(sum);
    }

    @Then("name of popup window ModalDialogOK is $lastNamePopUpWindow")
    public void thenPleaseSpecifyLastNameValue(String lastNamePopUpWindow) {
        addingAFieldUserSteps.popupWindow_should_be_correct(lastNamePopUpWindow);
    }

    @Then("line is added to the table with the previously entered parameters <firstName> into the field First Name")
    public void thenLineAddedToTheTableWithCorrectFirstName(@Named("firstName") String firstName) {
        addingAFieldUserSteps.firstName_should_be_correct_in_table(firstName);
    }

    @Then("line is added to the table with the previously entered parameters <lastName> into the field Last Name")
    public void thenLineAddedToTheTableWithCorrectLastName(@Named("lastName") String lastName) {
        addingAFieldUserSteps.lastName_should_be_correct_in_table(lastName);
    }

    @Then("line is added to the table with the previously entered parameters <gender> into the field Gender")
    public void thenLineAddedToTheTableWithCorrectGender(@Named("gender") String gender) {
        addingAFieldUserSteps.gender_should_be_correct_in_table(gender);
    }

    @Then("line is added to the table with the previously entered parameters <category> into the field Category")
    public void thenLineAddedToTheTableWithCorrectCategory(@Named("category") String category) {
        addingAFieldUserSteps.category_should_be_correct_in_table(category);
    }

    @Then("url is $url")
    public void thenUrlShouldBeCorrect(String url) {
        addingAFieldUserSteps.homeUrl_should_be_correct(url);
    }
}
