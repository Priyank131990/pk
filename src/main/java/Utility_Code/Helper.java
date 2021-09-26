package Utility_Code;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
	
	
	public static void takeScreenShot(WebDriver driver)
	{
		
		File scfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scfile, new File("./ScreenShots/login.png"));
		} 
		
		catch (IOException e) 
		{
		
			System.out.println("Unable to take Screenshot" + e.getMessage());
			
		}
		
	}

}
