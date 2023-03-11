package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookBrowser {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
				
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("Ramesh");
		driver.findElement(By.name("lastname")).sendKeys("s");
		driver.findElement(By.name("reg_email__")).sendKeys("ramesh904267@gamil.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Srv904267");
		driver.findElement(By.name("login")).click();
		String facebook = driver.getTitle();
		System.out.println(facebook);
		driver.close();

	}

}
