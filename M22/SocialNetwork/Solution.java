import java.util.Scanner;
class Solution {
	private static List<User> userDetails;
	Solution() {

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SocialNetwork data = new SocialNetwork();
		while(scan.hasNext()) {
			String line = scan.nextLine();
			if (line.contains(" is connected to ")) {
				String[] tokens = line.split(" is connected to ");
				String[] items = tokens[1].replace(".","").split(", ");
				User userObj = new User(tokens[0]);
				for (int i = 0; i < items.length; i++) {
					userObj.addConnection(items[i]);
				}
				data.addUser(userObj);
			} else {
				String[] input = line.split(" ", 2);
				switch(input[0]) {
					case "addConnections":
						String[] connection = input[1].split(" ");
						data.addConnection(connection[0], connection[1]);
						break;
					case "getConnections":
					System.out.println(data.getConnection(input[1]));
						break;
					case "CommonConnections":
						String[] people = input[1].split(" ");
						data.getcommonConnections(people[0], people[1]);
						break;
					case "Network":
						data.showAll();
					default: break;
				}
			}
		}
	}
}