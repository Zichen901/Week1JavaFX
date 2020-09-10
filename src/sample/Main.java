package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
        //let's create a first vehicles object
        Vehicles newVehicle = new Vehicles();
        newVehicle.setName("Honda Civic");
        newVehicle.setBuiltYear(2018);


        Vehicles secondVehicles = new Vehicles("Mazda 5", 2006);
        System.out.println("My first new vehicle's name is: "+newVehicle.getName());

        //call method to change name for a vehicles instance
        //changeVehicle("Volkwagen Golf", newVehicle);
        newVehicle.changeVehicles("Volkswagen Golf", 2007);
        System.out.println("My second new vehicle's name is: "+newVehicle.getName());
        System.out.println("My second new vehicle's built year is: "+newVehicle.getBuiltYear());

        Car myFirstCar = new Car();
        myFirstCar.setName("Mercedes A-Class");
        myFirstCar.setBuiltYear(2020);
        myFirstCar.setMileage(30.2);

        System.out.println("My third new vehicle's name is: "+myFirstCar.getName());
        System.out.println("My third new vehicle's built year is: "+myFirstCar.getBuiltYear());

        Vehicles fourthvehicle = new Vehicles();
        fourthvehicle.methodThatusesarray();

        Vehicles[] arrayOfVehicles = new Vehicles[2];
        arrayOfVehicles[0] = newVehicle;
        arrayOfVehicles[1] = secondVehicles;
        for (int i = 0; i<arrayOfVehicles.length; i++){
            System.out.println(arrayOfVehicles[i].getName());
        }

        //other data types that can hold lists of objects
        ArrayList<Vehicles> arrayListofVehicles = new ArrayList<Vehicles>();

        arrayListofVehicles.add(newVehicle);
        arrayListofVehicles.add(secondVehicles);

        //losts of program code here

        arrayListofVehicles.add(new Vehicles("Porche",2016));

        // more sophisticated way to get the number of objects in a arraylist.
        for (int i = 0; i<arrayListofVehicles.size(); i++){
            System.out.println(arrayListofVehicles.get(i).getBuiltYear());
        }
    }
}
