package com.objectDep.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//no source code

@Component
public class Appointment {
	
	private int AppointmentNo;
	private String doctorName;
	
	
	private Patient patient;
	public int getAppointmentNo() {
		return AppointmentNo;
	}
	public void setAppointmentNo(int appointmentNo) {
		AppointmentNo = appointmentNo;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	@Override
	public String toString() {
		return "Appointment [AppointmentNo=" + AppointmentNo + ", doctorName=" + doctorName + ", patient=" + patient
				+ "]";
	}
	
}
