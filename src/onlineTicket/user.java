package onlineTicket;


import java.util.Date;

public class user {
		private String name;
	    long userid;
	    private String password;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public  long getUserid() {
			return userid;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
}

/*class  Admin extends user{
	private void addRecord(){
		
	}
	private void updteRecords(){
		
	}
	private void deleterecords(){
		
	}
}*/

class customer extends user{
	private String email;
	private String phoneno;
	
	public void register(){
		
	}
	public void login(){
		
	}
	
	public void logout(){
		
	}
	public void bookticket(){
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
}

class theater{
	private long theaterid;
	private String tname;
	private String taddress;
	private String city;
	private int charges;
	private int seats;
	private String tphoneno;
	public long getTheaterid() {
		return theaterid;
	}
	public void setTheaterid(long theatreid) {
		this.theaterid = theatreid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTaddress() {
		return taddress;
	}
	public void setTaddress(String taddress) {
		this.taddress = taddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getCharges() {
		return charges;
	}
	public void setCharges(int charges) {
		this.charges = charges;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public String getTphoneno() {
		return tphoneno;
	}
	public void setTphoneno(String tphoneno) {
		this.tphoneno = tphoneno;
	}
	
	
}

class ticket{
	long ticketid;
	private String moviename;
	private String theatername;
	private String username;
	private String date;
	private String time;
	private String seats;
	private int amount;
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getTheatername() {
		return theatername;
	}
	public void setTheatername(String theatername) {
		this.theatername = theatername;
	}
	public void setUserid(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getTicketid() {
		return ticketid;
	}
	public void setTicketid(long ticketid) {
		this.ticketid = ticketid;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getSeats() {
		return seats;
	}
	public void setSeats(String seats) {
		this.seats = seats;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
}



class movie{
		long mid;
		private String name;
		private String releasedate;
		private String duration;
		private String director;		//Director:Cast
		private String cast;
		private String synopsis;
		private String genre;
		public long getMid() {
			return mid;
		}
		public void setMid(long mid) {
			this.mid = mid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getReleasedate() {
			return releasedate;
		}
		public String getDirector() {
			return director;
		}
		public void setDirector(String director) {
			this.director = director;
		}
		public String getCast() {
			return cast;
		}
		public void setCast(String cast) {
			this.cast = cast;
		}
		public void setReleasedate(String releasedate) {
			this.releasedate = releasedate;
		}
		public String getDuration() {
			return duration;
		}
		public void setDuration(String duration) {
			this.duration = duration;
		}
		
		public String getSynopsis() {
			return synopsis;
		}
		public void setSynopsis(String synopsis) {
			this.synopsis = synopsis;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
}
		

