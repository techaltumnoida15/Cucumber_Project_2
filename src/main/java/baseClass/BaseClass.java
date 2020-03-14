package baseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.jdbc.Driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {

	public WebDriver driver;
	
	public void selectBrowser(String browserName) {
		String osName = "Wins";
		String projectPath = System.getProperty("user.dir");
		
		//Check OS
		if(osName.equals("Wins")) {
			if(browserName.equalsIgnoreCase("firefox")) {
				//Open FF
			}
			
			else if(browserName.equalsIgnoreCase("chrome")) {
				//Open Chrome
				System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDriversEXE\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			
			else if(browserName.equalsIgnoreCase("ie")){
				//Open IE
			}
			
			else if(browserName.equalsIgnoreCase("edge")) {
				
			}
			
			else if(browserName.equalsIgnoreCase("headless")) {
				
			}
		}
		
		else if(osName.equals("Mac")) {
			
		}
		
		else if(osName.equals("Linux")) {
			
		}
		
		driver.manage().window().maximize();
		driver.get("http://www.cheapoair.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void closeBrowser() {
		driver.quit();
	}
}
