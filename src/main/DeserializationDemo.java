package main;

import model.Employee;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws Exception {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"));

		Employee employee = (Employee) ois.readObject();

		ois.close();

		System.out.println("===== AFTER DESERIALIZATION =====");
		System.out.println(employee);
	}
}