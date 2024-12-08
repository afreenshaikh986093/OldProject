package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taskforexcell {
	// write data in excel from web 
public static void writeData(int r, int c, String val) throws IOException {
		
		//step-1
		String path = System.getProperty("user.dir")+"\\Data\\mutipledatafromweb.xlsx";
		
		//step-2
		File file =new File(path);
		
		//step-3 
		FileInputStream fis =new FileInputStream(file);
		
		//step-4 
		XSSFWorkbook wb =new XSSFWorkbook(fis);
		
		//step-5 
		XSSFSheet sheet =wb.getSheet("Sheet1");
		
		//step-6
		XSSFRow row =sheet.createRow(r);
		
		//step-7
		XSSFCell cell = row.createCell(c);
		
		//step-8
		cell.setCellValue(val);
		
		//step-9
		FileOutputStream fos=new FileOutputStream(file);
		
		//step-10
		wb.write(fos);
		
		//System.out.println("successfully written value");
	}

	public static void findlistoftabledatapricecolumn() throws IOException, InterruptedException {
		//set path require while creating driver instance 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		//step-1 initalize instance-
		WebDriver driver =new ChromeDriver();
		System.out.println("-----------Step-1---------");
		
		//step-2 maximize
		driver.manage().window().maximize();
		System.out.println("-----------Step-2---------");
		
		//step-3
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("-----------Step-3---------");
		
		//step-4 scrolling
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,700)", "");
		System.out.println("-----------Step-4---------");
		Thread.sleep(2000);
		
		//step-5 get no of data
		List<WebElement> list =driver.findElements(By.xpath("//*[@id='product']//tbody//tr//td[3]"));
		int size =list.size();
		System.out.println("size of list " + size);
		int row=0; 
		int col=0;
		
		for (  WebElement ele : list) {
			
			  String value =ele.getText();
			  writeData(row,col,value);
			  row++;
			  System.out.println(value);
		}
		System.out.println("last");
   

	}
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		findlistoftabledatapricecolumn();
	}

}
