public class BookYourShow {

	Show[] allShows;
	int size;

	BookYourShow() {
		allShows = new Show[10];
		size = 0;
	}
	public void addAShow(Show a) {
		allShows[size++] = a;

	}
	public Show getAShow(String moviename, String dattime) {
		for (Show s : allShows) {
			if (s != null) {
				if (s.movieName.equals(moviename) && s.dateTime.equals(dattime)) {
					return s;
				}
			}

		}
		return null;
	}
	public void bookAShow(String moviename, String dattime, Patron p, String[] bookingSeats) {
		if (size == 0) {
			System.out.println("No show");
			return;
		}
		if (getAShow(moviename, dattime) == null) {
			System.out.println("No show");
			return;
		}
		for (Show s : allShows) {
			if (s != null) {
				if (s.movieName.equals(moviename) && s.dateTime.equals(dattime)) {
					for (String seatnum : bookingSeats)	{
						for (int i = 0; i < s.seatNums.length; i++) {
							if (s.seatNums[i].equals(seatnum)) {
								s.seatNums[i] = "N/A";
								s.bookedSeats[i] = p;
							}
						}
					}
				}
			}

		}

	}
	public void showAll() {
		for (Show s : allShows) {
			if (s != null) {
				String res = s.movieName + ",";
				res += s.dateTime + ",[";
				for (int i = 0; i < s.seatNums.length - 1; i++) {
					res += s.seatNums[i] + ",";
				}
				res += s.seatNums[s.seatNums.length - 1] + "]";
				System.out.println(res);
			}
		}
	}
	public void printTicket(String moviename, String dattime, String mobNum) {
		boolean flag = false;
		for (Show s : allShows) {
			if (s != null) {
				if (s.movieName.equals(moviename) && s.dateTime.equals(dattime)) {
					for (int i = 0; i < s.bookedSeats.length; i++) {
						if (s.bookedSeats[i] != null) {
							if (s.bookedSeats[i].mobileNumber.equals(mobNum)) {
								flag = true;
							}
						}
					}
				}
			}
		}

			if (flag) {
				System.out.println(mobNum + " " + moviename + " " + dattime);
			} else {
				System.out.println("Invalid");
			}

	}
}