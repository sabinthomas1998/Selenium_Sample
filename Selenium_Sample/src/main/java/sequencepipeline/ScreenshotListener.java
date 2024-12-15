package sequencepipeline;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotListener {
	
	static int i=0;
	
	public static void captureScreenshot(WebDriver driver ) throws IOException {
	
	i++;
		
    // Step 4: Take a screenshot
    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

    // Step 5: Save the screenshot to a desired location
    File destination = new File("target/screenshot-"+i+".png");
    FileUtils.copyFile(screenshot, destination);

    System.out.println("Screenshot saved to: " + destination.getAbsolutePath());
}

}
