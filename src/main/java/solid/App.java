package solid;

import solid.Student.NullStudentException;
import solid.Student.Score;
import solid.Student.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NullStudentException
    {

        Student student = new Student("Janusz Kowalski", 46,"Janko@wp.pl");
        Student student2 = new Student("Janusz Stefanowicz", 21,"js@stefan.pl");
//        Student student2 = new Student("Janusz Kowalski", 46,"Jankopl");

        student.addScores(new Score("Programowanie komputerów",3.4f));
        student.addScores(new Score("Januszowanie",4.2f));
        student.addScores(new Score("Systemy operacyjne",2.2f));
        student.addScores(new Score("Progamowanie wizualne",1));



        Score.generateRaport(student);
        System.out.println("Średnia ocen: " + String.valueOf(Score.calculateAverage(student)));
        Score.generateRaport(student2);



    }
}
