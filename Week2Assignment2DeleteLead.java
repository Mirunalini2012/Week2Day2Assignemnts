package week2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Assignment2DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 WebElement elementUserName= driver.findElement(By.id("username"));
		 elementUserName.sendKeys("Demosalesmanager");
		 WebElement elementPassword= driver.findElement(By.id("password"));
		 elementPassword.sendKeys("crmsfa");
		 WebElement elementLogingButton= driver.findElement(By.className("decorativeSubmit"));
		 elementLogingButton.click();
		 WebElement elementCRMSFA= driver.findElement(By.linkText("CRM/SFA"));
		 elementCRMSFA.click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.xpath("//span[text()='Phone']")).click();
		 //driver.findElement(By.xpath("//span[text()='Email']")).click();
		 //driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("mirunalini2012@gmail.com");
		 driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys(" ");
		 driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("97");
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 Thread.sleep(1000);
		 WebElement elementFindleadLink = driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]"));
		 String text= elementFindleadLink.getText(); 
		 System.out.println(text);	
		 elementFindleadLink.click();
		 driver.findElement(By.linkText("Delete")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 //driver.findElement(By.name("id")).sendKeys("14190");
		 driver.findElement(By.xpath("(//div[@class='x-form-item x-tab-item']//input)[1]")).sendKeys(text);
		  driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		  String text3="No records to display";		 
		 String text2 = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
	     if(text3.equals(text2)) {
			 System.out.println("The Record is Deleted");
		 }else {
			 System.out.println("The Record is not Deleted");
		 }
		 //driver.findElement(By.className(null))
         //driver.findElement(By.xpath("//input[@class=' x-form-text x-form-field']")).sendKeys("1");
	}

}
