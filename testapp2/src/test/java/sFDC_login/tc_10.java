package sFDC_login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testapp2.page_load;

public class tc_10 extends page_load{

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
				//--//input[@name='new']
				WebElement new_bt=driver.findElement(By.xpath("//input[@name='new']"));
				waitElement(new_bt);
				act.moveToElement(new_bt).build().perform();
				new_bt.click();
				//---//input[@id='acc2']
				WebElement name=driver.findElement(By.xpath("//input[@id='acc2']"));
				waitElement(name);
				name.sendKeys("lax");
				Thread.sleep(2000);
				//--//select[@id='acc6']
				WebElement type=driver.findElement(By.xpath("//select[@id='acc6']"));
				waitElement(type);
				type.click();
				type.sendKeys("technogy Partner"); 
				List <WebElement> li_type = driver.findElements(By.xpath("//select[@id='acc6']"));
					for(int count=0;count<li_type.size();count++)
					{
						if(li_type.get(count).getText().contains("technogy Partner"))
						{				
							li_type.get(count).click();
						}
						
					}
				
				Thread.sleep(2000);
				//--//select[@id='00N5w00000HXjVs']
				WebElement cust=driver.findElement(By.xpath("//select[@id='00N5w00000HXjVs']"));
				waitElement(cust);
				cust.click();
				
				List <WebElement> li_cust = driver.findElements(By.xpath("//select[@id='00N5w00000HXjVs']"));
				for(int count=0;count<li_cust.size();count++)
				{
					if(li_cust.get(count).getText().contains("High"))
					{				
						li_cust.get(count).click();
					}
					
				}
				cust.sendKeys("High");
				Thread.sleep(3000);
				driver.quit();
				  
	}

}
