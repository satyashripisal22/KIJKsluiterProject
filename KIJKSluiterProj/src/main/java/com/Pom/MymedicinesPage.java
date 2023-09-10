package com.Pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;




public class MymedicinesPage {
	

	@FindBy(xpath="//a[text()='Add video']")
	private WebElement addvideo;
	
	//@FindBy(xpath = "//table[@class='medicine']/tbody/tr")
	//List<WebElement> tableRows;
	
	@FindBy(xpath="//select[@id='optsProductSearch']")
	private WebElement searchmedicinename;
	
	@FindBy(xpath="//input[@id='txtProductName']")
	private WebElement medicinename;
	
	@FindBy(id="btnProductSubmit")
	private WebElement continuebtn;
	
	public MymedicinesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement clickOnAddVideo() {
		
		/*for(int i=1;i<tableRows.size();i++) {
			
		}*/
		return addvideo;
	}
	

	public WebElement enterSearchByMedicineName() {
			
		Select s = new Select(searchmedicinename);
		s.selectByVisibleText("Search by medicine name");
		return searchmedicinename;
	}
	
	public WebElement enterMedicineName() {
		
		return medicinename;
		
	}
	
	public WebElement clickOnContinueBtn() {
	return continuebtn;
	}
	
}
