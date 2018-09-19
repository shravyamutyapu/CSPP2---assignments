import java.util.*;
class SocialNetwork {
	private List<User> userDetails;

	SocialNetwork() {
		userDetails = new List<User>();

	}
	public void addUser(User user2) {
		userDetails.add(user2);
	}
	// public int getsize() {
	// 	return this.size;
	// }
	public void addConnection(String userA, String userB) {
		for (int i = 0; i < userDetails.size(); i++) {
			if (userA.equals(userDetails.get(i).getusername())) {
				userDetails.get(i).addConnection(userB);
			}
		}
	}
	public String getConnection(String user1) {

		for (int i = 0; i < userDetails.size(); i++) {
			if (user1.equals(userDetails.get(i).getusername())) {
				return userDetails.get(i).toString();
			}
		}
		return "Not a user in Network";
	}
	// public boolean contains(String element) {
	// 	for (int i = 0; i < size; i++) {
	// 		if (element == users[i]) {
	// 			return true;
	// 		}
	// 	}
	// 	return false;
	// }
	public void getcommonConnections(String user11, String user22) {
		List<String> tempOne = new List<String>();
		List<String> tempTwo = new List<String>();
		List<String> result = new List<String>();
		for (int i = 0; i < userDetails.size(); i++) {
			if (user11.equals(userDetails.get(i).getusername())) {
				tempOne = userDetails.get(i).getList();
				break;
			}
		}
		for (int i = 0; i < userDetails.size(); i++) {
			if (user22.equals(userDetails.get(i).getusername())) {
				tempTwo = userDetails.get(i).getList();
				break;
			}
		}
		for (int i = 0; i < tempOne.size(); i++) {
			if (tempTwo.contains(tempOne.get(i))) {
				result.add(tempOne.get(i));
			}
		}
		System.out.println(result);
	}
	public void showAll() {
		String[] userNames1 = new String[userDetails.size()];
		for (int i = 0; i < userDetails.size(); i++) {
			userNames1[i] = userDetails.get(i).toString();
		}
		Arrays.sort(userNames1);
		String str = Arrays.toString(userNames1);
		System.out.println(str.substring(1,str.length()-1));
	}

}

