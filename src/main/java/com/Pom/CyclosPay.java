package com.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.BaseClass;

public class CyclosPay extends BaseClass{
	
	 public CyclosPay() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/banking/self/payment']//div[@class='quick-access-icon']")
	private WebElement clickquick3;
	
	@FindBy(xpath="//div[@class='nav-item-text'][normalize-space()='Scheduled payments']")
	private WebElement clicksche3;

	@FindBy(xpath="//a[@href='/banking/self/payment']//div[@class='quick-access-icon']")
	private WebElement clickicon;
	
	@FindBy(xpath="//div[normalize-space()='Member account']")
	private WebElement clickmem;
	
	@FindBy(xpath="//th[text()=' Description']")
	private WebElement clickdes;
	
	@FindBy(xpath="//div[contains(text(),'My vouchers')]")
	private WebElement clickvoc;
	
	@FindBy(xpath="//div[@class='nav-item-text'][normalize-space()='Business directory']")
	private WebElement clickdir;
	
	@FindBy(xpath="//div[normalize-space()='Make payment']")
	private WebElement clickmake;
	
	@FindBy(xpath="//input[contains(@id,'id')]")
	private WebElement clickid;
	
	@FindBy(xpath="//span[normalize-space()='Next']")
	private WebElement clicknext;
	
	@FindBy(xpath="//span[normalize-space()='Confirm']")
	private WebElement clickcon;

	public WebElement getClickquick3() {
		return clickquick3;
	}

	public WebElement getClicksche3() {
		return clicksche3;
	}

	public WebElement getClickicon() {
		return clickicon;
	}

	public WebElement getClickmem() {
		return clickmem;
	}

	public WebElement getClickdes() {
		return clickdes;
	}

	public WebElement getClickvoc() {
		return clickvoc;
	}

	public WebElement getClickdir() {
		return clickdir;
	}

	public WebElement getClickmake() {
		return clickmake;
	}

	public WebElement getClickid() {
		return clickid;
	}

	public WebElement getClicknext() {
		return clicknext;
	}

	public WebElement getClickcon() {
		return clickcon;
	}
	
	
	
	
	
	
}
