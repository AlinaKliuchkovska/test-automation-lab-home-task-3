package rozetkatests;

import model.RozetkaFilter;
import org.testng.annotations.Test;
import utils.XMLToObject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AddToCartTests extends BaseTest {
    RozetkaFilter rozetkaFilter = new RozetkaFilter();

    @Test
    public void checkThatAddingToCartWorksCorrect() {
        rozetkaFilter = XMLToObject.readXMLToObject();
        getHomePage().enterKeyWordToSearchInput(rozetkaFilter.getGroup());
        getNotebooksPage().enterBrandToBrandSearchInput(rozetkaFilter.getBrandName()).checkAcerCheckbox()
                .checkReadyToShipCheckbox().setSortingType(rozetkaFilter.getSortingType()).clickOnFirstProduct();
        getProductPage().clickOnAddToCartButton();

        assertEquals(rozetkaFilter.getItemsNumber(), getCartPopup().getNumberOfItemsInCart());
        assertTrue(getCartPopup().getTotalSum() < rozetkaFilter.getMaxSum());
    }
}