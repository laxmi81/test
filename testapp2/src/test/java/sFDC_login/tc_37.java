package sFDC_login;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import testapp2.page_load;

public class tc_37 extends page_load {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launch_browser("ch");
		String u=url();
		driver.get(u);
		Thread.sleep(1000);
		//--//a[contains(text(),'Login')]
		WebElement log=driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		waitElement(log);
		log.click();
		Thread.sleep(1000);
		WebElement user=driver.findElement(By.xpath("//input[@id='username']"));
		waitElement(user);
		user.clear();
		String user1=valid_user();
		user.sendKeys(user1);
		Thread.sleep(1000);
		//--//input[@id='password']
		WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
		pwd.clear();
		String p=password();
		pwd.sendKeys(p);
		Thread.sleep(1000);
		//--//input[@id='rememberUn']
		/*WebElement remember=driver.findElement(By.xpath("//input[@id='rememberUn']"));
		remember.click();;
		Thread.sleep(1000);*/
				//--//input[@id='Login']
				WebElement login_button=driver.findElement(By.xpath("//input[@id='Login']"));
				login_button.click();
				//user();
				Thread.sleep(3000);
				//--//a[contains(text(),'Remind Me Later')]
				/*WebElement remind_button=driver.findElement(By.xpath("//a[contains(text(),'Remind Me Later')]"));
				waitElement(remind_button);
				remind_button.click();*/
				//--//a[contains(text(),'Home')]
				WebElement home=driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
				home.click();
				Thread.sleep(1000);
				driver.findElement(By.id("tryLexDialogX")).click();
		//--//a[contains(text(),'Saturday April 25, 2020')]
				WebElement cdate=driver.findElement(By.xpath("//a[contains(text(),'Saturday April 25, 2020')]"));	
				cdate.click();
				//--//a[contains(text(),'4:00 PM')]
				WebElement ti=driver.findElement(By.xpath("//a[contains(text(),'4:00 PM')]"));	
				waitElement(ti);
				ti.click();
				//--//img[contains(@class,'comboboxIcon')]
				
				WebElement su=driver.findElement(By.xpath("//img[contains(@class,'comboboxIcon')]"));
				waitElement(su);
				su.click();
				ArrayList<String> li_win=new ArrayList(driver.getWindowHandles());//window =2(0,1)
				  driver.switchTo().window(li_win.get(1));
				//--//a[contains(text(),'Other')]
				  WebElement other=driver.findElement(By.xpath("//a[contains(text(),'Other')]")); 
				  other.click();
				  //driver.close();
				  driver.switchTo().window(li_win.get(0));
				  //--//input[@id='EndDateTime_time']
				  WebElement end=driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
				  end.click();
				  Thread.sleep(1000);
				  //--//div[@id='timePickerItem_38']
				  WebElement seven=driver.findElement(By.xpath("//div[@id='timePickerItem_38']"));
				  JavascriptExecutor je=(JavascriptExecutor)driver;
				   je.executeScript("arguments[0].scrollIntoView(true);",seven);
				   Thread.sleep(1000);
				   seven.click();
				   Thread.sleep(1000);
				   //--//input[@id='IsRecurrence']
				   WebElement re=driver.findElement(By.xpath("//input[@id='IsRecurrence']"));
				   re.click();
				   driver.quit();
				 
	}

}
