package gui_phptravels_tests;

import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import gui_phptravels_pages.HomePage;
import gui_phptravels_pages.ProfilePage;
import gui_phptravels_pages.SignUpPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test
public class SignUp_POM {
    private WebDriver driver;
    private HomePage homePage;
    private SignUpPage signUpPage;
    private ProfilePage profilePage;
    @BeforeClass
            public void beforeClass() {

        WebDriver driver = DriverFactory.getDriver();
        BrowserActions.nevigateToURL(driver, "https://phptravels.com");

        homePage=new HomePage(driver);
        signUpPage=new SignUpPage(driver);
        profilePage=new ProfilePage(driver);

    }

    @Test
    public void signUp(){
        homePage.navigateToSignUpPage();
        signUpPage.userSignUp("Mahmoud","Mesalem","123456789","test0001@test.com","12345678");

        Assertions.assertEquals("Hi, Mahmoud Mesalem",profilePage.getHiMessageText());

        Assertions.assertElementAttribute(driver,profilePage.getHiMessageLocator(),"Hi, Mahmoud Mesalem");

    }
}
