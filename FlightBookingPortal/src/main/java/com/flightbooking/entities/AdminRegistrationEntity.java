package com.flightbooking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADMINDETAILS")
public class AdminRegistrationEntity {

	@Column(name = "ADMINNAME")
	String ADMINNAME;
	
	@Column(name = "ADMINPSWD")
	String ADMINPSWD;
	
	@Id
	@Column(name = "ADMINEMAIL")
	String ADMINEMAIL;

	public AdminRegistrationEntity() {
		super();
	}
	

	public AdminRegistrationEntity(String aDMINNAME, String aDMINPSWD, String aDMINEMAIL) {
		super();
		ADMINNAME = aDMINNAME;
		ADMINPSWD = aDMINPSWD;
		ADMINEMAIL = aDMINEMAIL;
	}


	public String getADMINNAME() {
		return ADMINNAME;
	}

	public void setADMINNAME(String aDMINNAME) {
		ADMINNAME = aDMINNAME;
	}

	public String getADMINPSWD() {
		return ADMINPSWD;
	}

	public void setADMINPSWD(String aDMINPSWD) {
		ADMINPSWD = aDMINPSWD;
	}

	public String getADMINEMAIL() {
		return ADMINEMAIL;
	}

	public void setADMINEMAIL(String aDMINEMAIL) {
		ADMINEMAIL = aDMINEMAIL;
	}

	@Override
	public String toString() {
		return "AdminRegistrationEntity [ADMINNAME=" + ADMINNAME + ", ADMINPSWD=" + ADMINPSWD + ", ADMINEMAIL="
				+ ADMINEMAIL + "]";
	}
	
	

}
