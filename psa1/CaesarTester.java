import java.io.*;
import java.util.*;

public class CaesarTester {


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
         char c = (char)(ch + rotation);//(ch + (26 - rotation));
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

  public static void main(String[] args){
    String str1 = new String("wow18");
    String str2 = new String();
    str2 = encrypt(str1,2);

    System.out.println("Test #1");

    if( (str2.equals("yqy18")) ){
      System.out.println("String is encrypted");
      System.out.println("Test Passed!! Encrypt method works.");
    }
    else {
     System.out.println(" Test Failed!!!!!!!!!!");
     System.out.println(str2);
   }

    if ( str2.equals("tmt18") ){
      System.out.println("rotation must be in opp direction! go back to encrypt method to check how rotation is implemented");
      System.out.println("Test Failed!!!!");
    }



    System.out.println();
    System.out.println("Test #2");
    String str3 = decrypt(str2,2);

    if( (str3.equals(str1))){
      System.out.println("Test Passed!! Decrypt method works.");
    }

    else{
      System.out.println("Test Failed");
      System.out.println(str3);
    }


    System.out.println();
    System.out.println("Test #3");

    char originalLetter = 'C';
    char newLetter = letterOperation(originalLetter,2);
    if (newLetter == 'E'){
      System.out.println("Test Passed!!! Letter operation works.");
      System.out.println("newLetter=" +newLetter);
    }
    else{
      System.out.println("Test Failed.");
      System.out.println("newLetter="+ newLetter);
    }


    System.out.println();
    System.out.println("Test #4");

    String str4 = encryptTwo(str1, 2);


    if( (str4.equals("yqy18")) ){
      System.out.println("String is encrypted");
      System.out.println("Test Passed!! Encrypt method works.");
    }
    else {
     System.out.println(" Test Failed!!!!!!!!!!");
     System.out.println(str4);
   }

    if ( str2.equals("tmt18") ){
      System.out.println("rotation must be in opp direction! go back to encrypt method to check how rotation is implemented");
      System.out.println("Test Failed!!!!");
    }


    System.out.println();
    System.out.println("Test #5");

    String str5 = decryptTwo(str2,2);

    if( (str5.equals(str1))){
      System.out.println("Test Passed!! Decrypt method works.");
    }

    else{
      System.out.println("Test Failed");
      System.out.println(str3);
    }
}

}
