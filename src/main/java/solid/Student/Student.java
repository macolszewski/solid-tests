package solid.Student;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int age;
    private String name;
    private String email;
    private List<Score> scores = new ArrayList<>();

    public Student(String name, int age, String email) throws NullStudentException {
        if (new StudentAgeValidator().checkAge(age) && EmailUtils.validateEmail(email)) {
            this.age = age;
            this.name = name;
            this.email = email;
        } else {
            throw new NullStudentException("Niepoprawne dane!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (EmailUtils.validateEmail(email)) {
            this.email = email;
        }
    }

    public List<Score> getScores() {
        return scores;
    }

    public void addScores(Score score) {
        this.scores.add(score);
    }
}
