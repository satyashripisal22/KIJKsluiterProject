package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

	
	@FindBy(xpath="//a[@class='login']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//section[@id='main']//following::div[2]/input[1]")
	private WebElement emailid;
	
	@FindBy(xpath="//section[@id='main']//following::div[2]/input[2]")
	private WebElement password;
	
	@FindBy(xpath="//section[@id='main']//following::div/button[text()='Continue']")
	private WebElement continuebtn;
	
	public LoginPage(WebDriver driver) {
		//PageFactory.initElements(driver, this);
		super(driver);
	}
	
	public WebElement clickOnLoginBtn() {
		return loginBtn;
	}
	
	public WebElement enterEmaiId() {
		return emailid;
	}
	
	public WebElement enterPassword() {
		return password;
	}
	
	public WebElement clickOnContinueBtn() {
		return continuebtn;
	}

}
