package onlineTicket;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.*;
//import com.mysql.jdbc.PreparedStatement;

class database{
	
	Connection conn=null;
	String username = "root";
	String pwd = "minions123";
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost:3306/project";
	
	public database() {
		try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, username, pwd);
           
        } catch(ClassNotFoundException | SQLException exc1){
            exc1.printStackTrace();
        }
	}
	
public boolean validateadmin(String adminname, String password) throws SQLException{
	boolean status=false; 
	 try {
        PreparedStatement ps = conn.prepareStatement("select * from user where name=? and password=?");  
		 ps.setString(1,adminname);  
		 ps.setString(2,password); 
		 ResultSet rs=ps.executeQuery();  
		 status=rs.next();  
		           
		 }catch(Exception e){System.out.println(e);}
	 	finally
		{
			conn.close();
		}
		 return status; 
	
}
		
public boolean validateuser(String username, String password) throws SQLException{
		 boolean status=false; 
		 try {
	         PreparedStatement ps = conn.prepareStatement("select * from customer where name=? and password=?;");  
			 ps.setString(1,username);  
			 ps.setString(2,password); 
			 ResultSet rs=ps.executeQuery();  
			 status=rs.next();  
			           
			 }catch(Exception e){System.out.println(e);}
		 	finally
			{
				conn.close();
			}
			 return status; 
		
	}

public boolean addadmin(user temp) throws SQLException{
	 
    boolean status=false;
    Statement ls=null;
    PreparedStatement ps=null;
	System.out.println("In Addadmin");
  try
	{
  	System.out.println("In Addadmin try");
  	ls=conn.createStatement();
  	String sql="create table if not exists admin (name varchar(30) not null, password varchar(15) not null);";
  	ls.execute(sql);
  	ps=conn.prepareStatement("insert into customers values(?,?);");
	ps.setString(1,temp.getName());
	ps.setString(2,temp.getPassword());
	
	
	if(ps.executeUpdate()==1)
		status=true;
	else
		status=false;
}
catch(Exception e){e.printStackTrace();}
finally
{
	conn.close();
}
return status;
}
	 
public boolean adduser(customer user) throws SQLException{
		 
		    boolean status=false;
		    Statement ls=null;
		    PreparedStatement ps=null;
			System.out.println("In Adduser");
		  try
			{
		  	System.out.println("In Adduser try");
		  	ls=conn.createStatement();
		  	System.out.println(user.getName());
		  	String name = user.getName();
		  	String pass = user.getPassword();
		  	String email = user.getEmail();
		  	String phn = user.getPhoneno();
		  	String sql="create table if not exists customer ( uid bigint(20) auto_increment, name varchar(30) not null, password varchar(15) not null, email varchar(20) not null, phno varchar(15) not null,primary key(uid));";
		  	ls.execute(sql);
		  	ps=conn.prepareStatement("insert into customer (name,password,email,phno) values(?,?,?,?);");
			ps.setString(1,name);
			ps.setString(2,pass);
			ps.setString(3,email);
			ps.setString(4,phn);
			
			
			if(ps.executeUpdate()==1)
				status=true;
			else
				status=false;
		}
		catch(Exception e){e.printStackTrace();}
		finally
		{
			conn.close();
		}
		return status;
	 }
public boolean addmovie(movie temp) throws SQLException{
		 boolean status=false;
		    Statement ls=null;
		    PreparedStatement ps=null;
			System.out.println("In Addmovie");
		  try
			{
		  	System.out.println("In Addmovie try");
		  	ls=conn.createStatement();
		  	String sql="create table if not exists movie(mid bigint(20) auto_increment, name varchar(30) not null, releasedate date, duration varchar(20), people varchar(40), synopsis varchar(200), genre varchar(20), primary key(mid));";
			ls.execute(sql);
		  	ps=conn.prepareStatement("insert into movie (name,releasedate,duration,people,synopsis,genre) values (?,?,?,?,?,?);");
			ps.setString(1,temp.getName());
			ps.setString(2,temp.getReleasedate());
			ps.setString(3,temp.getDuration());
			String people=temp.getDirector() + ':'+ temp.getCast();
			ps.setString(4,people);
			ps.setString(5,temp.getSynopsis());
			ps.setString(6,temp.getGenre());
			
			
			if(ps.executeUpdate()==1)
				status=true;
			else
				status=false;
		}
		catch(Exception e){e.printStackTrace();}
		finally
		{
			conn.close();
		}
		return status;
}
		 

public boolean addtheater(theater temp) throws SQLException{
		 boolean status=false;
		    Statement ls=null;
		    PreparedStatement ps=null;
			System.out.println("In Addtheater");
		  try
			{
		  	System.out.println("In Addtheater try");
		  	ls=conn.createStatement();
		  	String sql="create table if not exists theater( tid bigint(20) not null auto_increment, name varchar(30) not null, address varchar(50) not null, city varchar(20), phno varchar(15) not null, totalseats int,charges int, primary key(tid));";
			ls.execute(sql);
		  	ps=conn.prepareStatement("insert into theater(name,address,city,phno,totalseats,charges) values(?,?,?,?,?,?);");
			ps.setString(1,temp.getTname());
			ps.setString(2,temp.getTaddress());
			ps.setString(3,temp.getCity());
			ps.setString(4,temp.getTphoneno());
			ps.setInt(5,temp.getSeats());
			ps.setInt(6,temp.getCharges());
			
			
			if(ps.executeUpdate()==1)
				status=true;
			else
				status=false;
		}
		catch(Exception e){e.printStackTrace();}
		finally
		{
			conn.close();
		}
		return status;
}
public boolean addticket(ticket temp) throws SQLException{
		 boolean status=false;
		    Statement ls=null;
		    PreparedStatement ps1=null,ps2=null,ps3=null;
			System.out.println("In Addticket");
		  try
			{
		  	System.out.println("In Addticket try");
		  	ls=conn.createStatement();
		  	String sql1="create table if not exists ticket( id bigint(20) not null auto_increment, mid bigint(20), uid bigint(20),tid bigint(20), seats varchar(30), showtime varchar(15), showdate date,amount int);";
			String sql2="select mid from movie where name=?;";
			String sql3="select uid from customer where name=?;";
		  	ls.executeQuery(sql1);
		  	ps1=conn.prepareStatement("insert into ticket(mid,uid,tid,seats,showtime,showdate,amount) values(?,?,?,?,?,?);");
		  	ps2=conn.prepareStatement(sql2);
		  	ps3=conn.prepareStatement(sql3);
		  	ResultSet rs2=ps2.executeQuery();
		  	ResultSet rs3=ps3.executeQuery();
			ps2.setString(1,temp.getMoviename());
			ps3.setString(2,temp.getUsername());
			ps1.setLong(1,rs2.getLong(1));
			ps1.setLong(2,rs3.getLong(1));
			ps1.setString(3,temp.getSeats());
			ps1.setString(4,temp.getTime());
			ps1.setString(5,temp.getDate());
			ps1.setInt(6,temp.getAmount());
			
			
			if(ps1.executeUpdate()==1)
				status=true;
			else
				status=false;
		}
		catch(Exception e){e.printStackTrace();}
		finally
		{
			conn.close();
		}
		return status;
} 
public boolean addshow(show temp) throws SQLException{
		 boolean status=false;
		    Statement ls=null;
		    PreparedStatement ps1=null,ps2=null,ps3=null;
			System.out.println("In Addshow");
		  try
			{
		  	System.out.println("In Addshow try");
		  	ls=conn.createStatement();
		  	String sql1="create table if not exists showlist( tid bigint(20), mid bigint(20), startdate date, enddate date, timings varchar(30));";
		  	String sql2="select tid from theater where name=?;";
		  	
			String sql3="select mid from movie where name=?;";
		  	ls.execute(sql1);
		  	
		  	
		  	System.out.println("0");
		  	ps2=conn.prepareStatement(sql2);
		  	ps3=conn.prepareStatement(sql3);
		  	
		  	ps2.setString(1, temp.getTheatrename());
		  	ps3.setString(1, temp.getMoviename());
		  	System.out.println("1");
		  	ResultSet rs2=ps2.executeQuery();
		  	System.out.println("2");
		  	ResultSet rs3=ps3.executeQuery();
		  	System.out.println("3");
		  	ps1=conn.prepareStatement("insert into showlist values(?,?,?,?,?);");
		  	System.out.println("3");
		/*  	
		  	ps2=conn.prepareStatement(sql2);
		  	ps3=conn.prepareStatement(sql3);
		  	System.out.println("1");
		  	ResultSet rs2=ps2.executeQuery();
		  	System.out.println("2");
		  	ResultSet rs3=ps3.executeQuery(sql3);
		  	System.out.println("3");*/
		  	rs2.next();
		  	rs3.next();
			ps1.setLong(1,rs2.getLong(1));
			ps1.setLong(2,rs3.getLong(1));
			ps1.setString(3,temp.getStart());
			ps1.setString(4,temp.getEnd());
			ps1.setString(5,temp.getTimings());
			
			
			if(ps1.executeUpdate()==1)
				status=true;
			else
				status=false;
		}
		catch(Exception e){e.printStackTrace();}
		finally
		{
			conn.close();
		}
		return status;
} 
	 
	 
	public  ArrayList<movie> getmovielist()throws Exception
		{
			ArrayList<movie> lists=new ArrayList<movie>();
			Statement st=null;
			ResultSet rs=null;
			try
			{
				
				st=conn.createStatement();
				rs=st.executeQuery("select mid,name from movie");
				while(rs.next())
				{
					System.out.println("in movielist while");
					movie temp=new movie();
					temp.setMid(rs.getLong(1));
					temp.setName(rs.getString(2));							
					lists.add(temp);
				}
			}catch(Exception e){System.out.println(e);}
			finally
			{
				try
				{
					conn.close();
				}catch(Exception e){}
			}
			return lists;
		}
	 
	
	public  ArrayList<theater> gettheaterlist()throws Exception
		{
			
			ArrayList<theater> lists=new ArrayList<theater>();
			Statement st=null;
			ResultSet rs=null;
			try
			{
				
				st=conn.createStatement();
				rs=st.executeQuery("select tid,name from theater");
				while(rs.next())
				{
					System.out.println("in theaterlist while");
					theater temp=new theater();
					temp.setTheaterid(rs.getLong(1));
					temp.setTname(rs.getString(2));							
					lists.add(temp);
				}
			}catch(Exception e){System.out.println(e);}
			finally
			{
				try
				{
					conn.close();
				}catch(Exception e){}
			}
			return lists;
		}
	 int moviecount()
	 {
		 int count = 0;
		 String sql = "select count(*) from movie;";
		 Statement st=null;
//		 st=conn.createStatement();
		 
		 return count;
	 }
	 
	 
	public  ArrayList<show> getshows(long id)throws Exception
		{
			
			ArrayList<show> lists=new ArrayList<show>();
			PreparedStatement ps=null;
			ResultSet rs=null;
			try
			{
				
				String sql1="select t.name,s.startdate,s.enddate,s.timings from theater t,showlist s where s.mid=? and t.tid=s.tid;";
			  	ps=conn.prepareStatement(sql1);
			  	ps.setLong(1,id);
			  	rs=ps.executeQuery(sql1);
				while(rs.next())
				{
					show temp=new show();
					temp.setTheatrename(rs.getString(1));
					temp.setStart(rs.getString(2));
					temp.setEnd(rs.getString(3));
					temp.setTimings(rs.getString(4));
					lists.add(temp);
				}
			}catch(Exception e){System.out.println(e);}
			finally
			{
				try
				{
					conn.close();
				}catch(Exception e){}
			}
			return lists;
		}
	 
	
	public  ArrayList<show> getallshows()throws Exception
		{
			
			ArrayList<show> lists=new ArrayList<show>();
			Statement stmt=null;
			ResultSet rs=null;
			try
			{
				
				String sql1=" select t.name,m.name,s.startdate,s.enddate,s.timings from theater t,showlist s,movie m where s.mid=m.mid and t.tid=s.tid;";
			  	stmt=conn.createStatement();
			    rs=stmt.executeQuery(sql1);
				while(rs.next())
				{
					show temp=new show();
					temp.setTheatrename(rs.getString(1));
					temp.setMoviename(rs.getString(2));
					temp.setStart(rs.getString(3));
					temp.setEnd(rs.getString(4));
					temp.setTimings(rs.getString(5));
					lists.add(temp);
				}
			}catch(Exception e){System.out.println(e);}
			finally
			{
				try
				{
					conn.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			return lists;
		}

	public  ArrayList<show> getmovieshows(Long mid)throws Exception
	{
		
			ArrayList<show> lists=new ArrayList<show>();
			PreparedStatement stmt=null;
			ResultSet rs=null;
			try
			{
				
				String sql1=" select t.name,t.address,t.city,s.startdate,s.enddate,s.timings from theater t, showlist  s where s.mid=? and t.tid=s.tid;";
				
			  	stmt=conn.prepareStatement(sql1);
			  	stmt.setLong(1,mid);
			    rs=stmt.executeQuery(sql1);
				while(rs.next())
				{
					show temp=new show();
					temp.setTheatrename(rs.getString(1)+"\n"+rs.getString(2)+","+rs.getString(3)+".");
					//temp.setMoviename(rs.getString(2));
					temp.setStart(rs.getString(4));
					temp.setEnd(rs.getString(5));
					temp.setTimings(rs.getString(6));
					lists.add(temp);
				}
			}catch(Exception e){System.out.println(e);}
			finally
			{
				try
				{
					conn.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			return lists;
		}
	
		 
	public  movie getmovies(long id)throws Exception
		{
			
			//ArrayList lists=new ArrayList();
			PreparedStatement ps=null;
			ResultSet rs=null;
			movie temp=new movie();
			try
			{
				
				String sql1="select mid,name,releasedate,duration,people,synopsis,genre from movie where mid=?;";
			  	ps=conn.prepareStatement(sql1);
			  	ps.setLong(1,id);
			  	rs=ps.executeQuery();
				while(rs.next())
				{
					
					temp.setMid(rs.getLong(1));
					temp.setName(rs.getString(2));
					temp.setReleasedate(rs.getString(3));
					temp.setDuration(rs.getString(4));
					String people=rs.getString(5);
					movie temp1=new movie();
					temp1=parse(people);
					temp.setDirector(temp1.getDirector());
					temp.setCast(temp1.getCast());
					
				}
			}catch(Exception e){System.out.println(e);}
			finally
			{
				try
				{
					conn.close();
				}catch(Exception e){}
			}
			System.out.println(temp.getName());
			return temp;
		}
	 public movie parse(String str){
			//item it=new item();
		 String delims = "[:]+";
		 String tokens[] = str.split(delims);
		 movie temp=new movie();
		 temp.setDirector(tokens[0]);
		 temp.setCast(tokens[1]);
		 return temp;
		 
	 }
}
	
