package thucydidesTest.jbehave;

import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.runners.ThucydidesParameterizedRunner;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.runner.RunWith;
import thucydidesTest.steps.AddingAFieldUserSteps;

/**
 * Created by Администратор on 29.12.14.
 */
public class DefinitionStepsAdding2FieldsToTheTable {
    @Steps
    AddingAFieldUserSteps addingAFieldUserSteps;

    @Given("the user is on the Ranorex web page")
    public void givenTheUserIsOnTheRanorexWebPage() {
        addingAFieldUserSteps.is_the_web_page();
    }

    @Given("the user enter first name $first1Name")
    public void givenTheUserEnterFirstName1(String first1Name) {
        addingAFieldUserSteps.entersFirstName(first1Name);
    }
    @Given("the user enter last name $last1Name")
    public void givenTheUserEnterLastName1(String last1Name) {
        addingAFieldUserSteps.entersLastName(last1Name);
    }

    @When("the user press button 'Add' first time")
    public void whenTheUserPressButtonAdd1() {
        addingAFieldUserSteps.pushAddButton();
    }

    @Given("user enter first name $first2Name")
    public void givenTheUserEnterFirstName2(String first2Name) {
        addingAFieldUserSteps.entersFirstName(first2Name);
    }
    @Given("user enter first name $last2Name")
    public void givenTheUserEnterLastName2(String last2Name) {
        addingAFieldUserSteps.entersLastName(last2Name);
    }

    @When("the user press button 'Add' second time")
    public void whenTheUserPressButtonAdd2() {
        addingAFieldUserSteps.pushAddButton();
    }

    @Then("vip count should be 2")
    public void thenVipCountShouldBe2() {
        addingAFieldUserSteps.vipCount_should_be_2();
    }

}

