package sFDC_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testapp2.page_load;

public class tc_24 extends page_load{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
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
				//--(//a[contains(text(),'Leads')])[1]
				WebElement lead=driver.findElement(By.xpath("(//a[contains(text(),'Leads')])[1]"));
				waitElement(lead);
				lead.click();
				Thread.sleep(1000);
				driver.findElement(By.id("tryLexDialogX")).click();
		/////
	 //--//input[@name='new']
				WebElement n1=driver.findElement(By.xpath("//input[@name='new']"));
				waitElement(n1);
				n1.click();
		//--//input[@id='name_lastlea2']
				WebElement ln=driver.findElement(By.xpath("//input[@id='name_lastlea2']"));
				ln.sendKeys("ABCD");
				//---//input[@id='lea3']
				WebElement cn=driver.findElement(By.xpath("//input[@id='lea3']"));
				cn.sendKeys("ABCD");
				Thread.sleep(1000);
				//--(//input[@name='save'])[1]
				WebElement save=driver.findElement(By.xpath("(//input[@name='save'])[1]"));
				save.click();
				Thread.sleep(1000);
				driver.quit();
				
	}

}
