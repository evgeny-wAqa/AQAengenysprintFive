package pageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;

public class TopicPage {

    private static final SelenideElement buttonResources = $(By.xpath(" //button[contains(text(),'Resources')]"));
    private static final ElementsCollection exploreByTopic = $$x("//a[contains(@href,'/resources/articles')]//span");


    public void pushButtonResourses() {
        buttonResources.shouldBe(visible).click() ;
    }

        public List<String> getExploreByTopicNames () {
            return exploreByTopic.texts();

        }

    }

