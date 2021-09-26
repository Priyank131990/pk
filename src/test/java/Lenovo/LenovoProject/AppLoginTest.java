package Lenovo.LenovoProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObject.Login;
import Utility_Code.Baseclass;
import Utility_Code.ExcelDataReader;
import Utility_Code.Helper;

public class AppLoginTest extends Baseclass {

	
	
	@Test
	public void ApplicationLogin() throws IOException
	{
		
		//before class
		driver= Baseclass.broserBase(driver,"chrome");
		Login lg = new Login(driver);
		ExcelDataReader edr = new ExcelDataReader();
		
		
		
		
		lg.mail().sendKeys(edr.getUserNameData(0, 0, 0));
		lg.pass().sendKeys(edr.getPassdata(0, 0, 1));
		
		lg.clickToLogin().click();
		
		Helper.takeScreenShot(driver);
		driver.close();
		
		//After Class
		
		
		
		  
		  
	}
	
}
