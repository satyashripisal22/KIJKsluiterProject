package com.Pom;

import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class WelcomePage extends BasePage {
	
	@FindBy(xpath="//a[text()='Start KIJKsluiter']")
	private WebElement startkijksluiterbtn;
	
	@FindBy(xpath="//input[@id='optsCPCities']")
	private WebElement cityname;
	
	@FindBy(tagName="li")
	private List<WebElement>list;
	
	@FindBy(xpath="//select[@id='optsCPPharmacies']") 
	private WebElement selectcareprovider;
	
	@FindBy(xpath="//button[@id='btnCpContinue']")////button[@id='btnCpContinue']
	private WebElement continuebtn;
	
	@FindBy(xpath="//label[text()='Watch videos about your medicine']")
	private WebElement watchvideo;
	
	@FindBy(xpath="//select[@id='optsProductSearch']")
	private WebElement searchbymedicinename;
	
	@FindBy(xpath="//input[@id='txtProductName']")
	private WebElement entermedicinename;
	
	/*@FindBy(tagName="li")
	private List<WebElement> medicinelist;*/
	
	@FindBy(xpath="//button[text()='Continue']")////button[text()='Continue'] //button[@id='btnProductSubmit']
	private WebElement continuebutton;
	
	@FindBy(xpath="//input[@type='radio'][1]//following::label[2]")
	private WebElement choosegender;
	
	@FindBy(xpath="//label[text()='56+']") private WebElement chooseage;////label[text()='56+']//label[text()='18-55']
	@FindBy(xpath="//label[@for='Fever']") private WebElement choosesymptom;
	
	@FindBy(xpath="//button[@id='btnCpGoBack']") private WebElement gobackbtn;
	
	@FindBy(xpath="//section[@id='video']//following::div[6]/div[1]/button[2]")
	private WebElement savevideobtn;
	
	public WelcomePage(WebDriver driver) {
		
		super(driver);
	}
	
	
	public void scroll() {
		js.executeScript("window.scrollBy(0,300)");
	}
	
	public WebElement clickOnStartKijksluiterBtn() {
		return startkijksluiterbtn;
	}
	
	public WebElement enterNameToCity() {
		return cityname;
	}
	public void selectCityfromlist() {
		Actions act = new Actions(driver);
		for(int i=0;i<list.size();i++) {
			//String text = list.get(i).getText();
			if(list.get(i).getText().contains("Mumbai")) {
				list.get(i).click();
			}
			//act.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		act.click().build().perform();
	}
	
	public WebElement selectCareProvider() {
		Select s = new Select(selectcareprovider);
		s.selectByIndex(4);
		return selectcareprovider;
	}
	public WebElement clickOnContinueBtn() {
		return continuebtn;
	}
	
	public WebElement clickOnWatchVideoaboutMedicine() {
		return watchvideo;
	}
	
	public void enterSearchByMedicineName() {
		Select s = new Select(searchbymedicinename);
		s.selectByVisibleText("Search by medicine name");
	}
	
	public WebElement enterMedicineName() {
		return entermedicinename;
	}
	
	public void selectMedicineFromList() {
		Actions act = new Actions(driver);
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getText().contains("Paracetamol, tablet")){
				list.get(i).click();
			}
			
		}
		act.click().build().perform();
		
	}
	
	public WebElement clickOnContinueButton() {
		return continuebutton;
	}
	
	public WebElement selectGender() {
		return choosegender;
	}
	
	public WebElement selectAge() {
		return chooseage;
	}
	
	public WebElement selectSymptom() {
		return choosesymptom;
	}
	
	public WebElement clickOnGoBackBtn() {
		return gobackbtn;
	}
	
	public WebElement clickOnSaveVideoBtn() {
		return savevideobtn;
	}
	
}
