import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class form {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/venzo/OneDrive - Centennial College/Desktop/SELENIUM TESTING/chromedriver.exe" );
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/form");
		
		driver.findElement(By.id("first-name")).sendKeys("Vince");
		
		driver.findElement(By.id("last-name")).sendKeys("Ariola");
		
		driver.findElement(By.id("job-title")).sendKeys("QA Engineer");
		
		driver.findElement(By.id("radio-button-2")).click();
		
		driver.findElement(By.id("checkbox-1")).click();
		
		driver.findElement(By.cssSelector("option[value='1']")).click();
		
		driver.findElement(By.id("datepicker")).sendKeys("04/16/2024");
		
		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
		
		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
		
		driver.quit();

	}

}
