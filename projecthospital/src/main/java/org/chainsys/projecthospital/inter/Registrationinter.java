package org.chainsys.projecthospital.inter;

import java.sql.SQLException;

import org.chainsys.projecthospital.model.Patientpojo;
import org.chainsys.projecthospital.model.Registrationpojo;

public interface Registrationinter {

	public void userRegister(Registrationpojo regist) throws ClassNotFoundException, SQLException,Exception ;
	public void userprofile(Registrationpojo p)throws ClassNotFoundException, SQLException,Exception;
	public boolean login (int id,String password)throws ClassNotFoundException, SQLException;
	public int updateProfile(Registrationpojo m) throws ClassNotFoundException, SQLException;
	public int removeProfile(Registrationpojo m)throws ClassNotFoundException, SQLException;
	public int billAmount(Registrationpojo m)throws ClassNotFoundException, SQLException;
    public int paymentdetails(Registrationpojo p)throws ClassNotFoundException, SQLException;
    public int checkPayment(Registrationpojo p)throws ClassNotFoundException, SQLException;
    public int updatePayment(Registrationpojo p)throws ClassNotFoundException, SQLException;


	
}
