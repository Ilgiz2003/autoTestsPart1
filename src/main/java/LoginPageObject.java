import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPageObject {

    public SelenideElement getTelephoneField() {
        return $x("//div[@class='it_w']//input[@name='st.email']");
    }

    public SelenideElement getPasswordField() {
        return $x("//div[@class='it_w']//input[@id='field_password']");
    }

    public SelenideElement getButtonInput() {
        return $x("//div[@class='login-form-actions']//input[@value='Войти в Одноклассники']");
    }

}
