package sFDC_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testapp2.page_load;

public class test_B extends page_load {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launch_browser("ch");
		driver.get("https://login.salesforce.com/");
		
		//user name
		//--//span[@id='idcard-identity']
		//input[@id='username']
		/*WebElement user=driver.findElement(By.xpath("//span[@id='idcard-identity']"));
		waitElement(user);
		user.clear();*/
		WebElement user1=driver.findElement(By.xpath("//input[@id='username']"));
		waitElement(user1);
		
		//user1.click();
		//String u1=def_user();
		user1.sendKeys("123");
		Thread.sleep(1000);
	//--//input[@id='password']
		WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
//		waitElement(pwd);
//		String p1=def_pass();
       pwd.sendKeys("22131");
		Thread.sleep(1000);
		//--//input[@id='Login']
		WebElement button=driver.findElement(By.xpath("//input[@id='Login']"));
		button.click();		
		Thread.sleep(1000);
	}

}
