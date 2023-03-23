import org.hamcrest.Factory;
import org.hamcrest.TypeSafeMatcher;


public class IsUpCaseString extends TypeSafeMatcher<String> {

    @Factory
    public static IsUpCaseString isAUpCaseString() {
        return new IsUpCaseString();
    }

    @Override
    protected boolean matchesSafely(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLowerCase(string.charAt(i))) {
                return false;
            }
        } 
        return true;
    }

    @Override
    public void describeTo(org.hamcrest.Description description) {
        description.appendText("a up case string");
    }
}
