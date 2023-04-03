package com.stepdefinit;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.Pom.CyclosLogin;
import com.Pom.CyclosPay;
import com.Pom.CyclosSelect;
import com.resources.BaseClass;

import io.cucumber.java.en.*;

public class CyclosTestStep extends BaseClass {
	CyclosLogin log;
	CyclosSelect sel;
	CyclosPay pay;
	
	public void after() {
		driver.quit();

	}
	
	@Given("User should lanch the url")
	public void user_should_lanch_the_url() throws FileNotFoundException, IOException {
		LaunchBrowser();
		LaunchURL(getproperty("Cyclosurl"));
		log=new CyclosLogin();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    Click(log.getClick());
	}

	@When("User should enter the {string} and {string}")
	public void user_should_enter_the_and(String User, String pass) throws FileNotFoundException, IOException {
	  EnterValue(log.getClick1(), getproperty("UserID"));
	  EnterValue(log.getClick2(), getproperty("PassID"));
	  Click(log.getClick3());

	}


	@When("User should click the submit button {string} and {string}")
	public void user_should_click_the_submit_button_and(String amount, String message) {
			Click(log.getClick4());
		    Click(log.getClick5());
		    Click(log.getClick6());
		    EnterValue(log.getAmount(), amount);
		    EnterValue(log.getMessage(), message);
		    Click(log.getClick7());
	}
	@When("User should enter the value and click confirm button")
	public void user_should_enter_the_value_and_click_confirm_button() {
	    Click(log.getClickcon());
	}

	@When("User should click scheduled payment")
	public void user_should_click_scheduled_payment() {
	   Click(log.getClickquick());
	   Click(log.getClicksche());
	}

	@When("User should click scheduled payments")
	public void user_should_click_scheduled_payments() {
	    Click(log.getClickquick1());
	    Click(log.getClicksche1());
	}

	@When("User should click scheduled payment mode")
	public void user_should_click_scheduled_payment_mode() {
	    Click(log.getClickquick2());
	    Click(log.getClicksche2());
	}

	@When("User should click scheduled payment modes")
	public void user_should_click_scheduled_payment_modes() {
	   pay=new CyclosPay();
	   Click(pay.getClickquick3());
	   Click(pay.getClicksche3());
	}

	@When("User should click Member account")
	public void user_should_click_member_account() {
		 pay=new CyclosPay();
	    Click(pay.getClickicon());
	    Click(pay.getClickmem());
	    text(pay.getClickdes());
	}

	@When("User should click voucher {string}")
	public void user_should_click_voucher(String string) {
		 pay=new CyclosPay();
	    Click(pay.getClickvoc());
	    Click(pay.getClickdir());
	    Click(pay.getClickdgar());
	    Click(pay.getClickmake());
	    Click(pay.getClickid());
	    Click(pay.getClicknext());
	    Click(pay.getClickcon());
	}

	@When("User should click theme")
	public void user_should_click_theme() {
		sel= new CyclosSelect();
	   Click(sel.getClick());
	   
	}

	@When("User should click banking")
	public void user_should_click_banking() {
		sel= new CyclosSelect();
	    Click(sel.getClickBan());
	}

	@When("User should click market")
	public void user_should_click_market() {
		sel= new CyclosSelect();
	    Click(sel.getClickplace());
	}

	@When("User should click information")
	public void user_should_click_information() {
		sel= new CyclosSelect();
	    Click(sel.getClickinf());
	}

	@When("User should click demo")
	public void user_should_click_demo() {
		sel= new CyclosSelect();
	   Click(sel.getClickdemo());
	}

	@When("User should click setting")
	public void user_should_click_setting() {
		sel= new CyclosSelect();

	    Click(sel.getClickref());
	    Click(sel.getClickset());
	    Click(sel.getClickdark());
	}

	@When("User should click contact")
	public void user_should_click_contact() {
		sel= new CyclosSelect();
	   Click(sel.getClickcon());
	   Click(sel.getClicklist());
	}

	@When("User should click password")
	public void user_should_click_password() {
		sel= new CyclosSelect();
	    Click(sel.getClickpass());
	    text(sel.getClickword());
	}

}
