//CSCI 11913
//PROJECT 2
//AUTHOR: NEGI ARARS0


public class EvenOddCipher extends BaseCipher {
    public EvenOddCipher() {
        super("EvenOddCipher");
    }


    /**
     * Returns a string after applying the even odd cipher to the input
     * */
    @Override
    public String encrypt(String input) {
        String value = input.toLowerCase();
        char[] c = new char[value.length()];
        int y = 0;
        for (int i = 0; i < value.length(); i = i + 2) {
            c[y++] = value.charAt(i);
        }
        for (int i = 1; i < value.length(); i = i + 2) {
            c[y++] = value.charAt(i);
        }
        String encrypted = "";
        for (int i = 0; i < c.length; i++) {
            encrypted += c[i];
        }
        return encrypted;
    }


    /** Returns a string after reversing the even odd cipher to the input*/
    @Override
    public String decrypt(String input) {
        String value = input.toLowerCase();
        char[] c = new char[value.length()];
        int y = 0;
        for (int i = 0; i < value.length(); i = i + 2) {
            c[i] = value.charAt(y++);
        }
        for (int i = 1; i < value.length(); i = i + 2) {
            c[i] = value.charAt(y++);
        }
        String decrypted = "";
        for (int i = 0; i < c.length; i++) {
            decrypted += c[i];
        }
        return decrypted;
    }


    /** Returns the matching string*/
    @Override
    public String toString() {
        return "EvenOddCipher";
    }


    /** This returns boolean true if it passes EvenOddCipher*/
    @Override
    public boolean equals(Object other) {
        return other instanceof EvenOddCipher;
    }
}
