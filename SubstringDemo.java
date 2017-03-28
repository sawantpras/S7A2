public class SubstringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// store string in s variable
		String s = "My name is Prashant";

		// by using substring function we find string from begin index to end
		// index
		String s1 = s.substring(2,7);

		// here we used isempty method to display whether substring having
		// something or not

		if (s1.isEmpty()) {

			System.out.println("Substring is not found : ");
		}

		else {
			// for displaying substring we used touppercase method of string
			// class
			System.out.println("Substring is found : " + s1.toUpperCase());
		}

	}

}
