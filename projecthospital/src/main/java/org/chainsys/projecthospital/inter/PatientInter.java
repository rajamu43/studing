package org.chainsys.projecthospital.inter;

import java.sql.SQLException;
import java.util.List;

import org.chainsys.projecthospital.model.Doctorpojo;
import org.chainsys.projecthospital.model.Patientpojo;
import org.chainsys.projecthospital.model.Registrationpojo;

public interface PatientInter {
	
	
	public void userprofile(Patientpojo p)throws ClassNotFoundException, SQLException,Exception;
	
	public boolean login (int id,String password)throws ClassNotFoundException, SQLException;
	public int updateProfile(Patientpojo m) throws ClassNotFoundException, SQLException;
	public int removeProfile(Patientpojo m)throws ClassNotFoundException, SQLException;
	public boolean pidcheck(int id,int crid)throws ClassNotFoundException, SQLException;
	public int applyappointment(Patientpojo m)throws ClassNotFoundException, SQLException;
	public List<Patientpojo> listofappointmentapp()throws ClassNotFoundException,SQLException;
	public int billdetails(Registrationpojo r)throws ClassNotFoundException,SQLException; 
	public int paymentBill(Registrationpojo r,int bno)throws ClassNotFoundException,SQLException;
	public void listofprescription()throws ClassNotFoundException,SQLException;

}
