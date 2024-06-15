// import java.util.*;

// public class VowelConsonent {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a alphabet charector :");
//         String ch = sc.next();
//         if (ch == "a" || ch == "e"|| ch == "i" || ch == "o"|| ch == "u") {
//             System.out.print(ch + "  is a vowel");
//         }

//         else {

//             System.out.print(ch + " is the consonent ");
//         }

//     }
// }

import java.util.*;
public class VowelConsonent{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    char c = sc.next().toLowerCase().charAt(0);
    if(!Character.isLetter(c)){
      System.out.println("Not s letter");
    }else{
      if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
        System.out.print("Vowel");
      }else{
        System.out.print("Consonant");
      }
    }
     sc.close();
  }  
 


}