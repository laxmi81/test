package sFDC_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testapp2.page_load;

public class tc_29 extends page_load {

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
				//----//a[contains(text(),'Contacts')]
				WebElement contact=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
				waitElement(contact);
				contact.click();
				Thread.sleep(1000);
				driver.findElement(By.id("tryLexDialogX")).click();
				//--//a[contains(text(),'Barr, Tim')]
				WebElement contact_name=driver.findElement(By.xpath("//a[contains(text(),'Barr, Tim')]"));
				contact_name.click();
				Thread.sleep(1000);
				driver.quit();
	}

}
