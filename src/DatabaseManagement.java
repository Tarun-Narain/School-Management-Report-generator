import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class DatabaseManagement {
	public ArrayList<String> Names=new ArrayList<String>();
	
	public void SaveStudents(ArrayList<String> Student)
	{
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");  
			  
			PreparedStatement stmt=con.prepareStatement("insert into StudentsList values(?,?, ?, ?,?,?,?)");  
			int l=1;
			for(String i:Student)
			{
				stmt.setString(l, Student.get(l-1));
				System.out.println(i);
				l++;
			}
			stmt.executeUpdate();  
						  
			con.close();  
			  
			}catch(Exception e)
			{ System.out.println(e);}
		
	}
	public void SaveClass(ArrayList<String> ClassAdder)
	{
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");  
			  
			PreparedStatement stmt=con.prepareStatement("insert into Batch values(?,?, ?, ?,?)");  
			int l=1;
			for(String i:ClassAdder)
			{
				stmt.setString(l, ClassAdder.get(l-1));
				//System.out.println(i);
				l++;
			}
			stmt.executeUpdate();  
						  
			con.close();  
			  
			}catch(Exception e)
			{ System.out.println(e);}
	}
	public ArrayList<String> GetClass()
	{
		ArrayList<String> al=new ArrayList<String>();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "12345");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from Batch");
			while(rs.next())
			{
					al.add(rs.getString(1));	
			}
			}
			catch(Exception e)
			{
			e.printStackTrace();	
			}
		return al;
	}
	public ArrayList<String> GetNames()
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "12345");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from StudentsList");
			while(rs.next())
			{
					Names.add(rs.getString(1));	
			}
			}
			catch(Exception e)
			{
			e.printStackTrace();	
			}
		return Names;
	}
	public ArrayList<String> GetNames(String sub)
	{
		ArrayList<String> Names1=new ArrayList<String>();
		for(String x:Names)
		{
			if(x.toLowerCase().contains(sub.toLowerCase()))
			{
				Names1.add(x);
			}
		}
		return Names1;
	}
	public ArrayList<String> GetValues(String Name)
	{
		ArrayList<String> values=new ArrayList<String>();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "12345");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from StudentsList");
			while(rs.next())
			{
					if(rs.getString(1).equals(Name))
					{
						values.add(Name);
						values.add(rs.getString(2));
						values.add(rs.getString(3));
						values.add(rs.getString(4));
						values.add(rs.getString(5));
						values.add(rs.getString(6));
						values.add(rs.getString(7));
						break;
					}
			}
			}
			catch(Exception e)
			{
			e.printStackTrace();	
			}
		return values;
	}
	public void CDatabase()
	{//Database initialisation on call;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "12345");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from StudentsList");
			Names.clear();
			//Names1.clear();
			while(rs.next())
			{
					Names.add(rs.getString(1));	
			}
			}
			catch(Exception e)
			{
			e.printStackTrace();	
			}
	}
	
	public void SavingEdits(ArrayList<String> info )
	{
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "12345");
			Statement stmt=con.createStatement();
			System.out.println(info.get(0));
			stmt.executeQuery("update StudentsList" + " SET Name = '"+info.get(1)+"' "+" WHERE Name= '"+info.get(0)+"'");
			stmt.executeQuery("update StudentsList" + " SET FNAME = '"+info.get(2)+"' "+" WHERE Name= '"+info.get(0)+"'");
			stmt.executeQuery("update StudentsList" + " SET PNUM1 = '"+info.get(3)+"' "+" WHERE Name= '"+info.get(0)+"'");
			stmt.executeQuery("update StudentsList" + " SET PNUM2 = '"+info.get(4)+"' "+" WHERE Name= '"+info.get(0)+"'");
			stmt.executeQuery("update StudentsList" + " SET EMAIL = '"+info.get(5)+"' "+" WHERE Name= '"+info.get(0)+"'");
			stmt.executeQuery("update StudentsList" + " SET BATCH = '"+info.get(6)+"' "+" WHERE Name= '"+info.get(0)+"'");	
			}
			catch(Exception e)
			{
			e.printStackTrace();	
			}
	}
	}



