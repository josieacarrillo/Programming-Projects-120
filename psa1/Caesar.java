// Keep these two lines.  They are what tell Java to include the
// classes you need for working with files.
// You might get warnings about them at first.  That's OK, just
// ignore the warnings.  They should go away as you complete your code.
import java.io.*;
import java.util.*;

/** Your header comment goes here.
 * Be sure to include your name, cse account name, and the date
 * */
public class Caesar {

 public static char letterOperation(char letter, int rotation) {
  return '0';
 }

 public static String encrypt(String message, int rotation) {
   StringBuilder newMessage = new StringBuilder(message.length());
   for ( int i = 0; i < message.length(); i ++){

     if(message.charAt(i) >= 'A' && message.charAt(i) <= 'Z' || message.charAt(i) >= 'a' && message.charAt(i) <= 'z'){
       char newChar = message.charAt(i) - rotation;
       //add on the letter to the newstring

       else {
         //add the number to the new message string
       }
     }
   }
  return "";
 }

 public static String decrypt(String message, int rotation) {
  return "";
 }

 public static String encryptTwo(String message, int rotation) {
  return "";
 }

 public static String decryptTwo(String message, int rotation) {
  return "";
 }

}
