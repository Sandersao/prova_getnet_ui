package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDrive {
	public static WebDriver driver;
	protected static WebDriverWait wait;
	
	public static void start() {
		try {
			if (SeleniumDrive.driver == null) {
				ChromeOptions options = new ChromeOptions();
				System.setProperty("webdriver.chrome.driver", "D:\\Tools\\web_drivers\\chromedriver.exe");
				driver = new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			}
			if(SeleniumDrive.wait == null) {
				SeleniumDrive.wait = new WebDriverWait(SeleniumDrive.driver, 3);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
