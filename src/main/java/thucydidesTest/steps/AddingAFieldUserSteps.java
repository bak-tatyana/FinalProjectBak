package thucydidesTest.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import thucydidesTest.pages.WebTestingExamplesPage;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;


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
    public void chooseCategory(String category) {
        webTestingExamplesPage.chooseCategory(category);
    }

    @Step
    public void chooseGender(String gender) {
        webTestingExamplesPage.chooseGender(gender);
    }

    @Step
    public void pushAddButton() {
        webTestingExamplesPage.pushAddButton();
    }

    @Step
    public void pushLoadButton() {
        webTestingExamplesPage.pushLoadButton();
    }

    @Step
    public void pushRanorexLogotype() {
        webTestingExamplesPage.pushRanorexLogotype();
    }

    @Step
    public void pushDeleteButton() {
        webTestingExamplesPage.pushDeleteButton();
    }

    @Step
    public void pushClearButton() {
        webTestingExamplesPage.pushClearButton();
    }

    @Step
    public void pushSaveButton() {
        webTestingExamplesPage.pushSaveButton();
    }

    @Step
    public void vipCount_should_be_correct(String sum) {
        assertEquals(sum, webTestingExamplesPage.vipCount.getText());
    }


    @Step
    public void firstName_should_be_correct_in_table(String firstName) {
        assertEquals(firstName, webTestingExamplesPage.firstNameInTable.getText());
    }

    @Step
    public void lastName_should_be_correct_in_table(String lastName) {
        assertEquals(lastName, webTestingExamplesPage.lastNameInTable.getText());
    }

    @Step
    public void gender_should_be_correct_in_table(String gender) {
        assertEquals(gender, webTestingExamplesPage.genderInTable.getText());
    }

    @Step
    public void category_should_be_correct_in_table(String category) {
        assertEquals(category, webTestingExamplesPage.categoryInTable.getText());
    }

    @Step
    public void homeUrl_should_be_correct(String url) {
        String currentUrl = getDriver().getCurrentUrl();
        assertEquals(currentUrl, url);
    }

    @Step
    public void popupWindow_should_be_correct(String lastNamePopUpWindow) {
        webTestingExamplesPage.switchToWindowUsingTitle(lastNamePopUpWindow);
        webTestingExamplesPage.isPopUpWindowCorrect(lastNamePopUpWindow);
    }

}
