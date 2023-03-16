import static com.codeborne.selenide.Selenide.$x;


import com.codeborne.selenide.SelenideElement;

public class ProfilePageObject {

    public SelenideElement getAccountName() {
        return $x("//div[@class='nav-side_i-w']//a[@aria-label='Ильгиз Дусеев']");
    }
}
