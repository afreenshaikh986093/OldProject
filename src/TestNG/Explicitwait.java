package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Explicitwait {

	public static WebDriver driver;
	
	@BeforeClass
	public void initalization() throws InterruptedException {
		
		//set path require while creating driver instance 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");

		//step-1 launch instance 
		 driver = new ChromeDriver();
				
				//step-2 maximize window
				driver.manage().window().maximize();
				
				//step-3 open webpage
				driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
				
				//step-4 global wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test(priority=1)
	public void HandleAlert() {
		//driver.navigate().to("https://vctcpune.com/selenium/practice.html");
		
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		
		//handle alert using explicit wait
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(7));
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
	
		
	}
	@Test(priority=2)
	public void  Handlechangetext(){
		//driver.navigate().to("https://vctcpune.com/selenium/practice.html");
		WebElement txt =driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		txt.click();
		//handle change text using explicit wait
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement vis = driver.findElement(By.xpath("//h2[@id='h2']"));
		wait.until(ExpectedConditions.textToBePresentInElement(vis, "Selenium Webdriver"));
		
		System.out.println(vis.getText());
//		String expectedText = vis.getText();
//		
//		Assert.assertEquals(expectedText, "Selenium Webdriver", "Text unmatched");
	}
		
		
	
	@Test(priority=3)
	public void  handlebuttonpresenty(){
		//driver.navigate().to("https://vctcpune.com/selenium/practice.html");
		WebElement txt =driver.findElement(By.xpath("//button[@id='display-other-button']"));
		txt.click();
		
		//handle change text using explicit wait
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement txts =driver.findElement(By.xpath("//button[@id=\"hidden\"]"));
		wait.until(ExpectedConditions.visibilityOf(txts));
		System.out.println(txts.getText());
		
	}

	@Test(priority=4)
	public void  handlebuttonvisibility() {
		//driver.navigate().to("https://vctcpune.com/selenium/practice.html");
		WebElement btn =driver.findElement(By.xpath("//button[@id=\"enable-button\"]"));
		btn.click();

		WebElement btns =driver.findElement(By.xpath("//button[@id='disable']"));
		//handle change text using explicit wait
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(15));
		
		wait.until(ExpectedConditions.elementToBeClickable(btns));
		System.out.println(btns.getText());
		
	}
	@Test(priority=5)
	public void  handlecheckbox() throws InterruptedException{
		//driver.navigate().to("https://vctcpune.com/selenium/practice.html");
		WebElement chkbx =driver.findElement(By.xpath("//button[@id='checkbox']"));
		chkbx.click();
		WebElement chkbxx =driver.findElement(By.xpath("//input[@id='ch']"));
		
		//handle checkbox using explicit wait
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(15));
		
		wait.until(ExpectedConditions.elementToBeClickable(chkbx));
		//System.out.println(btns.getText());
		
		chkbxx.click();
		Thread.sleep(5000);
		//System.out.println(chkbxx.getText());
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.close();
	}

}
