package solid.Student;

public class EmailUtils {

    static boolean validateEmail(String email) {
        if (email.endsWith(".pl")) {
            return true;
        } else {
            return false;
        }
    }
}
