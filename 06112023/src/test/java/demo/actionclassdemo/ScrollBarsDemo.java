package demo.actionclassdemo;

import java.nio.file.Path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollBarsDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		Path application_path = Path.of(System.getProperty("user.dir"), "src", "test", "resources", "ScrollBars.html");

		driver.get(application_path.toString());

		Actions actions = new Actions(driver);

		// Element 1 - Horizontal scroll
		WebElement button1 = driver.findElement(By.xpath("//button[text()='Thirty']"));

		// Element 1 - Vertical scroll
		WebElement button2 = driver.findElement(By.xpath("//button[text()='J']"));

		Thread.sleep(4000);
		actions.scrollToElement(button1).perform(); // NOTE: This API will not do Mouse Hover.

		Thread.sleep(4000);
		actions.scrollToElement(button2).perform();

		Thread.sleep(5000);
		driver.quit();
	}
}