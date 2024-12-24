package appiumAutomationAndroid;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import io.appium.java_client.AppiumBy;

public class AppiumBasics extends BaseTest{
	
	@Test
	public void test1() throws MalformedURLException, URISyntaxException {
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		driver.findElement(AppiumBy.id("android:id/checkbox")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout)[2]")).click();
		driver.findElement(By.className("android.widget.EditText")).sendKeys("Surya");
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		
		
	}

}
