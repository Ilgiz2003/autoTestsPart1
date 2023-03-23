import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class MatcherTest {

    @BeforeAll
    static void login(){
        Data data = new Data();
        LoginPageObject loginPageObject = new LoginPageObject();
        open(data.url);

        loginPageObject.getTelephoneField()
                .setValue(data.telephone)
                .shouldBe(Condition.value(data.telephone));

        loginPageObject.getPasswordField()
                .setValue(data.password)
                .shouldBe(Condition.value(data.password));

        loginPageObject.getButtonInput().click();
    }

    @Test
    public void isMyName() {
        ProfilePageObject profilePageObject = new ProfilePageObject();
        assertThat(profilePageObject.getAccountName().toString(),containsString("Ильгиз"));
    }

    @Test
    public void countMessages(){
        ProfilePageObject profilePageObject = new ProfilePageObject();
        assertThat(profilePageObject.getAccountName().toString(),stringContainsInOrder(Arrays.asList("Дусеев", "Ильгиз")));
    }

}
