//CSCI 11913
//PROJECT 2
//AUTHOR: NEGI ARARS0


public class SuperCipher extends BaseCipher {
    private BaseCipher[] baseCiphers;

    public SuperCipher(BaseCipher[] baseCiphers) {
        super("SuperCipher");
        this.baseCiphers = baseCiphers;
    }


    /** Returns a boolean after making sure SuperCipher is valid*/
    @Override
    public boolean isValid() {
        for (BaseCipher b : baseCiphers
        ) {
            if (!(b.isValid())) {
                return false;
            }
        }
        return true;
    }


    /** Returns a string in order after applying each cipher provided for the constructor*/
    @Override
    public String encrypt(String input) {
        String encrypted = input;
        for (BaseCipher b : baseCiphers
        ) {
            encrypted = b.encrypt(encrypted);
        }
        return encrypted;
    }


    /** Returns a string after reversing each cipher provided for the constructor */
    @Override
    public String decrypt(String input) {
        String decrypted = input;
        for (BaseCipher b : baseCiphers
        ) {
            decrypted = b.decrypt(decrypted);
        }
        return decrypted;
    }

    /** Returns a string*/
    @Override
    public String toString() {
        String s = "SuperCipher";
        s += "(" + baseCiphers[0].toString();
        for (int i = 1; i < baseCiphers.length; i++) {
            s += " | " + baseCiphers[i].toString();
        }
        return s + ")";
    }

    /** Returns a boolean after checking the cipher matches*/
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        } else if (other == null) {
            return false;
        }
        if (other instanceof SuperCipher) {
            SuperCipher superCipher = (SuperCipher) other;
            if (this.baseCiphers.length == superCipher.baseCiphers.length) {
                boolean b = false;
                for (int i = 0; i < this.baseCiphers.length; i++) {
                    if (this.baseCiphers[i].equals(superCipher.baseCiphers[i])) {
                        b = true;
                    } else {
                        return false;
                    }
                }
                return b;
            }
        }
        return false;
    }
}
