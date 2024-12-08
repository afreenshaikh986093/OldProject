package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelemementlocators {
	
	public void linktext() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
		driver.navigate().to("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=120&lwc=1348028");
		
		WebElement linktext=driver.findElement(By.linkText("Sign up for Facebook"));
		linktext.click();
		Thread.sleep(4000);
		
	}
//	public void tagname() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		
//		
//		driver.navigate().to("https://www.facebook.com/");
//	
//		
//		WebElement input=driver.findElement(By.tagName("input"));
//		input.click();
//		
//		driver.close();
//	}
//	public void id() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		
//		
//		driver.navigate().to("https://www.facebook.com/");
//	
//		
//		WebElement input=driver.findElement(By.id("email"));
//		input.sendKeys("abc@gmail.com");
//		Thread.sleep(4000);
//		
//	
//	}
//	
//	public void name() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		
//		
//		driver.navigate().to("https://www.facebook.com/");
//		
//		WebElement inputid=driver.findElement(By.name("pass"));
//		inputid.sendKeys("12345678");
//		Thread.sleep(4000);
//		
//		WebElement button=driver.findElement(By.name("login"));
//		button.click();
//		Thread.sleep(4000);
//		
//	}
//	public void classname() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		
//		
//		driver.navigate().to("https://www.facebook.com/");
//		
//		WebElement inputid=driver.findElement(By.className("inputtext _55r1 inputtext _9npi inputtext _9npi"));
//		inputid.sendKeys("12345678");
//		Thread.sleep(4000);
//		
//		WebElement button=driver.findElement(By.className("_82qp _85em"));
//		button.click();
//		Thread.sleep(4000);
//		
//	}
//	
//	
//	public void partiallinktext() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		
//		
//		driver.navigate().to("https://www.facebook.com/");
//		
//	
//		driver.navigate().to("https://www.facebook.com/"); 
//	
//		WebElement partiallinktext=driver.findElement(By.partialLinkText("Create New Account"));
//		partiallinktext.click();
//		Thread.sleep(4000);
//	
//
//	}
//	public void cssselectorTwithI() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		
//		
//		driver.navigate().to("https://www.facebook.com/");
//		WebElement textBox= driver.findElement(By.cssSelector("input#email"));
//		textBox.sendKeys("xyzsds");
//
//		Thread.sleep(4000);
//		
//		
//	}
//	public void cssselectorTwithC() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		
//		
//		driver.navigate().to("https://www.facebook.com/");
//		WebElement button= driver.findElement(By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button"));
//        button.click();
//
//		Thread.sleep(4000);
//	}
//	public void cssselectorTwithO() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		
//		
//		driver.navigate().to("https://www.facebook.com/");
//		WebElement button= driver.findElement(By.cssSelector("button[type='submit']"));
//        button.click();
//
//		Thread.sleep(4000);
//	}
//	public void xpathA() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		
//		
//		driver.navigate().to("https://www.facebook.com/");
//		WebElement button= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[3]/button"));
//        button.click();
//
//		Thread.sleep(4000);
//	}
//	public void xpathR() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		
//		
//		driver.navigate().to("https://www.facebook.com/");
//		WebElement button= driver.findElement(By.xpath("//button[text()='Log in']"));
//        button.click();
//
//		Thread.sleep(4000);
//	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Findelemementlocators FE=new Findelemementlocators();
		FE.linktext();
		 
	}

}
