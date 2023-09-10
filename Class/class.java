
public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.roll = 15;
        s.name = "Munna";
        s.cgpa = 3.95f;

        System.out.println(s.roll);
        System.out.println(s.name);
        System.out.println(s.cgpa);

    }
}


class Student{
    int roll;
    String name;
    float cgpa;
};


/* Class : Class is a template of an object unlike physical. Class creates a data type that you can use to create object.
Class is just a logical constructor */

/* Object: Object is an  instance of a class, when you declare an object of a class you are creating an instance of a class.
Object occupies space in memory unlike class */


// Primitives: int, float, char are stored in stack memory
// Object: Objects are stored in (heap memory)
// Reference: References are stored in (stack memory)
// final (keyword): Always assign while declaring
