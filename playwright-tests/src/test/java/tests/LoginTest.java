package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginSuccessTest() {
        LoginPage loginpage = new LoginPage(page);
        HomePage homepage = new HomePage(page);

        page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        loginpage.addUsername("Admin");
        loginpage.addPassword("admin123");
        loginpage.clickLoginButton();
        homepage.clickTimeLink();
    }
}
