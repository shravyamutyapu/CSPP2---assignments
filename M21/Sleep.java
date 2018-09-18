class Sleep {
	private String sleepDate;
	private String dateStartTime;
	private String dateEndTime;
	Sleep() { }
	Sleep(String sleepDate1, String dateStartTime1, String dateEndTime1) {
		this.sleepDate = sleepDate1;
		this.dateStartTime = dateStartTime1;
		this.dateEndTime = dateEndTime1;
	}
	public String getsleepDate() {
		return this.sleepDate;
	}
	public String getdateStartTime() {
		return this.dateStartTime;
	}
	public String getdateEndTime() {
		return this.dateEndTime;
	}
}