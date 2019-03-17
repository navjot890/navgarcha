package practiceMavenProject.Sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadingFile {
@Test
public void login() throws IOException  {
	Properties p = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\Garcha\\workspace\\Sample\\Property\\config.properties");
	p.load(fis);
	String dPath = p.getProperty("driverPath");
	String bURL = p.getProperty("baseUrl");
	System.setProperty("webdriver.chrome.driver", dPath);
    WebDriver driver = new  ChromeDriver();
    driver.get(bURL);
}
}
