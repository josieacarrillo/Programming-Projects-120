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
   if(rotation > 26){
     rotation = rotation%26;
   }
   if(rotation < 0){
     rotation = (rotation%26) + 26;
   }
   for ( int i = 0; i < message.length(); i ++){

     if(message.charAt(i).isletter()){
       char ch = message.charAt(i);
       char c = (char) (ch - (26-rotation));
       newMessage += c;
       //add on the letter to the newstring
         }
        else {
         newMessage += message.charAt(i);
         //add the number to the new message string
       }
     }

  return newMessage;
 }

 public static String decrypt(String message, int rotation) {
   String newMessage = "";
   if(rotation > 26){
     rotation = rotation%26;
   }
   if(rotation < 0){
     rotation = (rotation%26) + 26;
   }
   for ( int i = 0; i < message.length(); i ++){

     if(message.charAt(i).isletter()){
       char ch = message.charAt(i);
       char c = (char) (ch + (26-rotation));
       newMessage += c;
       //add on the letter to the newstring
         }
        else {
         newMessage += message.charAt(i);
         //add the number to the new message string
       }
     }
  return newMessage;
}

 public static String encryptTwo(String message, int rotation) {

   for ( int i = 0; i < message.length(); i ++){
     char newChar = message.charAt(i);
     if(newChar.isletter()){
       message.append(newChar);

       //add on the letter to the newstring
         }
        else {
         message.append(newChar));
       }
     }
  return ;
 }

 public static String decryptTwo(String message, int rotation) {
   StringBuilder newMessage = new StringBuilder(message.length());
   for ( int i = 0; i < message.length(); i ++){
     char ch = message.charAt(i);

     if(ch.isletter()){


       //add on the letter to the newstring
         }
        else {
         message.append(ch);
         //add the number to the new message string
       }
     }
  return "";
 }

}
