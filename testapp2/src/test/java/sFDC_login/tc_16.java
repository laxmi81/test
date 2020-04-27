package sFDC_login;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testapp2.page_load;

public class tc_16 extends page_load {

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
				//---//a[contains(text(),'Opportunities')]
				WebElement opp=driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]"));
				waitElement(opp);
				act.moveToElement(opp).build().perform();
				opp.click();
				
				Thread.sleep(1000);
				driver.findElement(By.id("tryLexDialogX")).click();
				//--//input[@name='new']
				WebElement new1=driver.findElement(By.xpath("//input[@name='new']"));
				waitElement(new1);
				act.moveToElement(new1).build().perform();
				new1.click();
				//--//input[@id='opp3']
				WebElement n1=driver.findElement(By.xpath("//input[@id='opp3']"));
				waitElement(n1);
				n1.sendKeys("soft");
				Thread.sleep(1000);
				//--//input[@id='opp4']
				WebElement a1=driver.findElement(By.xpath("//input[@id='opp4']"));
			
				a1.sendKeys("soft12");
				Thread.sleep(1000);
				//--//input[@id='opp9']
				WebElement cl_date=driver.findElement(By.xpath("//input[@id='opp9']"));
				//--//a[contains(text(),'4')]
				WebElement clo_date=driver.findElement(By.xpath("//a[contains(text(),'4')]"));
				clo_date.click();
				String d=clo_date.getText();
				cl_date.sendKeys(d);
				Thread.sleep(1000);
				//--//select[@id='opp11']
				WebElement stage=driver.findElement(By.xpath("//select[@id='opp11']"));
				stage.click();
				List<WebElement> li_s=driver.findElements(By.xpath("//select[@id='opp11']"));
				for(int i=0;i<li_s.size();i++)
				{
					if(li_s.get(i).getText().contains("Value Proposition"))
					{
						li_s.get(i).click();
					}
				}
				stage.sendKeys("Value Proposition");
				Thread.sleep(1000);
				//--//input[@id='opp12']
				WebElement pro=driver.findElement(By.xpath("//input[@id='opp12']"));
				pro.click();
				//--//input[@id='opp17']
				WebElement pri_c=driver.findElement(By.xpath("//input[@id='opp17']"));
				pri_c.sendKeys("lax");
				Thread.sleep(1000);
				//--//select[@id='opp6']
				//-------------------------------not enter in lead
				WebElement lead=driver.findElement(By.xpath("//select[@id='opp6']"));
				waitElement(lead);
				lead.click();
				List<WebElement> li_l=driver.findElements(By.xpath("//select[@id='opp6']"));
				for(int i=0;i<li_l.size();i++)
				{
					if(li_l.get(i).getText().contains("Web"))
					{
						li_l.get(i).click();
					}
				}
				lead.sendKeys("web");
				Thread.sleep(2000);
				//--//div[contains(@class,'pbBottomButtons')]//input[1]
				WebElement save=driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]"));
				act.moveToElement(save).build().perform();
				save.click();
				Thread.sleep(1000);
				driver.quit();
	}

}
