package pageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class GitHub {

    private static final SelenideElement userNameorEmailInput = $(By.id("login_field"));
    private static final SelenideElement userPasswordInput = $(By.id("password"));
    private static final SelenideElement signUpButton = $(By.xpath( "//input[@value='Sign in']"));
    private static final SelenideElement happyPathAuth = $(By.xpath("//a[@href='/new']"));
    private static final SelenideElement invalidCredError = $(By.xpath("//div[contains(text(),'Incorrect username or password.')]") );

    public void authOperation (String login,String password){
        setuserNameorEmail();
        setuserPassword();
        pushsignUpButton();

    }
    public void setuserNameorEmail (String username){
        userNameorEmailInput.shouldBe(visible).setValue(username);}
    public void setuserPassword (String password){

        userPasswordInput.shouldBe(visible).setValue(password);
    }
    public void pushsignUpButton() {
        signUpButton.shouldBe(visible).click();
    }
    public void succesfullAuth(){
        happyPathAuth.shouldBe(visible);

    }
     public void isErrorMessageDisplayed (){
        invalidCredError.shouldBe(visible);
     }



}

