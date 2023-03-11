package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Account");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("vignesh");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Swami");
		driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("350000");
		WebElement Industry= driver.findElement(By.name("industryEnumId"));
		Select drop1=new Select(Industry);
		drop1.selectByIndex(3);
		WebElement owner= driver.findElement(By.name("ownershipEnumId"));
		Select corp=new Select(owner);
		corp.selectByVisibleText("Corporation");
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select emp=new Select(source);
		emp.selectByVisibleText("Employee");
		WebElement mark = driver.findElement(By.id("marketingCampaignId"));
		Select ecomm=new Select(mark);
		ecomm.selectByIndex(6);
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select tex=new Select(state);
		tex.selectByVisibleText("Texas");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		
		
		
		
		

	}

}
