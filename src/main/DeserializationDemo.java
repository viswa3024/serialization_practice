package main;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import model.Employee;

public class DeserializationDemo {

	public static void main(String[] args) throws Exception {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"));

		Employee employee = (Employee) ois.readObject();

		ois.close();

		System.out.println("After Deserialization");
		System.out.println(employee);
	}
}