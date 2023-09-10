package com.Utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

//import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static ConfigDataProvider config;
	public static ExcelDataProvider excel;
	@BeforeSuite
	
	public void BS() throws Exception {
		config = new ConfigDataProvider();
		excel = new ExcelDataProvider();
	}
	@Parameters({"Browser"})
	@BeforeMethod
	public void InitializationBrowser(@Optional String Browser) {
		
		//WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/chromedriver-win32/chromedriver.exe");
		/*ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver(opt);*/
		if(Browser.equalsIgnoreCase(config.getBrowser()))
		{
		driver=new ChromeDriver();
		driver.get(config.getUrl());
		
	 }else if(Browser.equalsIgnoreCase("Edge")) {
		 driver = new EdgeDriver();
		 driver.get(config.getUrl());
	 }
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("gdpr-cookie-accept")).click();
	}
	
	@AfterMethod
	public void TearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		//System.exit(0);
	}
}
