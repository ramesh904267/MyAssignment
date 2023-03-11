package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) {
		 
		
		ChromeDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/login");
	String title=driver.getTitle();
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	WebElement sources = driver.findElement(By.id("createLeadForm_dataSourceId"));
	
	Select dropDown1 = new Select(sources);
	
	// index  ---- 0
	// visibleText ---- BlackText
	// value -----> 
	dropDown1.selectByIndex(3);
	dropDown1.selectByVisibleText("Existing Customer");
	dropDown1.selectByValue("LEAD_SELFGEN");
	
	System.out.println(title);

	}

}
