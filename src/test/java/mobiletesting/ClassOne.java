package mobiletesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ClassOne {
	public static AndroidDriver driver;
	
	@Test
	private void appLaunch() throws MalformedURLException {
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "12");
		capabilities.setCapability("udid", "RZ8N91WK61R");
		capabilities.setCapability("deviceName", "Galaxy M51");
		capabilities.setCapability("appPackage", "com.google.android.calculator");
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
		driver= new AndroidDriver(url, capabilities);
		
		
	}
	@Test
	private void calculation() {
		WebElement seven = driver.findElement(AppiumBy.accessibilityId("7"));
		seven.click();
		WebElement minus = driver.findElement(AppiumBy.accessibilityId("minus"));
		minus.click();
		WebElement five = driver.findElement(AppiumBy.accessibilityId("5"));
		five.click();
		WebElement equals = driver.findElement(AppiumBy.accessibilityId("equals"));
		equals.click();
	}

}
