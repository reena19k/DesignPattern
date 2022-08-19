package com.aurionpro.model;

public class Employee {
	public int id;
	public String name;
	public IRole role;

	public Employee(int id, String name, IRole role) {
		this.id = id;
		this.name = name;
		this.role = role;
	}

	public void Promote(IRole newRole) {
		role = newRole;
	}

	public String getDescription() {
		return role.description();
	}

	public String getResponsibilitty() {
		return role.responsibility();
	}

	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", name=" + name + ", role=" + role + '}';
	}
}
