//CSCI 11913
//PROJECT 2
//AUTHOR: NEGI ARARS0


public class EncryptUtils {

    /** This takes a BaseCipher variable and array of string then
     *returns the encrypted array of string
     * */
    public static String[] encryptMany(BaseCipher cipher, String[] strings) {
        String[] encrypted = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            encrypted[i] = cipher.encrypt(strings[i]);
        }
        return encrypted;
    }


    /** This takes a BaseCipher variable and array of string then
     *returns the decrypted array of string
     * */
    public static String[] decryptMany(BaseCipher cipher, String[] strings){
        String[] decrypted = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            decrypted[i] = cipher.decrypt(strings[i]);
        }
        return decrypted;
    }
}
