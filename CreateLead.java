package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Swami");
		WebElement source =driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select emp=new Select(source);
		Thread.sleep(2000);
		emp.selectByVisibleText("Employee");
		WebElement marketingCampaignld = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	Select mc=new Select(marketingCampaignld);
	Thread.sleep(2000);
	mc.selectByValue("9001");
	WebElement own = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select corp=new Select(own);
	Thread.sleep(2000);
	corp.selectByIndex(5);
	WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	Select india=new Select(country);
	Thread.sleep(2000);
	india.selectByVisibleText("India");
	driver.findElement(By.name("submitButton")).click();
	System.out.println(driver.getTitle());
	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	System.out.println(text);
	if(text.contains("Testleaf")) {
		System.out.println("I confirm the Title has Testleaf");
	}else {
		System.out.println("This Title does not have Testlesf ");
	}
	
	driver.close();
	
	
	
	}

}
