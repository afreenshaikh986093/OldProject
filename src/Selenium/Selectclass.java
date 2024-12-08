package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass {
public static void selectoptions() throws InterruptedException {
		
		//set path require while creating driver instance 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		//step-1 launch instance 
		WebDriver driver = new ChromeDriver();
		
		//step-2 maximize window
		driver.manage().window().maximize();
		
		//step-3 open webpage
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		//stp-3 a scrolling on webpage
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		
		//step-4-A find element 
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		
		//step-4  using select class for handling dropdown
		Select sel =new Select(dropdown);
		
		//selecting value base on index
		sel.selectByIndex(2);
		
		//select element base on text
	    sel.selectByVisibleText("Option3");
		
		//get all values of dropdown
		List<WebElement> dropdownlist = sel.getOptions();
		
		//get no of values from list
		System.out.println(dropdownlist.size());
		
		//iterating on group of values
		for (WebElement ele : dropdownlist) {
			
			String text = ele.getText();
			
			System.out.println(text);
			
			if (text.equals("Option1")) {
				
				ele.click();
			}
			
			
		}
		
		
		Thread.sleep(2000);
		
		//step-5
		driver.close();
		
		
	}


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		selectoptions();
	}

}
