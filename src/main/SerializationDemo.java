package main;

import model.Address;
import model.Employee;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.*;

public class SerializationDemo {

	public static void main(String[] args) throws Exception {

		List<String> skills = new ArrayList<>(List.of("Java", "Spring Boot", "Angular"));

		Set<String> roles = new LinkedHashSet<>(List.of("Developer", "Reviewer"));

		Map<Integer, String> projects = new LinkedHashMap<>();

		projects.put(101, "Banking");
		projects.put(102, "Insurance");
		projects.put(103, "Mortgage");

		Address address = new Address("Hyderabad", "Telangana");

		Employee employee = new Employee(101, "Viswanath", LocalDate.of(2024, 1, 15), skills, roles, projects, address);

		System.out.println("===== BEFORE SERIALIZATION =====");
		System.out.println(employee);

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"));

		oos.writeObject(employee);

		oos.close();

		System.out.println("\nEmployee Serialized Successfully");
	}
}