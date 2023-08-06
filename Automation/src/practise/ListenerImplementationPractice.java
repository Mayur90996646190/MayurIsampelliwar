package practise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementationPractice extends BaseClassPractice implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getName();
		System.out.println(name + " has got on TestStarted");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name = result.getName();
		System.out.println(name + " on test sucess passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		System.out.println(name + " ontestfailure");
		TakesScreenshot t = (TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/"+name+".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name = result.getName();
		System.out.println(name  + " ontestskipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
	}
		
}
