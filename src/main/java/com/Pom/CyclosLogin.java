package com.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.resources.BaseClass;
public class CyclosLogin extends BaseClass {
	
	public CyclosLogin() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()=' Login ']")
	private WebElement click;
	
	@FindBy(xpath="//input[@placeholder='User']")
	private WebElement click1;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement click2;
	
	@FindBy(xpath="//span[text()='Submit']")
	private WebElement click3;
	
	@FindBy(xpath="//a[@href='/banking/self/payment']//div[@class='quick-access-icon']")
	private WebElement click4;
	
	@FindBy(xpath="//button[@class='btn btn-icon ml-2']")
	private WebElement click5;
	
	@FindBy(xpath="//a[text()=' Flores Software ']")
	private WebElement click6;
	
	@FindBy(xpath="//input[contains(@id,'id')]")
	private WebElement amount;
	
	@FindBy(xpath="//textarea[contains(@id,'id')]")
	private WebElement message;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement click7;
	
	@FindBy(xpath="//span[text()='Confirm']")
	private WebElement clickcon;
	
	@FindBy(xpath="//a[@href='/banking/self/payment']//div[@class='quick-access-icon']")
	private WebElement clickquick;
	
	@FindBy(xpath="//div[@class='nav-item-text'][normalize-space()='Scheduled payments']")
	private WebElement clicksche;
	
	@FindBy(xpath="//a[@href='/banking/self/payment']//div[@class='quick-access-icon']")
	private WebElement clickquick1;
	
	@FindBy(xpath="//div[@class='nav-item-text'][normalize-space()='Scheduled payments']")
	private WebElement clicksche1;
	
	@FindBy(xpath="//a[@href='/banking/self/payment']//div[@class='quick-access-icon']")
	private WebElement clickquick2;
	
	@FindBy(xpath="//div[@class='nav-item-text'][normalize-space()='Scheduled payments']")
	private WebElement clicksche2;

	public WebElement getClick() {
		return click;
	}

	public WebElement getClick1() {
		return click1;
	}

	public WebElement getClick2() {
		return click2;
	}

	public WebElement getClick3() {
		return click3;
	}

	public WebElement getClick4() {
		return click4;
	}

	public WebElement getClick5() {
		return click5;
	}

	public WebElement getClick6() {
		return click6;
	}

	public WebElement getAmount() {
		return amount;
	}

	public WebElement getMessage() {
		return message;
	}

	public WebElement getClick7() {
		return click7;
	}

	public WebElement getClickcon() {
		return clickcon;
	}

	public WebElement getClickquick() {
		return clickquick;
	}

	public WebElement getClicksche() {
		return clicksche;
	}

	public WebElement getClickquick1() {
		return clickquick1;
	}

	public WebElement getClicksche1() {
		return clicksche1;
	}

	public WebElement getClickquick2() {
		return clickquick2;
	}

	public WebElement getClicksche2() {
		return clicksche2;
	}
	
	
	

}
