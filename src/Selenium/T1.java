package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class T1 {

	
	
	public  void M1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver objectdriver=new ChromeDriver();
		objectdriver.get("https://housing.com/");
		objectdriver.manage().window().maximize();
		
		WebElement ele = objectdriver.findElement(By.xpath("//input[@class='css-1om6f21']"));
		ele.click();
		WebElement dropdown = objectdriver.findElement(By.className("css-qcr37p"));
		dropdown.click();
		WebElement text = objectdriver.findElement(By.xpath("//div[text()='₹85 L - 1.27 Cr']"));
		System.out.println(text.getText());
	
		Thread.sleep(2000);
		objectdriver.close();
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       T1 t = new T1();
       t.M1();
       
       
	}

}
