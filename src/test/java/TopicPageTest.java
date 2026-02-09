import com.codeborne.selenide.Selenide;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pageObject.TopicPage;

import java.util.Collection;
import java.util.List;


import static org.assertj.core.api.Assertions.assertThat;

public class TopicPageTest extends BaseTest {

    @ParameterizedTest(name = "значение Topics")
    @ValueSource(strings = { "AI","DevOps","Security", "Software Development", "View all topics" } )


    public void topicsShouldContainExpectedValues(String expectedTopic) {
        TopicPage topicPage = new TopicPage();
        Selenide.open("https://github.com/");
        topicPage.pushButtonResourses();
        List<String> topics = topicPage.getExploreByTopicNames();
        assertThat(topics).contains(expectedTopic);






    }


}