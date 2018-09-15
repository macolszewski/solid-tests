package solid;

import solid.Student.NullStudentException;
import solid.Student.Score;
import solid.Student.Student;
import solid.Student.StudentRaportGenerator;

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



        new StudentRaportGenerator().generateRaport(student);
        System.out.println("Średnia ocen: " + String.valueOf(StudentRaportGenerator.calculateAverage(student)));
        new StudentRaportGenerator().generateRaport(student2);



    }
}
