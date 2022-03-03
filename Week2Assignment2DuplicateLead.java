package week2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Week2Assignment2DuplicateLead {

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
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("mirunalini2012@gmail.com");
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 Thread.sleep(1000);
		 WebElement elementDuplicateleadLink =  driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName ']//a)[1]"));
		 String text= elementDuplicateleadLink.getText(); 
		 System.out.println(text); 
		 elementDuplicateleadLink.click();
		 driver.findElement(By.linkText("Duplicate Lead")).click();
		 System.out.println("The tile is "+driver.getTitle());
		 //driver.findElement(By.xpath("//input[@name='firstName']"));
		// System.out.println(driver.findElement(By.name("companyName")).getAttribute("Value"));
		 driver.findElement(By.className("smallSubmit")).click();
		 WebElement elementName = driver.findElement(By.id("viewLead_firstName_sp"));
		 String textone= elementName.getText();
		 System.out.println(textone);
		 //System.out.println(driver.findElement(By.id("createLeadForm_firstName")).getText());
		if(text.equals(textone))
		{
			
			System.out.println("The Record id Duplicate");
			
		}
		else {
			 System.out.println("The Record is not Duplicate");
		 } 
		
		
		 driver.close();	 
		 

	}

}
