package com.primitiveDep.annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.objectDep.annotation.Patient;
//source code available
@Component
public class Appointment {
	
	//@Autowired
	private Patient patient;
	
	@Value("${appointmentNo}")
	private int appointmentNo;
	
	@Value("${doctorName}")
	private String doctorName;
	
	
	
	public void setAppointmentNo(int appointmentNo) {
		appointmentNo = appointmentNo;
	}
	
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	@Override
	public String toString() {
		return "Appointment [AppointmentNo=" + appointmentNo + ", doctorName=" + doctorName + ", patient=" + patient
				+ "]";
	}

}
