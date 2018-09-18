class foodLog {
	private String name;
	private String quantity;
	private String date;
	private String time;
	foodLog() { }
	foodLog(String name1, String quantity1, String date1, String time1) {
		this.name = name1;
		this.quantity = quantity1;
		this.date = date1;
		this.time = time1;
	}
	public String getFoodname() {
		return this.name;
	}
	public String getQuantity() {
		return this.quantity;
	}
	public String getDate() {
		return this.date;
	}
	public String getTime() {
		return this.time;
	}
}
class WaterLog {
	private String waterQuantity;
	private String waterDate;
	private String waterTime;
	WaterLog() { }
	WaterLog(String quantity3, String date3, String time3) {
		this.waterQuantity = quantity3;
		this.waterDate = date3;
		this.waterTime = time3;
	}
	public String getwaterQuantity() {
		return this.waterQuantity;
	}
	public String getwaterDate() {
		return this.waterDate;
	}
	public String getwaterTime() {
		return this.waterTime;
	}
}
