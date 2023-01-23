package org.chainsys.projecthospital.inter;

import java.sql.SQLException;
import java.util.List;
import org.chainsys.projecthospital.model.Doctorpojo;
import org.chainsys.projecthospital.model.Patientpojo;

public interface Doctorinter {
	
	public void userprofile(Doctorpojo d)throws ClassNotFoundException, SQLException;
	public int updateProfile(Doctorpojo m) throws ClassNotFoundException, SQLException;
	public int removeProfile(Doctorpojo m)throws ClassNotFoundException, SQLException;
    public int giveAppointment(Doctorpojo d)throws ClassNotFoundException, SQLException;
    public int prescriptionsDetail(Doctorpojo pd)throws ClassNotFoundException, SQLException;
	public boolean login (int id,String password)throws ClassNotFoundException, SQLException;
	public void listofdoctors()throws ClassNotFoundException,SQLException;
	public boolean didcheck(int id,int crid)throws ClassNotFoundException, SQLException;
	public void listofappointment(Doctorpojo pd)throws ClassNotFoundException, SQLException;
	
}
