package sFDC_login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testapp2.page_load;

public class tc_12 extends page_load {

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
				//--//select[@id='fcf']
				WebElement v_name=driver.findElement(By.xpath("//select[@id='fcf']"));
				waitElement(v_name);
				v_name.sendKeys("llax");
				//v_name.click();
				Thread.sleep(1000);
				//--(//a[contains(text(),'Edit')])[1]
				WebElement edit=driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[1]"));
				waitElement(edit);
				edit.click();
				Thread.sleep(1000);
				//--//input[@id='fname']
				WebElement n1=driver.findElement(By.xpath("//input[@id='fname']"));
				waitElement(n1);
				n1.sendKeys("lax123");
				n1.click();
				Thread.sleep(1000);
				//--//select[@id='fcol1']
				WebElement feild=driver.findElement(By.xpath("//select[@id='fcol1']"));
				feild.click();
				
				
				  
				   List <WebElement> li_fi = driver.findElements(By.xpath("//select[@id='fcol1']"));
					for(int count=0;count<li_fi.size();count++)
					{
						if(li_fi.get(count).getText().contains("Account Name"))
						{				
							li_fi.get(count).click();
						}
						
					}
					feild.sendKeys("Account Name");
					Thread.sleep(1000);
					//--//select[@id='fop1']
					WebElement op=driver.findElement(By.xpath("//select[@id='fop1']"));
					op.click();
					
					
					  
					   List <WebElement> li_op = driver.findElements(By.xpath("//select[@id='fop1']"));
						for(int count=0;count<li_op.size();count++)
						{
							if(li_op.get(count).getText().contains("contains"))
							{				
								li_op.get(count).click();
							}
							
						}
						op.sendKeys("contains");
					Thread.sleep(1000);
					//--//input[@id='fval1']
					WebElement value=driver.findElement(By.xpath("//input[@id='fval1']"));
					value.sendKeys("a");
					Thread.sleep(1000);
					//--//div[3]//table[1]//tbody[1]//tr[1]//td[2]//input[1]
					WebElement sa=driver.findElement(By.xpath("//div[3]//table[1]//tbody[1]//tr[1]//td[2]//input[1]"));
					act.moveToElement(sa).build().perform();
					sa.click();
					Thread.sleep(1000);
				driver.quit();
				
	}

}
