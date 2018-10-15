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
   if (Character.isLetter(letter)){
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
     char ch = message.charAt(i);
     if(Character.isLetter(ch)){

       char c = (char) (ch + rotation);//(ch - (26-rotation));
       newMessage += c;
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
   String newMessage = "";
   if(rotation > 26){
     rotation = rotation%26;
   }
   if(rotation < 0){
     rotation = (rotation%26) + 26;
   }
   for ( int i = 0; i < message.length(); i ++){
     char ch = message.charAt(i);
     if(Character.isLetter(ch)){

       char c = (char) (ch - rotation);//(ch + (26-rotation));
       newMessage += c;
       //add on the letter to the newstring
         }
        else {
         newMessage += ch;
         //add the number to the new message string
       }
     }
  return newMessage;
}

 public static String encryptTwo(String message, int rotation) {
   if(rotation > 26){
     rotation = rotation%26;
   }
   if(rotation < 0){
     rotation = (rotation%26) + 26;
   }
   StringBuilder newMessage = new StringBuilder();
   for ( int i = 0; i < message.length(); i ++){
     char ch = message.charAt(i);

     if(Character.isLetter(ch)){
       char c = (char) (ch + rotation);//(ch - (26 - rotation));
       newMessage.append(c);

       //add on the letter to the newstring
         }
        else {
         newMessage.append(ch);
       }
     }
    return newMessage.toString();
 }

 public static String decryptTwo(String message, int rotation) {
   if(rotation > 26){
     rotation = rotation%26;
   }
   if(rotation < 0){
     rotation = (rotation%26) + 26;
   }

   StringBuilder newMessage = new StringBuilder();
   for ( int i = 0; i < message.length(); i ++){
     char ch = message.charAt(i);

     if(Character.isLetter(ch)){
        char c = (char)(ch - rotation);//(ch + (26 - rotation));
       newMessage.append(c);

       //add on the letter to the newstring
         }
        else {
         newMessage.append(ch);
         //add the number to the new message string
       }
     }
  return newMessage.toString();
 }

}
