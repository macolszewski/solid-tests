package solid.singleresponsibility;

public class StudentAgeValidator implements AgeValidator {
    private static final int MIN_AGE = 18;
    private static final int MAX_AGE = 65;

    @Override
    public boolean checkAge(int ageToValidate) {
        return ageToValidate >= MIN_AGE && ageToValidate <= MAX_AGE;
    }

}