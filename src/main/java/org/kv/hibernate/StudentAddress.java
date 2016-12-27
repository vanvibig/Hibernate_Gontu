package org.kv.hibernate;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by KV on 25/12/2016.
 */

@Entity
@Table(name = "student_address")
public class StudentAddress {

	@Id
	@GeneratedValue
	private int address_id;

	private String address_detail;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "studentAddress")
	private Set<Student> students = new HashSet<Student>(0);

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public String getAddress_detail() {
		return address_detail;
	}

	public void setAddress_detail(String address_detail) {
		this.address_detail = address_detail;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
}
