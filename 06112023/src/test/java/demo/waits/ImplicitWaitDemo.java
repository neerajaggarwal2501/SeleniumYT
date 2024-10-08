package demo.waits;
import java.nio.file.Path;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		Path application_path = Path.of(System.getProperty("user.dir"), "src", "test", "resources", "Wait.html");

		driver.get(application_path.toString());

		driver.findElement(By.id("Question_India")).click();
		System.out.println(driver.findElement(By.id("Answer_India_Delhi")).getText());
		//The driver will continuously check for the element's availability. 
		//When the element is available after 5 seconds, driver will read it's text and move to next execution step.
		
		driver.findElement(By.id("Question_Japan")).click();
		System.out.println(driver.findElement(By.id("Answer_Japan_Tokyo1")).getText()); 
		//The driver will continuously check for the element's availability. 
		//When the element is available after 10 seconds. Driver will read it's text and move to next execution step.
		
		driver.quit();
	}
}