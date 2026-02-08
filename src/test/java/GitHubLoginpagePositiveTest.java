import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pageObject.GitHubLoginpage;

public class GitHubLoginpagePositiveTest extends  BaseTest{
    @Test
   public void successfulLoginCredentials(){
       GitHubLoginpage gitHubLoginpage = new GitHubLoginpage();
        Selenide.open("/login");
        gitHubLoginpage.authOperation("yrtft41994","Li_20961994");
        gitHubLoginpage.succesfullAuth();


    }


}
