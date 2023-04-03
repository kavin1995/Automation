package com.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Select s;

	public static void LaunchBrowser() {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		// WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();

	}
	
	public String getproperty(String value) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream(System.getProperty("user.dir")+"\\Endpoint\\Endpoint.properties"));
		Object object = properties.get(value);
		String key =(String) object;
		return key;
		
	}

	public static void LaunchURL(String URL) {
		driver.get(URL);
	}

	public static void Click(WebElement c) {
		c.click();
	}

	public static String GetCurrentURL() {
		String currentUrl = driver.getCurrentUrl();
		System.err.println(currentUrl);
		return currentUrl;
	}

	public static String GetTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}

	public static void EnterValue(WebElement w, String s) {
		w.sendKeys(s);
	}

	public static void moveToElement(WebElement m) {
		a = new Actions(driver);
		a.moveToElement(m).perform();
	}

	public static void contextClick(WebElement c) {
		a = new Actions(driver);
		a.contextClick(c).perform();

	}

	public static void DoubleClick(WebElement d) {
		a = new Actions(driver);
		a.doubleClick(d).perform();
	}

	public static void dragDrop(WebElement src, WebElement des) {
		a.dragAndDrop(src, des).perform();
	}

	public static void SBI(WebElement w, int index) {
		s = new Select(w);
		s.selectByIndex(index);
	}

	public static void SBV(WebElement w, String value) {
		s = new Select(w);
		s.selectByValue(value);
	}

	public static void SBVT(WebElement w, String text) {
		s = new Select(w);
		s.selectByVisibleText(text);
		
	}
	
	
	public static void text(WebElement element) {
		String text = element.getText();
		   System.out.println(text);

	}

}
