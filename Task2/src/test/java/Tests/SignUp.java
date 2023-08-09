package Tests;
import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;
import com.shaft.driver.SHAFT;
public class SignUp {

    @Test

    public void userSignUp() {
        SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://developers.facebook.com/docs/development/build-and-test/test-users");

        driver.element().click(By.xpath("//*[@id=\"documentation_primary_nav_pagelet\"]/div/div/ul/li[1]/a"));

        driver.element().click(By.xpath("//a[@href='https://developers.facebook.com/async/registration']"));

        driver.element().click(By.xpath("//a[@class='_42ft _4jy0 _16jx _4jy6 _4jy2 selected _51sy']"));

        driver.element().type(By.xpath("//input[@type='text' and @class='inputtext _58mg _5dba _2ph-' and @name='firstname']"),"Mahmoud");

        driver.element().type(By.xpath("//input[@type='text' and @class='inputtext _58mg _5dba _2ph-' and @name='lastname']"),"Mesalem");

        driver.element().type(By.xpath("//input[@type='text' and @class='inputtext _58mg _5dba _2ph-' and @name='reg_email__']"),"test001@test.com");

        driver.element().type(By.xpath("//input[@type='text' and @class='inputtext _58mg _5dba _2ph-' and @name='reg_email_confirmation__']"),"test001@test.com");

        driver.element().type(By.xpath("//input[@type='password' and @name='reg_passwd__']"),"$$Mahmoud123$$");

        driver.element().select(By.xpath("//select[@id='day' and @name='birthday_day' and @aria-label='Day']"),"29");

        driver.element().select(By.xpath("//select[@id='month' and @name='birthday_month' and @aria-label='Month']"),"Mar");

        driver.element().select(By.xpath("//select[@id='year' and @name='birthday_year' and @aria-label='Year']"),"2003");

        driver.element().click(By.xpath("//button[contains(.,'Sign Up')and @name='websubmit']"));
    }
}
