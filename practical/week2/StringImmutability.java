package mypackage;

public class StringImmutability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "Hello";
        String modified = original.concat(" World");
        System.out.println(original);
        System.out.println(modified);
	}

}
