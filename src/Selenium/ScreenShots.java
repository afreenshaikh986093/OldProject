package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots {
	
	static String path = "C:\\Users\\hp\\eclipse-workspace\\16julyproject\\screenshots\\afg.png";
	
	//static String path = System.getProperty("user.dir")+"\\screenshots\\calpic.png";
	public static void captureScreen(WebDriver driver) throws IOException {
		
		//step -1 Upcast
		
		TakesScreenshot tss= (TakesScreenshot) driver;
		
		//step-2 capture screenshot
		
		File sourceFile = tss.getScreenshotAs(OutputType.FILE);
		
		//step-3 
		
		File destinationFile = new File(path);
		
		//step-4 store file in desired location
		
		FileHandler.copy(sourceFile, destinationFile);
		
		System.out.println("successfully captured screenshot");
		
		
	}
}
