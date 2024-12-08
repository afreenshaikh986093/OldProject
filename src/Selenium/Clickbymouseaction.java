package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Clickbymouseaction {
	
public static String path ="C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";
	
	
	
	public	 static  void rightclick () throws InterruptedException {
		
		//set path require while creating driver instance 
		System.setProperty("webdriver.chrome.driver", path );

		//step-1 initalize instance-
		WebDriver driver =new ChromeDriver();
		System.out.println("-----------Step-1---------");
		
		//step-2 maximize
		driver.manage().window().maximize();
		System.out.println("-----------Step-2---------");
		
		//step-3
		driver.get("https://demoqa.com/buttons");
		System.out.println("-----------Step-3---------");
		
		//step-4 locate button
		WebElement button2 = driver.findElement(By.id("rightClickBtn"));
		System.out.println("-----------Step-4---------");
		
		//step-5 using actions class
		Actions act =new Actions(driver);
		
		act.contextClick(button2).perform();
		Thread.sleep(2000);
		System.out.println("-----------Step-5---------");
		
	   //step-6 verification
		String text = driver.findElement(By.id("rightClickMessage")).getText();
		
		if (text.contains("right click")) {
			
			System.out.println("test case passed");
		}
		else {
			System.out.println("test case failed");
		}
		System.out.println("-----------Step-6---------");
		
		//step-7
		Thread.sleep(8000);
		driver.close();
		System.out.println("-----------Step-7---------");
	}
	
	
public	 static  void justclick() throws InterruptedException {
		
		//set path require while creating driver instance 
		System.setProperty("webdriver.chrome.driver", path );

		//step-1 initalize instance-
		WebDriver driver =new ChromeDriver();
		System.out.println("-----------Step-1---------");
		
		//step-2 maximize
		driver.manage().window().maximize();
		System.out.println("-----------Step-2---------");
		
		//step-3
		driver.get("https://demoqa.com/buttons");
		System.out.println("-----------Step-3---------");
		
		//step-4 locate button
		WebElement button2 = driver.findElement(By.xpath("//button[text()='Click Me']"));
		//(//button[@type='button'])[4]
				//button[text()='Click Me']
		
		//step-5 using actions class
		Actions act =new Actions(driver);
		
		act.click(button2).perform();
		Thread.sleep(2000);
		System.out.println("-----------Step-5---------");
		
	   //step-6 verification
		String text = driver.findElement(By.id("dynamicClickMessage")).getText();
		
		if (text.contains("dynamic click")) {
			
			System.out.println("test case passed");
		}
		else {
			System.out.println("test case failed");
		}
		System.out.println("-----------Step-6---------");
		
		//step-7
		Thread.sleep(2000);
		driver.close();
		System.out.println("-----------Step-7---------");
	}
	


public	 static  void doublelick () throws InterruptedException {
		
		//set path require while creating driver instance 
		System.setProperty("webdriver.chrome.driver", path );

		//step-1 initalize instance-
		WebDriver driver =new ChromeDriver();
		System.out.println("-----------Step-1---------");
		
		//step-2 maximize
		driver.manage().window().maximize();
		System.out.println("-----------Step-2---------");
		
		//step-3
		driver.get("https://demoqa.com/buttons");
		System.out.println("-----------Step-3---------");
		
		//step-4 locate button
		WebElement button2 = driver.findElement(By.id("doubleClickBtn"));
		System.out.println("-----------Step-4---------");
		
		//step-5 using actions class
		Actions act =new Actions(driver);
		
		act.doubleClick(button2).perform();
		Thread.sleep(2000);
		System.out.println("-----------Step-5---------");
		
	   //step-6 verification
		String text = driver.findElement(By.id("doubleClickMessage")).getText();
		
		if (text.contains("doubleclick click")) {
			
			System.out.println("test case passed");
		}
		else {
			System.out.println("test case failed");
		}
		System.out.println("-----------Step-6---------");
		
		//step-7
		Thread.sleep(8000);
		driver.close();
		System.out.println("-----------Step-7---------");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//rightclick ();
		//doublelick ();
		justclick();
	}

}
