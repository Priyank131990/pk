package Lenovo.LenovoProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import freemarker.core.ReturnInstruction.Return;

public class Baseclass {
	
	public WebDriver driver;

	public static WebDriver broserBase(WebDriver driver, String browser)
	
	{
		
		if(browser.equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "./src/main/java/Uility/chromedriver.exe");
			 driver = new ChromeDriver();
		}
		
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "./src/main/java/Uility/geckodriver.exe");
			 driver = new FirefoxDriver();
			
		}
		
		else if(browser.equals("IE")) {
			
			System.setProperty("webdriver.chrome.driver", "./src/main/java/Uility/IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
		}
		else
		{
			
			System.out.println("we do not support this browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://ui.cogmento.com/");
		
		return driver;
		
		}
		
	}
	

