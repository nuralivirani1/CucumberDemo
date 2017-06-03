package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class login {
	
	WebDriver driver;
	
	@Given("^I opened a chrome browser$")
	public void i_opened_a_chrome_browser(){
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ankit\\Desktop\\WorkData\\chromedriver.exe");
		driver=new ChromeDriver(); 
	}

	@Then("^I hit facebook \"(.*?)\" on to the browser$")
	public void i_hit_facebook_on_to_the_browser(String url) throws Throwable {
	    driver.get(url);
	}

	@Then("^i entered \"(.*?)\" in username text field$")
	public void i_entered_in_username_text_field(String username) throws Throwable {
	  driver.findElement(By.id("email")).sendKeys(username);  
	}

	@Then("^i also entered \"(.*?)\" in password text field$")
	public void i_also_entered_in_password_text_field(String password) throws Throwable {
		driver.findElement(By.id("pass")).sendKeys(password);
	}

	@Then("^I click on signin button$")
	public void i_click_on_signin_button(){
		
		driver.findElement(By.id("u_0_q")).click();
	    
	}


}
