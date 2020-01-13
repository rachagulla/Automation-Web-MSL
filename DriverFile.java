package utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import pageObjects.Groups_Page;
import pageObjects.Login_Page;


public class DriverFile {
	public static WebDriver driver;
	public static Properties prop ;
	public static FileInputStream fis ;
	public static Login_Page loginPage;
	public static Groups_Page groupsPage;
	
	

	public static WebDriver invokeBrowser() {
		try {
			prop = new Properties();
			fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/properties/config.properties");
			prop.load(fis);
			String browserName = prop.getProperty("browser");
			if (browserName.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
					driver = new FirefoxDriver();
				}else if (browserName.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
					driver = new ChromeDriver();
					driver.manage().window().maximize();
				}else if (browserName.equalsIgnoreCase("ie")) {
					System.setProperty("webdriver.ie.driver", Constant.IE_DRIVER_DIRECTORY);
					driver = new InternetExplorerDriver();
					driver.manage().window().maximize();
				}
				
			
		} catch (Exception e) {
			System.out.println("Unable to load browser: " + e.getMessage());
		} finally {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			loginPage=PageFactory.initElements(driver, Login_Page.class);
			groupsPage=PageFactory.initElements(driver, Groups_Page.class);
		}
		return driver;
	}
	
	public static void invokeUrl(){
		String url=prop.getProperty("baseUrl");
		driver.get(url);
	}
}
