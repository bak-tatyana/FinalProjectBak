package thucydidesTest.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.annotations.Named;
import thucydidesTest.pages.WebTestingExamplesPage;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Администратор on 28.12.14.
 */
public class AddingAFieldUserSteps extends ScenarioSteps {
    WebTestingExamplesPage webTestingExamplesPage;

    @Step
    public void is_the_web_page() {
        webTestingExamplesPage.open();
    }

    @Step
    public void entersFirstName(String firstName) {
        webTestingExamplesPage.enterFirstName(firstName);
    }

    @Step
    public void entersLastName(String lastName) {
        webTestingExamplesPage.enterLastName(lastName);
    }

    @Step
    public void chooseCategory (String category) {
        webTestingExamplesPage.chooseCategory(category);
    }

    @Step
    public void chooseGender (String gender) {
        webTestingExamplesPage.chooseGender(gender);
    }

    @Step
    public void pushAddButton() {
        webTestingExamplesPage.pushAddButton();
    }

    @Step
    public void pushSaveButton() {
        webTestingExamplesPage.pushSaveButton();
    }

    @Step
    public void vipCount_should_be_2() {
        webTestingExamplesPage.isVipCountEquals2();
    }

    @Step
    public void firstName_should_be_correct_in_table(String firstName){
        webTestingExamplesPage.isFirstNameCorrectInTable(firstName);
    }
    @Step
    public void lastName_should_be_correct_in_table(String lastName){
        webTestingExamplesPage.isLastNameCorrectInTable(lastName);
    }
    @Step
    public void gender_should_be_correct_in_table(@Named("gender") String gender){
        webTestingExamplesPage.isGenderCorrectInTable(gender);
    }
    @Step
    public void category_should_be_correct_in_table(@Named("category") String category){
        webTestingExamplesPage.isCategoryCorrectInTable(category);
    }
}
