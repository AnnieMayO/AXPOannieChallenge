package com.AXPOannieChallenge.pages;


import com.AXPOannieChallenge.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signUpPage {

    public signUpPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//button[text()='Solicitar']")
    public WebElement SolicitarButton;


    @FindBy(id = "email")
    public static WebElement emailAddress;

    @FindBy(css = "#identifierId")
    public static WebElement emailAddress2;

    @FindBy(xpath = "//span[text()='Su petición ha sido enviada, recibirá un correo de confirmación.']")
    public static WebElement petitionSuccessMsg;

    @FindBy(xpath = "//*[contains(text(),'Next')]")
    public static WebElement nextButton;

    @FindBy(xpath = "//input[@id='username']")
    public static WebElement password;


}
