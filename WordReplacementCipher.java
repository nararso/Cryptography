//CSCI 11913
//PROJECT 2
//AUTHOR: NEGI ARARS0


public class WordReplacementCipher extends BaseCipher {
    private String wordReplaceFrom;
    private String wordReplaceTo;

    public WordReplacementCipher(String wordReplaceFrom, String wordReplaceTo) {
        super("WordReplacementCipher");
        this.wordReplaceFrom = wordReplaceFrom;
        this.wordReplaceTo = wordReplaceTo;
    }


    /** Takes in two string parameters and replaces them*/
    @Override
    public String encrypt(String input) {
        String value = input.toLowerCase();
        return value.replace(wordReplaceFrom, wordReplaceTo);
    }

    /** Returns a string after applying the word replacement*/
    @Override
    public String decrypt(String input) {
        String value = input.toLowerCase();
        return value.replace(wordReplaceTo, wordReplaceFrom);
    }

    /** Returns a string that matches the described object*/
    @Override
    public String toString() {
        return "WordReplacementCipher(" + this.wordReplaceFrom + ", " + this.wordReplaceTo + ")";
    }


    /** Returns a boolean true if it passes the WordReplacementTest */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        } else if (other == null) {
            return false;
        } else if (other instanceof WordReplacementCipher) {
            WordReplacementCipher cipher = (WordReplacementCipher) other;
            return (cipher.wordReplaceFrom.equals(this.wordReplaceFrom) && (cipher.wordReplaceTo.equals(this.wordReplaceTo)));
        } else {
            return false;
        }
    }
}
