package testNgpractice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotation {
		@BeforeSuite
		public void con_ser() {
			Reporter.log("Connection to the server",true);
		}
		@AfterSuite
		public void dis_ser() {
			Reporter.log("DisConnection to the server",true);
		}
		@BeforeTest
		public void con_db() {
			Reporter.log("Connection to the DataBase",true);
		}
		@AfterTest
		public void dis_db() {
			Reporter.log("DisConnection to the DataBase",true);
		}
		@BeforeClass
		public static void openbrowser() {
			Reporter.log("Open the Browser",true);
		}
		@AfterClass
		public void closingbrowser() {
			Reporter.log("close the browser",true);
		}
		@BeforeMethod
		public void login() {
			Reporter.log("login",true);
		}
		@AfterMethod
		public static void logout() {
			Reporter.log("logout",true);
		}
		@Test
		public void testcase() {
			Reporter.log("testcase exicution",true);
		}
}
