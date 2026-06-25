package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	private final int id;
	private final String name;

	private final LocalDate joiningDate;

	private final List<String> skills;

	private final Set<String> roles;

	private final Map<Integer, String> projects;

	private final Address address;

	public Employee(int id, String name, LocalDate joiningDate, List<String> skills, Set<String> roles,
			Map<Integer, String> projects, Address address) {

		this.id = id;
		this.name = name;
		this.joiningDate = joiningDate;

		// Immutable + preserves order
		this.skills = Collections.unmodifiableList(new ArrayList<>(skills));

		this.roles = Collections.unmodifiableSet(new LinkedHashSet<>(roles));

		this.projects = Collections.unmodifiableMap(new LinkedHashMap<>(projects));

		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee{" + "\nid=" + id + ", \nname='" + name + '\'' + ", \njoiningDate=" + joiningDate
				+ ", \nskills=" + skills + ", \nroles=" + roles + ", \nprojects=" + projects + ", \naddress=" + address
				+ "\n}";
	}
}