package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_PO;
import pageObjects.Login_PO;


public class Login_Steps extends Base_PO {

    private Login_PO login_po;

    public Login_Steps(Login_PO login_po){
        this.login_po = login_po;
    }

    @Given("I access webdriver university login page")
    public void i_access_webdriver_university_login_page() {
        //navigateTo_URL("https://www.webdriveruniversity.com/Login-Portal/index.html?");
        login_po.navigate_To_WebDriver_University_Login_Page();
    }

    @When("I enter username {}")
    public void i_enter_username(String username) {
        //driver.findElement(By.cssSelector("input#text")).sendKeys(username);
        login_po.setUsername_textField(username);
    }

    @And("I enter password {}")
    public void i_enter_password(String password) {
        //driver.findElement(By.cssSelector("input#password")).sendKeys(password);
        login_po.setPassword_textField(password);
    }

    @And("I click on login button")
    public void i_click_on_login_button() {
        //driver.findElement(By.cssSelector("button#login-button")).click();
        login_po.clickLoginButton();
    }

    @Then("Alert with {} is displayed")
    public void alert_with_message_is_displayed(String expectedMessage) {
        //String messageDisplayed = driver.switchTo().alert().getText();
        //Assert.assertEquals(messageDisplayed, expectedMessage);
        login_po.waitForAlert_And_ValidateText(expectedMessage);
    }
    
}
