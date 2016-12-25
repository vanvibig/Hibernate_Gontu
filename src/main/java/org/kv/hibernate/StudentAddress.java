package org.kv.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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
}
