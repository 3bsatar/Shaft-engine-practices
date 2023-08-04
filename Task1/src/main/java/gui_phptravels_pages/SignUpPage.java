
package gui_phptravels_pages;

        import com.shaft.gui.element.ElementActions;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.python.antlr.ast.Str;

public class SignUpPage {
    private WebDriver driver;

    // Constructor
    public SignUpPage(WebDriver driver){
        this.driver=driver;
    }

    // Element Locators
    private By firstName_textfield=By.name("firstname");
    private By lastName_textfield=By.name("lastname");
    private By phone_textfield=By.name("phone");
    private By email_textfield=By.name("email");
    private By password_textfield=By.name("password");

    private By confirmPassword_textfield=By.name("confirmpassword");

    private By signUp_button=By.xpath("button[contains(.,'Sign Up')]");



    // Actions
    public void userSignUp(String firstName, String lastName,String phone,String email,String password){
        new ElementActions(driver)
        .type(firstName_textfield,firstName)
        .type(lastName_textfield,lastName)
        .type(phone_textfield,phone)
        .type(email_textfield,email)
        .type(password_textfield,password)
        .type(confirmPassword_textfield,password)
        .click(signUp_button);

    }
}
