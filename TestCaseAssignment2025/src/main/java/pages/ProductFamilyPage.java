package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductFamilyPage {
    WebDriver driver;

    // Locators
    @FindBy(linkText = "<a href=\"https://demo.invoiceplane.com/families/index\" xpath=\"1\">View Product Families</a>")
    WebElement productFamilyLink;

    @FindBy(xpath = "//button[contains(text(),'Add')]")
    WebElement addButton;

    @FindBy(id = "family_name")
    WebElement familyNameField;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement saveButton;

    // Constructor
    public ProductFamilyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Navigate to Product Family
    public void viewProductFamily() {
        productFamilyLink.click();
    }

    // Add new Product Family
    public void addProductFamily(String familyName) {
        addButton.click();
        familyNameField.sendKeys(familyName);
        saveButton.click();
    }
}
