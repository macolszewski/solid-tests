package solid.Student;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int age;
    private String name;
    private String email;
    private List<Score> scores = new ArrayList<>();

    public Student(String name, int age, String email) throws EmailException, AgeException {
        this.setEmail(email);
        this.setName(name);
        this.setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException {
        if (new StudentAgeValidator().checkAge(age)) {
            this.age = age;
        } else {
            throw new AgeException("Błędny wiek");
        }
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

    public void setEmail(String email) throws EmailException {
        if (EmailUtils.validateEmail(email)) {
            this.email = email;
        } else {
           throw new EmailException("Błędny adres e-mail");
        }
    }

    public List<Score> getScores() {
        return scores;
    }

    public void addScores(Score score) {
        this.scores.add(score);
    }
}
