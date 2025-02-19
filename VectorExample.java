//1. Write a program using Vector to store the list of students details and print the details.


// logic :

import java.util.Vector;

class Student {
    private int id;
    private String name;
    private int age;
    private String department;

    public Student(int id, String name, int age, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Department: " + department);
    }
}

public class VectorExample {
    public static void main(String[] args) {
        Vector<Student> students = new Vector<>();

        // Adding students to the Vector
        students.add(new Student(111, "Akanksha", 22, "CSE"));
        students.add(new Student(112, "Nikita", 21, "AIDS"));
        students.add(new Student(113, "Laxmi", 22, "ENTC"));

        // Displaying student details
        System.out.println("Student Details:");
        for (Student student : students) {
            student.displayDetails();
        }
    }
}


/*

output:

Student Details:
id: 111, name: Akanksha, age: 22, department: CSE
id: 112, name: Nikita, age: 21, department: AIDS
id: 113, name: Laxmi, age: 22, department: ENTC





*/
