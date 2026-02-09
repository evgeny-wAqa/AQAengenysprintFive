import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pageObject.SolutionsPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionsPageTest extends BaseTest {


    @Test

    public void succesSolutionPageOperation() {
        SolutionsPage solutionsPage = new SolutionsPage();
        Selenide.open("https://github.com/");
        solutionsPage.solutionPageOperation();
        solutionsPage.userSolutionPageOperation("Evgeny","Rezak");
        assertEquals("Evgeny", SolutionsPage.userFirstNameInput.getAttribute("value"));
        assertEquals("Rezak", SolutionsPage.userLastnameInput.getAttribute("value"));

    }
}

