//package com.AXPOannieChallenge.stepDefs;
//
//import com.AXPOannieChallenge.pages.emailParsingPage;
//import com.AXPOannieChallenge.pages.signUpPage;
//import com.AXPOannieChallenge.utilities.BrowserUtils;
//import com.AXPOannieChallenge.utilities.Driver;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class emailParsingStepDefs {
//
//    emailParsingPage EmailParsingPage = new emailParsingPage();
//    signUpPage SignUpPage = new signUpPage();
//
//    @When("I fetch the API key from email {string} with password {string}")
//    public void iFetchTheAPIKeyFromEmailWithPassword(String email, String password) throws InterruptedException {
//
//        signUpPage.emailAddress.sendKeys(email,password);
//        Thread.sleep(5000);
//
//    }
//
//    @Given("i navigate to the gmail log in site")
//    public void iNavigateToTheGmailLogInSite() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Update the path
//
//        // Create a new instance of the Chrome driver
//        WebDriver driver = new ChromeDriver();
//
//        // Navigate to LinkedIn
//        driver.get("https://www.linkedin.com/");
//
//        // Optionally, you can add a wait or perform actions here
//
////        WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(7));
////        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
//
//        // Close the browser after use
//        driver.quit();
//    }
//}
