package main;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import model.Employee;

public class DeserializationDemo {

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("employee.ser");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Employee emp = (Employee) ois.readObject();

        ois.close();

        System.out.println(emp);
    }
}