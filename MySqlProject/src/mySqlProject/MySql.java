package mySqlProject;
import java.sql.*;
public class MySql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
				try{ Class.forName("com.mysql.jdbc.Driver");
								Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee"
										+ "","root","Choti@2403");
								Statement st=con.createStatement();
								ResultSet rs=st.executeQuery("select * from employee_info");
								while(rs.next())
								{
								System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
								}
								}
								catch(Exception e)
								{
								System.out.println(e.toString());}
			
	}

}
