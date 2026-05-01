package tests;

import org.testng.SkipException;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginSuccessTest1() {
        LoginPage loginpage = new LoginPage(page);
        HomePage homepage = new HomePage(page);

        test.info("Navigating to login page");
        page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        test.info("Adding username");
        loginpage.addUsername("Admin");
        test.info("Adding password");
        loginpage.addPassword("admin12");
        test.info("Clicking login button");
        loginpage.clickLoginButton();
        test.info("Checking homepage");
        homepage.clickTimeLink();
        test.info("All steps completed");
    }

    @Test
    public void loginSuccessTest2() {
        test.skip("Skipping this test");
        throw new SkipException("Test skipped");
    }

    @Test
    public void loginSuccessTest3() {
        LoginPage loginpage = new LoginPage(page);
        HomePage homepage = new HomePage(page);

        test.info("Navigating to login page");
        page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        test.info("Adding username");
        loginpage.addUsername("Admin");
        test.info("Adding password");
        loginpage.addPassword("admin123");
        test.info("Clicking login button");
        loginpage.clickLoginButton();
        test.info("Checking homepage");
        homepage.clickTimeLink();
        test.info("All steps completed");
    }
}
