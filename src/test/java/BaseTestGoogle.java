import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Configuration;
public class BaseTestGoogle {

    @BeforeAll

    public static void setConfigurationGoogle(){
        Configuration.baseUrl =  "https://www.google.ru/";
        Configuration.browser = "chrome";
        Configuration.screenshots = false;
        Configuration.savePageSource = false;

    }

}
