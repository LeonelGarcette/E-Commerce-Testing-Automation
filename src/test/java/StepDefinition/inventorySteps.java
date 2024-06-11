package StepDefinition;

import Pages.CartPage;
import Pages.Inventory_Page;
import Pages.Login_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class inventorySteps {
    private final Login_page loginPage = new Login_page();
    private final Inventory_Page inventoryPage = new Inventory_Page();

    public inventorySteps() {

    }

    @Given("Access to the URL")
    public void access_to_the_url() throws InterruptedException {
        Thread.sleep(2000);
    }


    @When("the user log in with user {string} and password {string}")
    public void log_in(String user, String password) {
        loginPage.userNameMethod(user);
        loginPage.passwordMethod(password);
    }


    @And("Click in Login button")
    public void Click_in_Login_button() {
        loginPage.loginButtonLocator();
    }

    @And("Add 1 item in the cart (1)")
    public void Add_1_item_in_the_cart_1() {
        inventoryPage.addBackPackMethod();
    }

    @And("Add 1 item in the cart (2)")
    public void click_add_2_items_in_the_cart_2() {
        inventoryPage.addBikeLightMethod();
    }

    @And("Click in Shopping Cart button")
    public void click_in_shopping_cart_button() {
        inventoryPage.shoppingMethod();
    }

    @And("Click in Checkout button")
    public void click_in_checkout_button() {
        CartPage.checkoutButton();

    }

    @And("Type First Name")
    public void type_first_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("Type Last Name")
    public void type_last_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("Type Zip-Postal Code")
    public void type_zip_postal_code() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("Click in Continue button")
    public void click_in_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Click in Finish button")
    public void click_in_finish_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
