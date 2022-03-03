package week2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Assignment2EditLead {

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
		 driver.findElement(By.xpath("(//div[@class='x-form-item x-tab-item']//input)[2]")).sendKeys("Mirunalini");
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 Thread.sleep(1000);
		 WebElement elementFindleadLink = driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-companyName ']//a)[1]"));
		 String text = elementFindleadLink.getText();
		 System.out.println(text);		 
		 elementFindleadLink.click();
		 System.out.println("The tile is "+driver.getTitle());
		 driver.findElement(By.linkText("Edit")).click();
		 //System.out.println(driver.findElement(By.id("viewLead_companyName_sp")).getText());
		 driver.findElement(By.id("updateLeadForm_companyName")).clear();
		 driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("HCL");
		 Thread.sleep(1000);
		String text1= driver.findElement(By.id("updateLeadForm_companyName")).getAttribute("Value");
		System.out.println(text1);
		 driver.findElement(By.name("submitButton")).click();
		 //WebElement elementText = driver.findElement(By.id("viewLead_companyName_sp"));
		 //String text1 = elementText.getText();
		 //System.out.println(text1);
		 if(text.equals(text1))
			{
				
				System.out.println("The Company name are similar");
				
			}
			else {
				 System.out.println("The Company name is differrnt");
			 } 

	}

}
