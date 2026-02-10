package pageObject2;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GooglePage {


        private static final SelenideElement strSearch = $(By.cssSelector("#APjFqb"));
        private static final ElementsCollection resultSearch = $$(By.xpath("//*[@jsaction='click:.CLIENT;mouseover:.CLIENT']"));

        public  void checkSearch(String search) {
            pushStrSearch();
           setStrSearch(search);
           getResultSearch();




        }

        public void pushStrSearch() {
            strSearch.shouldBe(visible).click();
        }

        public void setStrSearch(String search) {
            strSearch.shouldBe(visible).setValue(search);
        }

        public void getResultSearch() {
            resultSearch.shouldHave(sizeGreaterThan(5));
        }


    }



