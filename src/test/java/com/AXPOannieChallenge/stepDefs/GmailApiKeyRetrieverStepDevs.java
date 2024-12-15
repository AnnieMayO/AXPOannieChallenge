package com.AXPOannieChallenge.stepDefs;

import com.AXPOannieChallenge.pages.gmailPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class GmailApiKeyRetrieverStepDevs {

    gmailPage GmailPage= new gmailPage();


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C://Users//mayom//IdeaProjects//AXPOannieChallenge//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        try {
            // Step 1: Log into Gmail
            driver.get("https://mail.google.com/");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Enter email
            WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(By.id("identifierId")));
            emailField.sendKeys("omerannie2023@gmail.com");
            driver.findElement(By.xpath("username")).click();

            // Enter password
            WebElement passwordField = wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
            passwordField.sendKeys("Babygirl@143");
            driver.findElement(By.xpath("password")).click();

            // Step 2: Wait for inbox to load
            wait.until(ExpectedConditions.titleContains("Inbox"));

            // Step 3: Find the email containing the API key
            List<WebElement> emails = driver.findElements(By.cssSelector("div.Cp div.ya div"));
            for (WebElement email : emails) {
                if (email.getText().contains("API Key")) { // Adjust this to match your email subject or content
                    email.click();
                    break;
                }
            }


            WebElement emailBody = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.a3s.aXjCH ")));
            String emailContent = emailBody.getText();
            String apiKey = extractApiKey(emailContent); // Implement this method to parse the API key

            System.out.println("Retrieved API Key: " + apiKey);

        } finally {

            driver.quit();
        }
    }

    private static String extractApiKey(String emailContent) {
        return emailContent;
    }
}
