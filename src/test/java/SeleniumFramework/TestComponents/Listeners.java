package SeleniumFramework.TestComponents;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import SeleniumFramework.resources.ExtentReporterNG;

public class Listeners extends BaseTest implements ITestListener{
	
	ExtentReports reports = ExtentReporterNG.getReportObject();
	ExtentTest test;
	
	@Override		
    public void onTestStart(ITestResult result) {					
    	test = reports.createTest(result.getMethod().getMethodName());
        		
    }		

    @Override		
    public void onTestFailure(ITestResult result) {					
        test.fail(result.getThrowable());
        
        try {
			String str = (String) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        String filepath = null;
        
		try {
			filepath = getScreenShotFile(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
        		
    }		

    @Override		
    public void onTestSkipped(ITestResult result) {					
        // TODO Auto-generated method stub				
        		
    }				

    @Override		
    public void onTestSuccess(ITestResult result) {					
        test.log(Status.PASS, "Test Case Passed");			
        		
    }
    
    @Override		
    public void onFinish(ITestContext arg0) {					
       reports.flush();			
        		
    }
	
}
