/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryptor_or_decryptor;

/**
 *
 * @author Joven
 */
public class Cryptographer {
     private String plaintext = "abcdefghijklmnopqrstuvwxyz1234567890";
    private String ciphertext = "klmnopqrstuvwxyz1234567890abcdefghij";
    
    public String encryptText (String text){
        String out = "";
        char[] enplain = plaintext.toCharArray();
        char[] encip = ciphertext.toCharArray();
        char[] entext = text.toCharArray();
       
        for (char e : entext){
            String ee = String.valueOf(e);
            int eee = 0;
             String y=plaintext;
            if(y.contains(ee)){
               eee = new String(enplain).indexOf(ee);
               out += encip[eee];
            }
        }
        return out;
    }
    public String decryptText (String text){
        String out = "";
        char[] deplain = plaintext.toCharArray();
        char[] decip = ciphertext.toCharArray();
        char[] detext = text.toCharArray();
        for (char d : detext){
            String dd = String.valueOf(d);
            int ddd = 0;
            if(new String(decip).contains(dd)){
               ddd = new String(decip).indexOf(dd);
               out += deplain[ddd];
            }
        }
        return out;
    }
}