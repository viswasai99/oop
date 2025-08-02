package mypackage;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));
	}

}
