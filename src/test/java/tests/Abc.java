package tests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Abc
{
	@Test()

		public void click1() throws Throwable
		{

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		TakesScreenshot tss=(TakesScreenshot)driver;
		File scr= tss.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\epavilion\\Cmd.Sample\\screen\\sp6.png");
		Files.copy(scr,dest);	
		Thread.sleep(1000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.in/");
		
		TakesScreenshot tss1=(TakesScreenshot)driver;
		File scr1=tss1.getScreenshotAs(OutputType.FILE);
		File dest1=new File("D:\\epavilion\\Cmd.Sample\\screen\\sp7.png"); 
		Files.copy(scr1,dest1);
		Thread.sleep(2000);
		
		driver.quit();
	}
}
