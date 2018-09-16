package solid;

import solid.dependencyinversion.Board4x4;
import solid.dependencyinversion.CustomBoard;
import solid.dependencyinversion.Game;
import solid.interfacesegregation.PlayerAPIImp;
import solid.interfacesegregation.exercise.PizzaHutMobileApp;
import solid.interfacesegregation.exercise.PizzaHutRestaurant;
import solid.interfacesegregation.exercise.PizzaHutTakeaway;
import solid.liskovsubstitution.AutomaticGearCar;
import solid.liskovsubstitution.GearType;
import solid.liskovsubstitution.ManualGearCar;
import solid.openclosed.Circle;
import solid.openclosed.GraphicEditor;
import solid.openclosed.Square;
import solid.openclosed.Triangle;
import solid.singleresponsibility.*;

import javax.swing.*;
import java.awt.*;


public class App {
    public static void main(String[] args) throws EmailException, AgeException {

//        ________________Single Responsibility_________________

//        Student student = new Student("Janusz Kowalski", 46, "Janko@wp.pl");
//        Student student2 = new Student("Janusz Stefanowicz", 21, "js@stefan.pl");
//
//        student.addScores(new Score("Programowanie komputerów", 3.4f));
//        student.addScores(new Score("Januszowanie", 4.2f));
//        student.addScores(new Score("Systemy operacyjne", 2.2f));
//        student.addScores(new Score("Progamowanie wizualne", 1));
//
//        StudentRaportGenerator studentRaportGenerator = new StudentRaportGenerator();
//
//        studentRaportGenerator.generateRaport(student);
//        System.out.println("Średnia ocen: " + String.valueOf(studentRaportGenerator.calculateAverage(student)));
//        studentRaportGenerator.generateRaport(student2);

//        ______________________Opened / Colsed___________________

//        Circle circle = new Circle();
//        Square square = new Square();
//        Triangle triangle = new Triangle();
//
//        GraphicEditor graphicEditor = new GraphicEditor();
//
//        graphicEditor.build(circle);
//        graphicEditor.build(square);
//        graphicEditor.build(triangle);


//        ______________________Liskov Substitution___________________


//        AutomaticGearCar automaticGearCar = new AutomaticGearCar();
//        ManualGearCar manualGearCar = new ManualGearCar();
//
//        for (GearType gearType : GearType.values()) {
//            manualGearCar.changeGear(gearType);
//            automaticGearCar.changeGear(gearType);
//        }


//        ______________________Interface Segregation___________________


//        PlayerAPIImp playerAPIImp = new PlayerAPIImp();
//        playerAPIImp.play();
//        playerAPIImp.pause();
//
//        EXERCISE:

//        PizzaHutTakeaway pizzaHutTakeaway = new PizzaHutTakeaway();
//        pizzaHutTakeaway.takeawayPizza();
//        pizzaHutTakeaway.acceptOnlineOrder();
//        pizzaHutTakeaway.payInPerson();
//        pizzaHutTakeaway.payOnline();
//        pizzaHutTakeaway.takeTelephoneOrder();
//        pizzaHutTakeaway.walkInCustomerOrder();
//
//        PizzaHutMobileApp pizzaHutMobileApp = new PizzaHutMobileApp();
//        pizzaHutMobileApp.acceptOnlineOrder();
//        pizzaHutMobileApp.payOnline();
//
//        PizzaHutRestaurant pizzaHutRestaurant = new PizzaHutRestaurant();
//        pizzaHutRestaurant.payInPerson();
//        pizzaHutRestaurant.walkInCustomerOrder();

//        ______________________Dependency Inversion___________________

        Board4x4 board4x4 = new Board4x4();
        Game game = new Game(board4x4);
        game.drawBoard();
        game.setBoard(new CustomBoard(8));
        game.drawBoard();
        game.setBoard(new CustomBoard(3));
        game.drawBoard();

    }
}
