package Resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	Properties pro;
	
	public WebDriver initialize() throws IOException {
		 pro = new Properties();
		 FileInputStream file = new FileInputStream("C:\\Users\\a2z\\eclipse-workspace\\Swag_Lab\\src\\test\\java\\Resource\\data.properties");
		 pro.load(file);
		 String browser = pro.getProperty("browser");
		 String url = pro.getProperty("url");
		 if(browser.equals("chrome")) {
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 driver.get(url);
			 driver.manage().window().maximize();
		 }
		 return driver;
	}

}
