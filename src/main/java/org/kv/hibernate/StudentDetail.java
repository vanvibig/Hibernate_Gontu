package org.kv.hibernate;

import org.hibernate.annotations.*;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by KV on 25/12/2016.
 */

@Entity
@Table(name = "student_detail")
public class StudentDetail {

	@Id
	@GeneratedValue(generator = "newGenerator")
	@GenericGenerator(name = "newGenerator", strategy = "foreign",
	parameters = {
			@Parameter(value = "student", name = "property")
	})
	private int student_id;

	private String student_mobile_number;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id")
	private Student student;

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_mobile_number() {
		return student_mobile_number;
	}

	public void setStudent_mobile_number(String student_mobile_number) {
		this.student_mobile_number = student_mobile_number;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
