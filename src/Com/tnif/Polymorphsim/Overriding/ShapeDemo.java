package Com.tnif.Polymorphsim.Overriding;

public class ShapeDemo {

    public static void main(String[] args) {

        int num = 121;
        String text = "madam";

        System.out.println("Is number palindrome? " + isPalindrome(num));
        System.out.println("Is string palindrome? " + isPalindrome(text));
    }

    // Check whether number is Palindrome or not
    public static boolean isPalindrome(int number) {
        int rev = 0;
        int dummyNumber = number;

        while (number != 0) {
            rev = rev * 10 + number % 10;
            number /= 10;
        }
        return dummyNumber == rev;
    }

    // Check whether string is Palindrome or not
    public static boolean isPalindrome(String str) {
        String rev = new StringBuffer(str).reverse().toString();
        return str.equals(rev);
    }
}

	
	



