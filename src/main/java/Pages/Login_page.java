package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Login_page extends BasePage {

    public By userNameLocator = By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input");
    public By passwordLocator = By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input");
    public By loginButtonLocator = By.id("login-button");
    public By errorMessageLocator = By.xpath("//div[@id='login_button_container']//form//h3");


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

    public void errorMessageAssert(String text) {

        WebElement errorMessage = driver.findElement(errorMessageLocator);
        if (!errorMessage.getText().equals(text)) throw new AssertionError("Error message does not match");
    }


}

