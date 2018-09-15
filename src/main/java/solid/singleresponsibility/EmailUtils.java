package solid.singleresponsibility;

import java.util.regex.Pattern;

public class EmailUtils {
    public static final Pattern EMAIL_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    static boolean validateEmail(String email) {
        return EMAIL_REGEX.matcher(email).find();
    }
}
