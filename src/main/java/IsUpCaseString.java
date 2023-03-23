import jdk.jfr.Description;

import java.util.regex.Matcher;


public class IsUpCaseString extends TypeSafeMatcher<String> {

    public void describeTo(Description description) {
        description.appendText("a up case string");
    }

    @Factory
    public static Matcher<String> isAUpCaseString() {
        return new IsUpCaseString();
    }

    @Override
    protected boolean matchesSafely(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLowerCase(string.charAt(i))) {
                return false
            }
        } 
        return true;
    }
}
