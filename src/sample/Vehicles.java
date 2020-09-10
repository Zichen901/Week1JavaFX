package sample;

import java.util.Random;

public class Vehicles {
    //field variables should be private - that's called data hiding
    private String name;
    private int builtYear;
    private String owner;
    //private variable of type array that should hold 4 integer numbers
    private int[] arr = new int[4];

    //constructor
    public Vehicles(String n, int y){
        name = n;
        builtYear = y;
    }
    // this is now our empty constructor, so you can have Vehicles newVehicles = new Vehicles (); blank.
    public Vehicles() {

    }

    //methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBuiltYear() {
        return builtYear;
    }

    public void setBuiltYear(int builtYear) {
        this.builtYear = builtYear;
    }

    public void changeVehicles(String newName, int newBuiltYear) {
        this.setName(newName);
        this.builtYear = newBuiltYear;
    }

    public void methodThatusesarray(){
        for (int i = 0; i < 4; i++) {
            //fill elements of array
            Random rand = new Random();
            arr[i] = rand.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            //access elements of an array via index
            System.out.println(arr[i]);
        }
    }
}
