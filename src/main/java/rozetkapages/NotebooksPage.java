package rozetkapages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static org.openqa.selenium.Keys.ENTER;


public class NotebooksPage extends BasePage {
    public NotebooksPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//select[contains(@class, 'ng-star-inserted')]")
    private WebElement sortingTypeSelect;

    @FindBy(xpath = "//input[@id='Готов к отправке']/ancestor::li")
    private WebElement readyToShipCheckbox;

    @FindBy(xpath = "//input[@id='Acer']/preceding::input[@placeholder='Поиск']")
    private WebElement brandSearchInput;

    @FindBy(xpath = "//a[@href='/notebooks/c80004/producer=acer/']")
    private WebElement acerCheckbox;

    @FindBy(css = ".goods-tile__heading")
    private WebElement firstProduct;

    public NotebooksPage enterBrandToBrandSearchInput(String brandName) {
        waitForVisibilityOfElement(brandSearchInput);
        brandSearchInput.sendKeys(brandName, ENTER);
        return this;
    }

    public NotebooksPage setSortingType(String sortingType) {
        waitForElementToBeClickable(sortingTypeSelect);
        Select sortingTypeDropdown = new Select(sortingTypeSelect);
        sortingTypeDropdown.selectByVisibleText(sortingType);
        return this;
    }

    public void clickOnFirstProduct() {
        waitForElementToBeClickable(firstProduct);
        firstProduct.click();
    }

    public NotebooksPage checkReadyToShipCheckbox() {
        waitForElementToBeClickable(readyToShipCheckbox);
        readyToShipCheckbox.click();
        return this;
    }

    public NotebooksPage checkAcerCheckbox() {
        waitForElementToBeClickable(acerCheckbox);
        acerCheckbox.click();
        return this;
    }
}
