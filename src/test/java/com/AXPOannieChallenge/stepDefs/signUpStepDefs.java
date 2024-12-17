package com.AXPOannieChallenge.stepDefs;

import com.AXPOannieChallenge.pages.signUpPage;
import com.AXPOannieChallenge.utilities.ConfigurationReader;
import com.AXPOannieChallenge.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static com.AXPOannieChallenge.utilities.Driver.driver;

public class signUpStepDefs {

    signUpPage SignUpPage = new signUpPage();


    @Given("i navigate to the AEMET API Portal.")
    public void iNavigateToTheAEMETAPIPortal() throws InterruptedException {

        Driver.get().get(ConfigurationReader.get("url"));
    }


    @When("i click request button to obtain api key")
    public void iClickRequestButtonToObtainApiKey() throws InterruptedException {

        Driver.get().findElement(By.xpath("//button[text()='Solicitar']")).click();
    }


    @And("i enter my valid email address {string}")
    public void iEnterMyValidEmailAddress(String emailaddress) throws InterruptedException {

        signUpPage.emailAddress.sendKeys(emailaddress);
        Thread.sleep(5000);
    }


    @And("i manually complete captcha")
    public void iManuallyCompleteCaptcha() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments();
        Thread.sleep(60000); //to have enough time to complete captcha manually, pls adjust waits according
    }


    @And("i manually complete captcha and verify that a message {string} appears")
    public void iManuallyCompleteCaptchaAndVerifyThatAMessageAppears(String expectedTitle) throws InterruptedException {

        String actualTitle = signUpPage.petitionSuccessMsg.getText();
        Assert.assertEquals(expectedTitle, actualTitle);
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        System.out.println("expectedTitle = " + expectedTitle);
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        System.out.println("actualTitle = " + actualTitle);
        Thread.sleep(5000);
    }


    @And("verify that a message {string} appears")
    public void verifyThatAMessageAppears(String expectedTitle) throws InterruptedException {
        String actualTitle = signUpPage.petitionSuccessMsg.getText();
        Assert.assertEquals(expectedTitle, actualTitle);
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        System.out.println("expectedTitle = " + expectedTitle);
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        System.out.println("actualTitle = " + actualTitle);
        Thread.sleep(5000);
    }


    @Then("i should receive an API key in my email")
    public void iShouldReceiveAnAPIKeyInMyEmail() throws InterruptedException {

        Driver.get().navigate().to("https://accounts.google.com/v3/signin/identifier?flowEntry=ServiceLogin&flowName=GlifWebSignIn&ifkv=AcMMx-diUtgWEKuR4FbwjMqwyp_-Ylqwf2sHbkbWuJVJ_hhwSjrWjdaFtRrIRRm1CgGM0g2-ndHm&ddm=1&continue=https%3A%2F%2Faccounts.google.com%2FManageAccount%3Fnc%3D1");
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
    }


    @And("i enter again my valid email address emailAddress")
    public void iEnterAgainMyValidEmailAddressEmailAddress() throws InterruptedException {
        new signUpPage().emailAddress2.sendKeys("omerannie2023@gmail.com");
        Thread.sleep(4000);
    }


    @And("i click next")
    public void iClickNext() throws InterruptedException {
        signUpPage.nextButton.click();
        Thread.sleep(5000);
    }
}
