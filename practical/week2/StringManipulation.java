package mypackage;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Java Programming";
        System.out.println(text.substring(5));
        System.out.println(text.replace("Java", "Python"));
        System.out.println(text.indexOf("g"));
        System.out.println(text.lastIndexOf("a"));
	}

}
