public class Show {
	String movieName,dateTime;
	String[] seatNums;
	Patron[] bookedSeats;
	Show(String mName,String datetime,String[] seats) {
       this.movieName = mName;
       this.dateTime = datetime;
       this.seatNums = seats;
       this.bookedSeats = new Patron[seats.length];
	}
	public String toString() {
		return movieName+","+dateTime;
	}

}