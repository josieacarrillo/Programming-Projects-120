import java.io.*;
import java.util.*;

public class CaesarTester {

  public static String encrypt(String message, int rotation) {
    String newMessage = new String();
    for ( int i = 0; i < message.length(); i ++){

      if(message.charAt(i) >= 'A' && message.charAt(i) <= 'Z' || message.charAt(i) >= 'a' && message.charAt(i) <= 'z'){
        char newChar = message.charAt(i);
        newChar = (char) (newChar + rotation);
        newMessage = newMessage + newChar;
        //add on the letter to the newstring
          }
         else {
          newMessage = newMessage + message.charAt(i);
          //add the number to the new message string
        }
      }

   return newMessage;
  }

  public static void main(String[] args){
    String str1 = new String("wow18");
    String str2 = new String();
    str2 = encrypt(str1,2);

    if( (str1.equals("yqy18")) ){
      System.out.println("String is encrypted");
      System.out.println("Test Passed!!");
    }

    if ( str2.equals("tmt18") ){
      System.out.println("rotation must be in opp direction! go back to encrypt method to check how rotation is implemented");
      System.out.println("Test Failed!!!!");
    }
    else {
      System.out.println(" Test Failed!!!!!!!!!!");
      System.out.println(str2);
    }
  }

}
