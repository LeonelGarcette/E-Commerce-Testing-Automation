package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Inventory_Page extends BasePage {

    public By userNameLocator = By.xpath("//*[@id=\"user-name\"]");
    public By passwordLocator = By.id("password");
    public By loginButtonLocator = By.id("login-button");
    public By backpackButton = By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button");
    public By bikelightButton = By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]/button");
    public By shopping_Button = By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a");
    public By productTittle = By.xpath("/html/body/div/div/div/div[1]/div[2]/span");

    public void userNameMethod(String user) {
        driver.findElement(userNameLocator).sendKeys(user);
    }

    public void passwordMethod(String password) {
        WebElement passwordInput = driver.findElement(passwordLocator);
        passwordInput.sendKeys(password);
    }

    public void loginButtonLocator() {
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();
    }

    public void addBackPackMethod() {
        WebElement backPackButton = driver.findElement(backpackButton);
        backPackButton.click();
    }

    public void addBikeLightMethod() {
        WebElement bikeLightButton = driver.findElement(bikelightButton);
        bikeLightButton.click();
    }

    public void shoppingMethod() {
        WebElement shoppingButton = driver.findElement(shopping_Button);
        shoppingButton.click();
    }

    public String productTittleMethod() {

        return driver.findElement(productTittle).getText();
    }





}
