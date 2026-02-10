import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pageObject2.GooglePage;


public class GoogleTest extends BaseTestGoogle{
    @Test

    public void positiveGoogleTest(){
        GooglePage warningPage = new GooglePage();
        Selenide.open("https://www.google.ru/");
        warningPage.checkSearch("qa");
        warningPage.checkSearch("aqa");
        warningPage.checkSearch("car");

    }



}
