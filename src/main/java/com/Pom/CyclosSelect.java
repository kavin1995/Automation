package com.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.BaseClass;

public class CyclosSelect extends BaseClass {
	
	public CyclosSelect() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//a[@href='/personal/settings']//div[@class='quick-access-icon']//icon//*[name()='svg']")
	private WebElement click;
	
	@FindBy(xpath="//div[text()='Banking']")
	private WebElement clickBan;
	
	@FindBy(xpath="//div[@class='menu-text'][normalize-space()='Marketplace']")
	private WebElement clickplace;
	
	@FindBy(xpath="//div[@class='menu-text'][normalize-space()='Information']")
	private WebElement clickinf;
	
	@FindBy(xpath="//div[text()='  Demo user ']")
	private WebElement clickdemo;
	
	@FindBy(xpath="//span[text()=' (5 references) ']")
	private WebElement clickref;
	
	@FindBy(xpath="//div[normalize-space()='Settings']")
	private WebElement clickset;
	
	@FindBy(xpath="//label[normalize-space()='Dark']")
	private WebElement clickdark;
	
	@FindBy(xpath="//div[text()='Contacts']")
	private WebElement clickcon;
	
	@FindBy(xpath="//label[@class='btn btn-icon focusable resultType-list']")
	private WebElement clicklist;
	
	@FindBy(xpath="//div[normalize-space()='Passwords']")
	private WebElement clickpass;
	
	@FindBy(xpath="//div[text()=' Manage your passwords ']")
	private WebElement clickword;

	public WebElement getClick() {
		return click;
	}

	public WebElement getClickBan() {
		return clickBan;
	}

	public WebElement getClickplace() {
		return clickplace;
	}

	public WebElement getClickinf() {
		return clickinf;
	}

	public WebElement getClickref() {
		return clickref;
	}

	public WebElement getClickdark() {
		return clickdark;
	}

	public WebElement getClickcon() {
		return clickcon;
	}

	public WebElement getClicklist() {
		return clicklist;
	}

	public WebElement getClickpass() {
		return clickpass;
	}

	public WebElement getClickword() {
		return clickword;
	}

	public WebElement getClickdemo() {
		return clickdemo;
	}

	public WebElement getClickset() {
		return clickset;
	}
	
	

}
