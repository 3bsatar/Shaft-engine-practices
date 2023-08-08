package gui_phptravels_tests;
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
        SHAFT.GUI.WebDriver driver=new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://demo.nopcommerce.com/");

        driver.element().type(By.id("small-searchterms"),"laptop");

        driver.element().click(By.xpath("//button[contains(.,'Search')]"));

        driver.element().click(By.xpath("//img[@src='https://demo.nopcommerce.com/images/thumbs/0000031_lenovo-thinkpad-x1-carbon-laptop_415.jpeg']"));

        driver.element().click(By.xpath("//button[contains(.,'Email a friend')]"));

        driver.element().type(By.id("FriendEmail"),"zeyadnagi2@gmail.com");

        driver.element().type(By.id("YourEmailAddress"),"mahmoudmesalem@paymob.com");

        driver.element().type(By.xpath("//*[@id=\"PersonalMessage\"]"),"Done!");

        driver.element().click(By.xpath("//button[contains(.,'Send email')]"));
    }
}
