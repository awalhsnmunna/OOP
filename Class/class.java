import java.util.*;
public class Main {
    public static void main(String[] args) {
        Student munna = new Student(13,"Munna",3.85f);
        System.out.println(munna.roll);
        System.out.println(munna.name);
        System.out.println(munna.marks);
    }
}


// Primitives: int, float, char are stored in stack memory
// objects: objects are stored in heap memory
// final (keyword): always assign while declaring


class Student{
    int roll;
    String name;
    float marks;


    // Create constructor
    Student(int roll, String name, float marks){
        this.roll = roll;
        this.name = "name";
        this.marks = marks;
    } // constructor is called automatically

