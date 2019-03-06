package org.tms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;




import org.tms.util.DBConstants;
import org.tms.util.DBUtil;


import org.tms.model.Traineecls;
public class Searchtraineeimpl implements Searchtrainee {
	Connection con = null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	public Traineecls search(int userId) {
		
	
	//List<Traineecls> ts= new ArrayList<>();
		Traineecls tr=null;
	
	try {
		con=DBUtil.getConnection(DBConstants.DRIVER, DBConstants.URL, DBConstants.UNAME, DBConstants.PWD);
		pst=con.prepareStatement("select * from users where userId=?");
		pst.setInt(1, userId);		
		rs=pst.executeQuery();
		
		if(rs.next())
		{
			 tr=new Traineecls(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7));
		
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return tr;
}



}
