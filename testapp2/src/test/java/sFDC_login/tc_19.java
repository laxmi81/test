package sFDC_login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testapp2.page_load;

public class tc_19 extends page_load{

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
				remind_button.click();}
				WebElement opp=driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]"));
				waitElement(opp);
				act.moveToElement(opp).build().perform();
				opp.click();
				driver.findElement(By.id("tryLexDialogX")).click();
				Thread.sleep(1000);
				//--//select[@id='quarter_q']
				WebElement inter=driver.findElement(By.xpath("//select[@id='quarter_q']"));
				act.moveToElement(inter).build().perform();
				inter.click();
				List<WebElement> li_i=driver.findElements(By.xpath("//select[@id='quarter_q']"));
				for(int i=0;i<li_i.size();i++)
				{
					if(li_i.get(i).getText().contains("Current FQ"))
					{
						li_i.get(i).click();
					}
				}
				inter.sendKeys("Current FQ");
				Thread.sleep(1000);
				
				//--//select[@id='open']
				WebElement include=driver.findElement(By.xpath("//select[@id='open']"));
				include.click();
				List<WebElement> li_c=driver.findElements(By.xpath("//select[@id='open']"));
				for(int i=0;i<li_c.size();i++)
				{
					if(li_c.get(i).getText().contains("Open Opportunities"))
					{
						li_c.get(i).click();
					}
				}
				include.sendKeys("Open Opportunities");
				Thread.sleep(1000);
				//--//input[@value='Run Report']
				WebElement run=driver.findElement(By.xpath("//input[@value='Run Report']"));
				act.moveToElement(run).build().perform();
				run.click();
				Thread.sleep(1000);
				driver.quit();
				
				
	}

}
