package org.kv.hibernate;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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

	@ManyToMany(cascade = CascadeType.ALL)
	private Set<StudentCertification> studentCertifications =
			new HashSet<StudentCertification>(0);

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

	public Set<StudentCertification> getStudentCertifications() {
		return studentCertifications;
	}

	public void setStudentCertifications(Set<StudentCertification> studentCertifications) {
		this.studentCertifications = studentCertifications;
	}
}
