package sFDC_login;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testapp2.page_load;

public class tc_06 extends page_load {

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
				//--//a[contains(text(),'My Profile')] ---click on that
				WebElement my_profile=driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
				act.moveToElement(my_profile).build().perform();
				my_profile.click();
				
				/*
				if(!driver.findElements(By.xpath("//*[@id=\"displayBadge\"]")).isEmpty())
				{
				WebElement aaaa=driver.findElement(By.xpath("//*[@id=\"displayBadge\"]"));
				System.out.println("sssssss");
				Actions actddd=new Actions(driver);
				actddd.moveToElement(aaaa).build().perform();
				//upload_photo_link;
				}
				
				//--//a[contains(text(),'Remind Me Later')]
				if(!driver.findElements(By.xpath("//*[@id=\"uploadLink\"]")).isEmpty())
				{
				WebElement upload_photo_link=driver.findElement(By.xpath("//*[@id=\"uploadLink\"]"));
				System.out.println("c");
				upload_photo_link.click();
				}
				
				if(!driver.findElements(By.xpath("//*[@id=\"j_id0:uploadFileForm:uploadInputFile\"]")).isEmpty())
				{
					System.out.println("choose found");
				WebElement choose=driver.findElement(By.xpath("//*[@id=\"j_id0:uploadFileForm:uploadInputFile\"]"));
				System.out.println("c");
				choose.click();
				}*/
				
				
				//---(//img[@title='Edit Profile'])[1]
			/*----this is working fine-----
			 * WebElement edit_profile=driver.findElement(By.xpath("(//img[@title='Edit Profile'])[1]"));
				waitElement(edit_profile);
				edit_profile.click();
				Thread.sleep(1000);
				//driver.switchTo().frame(1);
				//--//iframe[@id='contactInfoContentId']
				WebElement frame=driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']"));
				waitElement(frame);
				//System.out.println("frame found");
				driver.switchTo().frame("contactInfoContentId");
				//System.out.println("switch into frame");
				//--//li[@id='aboutTab']
				WebElement about_tab=driver.findElement(By.xpath("//li[@id='aboutTab']"));
				waitElement(about_tab);
				//System.out.println("about found");
				about_tab.click();
				Thread.sleep(1000);
				//--//input[@id='lastName']
				WebElement last_name=driver.findElement(By.xpath("//input[@id='lastName']"));
				//last_name.clear();
				last_name.sendKeys("RR");
				//--//input[@value='Save All']
				WebElement save_all=driver.findElement(By.xpath("//input[@value='Save All']"));
				save_all.click();
				Thread.sleep(1000);
				------------till here-----------*/
				//--(//span[contains(text(),'Post')])[1]-----post tab
				
				/*this code working*/
				/*WebElement post=driver.findElement(By.xpath("(//span[contains(text(),'Post')])[1]"));
			if(post!=null)
				{
				
				post.click();
				System.out.println(post);
				System.out.println("post click");
				}*/
				
				
				
				//frame enterin that--//iframe[@class='cke_wysiwyg_frame cke_reset']
				//System.out.println("Page source");
				//System.out.println(driver.getPageSource());
				//WebElement frame_1=driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
				//waitElement(frame_1);
				//driver.switchTo().frame(frame_1);
				//System.out.println("switch into frame");
				//--/html/body/p
				Thread.sleep(1000);
				//--//body[contains(@class,'chatterPublisherRTE cke_editable cke_editable_themed cke_contents_ltr cke_show_borders')]
				//---text area not found
				
				/*WebElement text_area=driver.findElement(By.xpath("//body[contains(text(),'Share an update, @mention someone...')]"));
				if(text_area!=null)
				{
				text_area.sendKeys("this is tested");
				
				Thread.sleep(1000);
				
				//--//input[@id='publishersharebutton']
				WebElement share_button=driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
				if(share_button!=null)
				{
				share_button.click();
				}else
				{
					System.out.println("share_button not found");
				}
				}*/
				
				//--//span[contains(text(),'File')]
				Thread.sleep(1000);
				
				
				/*String f_path="C:\\Users\\urajp\\Desktop\\answer_sheet.docx";
				WebElement file=driver.findElement(By.xpath("//span[contains(text(),'File')]"));
				file.click();
				//--//a[@id='chatterUploadFileAction']
				WebElement upload=driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']"));
				upload.click();
				//Thread.sleep(1000);
				//--//input[@id='chatterFile']
				WebElement choose=driver.findElement(By.xpath("//input[@class='file']"));
				waitElement(choose);
				act.moveToElement(choose).build().perform();
				choose.sendKeys(f_path);
				//choose.click();
				//Thread.sleep(1000);
				System.out.println("choose");
				Thread.sleep(1000);
				//---//input[@id='publishersharebutton']
				WebElement share=driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
				share.click();
				
				*/
				/*ArrayList<String> li_win=new ArrayList(driver.getWindowHandles());//window =2(0,1)
				   System.out.println("total windows= "+li_win.size());//=2
				   Thread.sleep(1000);
				   //driver.close();
				   driver.switchTo().window(li_win.get(1));
				   
				   driver.get("https://www.facebook.com");
				   Thread.sleep(1000);
				   driver.close();
				   */
				   
				
			/*	----------for photo upload----------
			 * //--(//img[@title='laxmi RR'])[1]*/
				
				Actions act1=new Actions(driver);
				WebElement moderator=driver.findElement(By.id("displayBadge"));
				act.moveToElement(moderator).build().perform();
				Thread.sleep(1000);
				//--//a[contains(text(),'Add Photo')]
				WebElement addPhotolink=driver.findElement(By.xpath("//a[@id='uploadLink']"));
				addPhotolink.click();
				WebElement Iframe=driver.findElement(By.xpath("//iframe[@id='uploadPhotoContentId']"));
				   driver.switchTo().frame("uploadPhotoContentId");
				   System.out.println("switch on to frame");
				   Thread.sleep(1000);
				   //--//input[@class='fileInput']
				   //--//input[@id='j_id0:uploadFileForm:uploadInputFile']
				   WebElement choosefileoption=driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']"));
				   System.out.println("choose founnd");
				   waitElement(choosefileoption);
				  //only one window
				  // choose.click();
				   choosefileoption.sendKeys("C:\\Users\\urajp\\Desktop\\bird.jpg");
				   System.out.println("send keys worked");//address of an image
				//--(//input[@value='Save'])[1]
				   driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
				  // driver.switchTo().frame("uploadPhotoContentId");
				   WebElement sa=driver.findElement(By.xpath("//*[@id=\"j_id0:uploadFileForm:uploadBtn\"]"));
				   System.out.println("save button found");
				   
				   sa.click();
				   /*driver.switchTo().window(li_win.get(0));*/
				   Thread.sleep(5000);
				   WebElement sav=driver.findElement(By.xpath("//*[@id=\"j_id0:j_id7:save\"]"));
				   sav.click();
				   Thread.sleep(5000);
				   driver_quit();
	}
	

}
