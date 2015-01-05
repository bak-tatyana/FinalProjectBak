package thucydidesTest.jbehave;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import thucydidesTest.steps.AddingAFieldUserSteps;

/**
 * Created by Администратор on 28.12.14.
 */
public class DefinitionStepsAddingAFieldToTheTable_Sample2 {

    @Steps
    AddingAFieldUserSteps addingAFieldUserSteps;

    @Given("the user is on the Ranorex web page")
    public void givenTheUserIsOnTheRanorexWebPage() {
        addingAFieldUserSteps.is_the_web_page();
    }

    @Given("the user enter <firstName> into First Name field, <lastName> into Last Name field, chose <category> from the list Category and choose <gender> from Gender")
    public void givenTheUserEnterAllParams(@Named("firstName") String firstName, @Named("lastName") String lastName, @Named("category") String category, @Named("gender") String gender){
        addingAFieldUserSteps.entersFirstName(firstName);
        addingAFieldUserSteps.entersLastName(lastName);
        addingAFieldUserSteps.chooseCategory(category);
        addingAFieldUserSteps.chooseGender(gender);
    }

    @When("the user press button Add")
    public void whenTheUserPressButtonAdd() {
        addingAFieldUserSteps.pushAddButton();
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
}
