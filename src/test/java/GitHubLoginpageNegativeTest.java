import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pageObject.GitHubLoginpage;

public class GitHubLoginpageNegativeTest extends  BaseTest{

    @Test

    public void loginOperationWithBadCredentials(){
        GitHubLoginpage gitHubLoginpage = new GitHubLoginpage();
        Selenide.open("/login");
        gitHubLoginpage.authOperation("testEvgeny","1234567899");
        gitHubLoginpage.isErrorMessageDisplayed();
    }






}
