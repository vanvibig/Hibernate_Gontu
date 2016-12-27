package org.kv.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by KV on 27/12/2016.
 */

@Entity
@Table(name = "student_certification")
public class StudentCertification {

	@Id
	@GeneratedValue
	private int certification_id;

	private String certification_name;

	public int getCertification_id() {
		return certification_id;
	}

	public void setCertification_id(int certification_id) {
		this.certification_id = certification_id;
	}

	public String getCertification_name() {
		return certification_name;
	}

	public void setCertification_name(String certification_name) {
		this.certification_name = certification_name;
	}
}
