package solid.Student;

public class StudentRaportGenerator implements RaportGenerator {
    @Override
    public void generateRaport(Student student) {
        if (student.getScores().size() > 0) {
            System.out.println("Oceny studenta: " + student.getName());
            for (Score score : student.getScores()) {
                System.out.println(score.getName() + " : " + score.getScore());
            }
        } else {
            System.out.println("Brak ocen dla: " + student.getName());
        }
    }

    public static float calculateAverage(Student student) {
        int n = student.getScores().size();
        float s = 0;
        if (n > 0) {
            for (Score score : student.getScores()) {
                s += score.getScore();
            }
            return s / n;
        } else {
            return 0;
        }
    }
}
