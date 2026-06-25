package model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String name;

	private transient String password;

	public Employee(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	private void writeObject(ObjectOutputStream out) throws IOException {

		// Serialize normal fields
		out.defaultWriteObject();

		// Custom serialization for transient field
		String encryptedPassword = password + "_ENC";

		out.writeObject(encryptedPassword);
	}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {

		// Deserialize normal fields
		in.defaultReadObject();

		// Read encrypted password
		String encryptedPassword = (String) in.readObject();

		// Decrypt password
		password = encryptedPassword.replace("_ENC", "");
	}

	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", password='" + password + '\'' + '}';
	}
}