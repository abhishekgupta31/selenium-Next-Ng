package maven_project.maven_artifact;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {

    ExtentSparkReporter htmlReporter;
    ExtentReports reports;
    ExtentTest test;

    @BeforeTest
    public void startReport() {
        // Specify the file path for the report
        htmlReporter = new ExtentSparkReporter("C:\\Users\\Admin\\OneDrive\\Desktop\\java\\maven_artifact\\ExtentReport.html");
        reports = new ExtentReports();
        reports.attachReporter(htmlReporter);

        // Add Environment details
        reports.setSystemInfo("machine", "testpc1");
        reports.setSystemInfo("os", "Windows 10");
        reports.setSystemInfo("user", "admin");
        reports.setSystemInfo("browser", "chrome");

        // Configuration to change look and feel
        htmlReporter.config().setDocumentTitle("Extent Report Demo");
        htmlReporter.config().setReportName("Test Report");
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
    }

    @Test
    public void LaunchBrowser() {  
        test = reports.createTest("Launch browser and open URL");
        Assert.assertTrue(true);  // Test Passed
    }

    @Test
    public void VerifyTitle() {  
        test = reports.createTest("Verify Title");    
        Assert.assertTrue(false);  // Test Failed
    }

    @Test
    public void VerifyLogo() {  
        test = reports.createTest("Verify Logo");    
        Assert.assertTrue(true);  // Test Passed
    }

    @Test
    public void VerifyEmail() {  
        test = reports.createTest("Verify Email");    
        throw new SkipException("Skipping this test method with an exception");  // Test Skipped
    }

    @Test
    public void VerifyUserName() {  
        test = reports.createTest("Verify User Name");    
        Assert.assertTrue(true);  // Test Passed
    }

    @AfterMethod
    public void getTestResult(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
            test.log(Status.FAIL, result.getThrowable()); // Log the exception
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " - Test Case Passed", ExtentColor.GREEN));
        } else if (result.getStatus() == ITestResult.SKIP) {
            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));
        }
    }

    @AfterTest
    public void tearDown() {
        reports.flush();  // Write everything to the report
    }
}
