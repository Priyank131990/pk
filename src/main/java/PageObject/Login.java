package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	
	WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
		
		By email = By.name("email");
		By password = By.name("password");
	
		By lognclick = By.xpath("//div[text()='Login']");

	
	


	public WebElement mail()
	{
		return driver.findElement(email);
		
	}

	public WebElement pass()
	{
		return driver.findElement(password);
		
	}
	
	public WebElement clickToLogin()
	{
		return driver.findElement(lognclick);
		
	}
	
}
