package rozetkapages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class CartPopup extends BasePage {
    public CartPopup(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='cart-receipt__sum-price']")
    private WebElement totalSum;

    @FindBy(css = ".cart-list__item")
    private List<WebElement> itemsInCartList;

    public int getNumberOfItemsInCart() {
        waitForVisibilityOfElement(itemsInCartList.get(0));
        return itemsInCartList.size();
    }

    public int getTotalSum() {
        return Integer.parseInt(totalSum.getText().replace(" ₴", ""));
    }
}