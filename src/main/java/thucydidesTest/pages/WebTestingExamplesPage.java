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
import java.util.Set;
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

    @FindBy(id = "Load")
    private WebElement loadButton;

    @FindBy(id = "Delete")
    private WebElement deleteButton;

    @FindBy(id = "Clear")
    private WebElement clearButton;

    @FindBy(id = "Save")
    private WebElement saveButton;

    @FindBy(xpath = "//*[@id='count']")
    private WebElement vipCount;

    @FindBy(xpath = "//*[@id='VIPs']/tbody/tr[2]/td[2]")
    private WebElement firstNameInTable;

    @FindBy(xpath = "//*[@id='VIPs']/tbody/tr[2]/td[3]")
    private WebElement lastNameInTable;

    @FindBy(xpath = "//*[@id='VIPs']/tbody/tr[2]/td[4]")
    private WebElement genderInTable;

    @FindBy(xpath = "//*[@id='VIPs']/tbody/tr[2]/td[5]")
    private WebElement categoryInTable;

    @FindBy(xpath = "//*[@id='alertTextOK']")
    private WebElement lastNamePopUpWindowText;

    @FindBy(xpath = "//*[@id='logo']/a")
    private WebElement ranorexLogotype;

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

    public void chooseGender(String gender) {
        Integer option = genderMap.get(gender);
        List<WebElement> radios = getDriver().findElements(By.name("Gender"));
        if (option > 0 && option <= radios.size()) {
            radios.get(option - 1).click();
        } else {
            throw new NotFoundException("option " + option + " not found");
        }
    }

    public void pushAddButton() {
        addButton.click();
    }

    public void pushLoadButton() {
        loadButton.click();
    }


    public void pushRanorexLogotype() {
        ranorexLogotype.click();
    }

    public void pushDeleteButton() {
        deleteButton.click();
    }

    public void pushClearButton() {
        clearButton.click();
    }

    public void pushSaveButton() {
        saveButton.click();
    }


    public void isVipCountEquals2() {
        assertEquals(vipCount.getText(), "VIP count: 2");
    }

    public void isVipCountEquals6() {
        assertEquals(vipCount.getText(), "VIP count: 6");
    }

    public void isVipCountEquals5() {
        assertEquals(vipCount.getText(), "VIP count: 5");
    }

    public void isVipCountEquals0() {
        assertEquals(vipCount.getText(), "VIP count: 0");
    }

    public void isFirstNameCorrectInTable(String firstName) {
        assertEquals(firstNameInTable.getText(), firstName);
        //      assertEquals("testNameForFail", firstName);
    }

    public void isLastNameCorrectInTable(String lastName) {
        assertEquals(lastNameInTable.getText(), lastName);
    }

    public void isGenderCorrectInTable(String gender) {
        assertEquals(genderInTable.getText(), gender);
    }

    public void isCategoryCorrectInTable(String category) {
        assertEquals(categoryInTable.getText(), category);
    }

    public void isHomeUrlCorrect(String url) {
        String currentUrl = getDriver().getCurrentUrl();
        assertEquals(currentUrl, url);
    }


    public boolean switchToWindowUsingTitle(String title)
    {
        String currentWindow = getDriver().getWindowHandle();
        Set<String> availableWindows = getDriver().getWindowHandles();
        if (!availableWindows.isEmpty())
        {
            for (String windowId : availableWindows)
            {
                if (getDriver().switchTo().window(windowId).getTitle().equals(title))
                {
                    return true;
                }
                else
                {
                    getDriver().switchTo().window(currentWindow);
                }
            }
        }
        return false;
    }


    public void isPopUpWindowCorrect(String lastNamePopUpWindow) {
        assertEquals(lastNamePopUpWindowText.getText(), lastNamePopUpWindow);

    }
}
