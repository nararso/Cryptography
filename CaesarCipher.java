//CSCI 11913
//PROJECT 2
//AUTHOR: NEGI ARARS0


public class CaesarCipher extends BaseCipher {
    private int key;

    public CaesarCipher(int key) {
        super("CaesarCipher");
        this.key = key;
    }

    /**
     * If the key is valid this function returns boolean after indicating
     */
    public boolean isValid() {
        return this.key >= 1 && this.key <= 25;
    }

    /**
     * This returns a string of the results
     */
    public String encrypt(String input) {
        input = input.toLowerCase();
        String encrypted = "";

        for (int i = 0; i < input.length(); i++) {
            Character c = input.charAt(i);
            if ((Character.isAlphabetic(c))) {
                int new_c = (int) (c) + this.key;
                if (new_c > 122) {
                    new_c -= 26;
                }

                encrypted += (char) new_c;
            } else {
                encrypted += c;
            }
        }
        return encrypted;
    }

    /**
     * This returns a string of the encrypted results
     */
    public String decrypt(String input) {
        input = input.toLowerCase();
        String decrypted = "";

        for (int i = 0; i < input.length(); i++) {
            Character c = input.charAt(i);
            if ((Character.isAlphabetic(c))) {
                int new_c = (int) (c) - this.key;
                if (new_c < 97) {
                    new_c += 26;
                }

                decrypted += (char) new_c;
            } else {
                decrypted += c;
            }
        }
        return decrypted;
    }

    /**
     * This returns a string in a format match
     */
    public String toString() {
        return "Caesar(" + this.key + ")";
    }

    public boolean equals(CaesarCipher other) {
        if (other == this) {
            return true;
        } else if (other == null){
            return false;
        } else if (other.toString() == this.toString()) {
            return true;
        } else {
            return false;
        }
    }
}
