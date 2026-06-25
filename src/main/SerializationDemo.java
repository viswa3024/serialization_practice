package main;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import model.Employee;

public class SerializationDemo {

	public static void main(String[] args) throws Exception {

		Employee employee = new Employee(101, "John", "secret123");

		System.out.println("Before Serialization");
		System.out.println(employee);

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"));

		oos.writeObject(employee);

		oos.close();

		System.out.println("\nObject Serialized Successfully");
	}
}