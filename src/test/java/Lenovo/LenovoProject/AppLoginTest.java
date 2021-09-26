package Lenovo.LenovoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObject.Login;

public class AppLoginTest extends Baseclass {

	
	
	@Test
	public void ApplicationLogin()
	{
		
		//before class
		driver= Baseclass.broserBase(driver,"chrome");
		Login lg = new Login(driver);
		lg.email().sendKeys("priyank4gvm@gmail.com");
		lg.password().sendKeys("Priyank@123");
		
		lg.clickToLogin().click();
		driver.close();
		
		//After Class
		
		
		
		  
		  
	}
	
}
