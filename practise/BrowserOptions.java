package practise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserOptions {

	public static void main(String[] args) throws IOException {
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--private");
		FirefoxDriver driver = new FirefoxDriver(options);
		driver.get("https://leafground.com/window.xhtml");
		WebElement element = driver.findElement(By.xpath("//span[text()='Open with delay']"));
		File src=element.getScreenshotAs(OutputType.FILE);
		File des= new File("./snap/windowscreenshot.png");
		FileUtils.copyFile(src, des);
	}

}
