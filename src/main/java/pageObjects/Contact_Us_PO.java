package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import utils.Global_Vars;

public class Contact_Us_PO extends Base_PO{

    @FindBy(how = How.CSS, using = "form#contact_form > input[name='first_name']")
    WebElement firstNameElement;

    @FindBy(css = "form#contact_form > input[name='last_name']")
    WebElement lastNameElement;

    @FindBy(css = "form#contact_form > input[name='email']")
    WebElement emailElement;

    @FindBy(css = "textarea")
    WebElement commentElement;

    @FindBy(css = "[type='submit']") WebElement SubmitButton;

    @FindBy(css = "div#contact_reply > h1") WebElement successfulSubmissionMessage;


    public Contact_Us_PO(){
        super();
    }

    public void navigate_to_WebDriverUniversity_ContactUs_Page(){
        navigateTo_URL(Global_Vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL + "/Contact-Us/contactus.html");
    }

    public void setFirstNameElement_Unique(){
        sendKeys(firstNameElement, "auto first name" + generateRandomNumber(5));
    }

    public void setLastNameElement_Unique(){
        sendKeys(lastNameElement, "auto last name" + generateRandomNumber(5));
    }

    public void setEmailElement_Unique(){
        sendKeys(emailElement, "email" + generateRandomNumber(5) + "@mail.com");
    }

    public void setCommentElement_Unique(){
        sendKeys(commentElement, generateRandomString(10));
    }

    public void setFirstNameElement_specific(String firstName){
        sendKeys(firstNameElement, firstName);
    }

    public void setLastNameElement_specific(String lastName){
        sendKeys(lastNameElement, lastName);
    }

    public void setEmailElement_specific(String email){
        sendKeys(emailElement, email);
    }


    public void setCommentElement_specific(String comment){
        sendKeys(commentElement, comment);
    }

    public void clickSubmitButton(){
        waitForWebElementAndClick(SubmitButton);
    }

    public void validateSuccessfulSubmissionMessage(){
        waitFor(successfulSubmissionMessage);
        Assert.assertEquals(successfulSubmissionMessage.getText(), "Thank You for your Message!");
    }

}
