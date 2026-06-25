package model;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;                 // private
    private String name;            // normal instance variable
    private String value; 

    private transient String password;

    public static String company = "TCS";

    private final String country;

	public Employee(int id, String name, String password, String country) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", value=" + value + ", password=" + password + ", country="
				+ country + "]";
	}


}