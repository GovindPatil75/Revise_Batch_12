package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_Test_1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement txt_email=driver.findElement(By.name("email"));
		txt_email.sendKeys("Test@gmail.com");
		
		WebElement txt_password=driver.findElement(By.id("pass"));
		txt_password.sendKeys("12345678");
		
		
		
		
		
		
		
		
		
	}

}
