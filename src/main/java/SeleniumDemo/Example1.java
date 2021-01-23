package SeleniumDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.MILLISECONDS);
		driver.get("https://demo.guru99.com/V4/");
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());

driver.findElement(By.name("uid")).sendKeys("mngr305216");
driver.findElement(By.name("password")).sendKeys("jusAsEd");
driver.findElement(By.name("btnLogin")).click();
driver.findElement(By.linkText("New Customer")).click();


	}

}
