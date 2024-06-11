package StepDefinition;

import Pages.BasePage;
import Pages.Inventory_Page;
import Pages.Login_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps extends BasePage {
    private final Login_page loginPage = new Login_page();
    private final Inventory_Page inventoryPage = new Inventory_Page();

    public LoginSteps() {
        super();
    }

    @Given("the user navigates to the SauceDemo login page")
    public void the_user_navigates_to_the_sauce_demo_login_page() throws InterruptedException {
        Thread.sleep(2000);
    }

    @When("the user enters {string} as the username")
    public void theUserEntersAsTheUsername(String username) {
        loginPage.userNameMethod(username);
    }

    @And("the user enters {string} as the password")
    public void theUserEntersAsThePassword(String password) {
        loginPage.passwordMethod(password);
    }

    @And("the user clicks on the login button")
    public void clickLoginButton() {
        loginPage.loginButtonLocator();
    }

    @Then("the login should be {string}")
    public void verifyLoginStatus(String expectedStatus) {

        switch (expectedStatus) {
            case "success" -> inventoryPage.productTittleMethod().compareTo("Products");
            case "invalid" ->
                    loginPage.errorMessageAssert("Epic sadface: Username and password do not match any user in this service");
            case "locked" -> loginPage.errorMessageAssert("Epic sadface: Sorry, this user has been locked out.");
        }
    }


}
