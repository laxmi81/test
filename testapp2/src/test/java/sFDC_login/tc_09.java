package sFDC_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testapp2.page_load;

public class tc_09 extends page_load {
public static void main(String[] args) throws Exception {
	launch_browser("ch");
	String u=url();
	driver.get(u);
	Thread.sleep(1000);
	Actions act=new Actions(driver);
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
			if(!driver.findElements(By.xpath("//a[contains(text(),'Remind Me Later')]")).isEmpty())
			{
			WebElement remind_button=driver.findElement(By.xpath("//a[contains(text(),'Remind Me Later')]"));
			waitElement(remind_button);
			remind_button.click();
			}
			//--//span[@id='userNavLabel']
			WebElement user_menu=driver.findElement(By.xpath("//span[@id='userNavLabel']"));
			waitElement(user_menu);
			act.moveToElement(user_menu).build().perform();
			user_menu.click();
			Thread.sleep(3000);
			//--//a[contains(text(),'Logout')]
			WebElement log_out=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
			act.moveToElement(log_out).build().perform();
			log_out.click();
			Thread.sleep(1000);
			driver.quit();
}
}
