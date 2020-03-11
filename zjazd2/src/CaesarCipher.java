/*
Simple Caesar cipher implemented in Java.
Author: Marcel
*/
public class CaesarCipher {

    public static StringBuffer cipher(String text, int shift) {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char) (((int) text.charAt(i) + shift - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) text.charAt(i) + shift - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String text = "Marcel Pankanin";
        int shift = 3;
        System.out.println("Cipher: " + cipher(text, shift));
    }
}
