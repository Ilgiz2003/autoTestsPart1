import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoginTest {
    @Test
    public void loginTest() {
        Data data = new Data();
        LoginPageObject loginPageObject = new LoginPageObject();
        ProfilePageObject profilePageObject = new ProfilePageObject();
        open(data.url);

        loginPageObject.getTelephoneField()
                .setValue(data.telephone)
                .shouldBe(Condition.value(data.telephone));

        loginPageObject.getPasswordField()
                .setValue(data.password)
                .shouldBe(Condition.value(data.password));

        loginPageObject.getButtonInput().click();

        profilePageObject.getAccountName().shouldBe(Condition.visible);
    }
}
