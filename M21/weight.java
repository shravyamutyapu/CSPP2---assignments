class weight {
	private String weight;
	private String date;
	private String fat;

	weight() { }
	weight(String weight1, String fat1, String date1) {
		this.weight = weight1;
		this.date = date1;
		this.fat = fat1;
	}
	public String getWeight() {
		return this.weight;
	}
	public String getFat() {
		return this.fat;
	}
	public String getDate() {
		return this.date;
	}

}