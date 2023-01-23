package org.chainsys.projecthospital.inter;

import java.sql.SQLException;

import org.chainsys.projecthospital.model.Adminpojo;
import org.chainsys.projecthospital.model.Patientpojo;

public interface Admininter {
	
	public void userprofile(Adminpojo a)throws ClassNotFoundException, SQLException;
	public boolean login (int id,String password)throws ClassNotFoundException, SQLException;
	

}
