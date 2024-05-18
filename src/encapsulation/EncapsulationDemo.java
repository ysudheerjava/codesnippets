package encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {

		User user1 = new User();

		User user = new User(100, "Ravi", "password");

		System.out.println(user.getUserId());
		System.out.println(user.getUserName());
		System.out.println(user.getPassword());

		System.out.println(user);

		User user2 = new User(200, "Shekhar");

	}

}
