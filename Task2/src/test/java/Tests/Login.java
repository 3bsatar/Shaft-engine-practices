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
public class Login {
    @Test
    public void login(){
        SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://developers.facebook.com/docs/development/build-and-test/test-users");

        driver.element().click(By.xpath("//a[text()='Log In' and @class='_p47 lfloat _1k5h']"));

        driver.element().type(By.xpath("//input[@type='text' and @name='email']"),"test001@test.com");

        driver.element().type(By.xpath("//input[@type='password' and @name='pass']"),"$$Mahmoud123$$");

        driver.element().click(By.xpath("//button[@type='submit' and @name='login']"));

    }
}
