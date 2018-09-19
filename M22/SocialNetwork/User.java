import java.util.*;
public class User {
	private String username;
	private List<String> followers;
	// String[] connections;
	// String[] commonConnections;
	User(String username1) {
		this.username = username1;
		followers = new List<String>();
		// this.connections=connections1;
		// this.commonConnections=commonConnections1;
	}
	public String getusername() {
		return this.username;
	}
	public void addConnection(String followers1) {
		followers.add(followers1);
	}
	public List<String> getList() {
		return followers;
	}
	public String toString() {
		String str = this.username + ": " + followers.toString();
		return str;
	}
	public String toString1() {
		String str1 = followers.toString();
		return str1;
}
}