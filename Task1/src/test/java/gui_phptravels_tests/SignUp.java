package gui_phptravels_tests;

import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import javax.swing.text.Element;

public class SignUp {

    @Test
    public void userSignUp() {
        WebDriver driver= DriverFactory.getDriver();
        BrowserActions.nevigateToURL(driver,"https://phptravels.com");

        // make sure xpath for element 1 of 1
        ElementActions.click(driver, By.xpath("//a[contains(.,'My Account')]"));

        ElementActions.click(driver, By.xpath("//a[contains(.,'Sign Up')and contains(@class,'dropdown')]"));

        ElementActions.type(driver, By.name("firstname"),"Mahmoud");
        ElementActions.type(driver, By.name("lastname"),"Mesalem");
        ElementActions.type(driver, By.name("phone"),"123456789");
        ElementActions.type(driver, By.name("email"),"test001@test.com");
        ElementActions.type(driver, By.name("password"),"12345678");
        ElementActions.type(driver, By.name("confirmpassword"),"12345678");
        ElementActions.click(driver, By.xpath("button[contains(.,'Sign Up')]"));

        Assertions.assertEquals("Hi, Mahmoud Mesalem",ElementActions.getText(driver,By.xpath("//h3[contains(.,'Hi, ')]")));

        Assertions.assertElementAttribute(driver,By.xpath("//h3[contains(.,'Hi, ')]"),ElementAttributeType.TEXT,"Hi, Mahmoud Mesalem");
    }
}
