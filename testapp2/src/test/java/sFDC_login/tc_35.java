package sFDC_login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testapp2.page_load;

public class tc_35 extends page_load {

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
				WebElement remind_button=driver.findElement(By.xpath("//a[contains(text(),'Remind Me Later')]"));
				waitElement(remind_button);
				remind_button.click();
				Thread.sleep(1000);
				//---//img[contains(@class,'allTabsArrow')]
				WebElement plus_bt=driver.findElement(By.xpath("//img[contains(@class,'allTabsArrow')]"));
				plus_bt.click();
				//--//input[@name='customize']
				WebElement cust=driver.findElement(By.xpath("//input[@name='customize']"));
				waitElement(cust);
				cust.click();
				//--//select[@id='duel_select_1']
				WebElement li_tab=driver.findElement(By.xpath("//select[@id='duel_select_1']"));
				waitElement(li_tab);
				li_tab.click();
				List<WebElement> li_t=driver.findElements(By.xpath("//select[@id='duel_select_1']"));
				for(int i=0;i<li_t.size();i++)
				{
					if(li_t.get(i).getText().contains("Content"))
					{
						li_t.get(i).click();
					}
				}
				li_tab.sendKeys("Content");
				Thread.sleep(1000);
				//--//img[contains(@class,'leftArrowIcon')]
				WebElement remove=driver.findElement(By.xpath("//img[contains(@class,'leftArrowIcon')]"));
				remove.click();
				//--//input[@name='save']
				WebElement save=driver.findElement(By.xpath("//input[@name='save']"));
				save.click();
				Thread.sleep(1000);
				//--//span[@id='userNavLabel']
				WebElement us=driver.findElement(By.xpath("//span[@id='userNavLabel']"));
				us.click();
				//--//a[contains(text(),'Logout')]
				WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
				logout.click();
				///////////////////////////////////
				/*WebElement log1=driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
				waitElement(log1);
				log1.click();*/
				Thread.sleep(1000);
				WebElement user11=driver.findElement(By.xpath("//input[@id='username']"));
				waitElement(user11);
				user11.clear();
				String user12=valid_user();
				user11.sendKeys(user12);
				Thread.sleep(1000);
				//--//input[@id='password']
				WebElement pwd1=driver.findElement(By.xpath("//input[@id='password']"));
				pwd1.clear();
				String p1=password();
				pwd1.sendKeys(p1);
				Thread.sleep(1000);
				//--//input[@id='rememberUn']
				/*WebElement remember=driver.findElement(By.xpath("//input[@id='rememberUn']"));
				remember.click();;
				Thread.sleep(1000);*/
						//--//input[@id='Login']
						WebElement login_button1=driver.findElement(By.xpath("//input[@id='Login']"));
						login_button1.click();
						//user();
						Thread.sleep(3000);
						//--//a[contains(text(),'Remind Me Later')]
						WebElement remind_button1=driver.findElement(By.xpath("//a[contains(text(),'Remind Me Later')]"));
						waitElement(remind_button1);
						remind_button1.click();
						Thread.sleep(1000);
				driver.quit();
	}

	
	
}
