package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

    public By backpackLocator = By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div");
    public By bikeLightLocator = By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[4]/div[2]/a/div");
    public By checkoutLocator = By.id("checkout");

    public String setBackpackLocator("Sauce Labs Backpack") {
        return driver.findElement(backpackLocator).getText();

    }

    public String bikeLightLocator("Sauce Labs Bike Light") {
        return driver.findElement(bikeLightLocator).getText();
    }

    public void checkoutLocator() {
        WebElement checkoutButton = driver.findElement(checkoutLocator);
        checkoutButton.click();
    }
}
