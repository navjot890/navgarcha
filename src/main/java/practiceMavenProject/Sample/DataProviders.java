package practiceMavenProject.Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	@Test(dataProvider = "provideData")
	public void login(String userName, String password){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Garcha\\Downloads\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.surveymonkey.com/");
		 driver.findElement(By.linkText("LOG IN")).click();
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys(userName);
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@DataProvider
	public Object[][] provideData(){
		Object userDetails[][] = new Object[1][2];
		userDetails[0][0] = "navjot";
		userDetails[0][1] = "navjot1234";
		return userDetails;
	}

}
