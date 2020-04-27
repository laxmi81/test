package sFDC_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testapp2.page_load;

public class test_1 extends page_load{

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
		//--//input[@id='username']
		WebElement user=driver.findElement(By.xpath("//input[@id='username']"));
		waitElement(user);
		user.clear();
		String user1=user();
		user.sendKeys(user1);
		Thread.sleep(1000);
		//--//input[@id='password']
		WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
		pwd.clear();
		Thread.sleep(1000);
		//--//input[@id='Login']
		WebElement login_button=driver.findElement(By.xpath("//input[@id='Login']"));
		login_button.click();
		//user();
		Thread.sleep(1000);
		driver.quit();
	}

}
