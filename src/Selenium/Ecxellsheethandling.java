package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecxellsheethandling {
		
	
	public static String readatafromsheet(int r,int c) throws IOException {
		//step-set path of file location
		String path="C:\\Users\\hp\\eclipse-workspace\\16julyproject\\Data\\readdata.xlsx";
		
		//step-2 to handle file type info
		File file =new File(path);
		
		//step-3 to read file we need input stream 
		FileInputStream fis=new FileInputStream(file);
		
		//step-4 we need poi library classes to handle excel file
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//step-5 locate sheet
		XSSFSheet sheet=wb.getSheet("sheet1");
		
		//step-6 locate row
		XSSFRow  row=sheet.getRow(r);
		
		//step-7 locate cell
		XSSFCell cell=row.getCell(c);
		
		//step-8 get cell value 
		String val=cell.getStringCellValue();
		//System.out.println(val);
		return val;
	}
	public static void writedatainexcell() throws IOException {
		//step-1
				String path = "C:\\Users\\hp\\eclipse-workspace\\16julyproject\\Data\\writedata.xlsx";
				
				//step-2
				File file =new File(path);
				
				//step-3 
				FileInputStream fis =new FileInputStream(file);
				
				//step-4 
				XSSFWorkbook wb =new XSSFWorkbook(fis);
				
				//step-5 
				XSSFSheet sheet =wb.createSheet();
				
				//step-6
				XSSFRow row =sheet.createRow(0);
				
				//step-7
				XSSFCell cell = row.createCell(0);
				
				//step-8
				cell.setCellValue("sss@gmail.com");
				
				//step-9
				FileOutputStream fos=new FileOutputStream(file);
				
				//step-10
				wb.write(fos);
				
				System.out.println("successfully written value");
			}
	
	
	public static void writemutipledatainexcell(int r,int c,String val) throws IOException {
		//step-1
		//step-1
				String path = System.getProperty("user.dir")+"\\Data\\writemultiplrdata.xlsx";
				
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
				
				System.out.println("successfully written value");
				
	
	}
	public static void filldatafromexcell() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys(readatafromsheet(0,0));
		driver.findElement(By.id("pass")).sendKeys(readatafromsheet(0,1));
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(20000);
		
		//step-7 close window
		driver.close();
	
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String [] arr = {"Mumbai", "Pune", "Nagpur","Nagar"};
		
        for (int row=0; row<arr.length;row++) {
        	int col=0;
        	
        	writemutipledatainexcell(row,col,arr[row]);
        	
        }
		
		//readatafromsheet(3,1);
		//filldatafromexcell();
	
		//writedatainexcell();
		
		
		//write multiple data in sheet
		
		
		
		////read multiple data from sheet with itteration(loop)
//		for (int r=0; r<=3;r++)
//		{
//			for (int c=0;c<=1;c++)
//			{
//					System.out.print(readatafromsheet(r,c) + " | ");
//						
//			}
//		System.out.println();
//		}
//	
}
}