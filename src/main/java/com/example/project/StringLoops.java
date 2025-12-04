package com.example.project;

public class StringLoops {

   public StringLoops() { }

   //WARM UP 
    // using a for loop remove all 'a' characters from input string
   public String removeA(String str) {
    String tempString = str;
    String a = "";
    String newWord = "";
        for (int i = 0; i < str.length(); i++){
                a = tempString.substring(i,i+1);
                if (!a.equals("a")){
                    newWord += a;
                }
            }
            return newWord;
        }
       
   


   // WARM UP
   // using a while loop remove all 'a' characters from input string
   public String removeA2(String str) {
    int i = 0;
    String newWord = "";
    while (i<str.length()){
        String a = str.substring(i,i+1);
        if (!a.equals("a")){
            newWord += a;
        }
        i++;
    }
       return newWord;
   }


   //WARM UP 
   //Reverse a string by counting down from the end to the start
   public String reverseString(String str) {
   String tempWord = str;
    String newWord = "";
    for (int i = str.length() -1; i >= 0; i--){
        tempWord = str.substring(i, i+1);
        newWord += tempWord;
    }
    return newWord;
   }


   //WARM UP
   //Reverse a string by counting up from the start to the end
   public String reverseString2(String str) {
    String tempWord = str;
    String newWord = "";
    for (int i = 0; i < str.length(); i++){
        tempWord = str.substring(i,i+1);
        newWord = tempWord + newWord;
    }
       return newWord;
   }


   // using a for loop
   public String replaceCharacterV1(String searchChar, String origStr, String replaceChar){
    String letter = "";
    String newWord = "";
    for (int i = 0; i < origStr.length(); i++){
        letter = origStr.substring(i,i+1);
        if (!letter.equals(searchChar)){
            newWord += letter;
        }else {
            letter = replaceChar;
            newWord += letter;
        }
    }
        return newWord;
   }


   // using a while loop
   public String replaceCharacterV2(String searchChar, String origStr, String replaceChar) {
    String letter = "";
    String newWord = "";
    int i = 0;
    while (i < origStr.length()){
        letter = origStr.substring(i,i+1);
        if (!letter.equals(searchChar)){
            newWord += letter;
        }
        else {
            letter = replaceChar;
            newWord += letter;
        }
        i++;
    }
       return newWord;
   }

   public int countString(String searchString, String origString) {
    String tempString = origString.toLowerCase();
    String tempSearch = searchString.toLowerCase();
    int count = 0;
    int index = 0;
    while((index = tempString.indexOf(tempSearch, index)) != -1){
        count++;
        index++;
    }
       return count;
   }

   public String removeString(String searchString, String origString) {
    
       return "";
   }


   public void commaSeparated(int fromNum, int toNum) { //the tests will compare your printed output (not a returned string)
       System.out.println();
   }



   public boolean isPalindrome(String myString) {
       return false;
   }


   public void multiPrint(String toPrint, int num) { //the tests will compare your printed output (not a returned string)
       System.out.println();
   }
}
