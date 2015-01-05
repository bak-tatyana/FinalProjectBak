package thucydidesTest.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.jbehave.core.annotations.Named;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import net.thucydides.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;


@DefaultUrl("http://www.ranorex.com/web-testing-examples/vip/")
public class WebTestingExamplesPage extends PageObject {

    private static Map<String, Integer> genderMap = new HashMap<String, Integer>();
    static {
        genderMap.put("Female", 1);
        genderMap.put("Male", 2);
    }

    @FindBy(id = "LastName")
    private WebElement lastNameField;

    @FindBy(id = "FirstName")
    private WebElement firstNameField;

    @FindBy(id = "Add")
    private WebElement addButton;

    @FindBy(id = "Save")
    private WebElement saveButton;

    @FindBy(xpath = "//*[@id='count']")
    private WebElement vipCount2;

    @FindBy(xpath = "//*[@id='VIPs']/tbody/tr[2]/td[2]")
    private WebElement firstNameInTable;

    @FindBy(xpath = "//*[@id='VIPs']/tbody/tr[2]/td[3]")
    private WebElement lastNameInTable;

    @FindBy(xpath = "//*[@id='VIPs']/tbody/tr[2]/td[4]")
    private WebElement genderInTable;

    @FindBy(xpath = "//*[@id='VIPs']/tbody/tr[2]/td[5]")
    private WebElement categoryInTable;


    public void enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }


    public void chooseCategory(String category) {
        WebElement select = getDriver().findElement(By.id("Category"));
        Select dropDown = new Select(select);
        String selected = dropDown.getFirstSelectedOption().getText();
        if (selected.equals(category)) {
        }
        List<WebElement> Category = dropDown.getOptions();
        for (WebElement option : Category) {
            if (option.getText().equals(category)) {
                option.click();
            }
        }

    }

    public void chooseGender (String gender) {
        Integer option = genderMap.get(gender);
        List<WebElement> radios = getDriver().findElements(By.name("Gender"));
        if (option > 0 && option <= radios.size()) {
            radios.get(option - 1).click();
        } else {
            throw new NotFoundException("option " + option + " not found");
        }
    }

    public void pushAddButton(){
        addButton.click();
    }

    public void pushSaveButton(){
        saveButton.click();
    }


    public void isVipCountEquals2(){
        assertEquals(vipCount2.getText(), "VIP count: 2");
    }

    public void isFirstNameCorrectInTable(@Named("firstName") String firstName){
     assertEquals(firstNameInTable.getText(), firstName);
 //      assertEquals("testNameForFail", firstName);
    }

    public void isLastNameCorrectInTable(@Named("lastName") String lastName){
        assertEquals(lastNameInTable.getText(), lastName);
    }

    public void isGenderCorrectInTable(@Named("gender") String gender){
        assertEquals(genderInTable.getText(), gender);
    }

    public void isCategoryCorrectInTable(@Named("category") String category){
        assertEquals(categoryInTable.getText(), category);
    }
}
