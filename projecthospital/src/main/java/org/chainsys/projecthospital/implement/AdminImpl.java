package org.chainsys.projecthospital.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.chainsys.projecthospital.connection.Connecting;
import org.chainsys.projecthospital.inter.Admininter;
import org.chainsys.projecthospital.model.Adminpojo;
import org.chainsys.projecthospital.model.Patientpojo;

public class AdminImpl implements Admininter {
	
	public boolean login(int id, String password) throws ClassNotFoundException, SQLException {
	Connection con=Connecting.getconnected();
        
		int regid=0;
		String pword=null,role1=null;
		String log="select registrationid,password,catogories from registration where registrationid=?";
		PreparedStatement ps=con.prepareStatement(log);
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			regid=rs.getInt("registrationid");
			pword=rs.getString("password");
			role1=rs.getString("catogories");
		}
		if((regid==id)&&(pword.equals(password))&&(role1.equals("admin")))
			
			return true;
		else
		return false;
	}

	public void userprofile(Adminpojo a) throws ClassNotFoundException, SQLException {
		
		Connection con=Connecting.getconnected();
		String addprofile="insert into adminprofile(regid,adminid,adminname,gender,age,address,mailid,mobileNo)values(?,?,?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(addprofile);
		
		ps.setInt(1, a.getRegistid());
		ps.setInt(2, a.getAdminid());
		ps.setString(3, a.getAdminName());
		ps.setString(4, a.getGender());
        ps.setInt(5, a.getAge());
        ps.setString(6, a.getAddress());
        ps.setString(7, a.getMail());
        ps.setString(8, a.getMnumber());
        
        int row=ps.executeUpdate();
        System.out.println("profile added");
		
		
	}



}
