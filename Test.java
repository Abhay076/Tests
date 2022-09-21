package test;

import org.openqa.selenium.By.ById;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//		WebDriver driver;
		
		//here you will be specify the driver type and its location
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABHAY YADAV\\Desktop\\selenium-java-4.4.0\\chromedriver.exe");
        //here you will be create and object of your web driver
		WebDriver driver = new ChromeDriver();
		 //nevigation
		driver.get("https://www.amazon.com/");
		WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iPhone13");
//		searchBox.submit();
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
		driver.findElement(By.linkText("Apple iPhone 13, 128GB, Midnight - Unlocked (Renewed)")).click();
		System.out.println(driver.findElement(By.id("a-offscreen")));
		//maximize
//		driver.manage().window().maximize();
//		//wait
//		Thread.sleep(5000);
//		//close
//		driver.close();
//        driver.quit(); it will be close the .exe driver and it will close all browsers opened by selenium
	}

}
