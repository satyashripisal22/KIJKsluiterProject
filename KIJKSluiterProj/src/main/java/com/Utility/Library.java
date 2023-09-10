package com.Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

public class Library extends BaseClass {
	
	public static void custom_Sendkeys(WebElement element, String value, String fieldname) {
		try {
			
			element.sendKeys(value);
			
			//System.out.println(fieldname+" = Value successfully send = "+value);
			
			ObjectRepo.test.log(Status.PASS, fieldname+" = Value successfully send = "+value);
		}catch(Exception e) {
			
			//System.out.println("Unable to send value");
			
			
		}
	}

	public static void custom_Click(WebElement element,String fieldname )
	{
		try {
			
			element.click();
			
			//System.out.println("clicked Successfully :"+fieldname);
			
			ObjectRepo.test.log(Status.PASS, "clicked Successfully :"+fieldname);
			
		}catch(Exception e) {
			
			//System.out.println("Unable to click"+e);
			
			//ObjectRepo.test.log(Status.FAIL, "Unable to click");
		}
		
	}
	
	public static  void custom_AssertStringEquals(String actual, String expected) {
		
		try {
			Assert.assertEquals(actual, expected);
			ObjectRepo.test.log(Status.PASS, actual+"value matches "+expected);
		} catch (Exception e) {
			ObjectRepo.test.log(Status.FAIL, actual+"value not match "+expected);
		}
	}
	
	/*public static void custom_Scroll(WebElement element,String type,String value) {
		
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String s = type;
			switch (s) {
			case "scrollby":
				js.executeScript(value);
				break;
			case "scrollinto":
				js.executeScript("arguments[0].scrollIntoView()", element);
				break;

			default:
				System.out.println("invalid type");
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}*/
	
	public static void custom_ActionMethod(WebElement element) {
		
	}
	
	public static void scrollByvisibleOfElement (WebDriver driver ,WebElement ele) {
		 JavascriptExecutor js =(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView();", ele);
	 }
	 
	 public static void click(WebDriver ldriver, WebElement locatorName) {
		 Actions act = new Actions(ldriver);
		 act.moveToElement(locatorName).click().build().perform();
		 
	 }
	 
	 public static boolean findElement (WebDriver ldriver, WebElement ele) {
		boolean flag = false;
		try {
			ele.isDisplayed();
			flag =true;
			
		}catch (Exception e) {
			//System.out.println("Location not found: "+locatorName);
			flag =false;
			
		}finally {
			if(flag) {
				System.out.println("Successfully Found element at");
				
			}else {
				System.out.println("Unable to locate  element at");
			}}
		return flag;
		}

	
	
}
