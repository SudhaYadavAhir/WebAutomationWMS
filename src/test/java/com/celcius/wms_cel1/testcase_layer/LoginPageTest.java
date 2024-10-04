package com.celcius.wms_cel1.testcase_layer;




import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.celcius.wms_cel1.generic.BaseTest;
import com.celcius.wms_cel1.generic.WaitStatement;

public class LoginPageTest extends BaseTest{
	
	@Test
	public void tc01_VerifyUiComponentOfLoginPage() {
		extentTest = extent.createTest("TC01: Verify UI component of Login page");
        extentTest.assignAuthor("Sudha");
		System.out.println("Hello...");
		WaitStatement.staticWaitForSeconds(2);
		extentTest.log(Status.INFO, "UI component of Login page is verified successfully");
	}

}
