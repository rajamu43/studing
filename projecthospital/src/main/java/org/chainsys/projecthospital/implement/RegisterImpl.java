package org.chainsys.projecthospital.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sql.ConnectionEvent;
import javax.sql.ConnectionPoolDataSource;

import org.chainsys.projecthospital.connection.Connecting;
import org.chainsys.projecthospital.inter.Registrationinter;
import org.chainsys.projecthospital.model.Patientpojo;
import org.chainsys.projecthospital.model.Registrationpojo;
import org.chainsys.projecthospital.validation.Validation;

public class RegisterImpl implements Registrationinter {

	public void userRegister(Registrationpojo regist) throws ClassNotFoundException, SQLException,Exception {
		
		Connection con=Connecting.getconnected();
		Validation val=new Validation();
		String adduser = "insert into registration(registrationid,registname,password,catogories)values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(adduser);
		
		
		ps.setInt(1, regist.getRegid());
	    ps.setString(2, regist.getName());
	    ps.setString(3, regist.getPassword());
		ps.setString(4, regist.getCatogories());
		
		
		int rows = ps.executeUpdate();
		System.out.println("Registration Sucessfull.....");


		
	}
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
	public void userprofile(Registrationpojo p) throws ClassNotFoundException, SQLException, Exception {
		Connection con=Connecting.getconnected();
		Validation val=new Validation();

		String addprofile="insert into adminprofile(regid,adminid,adminname,gender,age,address,mailid,mobileNo)values(?,?,?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(addprofile);
		
		
		   ps.setInt(1, p.getRegistid());
	       ps.setInt(2, p.getAdminid());
		   ps.setString(3, p.getAdminName());
	       ps.setString(4, p.getGender());
           ps.setInt(5, p.getAge());
	       ps.setString(6, p.getAddress());
	       ps.setString(7, p.getMail());
           ps.setString(8, p.getMnumber());
        
        int row=ps.executeUpdate();
        System.out.println("Profile Created.....");
		
	}
	public int updateProfile(Registrationpojo m) throws ClassNotFoundException, SQLException {
		Connection con=Connecting.getconnected();

		Integer row=null;

		String query="update adminprofile set adminname=? where adminid=?";
		PreparedStatement ps = con.prepareStatement(query);
		int uid=m.getAdminid();
		String name=m.getAdminName();
        ps.setInt(2, uid);
		ps.setString(1,name);
		  row=ps.executeUpdate();
		
		return row;
	}
	public int removeProfile(Registrationpojo m) throws ClassNotFoundException, SQLException {
		Connection con=Connecting.getconnected();
		Integer row=null;
		String query="delete from adminprofile where adminid=?";
		PreparedStatement ps = con.prepareStatement(query);
		int uid=m.getAdminid();
		
		ps.setInt(1, uid);
		  row=ps.executeUpdate();
		return row;
	}
	public int billAmount(Registrationpojo m) throws ClassNotFoundException, SQLException {
		Connection con=Connecting.getconnected();
		Integer row=null;
		int amt=m.getDfees()+m.getMfees();
		int gst=amt+(amt*12)/100;
		m.setAmount(gst);
		String bill="insert into billamount(billno,patientid,appointmentno,doctorfees,medicinefees,payamount)values(?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(bill);
		
		ps.setInt(1, m.getBillno());
		ps.setInt(2, m.getPid());
		ps.setInt(3, m.getApno());
		ps.setInt(4, m.getDfees());
		ps.setInt(5, m.getMfees());
		ps.setInt(6, m.getAmount());
		row=ps.executeUpdate();
	    System.out.println("Bill Created.....");
		
		return row;
	}
	public int paymentdetails(Registrationpojo p) throws ClassNotFoundException, SQLException {
		Connection con=Connecting.getconnected();
		String bill = "insert into paymentdetails(billno,paymentmode,cardorupino,amount)values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(bill);
		ps.setInt(1, p.getBillno());
		ps.setString(2, p.getPaymode());
		ps.setLong(3, p.getPayno());
		ps.setInt(4, p.getAmount());
		int row=ps.executeUpdate();
		System.out.println("Bill paid......");
		return row;
	}
	public int checkPayment(Registrationpojo p) throws ClassNotFoundException, SQLException {
		Connection con=Connecting.getconnected();
		String check="select billno,paymentmode,cardorupino,amount from paymentdetails";
		PreparedStatement ps=con.prepareStatement(check);
		Integer bno,amt;
		Long cuno;
		String pmode;
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			bno=rs.getInt(1);
			pmode=rs.getString(2);
			cuno=rs.getLong(3);
			amt=rs.getInt(4);
			ArrayList list1=new ArrayList();
			list1.add(bno);
			list1.add(pmode);
			list1.add(cuno);
			list1.add(amt);
			System.out.println(list1);
		}
		
		return 0;
	}
	public int updatePayment(Registrationpojo p) throws ClassNotFoundException, SQLException {
		Connection con=Connecting.getconnected();

		String approve="update billamount set paymentstatus='paid' where billno=?";
		PreparedStatement ps1=con.prepareStatement(approve);
		int bill=p.getBillno();
		ps1.setInt(1, bill);
		int row=ps1.executeUpdate();
		System.out.println("Update Suceesfull.....");
		return row;
	}
    
	

	
}
