package project1;
import java.sql.*;
public class Mysqlprogram {
	
	public static void select(){
				try
				{ 
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Choti@2403");
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
		static void insert() {
						try{ Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Choti@2403");
						Statement st=con.createStatement();
						st.executeUpdate("insert into employee_info values(5,roshini,ceo,120000,9)");
						con.close();
						}
						catch(Exception e)
						{
						System.out.println(e.getMessage());}
					
					}
		static void update() {
						try{ Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Choti@2403");
						Statement st=con.createStatement();
						st.executeUpdate("update employee_info set posting='program manager' where id=2");
						con.close();
						}
						catch(Exception e)
						{
						System.out.println(e.getMessage());}
						
					}
		static void delete() {
						
						try{ Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Choti@2403");
						String s="delete from employee_info where id=?";
						PreparedStatement ps=con.prepareStatement(s);
						ps.setInt(1,3);
						ps.execute();
						con.close();
						}
						catch(Exception e)
						{
							System.out.println(e.getMessage());}

						} 
	  
		public static void main(String args []) {
					    int a = 4;
						switch(a) {
						case 1:
						   Mysqlprogram.select();
							break;
						case 2:
							Mysqlprogram.insert();
							break;
						case 3:
							Mysqlprogram.update();
							break;
						case 4:
							Mysqlprogram.delete();
							
							break;
						}
						
					}

			}


