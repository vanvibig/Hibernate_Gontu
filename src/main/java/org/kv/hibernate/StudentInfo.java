package org.kv.hibernate;


import javax.persistence.*;
import java.util.Date;

/**
 * Created by KV on 24/12/2016.
 */

@Entity
@Table(name = "student_infomation")
public class StudentInfo {

	@Id
	@GeneratedValue
	private int rollNo;

	@Column(name = "full_name", nullable = false)
	private String name;

	@Temporal(TemporalType.DATE)
	private Date birthDate;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
