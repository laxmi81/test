package sFDC_login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testapp2.page_load;

public class tc_07 extends page_load{

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
				
				//--//span[@id='userNavLabel']
				WebElement user_menu=driver.findElement(By.xpath("//span[@id='userNavLabel']"));
				waitElement(user_menu);
				act.moveToElement(user_menu).build().perform();
				user_menu.click();
				Thread.sleep(3000);
				//--//a[contains(text(),'My Settings')]
				WebElement my_setting=driver.findElement(By.xpath("//a[contains(text(),'My Settings')]"));
				act.moveToElement(my_setting).build().perform();
				my_setting.click();
				//--(//a[@class='header setupFolder'])[1]
				WebElement personal=driver.findElement(By.xpath("(//a[@class='header setupFolder'])[1]"));
				waitElement(personal);
				act.moveToElement(personal).build().perform();
				personal.click();
				Thread.sleep(1000);
				//--//a[@id='LoginHistory_font']
				WebElement login_history=driver.findElement(By.xpath("//a[@id='LoginHistory_font']"));
				act.moveToElement(login_history).build().perform();
				login_history.click();
				//--//a[contains(text(),'Download login history for last six months, includ')]
				WebElement login_history_download=driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]"));
				waitElement(login_history_download);
				login_history_download.click();
				Thread.sleep(1000);
				//--//span[@id='DisplayAndLayout_font']
				WebElement display_layout=driver.findElement(By.xpath("//span[@id='DisplayAndLayout_font']"));
				act.moveToElement(display_layout).build().perform();
				display_layout.click();
				//--//span[@id='CustomizeTabs_font']
				WebElement cust_my_tab=driver.findElement(By.xpath("//span[@id='CustomizeTabs_font']"));
				act.moveToElement(cust_my_tab).build().perform();
				cust_my_tab.click();
				//--//select[@id='p4']
				WebElement cust_app_dd=driver.findElement(By.xpath("//select[@id='p4']"));
				waitElement(cust_app_dd);
				
				
				//xpath of dd --//select[@id='p4']/option
				/*List<WebElement> li_cust_app=driver.findElements(By.xpath("//select[@id='p4']/option"));
				for(int c=0;c<li_cust_app.size();c++)
				{
					if(li_cust_app.get(c).getText().contains("Salesforce Chatter"))
					{
						li_cust_app.get(c).click();
					}
					
				}*/
				cust_app_dd.sendKeys("salesforce");
				Thread.sleep(2000);
				//--//select[@id='duel_select_0']
				WebElement av_tab=driver.findElement(By.xpath("//select[@id='duel_select_0']"));
				av_tab.click();
				List<WebElement>li_a=driver.findElements(By.xpath("//select[@id='duel_select_0']"));
				for(int i=0;i<li_a.size();i++)
				{
					if(li_a.get(i).getText().contains("cases"))
					{
						li_a.get(i).click();
					}
				}
				av_tab.sendKeys("cases");
				Thread.sleep(1000);
				
				//--//span[@id='EmailSetup_font'] ----for email
				
				//--//img[@class='rightArrowIcon']
				WebElement add=driver.findElement(By.xpath("//img[@class='rightArrowIcon']"));
				add.click();
				Thread.sleep(2000);
				//--//div[@id='PersonalInfo']//a[@class='header setupFolder']
				WebElement email=driver.findElement(By.xpath("(//a[@class='header setupFolder'])[3]"));
				act.moveToElement(email).build().perform();
				//waitElement(email);
				email.click();
				//--//span[@id='EmailSettings_font']
				WebElement email_set=driver.findElement(By.xpath("//span[@id='EmailSettings_font']"));
				act.moveToElement(email_set).build().perform();
				email_set.click();
				//--//input[@id='sender_name']
				WebElement email_name=driver.findElement(By.xpath("//input[@id='sender_name']"));
				waitElement(email_name);
				email_name.clear();
				email_name.sendKeys("laxmi");
				Thread.sleep(1000);
				//---//input[@id='sender_email']
				WebElement email_add=driver.findElement(By.xpath("//input[@id='sender_email']"));
				email_add.sendKeys("laxmi.R@saleforce.com");
				Thread.sleep(1000);
				//--//input[@id='auto_bcc1']
				WebElement bcc=driver.findElement(By.xpath("//input[@id='auto_bcc1']"));
				bcc.click();
				Thread.sleep(1000);
				//--//input[@name='save']
				WebElement save=driver.findElement(By.xpath("//input[@name='save']"));
				act.moveToElement(save).build().perform();
				save.click();
				Thread.sleep(1000);
				//--//span[@id='CalendarAndReminders_font']
				WebElement cal=driver.findElement(By.xpath("//span[@id='CalendarAndReminders_font']"));
				act.moveToElement(cal).build().perform();
				cal.click();
				//--//span[@id='Reminders_font']
				WebElement rem=driver.findElement(By.xpath("//span[@id='Reminders_font']"));
				rem.click();
				Thread.sleep(1000);
				//--//input[@id='testbtn']
				WebElement test=driver.findElement(By.xpath("//input[@id='testbtn']"));
				waitElement(test);
				test.click();
				Thread.sleep(1000);
				driver_quit();
	}

}
