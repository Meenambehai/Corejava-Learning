package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectDropdown {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/select.xhtml");
		WebElement element = driver.findElement(By.className("ui-selectonemenu"));
		Select options = new Select(element);
		options.selectByIndex(2);
		options.selectByContainsVisibleText("Puppeteer");
	}

}
