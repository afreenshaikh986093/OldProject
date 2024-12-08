package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	
	public static void searchforproduct() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver objectdriver=new ChromeDriver();
		objectdriver.get("https://www.amazon.in/");
		System.out.println("1");
		objectdriver.manage().window().maximize();
		System.out.println("2");
		//Thread.sleep(2000);
		WebElement ele =objectdriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		System.out.println("3");
		ele.sendKeys("vivo mobiles under 15000");
		System.out.println("4");
		ele.submit();
		System.out.println("5");
		Thread.sleep(2000);
		
		
	
		
		objectdriver.findElement(By.xpath("//img[@class='s-image']")).click();
		System.out.println("7");
		
	
		Thread.sleep(2000);
		objectdriver.get("https://www.amazon.in/Samsung-Galaxy-Prime-Light-128GB/dp/B0BD3V985M/ref=sr_1_1_sspa?crid=IRG0DXW9LJSF&keywords=vivo%2Bmobiles%2Bunder%2B15000&qid=1665993666&qu=eyJxc2MiOiI2LjExIiwicXNhIjoiNS40NiIsInFzcCI6IjIuNzMifQ%3D%3D&sprefix=vivo%2Bmobiles%2Bunder%2B15000%2Caps%2C271&sr=8-1-spons&th=1");
		JavascriptExecutor js = (JavascriptExecutor)objectdriver;
		js.executeScript("window.scrollBy(0,800)", "");
		System.out.println("8");
		Thread.sleep(2000);
		objectdriver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		System.out.println("9");
		Thread.sleep(4000);
		objectdriver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		System.out.println("10");
		Thread.sleep(2000);
		objectdriver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();
		Thread.sleep(4000);
		objectdriver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		searchforproduct();
	}

}
