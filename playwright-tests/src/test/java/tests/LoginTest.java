package tests;

import org.testng.annotations.Test;

import base.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void test() {
        page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        page.getByPlaceholder("Username").click();
        page.getByPlaceholder("Username").fill("Admin");
        page.getByPlaceholder("Username").press("Tab");
        page.getByPlaceholder("Password").fill("admin123");
        page.getByPlaceholder("Password").press("Enter");
  }
}
