package sFDC_login;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testapp2.page_load;

public class tc_14  extends page_load {

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
				//--//a[contains(text(),'Accounts with last activity > 30 days')]
				WebElement last=driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]"));
				waitElement(last);
				act.moveToElement(last).build().perform();
				last.click();
				//--//input[@id='ext-gen20']
				WebElement da=driver.findElement(By.xpath("//input[@id='ext-gen20']"));
				waitElement(da);
				da.click();
				Thread.sleep(1000);
			List <WebElement> li_date = driver.findElements(By.xpath("//input[@id='ext-gen20']"));
			for(int count=0;count<li_date.size();count++)
					{
						if(li_date.get(count).getText().contains("Created Date"))
						{				
							li_date.get(count).click();
						}
						
					}
					da.sendKeys("Created Date");
					Thread.sleep(1000);
				//--//input[@id='ext-gen20']
					
					
					WebElement from=driver.findElement(By.xpath("//img[@id='ext-gen152']"));
					from.click();
					Thread.sleep(2000);
					//--//button[contains(text(),'Today')]
			WebElement tod=driver.findElement(By.xpath("//button[contains(text(),'Today')]"));
			waitElement(tod);
			tod.click();
			Thread.sleep(1000);
			//--//img[@id='ext-gen154']
			WebElement to=driver.findElement(By.xpath("//img[@id='ext-gen154']"));
			to.click();
			//--(//button[contains(text(),'Today')])[2]
			WebElement tod1=driver.findElement(By.xpath("(//button[contains(text(),'Today')])[2]"));
			waitElement(tod1);
			tod1.click();
			Thread.sleep(1000);
			//--(//button[contains(text(),'Save')])[1]
			WebElement sa=driver.findElement(By.xpath("(//button[contains(text(),'Save')])[1]"));
			act.moveToElement(sa).build().perform();
			sa.click();
			Thread.sleep(1000);
			
			   //--//input[@id='saveReportDlg_reportNameField']
			   WebElement n1=driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']"));
			   waitElement(n1);
			   n1.sendKeys("la");
			   //--//input[@id='saveReportDlg_DeveloperName']
			   WebElement n11=driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']"));
			   
			   n11.sendKeys("la");
			   //--//button[contains(text(),'Save and Run Report')]
			   WebElement sav=driver.findElement(By.xpath("//button[contains(text(),'Save and Run Report')]"));
			   act.moveToElement(sav).build().perform();
			   sav.click();
			   Thread.sleep(1000);
			   //driver.close();
			   
			driver.quit();
	}

}
