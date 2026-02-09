package pageObject;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
@Data
public class SolutionsPage {

    private static final SelenideElement buttonSolutions = $(By.xpath(	" //button[contains(text(),'Solutions')]"));
    private static final SelenideElement dropDownList = $(By.xpath("//span[text()='CI/CD']"));
    private static final SelenideElement buttonContSales = $(By.xpath("//a[contains(@href,'ref_loc=hero')][.//text()='Contact sales']"));
    public static final SelenideElement userFirstNameInput = $(By.xpath(".//input[@ name='first_name']"));
    public static final SelenideElement userLastnameInput = $(By.xpath(".//input[@ name='last_name']"));

public void solutionPageOperation() {
    pushButtonSolution();
    pushDropDownList();
    pushButtonContSales();


}
    public void userSolutionPageOperation(String firstname,String lastname){
        setUserFirstName(firstname);
        setUserLastname(lastname);
    }

    public void  pushButtonSolution() {
        buttonSolutions.shouldBe(visible).click();
    }

    public void pushDropDownList() {
        dropDownList.shouldBe(visible).click();
    }

    public void pushButtonContSales () {
        buttonContSales.shouldBe(visible).click();

    }
    public void setUserFirstName(String firstname ){
        userFirstNameInput.shouldBe(visible).setValue(firstname);

        }
    public void setUserLastname (String lastname){
        userLastnameInput.shouldBe(visible).setValue(lastname);
    }

    }

