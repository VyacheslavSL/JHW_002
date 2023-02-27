package JHW_002;

// . Напишите метод, который принимает на вход строку (String) и определяет является ли 
// строка палиндромом (возвращает boolean значение).

public class StringPalindrome {
   public static void main(String args[]){
      String myString = "anna";
      StringBuffer buffer = new StringBuffer(myString);
      buffer.reverse();
      String data = buffer.toString();
      if(myString.equals(data)){
         System.out.println("Given String is palindrome");
      }else{
         System.out.println("Given String is not palindrome");
      }
   }
}