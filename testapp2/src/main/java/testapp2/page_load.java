package testapp2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;




public class page_load {
	//url function
	public static String url() throws Exception
	{
		
	File fl1=new File("C:\\AC.Microui\\sales.xlsx");
    FileInputStream fil=new FileInputStream(fl1);
    XSSFWorkbook wb=new XSSFWorkbook(fil);
    XSSFSheet sheet1= wb.getSheetAt(0);
    String text1=sheet1.getRow(0).getCell(1).getStringCellValue();
    //System.out.println(text1);
	return text1;
	}
	//invalid_user name
	public static String user() throws Exception
	{
		
	File fl1=new File("C:\\AC.Microui\\sales.xlsx");
    FileInputStream fil=new FileInputStream(fl1);
    XSSFWorkbook wb=new XSSFWorkbook(fil);
    XSSFSheet sheet1= wb.getSheetAt(0);
    String text1=sheet1.getRow(1).getCell(1).getStringCellValue();
    //System.out.println(text1);
	return text1;
	}
	//valid_user
	public static String valid_user() throws Exception
	{
		
	File fl1=new File("C:\\AC.Microui\\sales.xlsx");
    FileInputStream fil=new FileInputStream(fl1);
    XSSFWorkbook wb=new XSSFWorkbook(fil);
    XSSFSheet sheet1= wb.getSheetAt(0);
    String text1=sheet1.getRow(3).getCell(1).getStringCellValue();
   // System.out.println(text1);
	return text1;
	}
	//for password
	public static String password() throws Exception
	{
		
	File fl1=new File("C:\\AC.Microui\\sales.xlsx");
    FileInputStream fil=new FileInputStream(fl1);
    XSSFWorkbook wb=new XSSFWorkbook(fil);
    XSSFSheet sheet1= wb.getSheetAt(0);
    String text1=sheet1.getRow(2).getCell(1).getStringCellValue();
    //System.out.println(text1);
	return text1;
	}
   // wb.close();
	public static WebDriver driver=null;
	protected static void launch_browser(String sbrowser)
	{
		if(sbrowser.startsWith("ch"))
		{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else
		{
			System.out.println("you have not enter browser correctly ");
	}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get("http://qa-tekarch.firebaseapp.com/");
	}
// to driver the driver
protected static void driver_quit()
{
	driver.quit();
}

protected static void waitElement(WebElement ele)
{
	WebDriverWait wait=new WebDriverWait(page_load.driver,30);
	wait.until(ExpectedConditions.visibilityOf(ele));
}
//for test case 4B user 
public static String def_user() throws Exception {
	File fl1=new File("C:\\AC.Microui\\sales.xlsx");
    FileInputStream fil=new FileInputStream(fl1);
    XSSFWorkbook wb=new XSSFWorkbook(fil);
    XSSFSheet sheet1= wb.getSheetAt(0);
    String text1=sheet1.getRow(4).getCell(1).getStringCellValue();
    
    System.out.println(text1);
	return text1;
}
public static String def_pass() throws Exception {
	File fl1=new File("C:\\AC.Microui\\sales.xlsx");
    FileInputStream fil=new FileInputStream(fl1);
    XSSFWorkbook wb=new XSSFWorkbook(fil);
    XSSFSheet sheet1= wb.getSheetAt(0);
    String text1=sheet1.getRow(5).getCell(1).getStringCellValue();
    
    System.out.println(text1);
	return text1;
}
}
