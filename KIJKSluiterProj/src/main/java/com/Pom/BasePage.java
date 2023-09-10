package com.Pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	WebDriver driver;
	JavascriptExecutor js;
	public BasePage(WebDriver driver) {
		this.driver=driver;
		js = (JavascriptExecutor)driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//ul[@class='languagepicker']")
	private WebElement country;
	
	@FindBy(xpath="//a[@class='lang enable'][2]")
	private WebElement english;

	public WebElement moveToCountry() {
		
		Actions act = new Actions(driver);
		act.moveToElement(country).build().perform();
		return country;
	}
	public WebElement clickOnEnglish() {
		return english;
	}
	
	
}
