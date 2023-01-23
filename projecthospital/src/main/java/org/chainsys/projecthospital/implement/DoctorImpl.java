package org.chainsys.projecthospital.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.chainsys.projecthospital.connection.Connecting;
import org.chainsys.projecthospital.inter.Doctorinter;
import org.chainsys.projecthospital.model.Doctorpojo;
import org.chainsys.projecthospital.model.Patientpojo;

public class DoctorImpl implements Doctorinter {

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
		if((regid==id)&&(pword.equals(password))&&(role1.equals("doctor")))
			
			return true;
		else

		return false;
	}

	public void userprofile(Doctorpojo d) throws ClassNotFoundException, SQLException {
		
		Connection con=Connecting.getconnected();
		String addprofile="insert into doctorprofile(regid,doctorid,doctorname,gender,age,address,mailid,mobileNo,specialization)values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(addprofile);
		
		ps.setInt(1, d.getRegistid());
		ps.setInt(2, d.getDoctortid());
		ps.setString(3, d.getDoctorName());
		ps.setString(4, d.getGender());
        ps.setInt(5, d.getAge());
        ps.setString(6, d.getAddress());
        ps.setString(7, d.getMail());
        ps.setString(8, d.getMnumber());
        ps.setString(9,d.getSpecialization());
        
        int row=ps.executeUpdate();
        System.out.println("****profile added****");
		

		
	}

	public void listofdoctors() throws ClassNotFoundException,SQLException {
		Connection con=Connecting.getconnected();
		String adduser = "select regid,doctorid,doctorname,gender,age,address,mailid,mobileNo,specialization from doctorprofile";
		PreparedStatement ps = con.prepareStatement(adduser);
        int rid1,did1,age1;
        String dname,gender,address1,mailid,mno,special;
		

		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			rid1=rs.getInt(1);
			did1=rs.getInt(2);
			dname=rs.getString(3);
			gender=rs.getString(4);
			age1=rs.getInt(5);
			address1=rs.getString(6);
			mailid=rs.getString(7);
			mno=rs.getString(8);
			special=rs.getString(9);
	//		System.out.println("Regid "+rid1+"\t"+"Doctorid"+did1+"\t"+"Doctorname"+dname+"\t"+"Gender"+gender+"\t"+"mailid"+mailid+"\t"+"Mobileno"+mno+"\t"+"Specialization"+special);
			ArrayList list = new ArrayList(); 
            list.add(rid1);
            list.add(did1);
            list.add(dname);
            list.add(gender);
            list.add(age1);
            list.add(address1);
            list.add(mailid);
            list.add(mno);
            list.add(special);
//			d1.setRegistid(rid1);
//			d1.setDoctortid(did1);
//			d1.setDoctorName(dname);
//			d1.setGender(gender);
//			d1.setAge(age1);
//			d1.setAddress(address1);
//			d1.setMail(mailid);
//			d1.setMnumber(mno);
//			d1.setSpecialization(special);

			//list.add(d1);
    		System.out.println(list);

	    }
	
	}

	public int updateProfile(Doctorpojo m) throws ClassNotFoundException, SQLException {
		Connection con=Connecting.getconnected();

		Integer row=null;

		String query="update doctorprofile set doctorname=? where doctorid=?";
		PreparedStatement ps = con.prepareStatement(query);
		int uid=m.getDoctortid();
		String name=m.getDoctorName();
        ps.setInt(2, uid);
		ps.setString(1,name);
		  row=ps.executeUpdate();
		return row;
	}

	public int removeProfile(Doctorpojo m) throws ClassNotFoundException, SQLException {
		Connection con=Connecting.getconnected();
		Integer row=null;
		String query="delete from doctorprofile where doctorid=?";
		PreparedStatement ps = con.prepareStatement(query);
		int uid=m.getDoctortid();
		
		ps.setInt(1, uid);
		  row=ps.executeUpdate();
		return row;
	}

	public int giveAppointment(Doctorpojo d) throws ClassNotFoundException, SQLException {
		Connection con=Connecting.getconnected();
		String addprofile="insert into appointmentdetails1(appointmentno,appointmentreqno,doctorid,patientid,appointmentdate,appointmenttime,status)values(?,?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(addprofile);
		
		ps.setInt(1, d.getAno());
		ps.setInt(2, d.getArno());
		ps.setInt(3, d.getDoctortid());
		ps.setInt(4, d.getPid());
        ps.setString(5, d.getAdate());
        ps.setString(6, d.getAtime());
        ps.setString(7, d.getStatus());
      
        
        int row=ps.executeUpdate();
        System.out.println("**appointment added**");
		
		return row;
	}

	public int prescriptionsDetail(Doctorpojo pd) throws ClassNotFoundException, SQLException {
		Connection con=Connecting.getconnected();
		String pre="insert into prescriptiondetails1(precriptionno,appointmentno,doctorid,precription,qty)values(?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(pre);
		ps.setInt(1, pd.getPreno());
		ps.setInt(2, pd.getAno());
		ps.setInt(3, pd.getDoctortid());
		ps.setString(4, pd.getPrecription());
		ps.setInt(5, pd.getQty());
		int row=ps.executeUpdate();
		System.out.println("***prescription filled***");
		return row;
	}

	public boolean didcheck(int id, int crid) throws ClassNotFoundException, SQLException {
		Connection con=Connecting.getconnected();
		Doctorpojo p=new Doctorpojo();
		int pid=0,regid1=0;
		String check="select regid,doctorid from doctorprofile where regid=?";
		PreparedStatement ps1=con.prepareStatement(check);
		ps1.setInt(1, id);
		ResultSet rs1=ps1.executeQuery();
		while(rs1.next()) {
			regid1=rs1.getInt("regid");
			pid=rs1.getInt("doctorid");
		}
		if((regid1==id)&&(pid==crid))
		
			return true;
		else
		return false;
	}

	public void listofappointment(Doctorpojo pd) throws ClassNotFoundException, SQLException {
		Connection con=Connecting.getconnected();
		String app = "select appointmentno,appointmentreqno,doctorid,patientid,appointmentdate,appointmenttime,status from appointmentdetails1";
		PreparedStatement ps = con.prepareStatement(app);		
		int ano,arno,did11,pid11;
		String adate1,atime1,status;
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			ano=rs.getInt(1);
			arno=rs.getInt(2);
			did11=rs.getInt(3);
			pid11=rs.getInt(4);
			adate1=rs.getString(5);
			atime1=rs.getString(6);
			status=rs.getString(7);
			ArrayList list=new ArrayList();
			list.add(ano);
			list.add(arno);
			list.add(did11);
			list.add(pid11);
			list.add(adate1);
			list.add(atime1);
			list.add(status);
			System.out.println(list);
		}
	}



	
}
