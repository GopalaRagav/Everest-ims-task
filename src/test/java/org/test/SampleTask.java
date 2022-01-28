package org.test;

import java.io.IOException;
import java.util.Set;

import org.base.BaseClass;
import org.pojo.PojoClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SampleTask extends BaseClass {

	PojoClass pj;

	@BeforeClass
	private void starting() {
		launchBrowser();
		urlLaunch("https://www.amazon.in/");

	}

	@BeforeMethod
	private void start() {
		pj = new PojoClass();
		waitImpli(30);
	}

	@Test
	private void tc1() {

		btnClick(pj.getSignBtn());
		fillText("gopalraghav25@gmail.com", pj.getUsername());
		actionsClick(pj.getContinueBtn());
		fillText("Gopal@123", pj.getPassword());
		actionsClick(pj.getSignInBtn());

	}

	
	@Test
	private void tc2() throws InterruptedException {
		
		btnClick(pj.getAddressBtn());
		
//		String parID = driver.getWindowHandle();
//		Set<String> allId = driver.getWindowHandles();
//		for (String eachId : allId) {
//			if (!parID.equals(eachId)) {
//				driver.switchTo().window(eachId);
//			}
//		}
		Thread.sleep(5000);
		btnClick(pj.getPickPoint());
		btnClick(pj.getAddAdressBtn());
	}


	@Test
	private void tc3() throws IOException, InterruptedException {
		fillText(readExcel("kathir's", 1, 0), pj.getFullName());
		
		fillText(readExcel("kathir's", 1, 1), pj.getPhoneNum());
		fillText(readExcel("kathir's", 1, 2), pj.getPostalCode());
		fillText(readExcel("kathir's", 1, 3), pj.getAddLine1());
		fillText(readExcel("kathir's", 1, 4), pj.getAddLine2());
		fillText(readExcel("kathir's", 1, 5), pj.getLandMark());
		Thread.sleep(5000);
		actionsClick(pj.getConfirmAddress());

	}

}
