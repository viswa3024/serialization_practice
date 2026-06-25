package main;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import model.Employee;

public class DeserializationDemo {

	public static void main(String[] args) throws Exception {
		
		Employee.company = "Infosys";

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"));

		Employee emp = (Employee) ois.readObject();

		ois.close();

		System.out.println(emp);
	}
}