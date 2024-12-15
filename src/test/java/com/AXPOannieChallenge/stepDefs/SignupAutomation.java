package com.AXPOannieChallenge.stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignupAutomation {

    SignUpPage signUpPage= new SignUpPage();

    private static WebDriver driver;
    private String apiKey;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/mayom/IdeaProjects/AXPOannieChallenge/path/to/chromedriver");
        ChromeDriver driver = new ChromeDriver();
    }

    public void signup(String email, String password) {
        try {
            driver.get("https://mail.google.com/");
            driver.findElement(By.id("email")).sendKeys(email);
            driver.findElement(By.id("password")).sendKeys(password);
            driver.findElement(By.id("signupButton")).click();

            // Handle reCAPTCHA manually
            System.out.println("Please complete the reCAPTCHA and press Enter...");
            System.in.read();

            // Wait for email confirmation
            Thread.sleep(10000); // Wait for email to arrive (adjust as necessary)
            apiKey = retrieveApiKey(email);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    private String retrieveApiKey(String email) throws Exception {
        // Implement email retrieval logic here
        // This is a placeholder for email retrieval logic
        String emailContent = checkEmailForApiKey(email);
        return extractApiKey(emailContent);
    }

    private String checkEmailForApiKey(String email) {
        // Implement email checking logic here
        return "Your API key is: ABC123"; // Placeholder
    }

    private String extractApiKey(String emailContent) {
        Pattern pattern = Pattern.compile("API key is: (\\w+)");
        Matcher matcher = pattern.matcher(emailContent);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public String getApiKey() {
        return apiKey;
    }
}
