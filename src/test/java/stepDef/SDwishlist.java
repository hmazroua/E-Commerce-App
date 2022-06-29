package stepDef;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class SDwishlist {
    @When("user adds a product to wishlist")
    public void addToWishlist()
    {
        Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]")).get(2).click();
    }
}
