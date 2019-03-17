package practiceMavenProject.Sample;

//import org.testng.annotations.Test;



import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;




public class TestNg {
	
	public String baseUrl = "https://www.surveymonkey.com/";
	String driverPath = "C:\\Users\\Garcha\\Downloads\\chromedriver.exe";
	
	
	
	    public WebDriver driver ; 
	     
	     @BeforeTest
	      public void launchBrowser() {
	        System.out.println("launching chrome browser"); 
	        System.setProperty("webdriver.chrome.driver", driverPath);
	        driver = new ChromeDriver();
	        driver.get(baseUrl);
	      }
	      @Test
	      public void verifyHomepageTitle() {
	    	  System.out.println("comparing..."); 
	          String expectedTitle = "SurveyMonkey: The World’s Most Popular Free Online Survey Tool";
	          String actualTitle = driver.getTitle();
	          AssertJUnit.assertEquals(actualTitle, expectedTitle);
	     }
	      @Test
	      public void verifyHomepageTitle1() {
	    	  System.out.println("sign up"); 
	         driver.findElement(By.linkText("SIGN UP")).click();
	     }
	      @AfterTest
	      public void terminateBrowser() throws InterruptedException{
	    	  System.out.println("end");
	    	  Thread.sleep(5000);
	          driver.close();
	      }
}
