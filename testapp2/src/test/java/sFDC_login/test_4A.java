package sFDC_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testapp2.page_load;

public class test_4A extends page_load {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launch_browser("ch");
		driver.get("https://login.salesforce.com/");
		//--//a[@id='forgot_password_link']
		WebElement forgot=driver.findElement(By.xpath("//a[@id='forgot_password_link']"));
		waitElement(forgot);
		forgot.click();
		//--//input[@id='un']
		WebElement user=driver.findElement(By.xpath("//input[@id='un']"));
		waitElement(user);
		String u1=valid_user();
		user.sendKeys(u1);
		Thread.sleep(1000);
		//--//input[@id='continue']
		
		WebElement conti=driver.findElement(By.xpath("//input[@id='continue']"));
		conti.click();
		Thread.sleep(1000);
		driver.quit();
	}

}
