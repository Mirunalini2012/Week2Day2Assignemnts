package week2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2assignment2CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		 WebElement elementUserName= driver.findElement(By.id("username"));
		 elementUserName.sendKeys("Demosalesmanager");
		 WebElement elementPassword= driver.findElement(By.id("password"));
		 elementPassword.sendKeys("crmsfa");
		 WebElement elementLogingButton= driver.findElement(By.className("decorativeSubmit"));
		 elementLogingButton.click();
		 WebElement elementCRMSFA= driver.findElement(By.linkText("CRM/SFA"));
		 elementCRMSFA.click();
		 driver.findElement(By.linkText("Contacts")).click();
		 driver.findElement(By.linkText("Create Contact")).click();
		 driver.findElement(By.id("firstNameField")).sendKeys("Mirunalini");
		 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Mirun");
		 driver.findElement(By.id("lastNameField")).sendKeys("Chakravarthy");
		 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Chakr");
		 driver.findElement(By.id("createContactForm_departmentName")).sendKeys("CS");
		 driver.findElement(By.id("createContactForm_description")).sendKeys("xxxxx");
		 driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("mirunalini2012@gmail.com");
		 WebElement elementDropDown=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		 Select dd=new Select(elementDropDown);
		 dd.selectByVisibleText("New York");
		 driver.findElement(By.className("smallSubmit")).click();  
		 driver.findElement(By.linkText("Edit")).click();
		  WebElement elementDescriptionClear = driver.findElement(By.id("updateContactForm_description"));
		  elementDescriptionClear.clear();
		 driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important Note");
		 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		 //driver.findElement(By.className("smallSubmit")).click();
		System.out.println("The Title is "+driver.getTitle());
		 

	}

}
