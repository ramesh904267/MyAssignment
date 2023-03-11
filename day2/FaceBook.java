package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		
		 ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ramesh");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("swami");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("6369589245");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Srv636958");
		WebElement Bday = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Select day=new Select(Bday);
		day.selectByVisibleText("9");
		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		Select M=new Select(Month);
		M.selectByVisibleText("Dec");
		WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
		Select y=new Select(year);
		y.selectByVisibleText("1997");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();

	}

}
