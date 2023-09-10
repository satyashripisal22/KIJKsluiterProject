package com.Test;


import org.testng.annotations.Test;

import com.Pom.LoginPage;
import com.Pom.MymedicinesPage;
import com.Pom.WelcomePage;
import com.Utility.BaseClass;
import com.Utility.Library;

public class KIIJKSluiter_WelcomePage extends BaseClass{

	WelcomePage welcomepg;
	LoginPage loginpg;
	MymedicinesPage medicinepg;
	@Test
	public void verifyKIJKSluiterPage() throws Exception  {
		
		
		/*WebElement country = driver.findElement(By.xpath("//ul[@class='languagepicker']"));
		Actions act = new Actions(driver);
		act.moveToElement(country).build().perform();
		/*for(int i=0;i<2;i++) {
			act.sendKeys(Keys.ARROW_DOWN).build().perform();
			
		}*/
		//act.sendKeys(Keys.ENTER).build().perform();
		//driver.findElement(By.xpath("//a[@class='lang enable'][2]")).click();
		welcomepg = new WelcomePage(driver);
		welcomepg.moveToCountry();
		//Library.custom_Click(welcomepg.moveToCountry(), "Country");
		
		Library.custom_Click(welcomepg.clickOnEnglish(), "EnglishLang");
		
		
		welcomepg.scroll();
		
		Library.custom_Click(welcomepg.clickOnStartKijksluiterBtn(), "StartKijkSluiterbtn");
		Library.custom_Sendkeys(welcomepg.enterNameToCity(), "Mum", "Cityname");
		Thread.sleep(1000);
		
		welcomepg.selectCityfromlist();
		welcomepg.selectCareProvider();
		Library.custom_Click(welcomepg.clickOnContinueBtn(), "continue");
		
		Library.custom_Click(welcomepg.clickOnWatchVideoaboutMedicine(), "WatchVideo");
		
		welcomepg.enterSearchByMedicineName();
		Library.custom_Sendkeys(welcomepg.enterMedicineName(), "para", "MedicineName");
		welcomepg.selectMedicineFromList();
		Library.custom_Click(welcomepg.clickOnContinueButton(), "continue");
		Library.custom_Click(welcomepg.selectGender(), "Gender");
		Library.custom_Click(welcomepg.clickOnContinueButton(), "continue");
		Library.custom_Click(welcomepg.selectAge(), "Age");
		Library.custom_Click(welcomepg.clickOnContinueButton(), "contiue");
		Library.custom_Click(welcomepg.selectSymptom(), "Symptomname");
		Library.custom_Click(welcomepg.clickOnContinueButton(), "continue");
		//Library.custom_Click(welcomepg.clickOnGoBackBtn(), "Go Back");
		welcomepg.scroll();
		Library.custom_Click(welcomepg.clickOnSaveVideoBtn(), "SaveVideo");
		
		
	}
	
		@Test
		public void verifyLoginPage() throws Exception {
		loginpg = new LoginPage(driver);
		loginpg.moveToCountry();
		
		Library.custom_Click(loginpg.clickOnEnglish(), "EnglishLang");
		Library.custom_Click(loginpg.clickOnLoginBtn(), "LoginBtn");
		
		Library.custom_Sendkeys(loginpg.enterEmaiId(), excel.getStringData("Sheet1", 0, 0), "EmailId");
		
		Library.custom_Sendkeys(loginpg.enterPassword(), excel.getStringData("Sheet1", 1, 0), "Password");
		
		
		Library.custom_Click(loginpg.clickOnContinueBtn(), "ContinueBtn");
		
		/*Double data = excel.getNumericData("Sheet1", 3, 0);//1234567.0 because of doublt
		String datastring = Double.toString(data).replace(".0", "");
		System.out.println(datastring);//1234567
		
		/*System.out.println(excel.getStringData("Sheet1", 1, 0));
		System.out.println(excel.getNumericData("Sheet1", 2, 0));*/
		
		medicinepg = new MymedicinesPage(driver);
		Thread.sleep(2000);
		
		Library.custom_Click(medicinepg.clickOnAddVideo(), "AddVideo");
		
		medicinepg.enterSearchByMedicineName();
		
		
		Library.custom_Sendkeys(medicinepg.enterMedicineName(), "Aspirine EC Protect, maagsapresistente tablet", "MedicineName");
		Thread.sleep(1000);
		
		Library.custom_Click(medicinepg.clickOnContinueBtn(), "continueBtn");
		Library.custom_AssertStringEquals(driver.getTitle(), "xyz");
		}
		
		@Test(enabled=false)
		public void verifyMedicinePage() throws Exception {
			medicinepg = new MymedicinesPage(driver);
			Thread.sleep(2000);
			medicinepg.clickOnAddVideo().click();
			//Library.custom_Click(medicinepg.clickOnAddVideo(), "AddVideo");
			
			medicinepg.enterSearchByMedicineName();
			
			//medicinepg.enterMedicineName().sendKeys("Aspirine EC Protect, maagsapresistente tablet");
			Library.custom_Sendkeys(medicinepg.enterMedicineName(), "Aspirine EC Protect, maagsapresistente tablet", "MedicineName");
			Thread.sleep(1000);
			//medicinepg.clickOnContinueBtn().click();
			Library.custom_Click(medicinepg.clickOnContinueBtn(), "continueBtn");
			//Library.custom_AssertStringEquals("abc", "xyz");
		
		
	}
}
