/*
Palindrome implemented in Java.
Author: Marcel P
 */
public class Palindrome {

    public static void isPalindrome(String str) {
        String lowerStr = new String(str);
        String lowerStrToCompare = lowerStr.toLowerCase();
        System.out.println(lowerStrToCompare.equals(new StringBuilder(lowerStrToCompare).reverse().toString()));
    }

    public static void main(String[] args) {
        isPalindrome("Ala");
    }
}
