package main;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import model.Employee;

public class SerializationDemo {

    public static void main(String[] args) throws Exception {

		Employee emp = new Employee(101, "John", "secret123", "India");

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"));

        oos.writeObject(emp);

        oos.close();

        System.out.println("Serialized");
    }
}