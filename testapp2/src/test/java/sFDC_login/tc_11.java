package sFDC_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testapp2.page_load;

public class tc_11 extends page_load {

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
				Thread.sleep(1000);
				//--//a[contains(text(),'Remind Me Later')]
				if(!driver.findElements(By.xpath("//a[contains(text(),'Remind Me Later')]")).isEmpty())
				{
				WebElement re_me=driver.findElement(By.xpath("//a[contains(text(),'Remind Me Later')]"));
				re_me.click();
				}
				//--(//a[contains(text(),'Accounts')])[1]
				WebElement acc=driver.findElement(By.xpath("(//a[contains(text(),'Accounts')])[1]"));
				waitElement(acc);
				act.moveToElement(acc).build().perform();
				acc.click();
				Thread.sleep(1000);
				driver.findElement(By.id("tryLexDialogX")).click();
				//--//a[contains(text(),'Create New View')]
				WebElement view=driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
				waitElement(view);
				act.moveToElement(view).build().perform();
				view.click();
				Thread.sleep(1000);
				//--//input[@id='fname']
				WebElement v_name=driver.findElement(By.xpath("//input[@id='fname']"));
				waitElement(v_name);
				v_name.sendKeys("llax1");
				Thread.sleep(1000);
				//--//input[@id='devname']
				WebElement vq_name=driver.findElement(By.xpath("//input[@id='devname']"));
				vq_name.click();
				//String s=v_name.getText();
				vq_name.sendKeys("lax");
				Thread.sleep(1000);
				//--//div[@class='pbBottomButtons']//input[@name='save']
				WebElement save=driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']"));
				act.moveToElement(save).build().perform();
				save.click();
				Thread.sleep(3000);
				driver.quit();
	}

}
