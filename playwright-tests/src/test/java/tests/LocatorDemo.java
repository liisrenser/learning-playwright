package tests;

import java.awt.Checkbox;

import org.testng.annotations.Test;

import base.BaseTest;

public class LocatorDemo extends BaseTest {

    @Test
    public void testAllLocators() {
        page.navigate("https://trytestingthis.netlify.app/");
        page.locator("#fname").fill("Tom");
        page.locator("input[name='lname']").fill("Jerry");
        page.locator("input[value='female']").check();
        page.locator("select#option").selectOption("Option 3");
        page.locator("input[type='checkbox'][value='Option 2']").check();
        page.locator("//input[@type='date']").fill("2026-05-01");
        page.getByText("Click Me").click();
    }
}