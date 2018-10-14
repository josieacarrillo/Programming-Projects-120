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
   if (letter >='A' && letter <= 'Z' || letter >= 'a' && letter <= 'z'){
     letter = (char) (letter + rotation);

   }
   else{
     return letter;
   }
  return letter;
 }

 public static String encrypt(String message, int rotation) {
   String newMessage = "";
   if(shift > 26){
     shift = shift%26;
   }
   if(shift < 0){
     shift = (shift%26) + 26;
   }
   for ( int i = 0; i < message.length(); i ++){

     if(message.charAt(i) >= 'A' && message.charAt(i) <= 'Z' || message.charAt(i) >= 'a' && message.charAt(i) <= 'z'){
       char newChar = message.charAt(i);
       ch = (char) (ch + rotation);
       newMessage += + ch;
       //add on the letter to the newstring
         }
        else {
         newMessage += ch;
         //add the number to the new message string
       }
     }

  return newMessage;
 }

 public static String decrypt(String message, int rotation) {
   String newMessage = new String();
   for ( int i = 0; i < message.length(); i ++){

     if(message.charAt(i) >= 'A' && message.charAt(i) <= 'Z' || message.charAt(i) >= 'a' && message.charAt(i) <= 'z'){
       char newChar = message.charAt(i);
       newChar = (char) (newChar - rotation);
       newMessage= newMessage+newChar;
       //add on the letter to the newstring
         }
        else {
         newMessage= newMessage+ message.charAt(i);
         //add the number to the new message string
       }
     }
  return newMessage;
}

 public static String encryptTwo(String message, int rotation) {
   StringBuilder newMessage = new StringBuilder(message.length());
   for ( int i = 0; i < message.length(); i ++){

     if(message.charAt(i) >= 'A' && message.charAt(i) <= 'Z' || message.charAt(i) >= 'a' && message.charAt(i) <= 'z'){
       char newChar = message.charAt(i);
       newChar = (char) (newChar + rotation);
       newMessage.append(newChar);
       //add on the letter to the newstring
         }
        else {
         newMessage.append(message.charAt(i));
       }
     }
  return "";
 }

 public static String decryptTwo(String message, int rotation) {
   StringBuilder newMessage = new StringBuilder(message.length());
   for ( int i = 0; i < message.length(); i ++){

     if(message.charAt(i) >= 'A' && message.charAt(i) <= 'Z' || message.charAt(i) >= 'a' && message.charAt(i) <= 'z'){
       char newChar = message.charAt(i);
       newChar = (char) (newChar - rotation);
       newMessage.append(newChar);
       //add on the letter to the newstring
         }
        else {
         newMessage.append(message.charAt(i));
         //add the number to the new message string
       }
     }
  return "";
 }

}
