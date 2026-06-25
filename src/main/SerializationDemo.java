package main;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import model.Employee;

public class SerializationDemo {

    public static void main(String[] args) throws Exception {

        Employee emp = new Employee(101, "John");

        FileOutputStream fos = new FileOutputStream("employee.ser");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(emp);

        oos.close();

        System.out.println("Object Serialized");
    }
}