/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author aditi
 */
public class TestMain {
    
    public static boolean PasswordPatternCorrect(String passWord){

    String regex3 = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[$&*#])"
                       + "(?=\\S+$).{6,20}$"; 
    Pattern p =Pattern.compile(regex3);
    Matcher m = p.matcher(passWord);
    return m.matches();
   
}
    public static void main(String[] args) {
        System.out.println(PasswordPatternCorrect("Abc@201"));
    }
    
}
