package solid.Student;

public class Score {
    public String name;
    public float score;

    public Score(String name, float score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public static void generateRaport(Student student) {
        if (student.getScores().size()>0) {
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
        if (n>0) {
            for (Score score : student.getScores()) {
                s+=score.getScore();
            }
            return s / n;
        } else {
            return 0;
        }
    }
}
