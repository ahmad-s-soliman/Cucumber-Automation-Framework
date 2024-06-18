package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.Base_PO;
import pageObjects.Contact_Us_PO;

import static driver.DriverFactory.getDriver;

public class Contact_Us_Steps {

    private Contact_Us_PO contact_us_po;

    public Contact_Us_Steps(Contact_Us_PO contact_us_po) {
        this.contact_us_po = contact_us_po;
    }

    @Given("I access webdriver university contact us page")
    public void i_access_webdriver_university_contact_us_page() {
        //navigateTo_URL("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
        contact_us_po.navigate_to_WebDriverUniversity_ContactUs_Page();
    }
    @When("I enter unique first name")
    public void i_enter_unique_first_name() {
        //driver.findElement(By.cssSelector("form#contact_form > input[name='first_name']")).sendKeys("auto first " +"name" + generateRandomNumber(5));
        //sendKeys(By.cssSelector("form#contact_form > input[name='first_name']"),"auto first " +"name" + generateRandomNumber(5));
        contact_us_po.setFirstNameElement_Unique();
    }
    @And("I enter unique last name")
    public void i_enter_unique_last_name() {

        //driver.findElement(By.cssSelector("form#contact_form > input[name='last_name']")).sendKeys("auto last " +"name" + generateRandomNumber(5));
        contact_us_po.setLastNameElement_Unique();
    }
    @And("I enter unique email address")
    public void i_enter_unique_email_address() {

        //driver.findElement(By.cssSelector("form#contact_form > input[name='email']")).sendKeys("email" +generateRandomNumber(5) + "@mail.com");
        contact_us_po.setEmailElement_Unique();
    }
    @And("I enter unique comment")
    public void i_enter_unique_comment() {
        //driver.findElement(By.cssSelector("textarea")).sendKeys(generateRandomString(10));
        contact_us_po.setCommentElement_Unique();
    }

    @When("I enter specific first name {word}")
    public void i_enter_specific_first_name(String firstName) {
        //driver.findElement(By.cssSelector("form#contact_form > input[name='first_name']")).sendKeys(firstName);
        contact_us_po.setFirstNameElement_specific(firstName);
    }
    @When("I enter specific last name {word}")
    public void i_enter_specific_last_name(String lastName) {
        //driver.findElement(By.cssSelector("form#contact_form > input[name='last_name']")).sendKeys(lastName);
        contact_us_po.setLastNameElement_specific(lastName);
    }
    @When("I enter specific email address {word}")
    public void i_enter_specific_email_address(String email) {
        //driver.findElement(By.cssSelector("form#contact_form > input[name='email']")).sendKeys(email);
        contact_us_po.setEmailElement_specific(email);
    }

    @When("I enter specific comment {string}")
    public void i_enter_specific_comment(String comment) {
        //driver.findElement(By.cssSelector("textarea")).sendKeys(comment);
        contact_us_po.setCommentElement_specific(comment);
    }

    @And("I click on submit button")
    public void i_click_on_submit_button() {
        //driver.findElement(By.cssSelector("[type='submit']")).click();
        contact_us_po.clickSubmitButton();
    }
    @Then("I should be presented with a successful message submission")
    public void i_should_be_presented_with_a_successful_message_submission() {
        //WebElement submissionMessage = driver.findElement(By.cssSelector("div#contact_reply > h1"));
        //Assert.assertEquals(submissionMessage.getText(), "Thank You for your Message!");
        contact_us_po.validateSuccessfulSubmissionMessage();
    }
}
