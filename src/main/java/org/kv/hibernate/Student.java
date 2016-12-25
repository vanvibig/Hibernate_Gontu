package org.kv.hibernate;


import javax.persistence.*;
import java.util.Date;

/**
 * Created by KV on 24/12/2016.
 */

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue
	private int student_id;

	private String student_name;

	@ManyToOne(cascade = CascadeType.ALL)
	private StudentAddress studentAddress;

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public StudentAddress getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(StudentAddress studentAddress) {
		this.studentAddress = studentAddress;
	}
}
