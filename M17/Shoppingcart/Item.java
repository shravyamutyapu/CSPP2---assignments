class Item {
	String name;
	int quantity;
	double price;
	Item(String name, String quantity, String price) {
		this.name = name;
		this.quantity = Integer.parseInt(quantity);
		this.price = Double.parseDouble(price);
	}
	Item(String name, String quantity) {
		this.name = name;
		this.quantity = Integer.parseInt(quantity);
	}
	public String toString() {
		return this.name + " " + this.quantity + " " + this.price;
	}
	public boolean equals(Item given){
		if(this.name.equals(given.name)){
			return true;
		}
			return false;
	}


}