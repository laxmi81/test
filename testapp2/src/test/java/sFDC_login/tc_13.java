package sFDC_login;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testapp2.page_load;

public class tc_13 extends page_load {

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
				Thread.sleep(1000);
				//--//a[contains(text(),'Remind Me Later')]
				WebElement re_me=driver.findElement(By.xpath("//a[contains(text(),'Remind Me Later')]"));
				re_me.click();
				//--(//a[contains(text(),'Accounts')])[1]
				WebElement acc=driver.findElement(By.xpath("(//a[contains(text(),'Accounts')])[1]"));
				waitElement(acc);
				acc.click();
				Thread.sleep(1000);
				driver.findElement(By.id("tryLexDialogX")).click();
				//--//a[contains(text(),'Merge Accounts')]
				WebElement m_acc=driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"));
				waitElement(m_acc);
				m_acc.click();
				//--//input[@id='srch']
				WebElement se=driver.findElement(By.xpath("//input[@id='srch']"));
				waitElement(se);
				se.sendKeys("lax");
				Thread.sleep(1000);
				//--//input[contains(@name,'srchbutton')]
				WebElement find=driver.findElement(By.xpath("//input[contains(@name,'srchbutton')]"));
				find.click();
				//---//input[@id='cid0']
				WebElement ch=driver.findElement(By.xpath("//input[@id='cid0']"));
				ch.click();
				//---(//input[@name='goNext'])[2]
				WebElement next=driver.findElement(By.xpath("(//input[@name='goNext'])[2]"));
				next.click();
				Thread.sleep(1000);
				//--(//input[@value=' Merge ']) [1]
				WebElement merge=driver.findElement(By.xpath("(//input[@value=' Merge ']) [1]"));
				waitElement(merge);
				merge.click();
				Alert al=driver.switchTo().alert();
				al.accept();
				Thread.sleep(1000);
				driver.quit();
				
	}

}
