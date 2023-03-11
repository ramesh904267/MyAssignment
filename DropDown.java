package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
    ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(opt);
	driver.get("https://www.leafground.com/select.xhtml");
    WebElement Selecttool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
    Select sele=new Select(Selecttool);
	sele.selectByIndex(1);
	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s ui-c']")).click();
	driver.findElement(By.id("j_idt87:country_3")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[contains(@class,'ui-icon ui-icon-triangle')])[2]")).click();
	driver.findElement(By.id("j_idt87:city_2")).click();
	driver.findElement(By.xpath("(//span[contains(@class,'ui-button-icon-primary ui-icon ui-icon-triangle')])")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//li[contains(@class,'ui-autocomplete-item ui-autocomplete-list-item ui-corner')])[3]")).click();
	driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[3]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[text()='Tamil']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[4]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//ul[@id='j_idt87:value_items']//li)[2]")).click();
	
	
	}

}
