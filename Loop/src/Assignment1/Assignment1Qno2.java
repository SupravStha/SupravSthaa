package Assignment1;

import java.util.Scanner;

public class Assignment1Qno2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.next();
        String reverse="";
        for(int i=str.length()-1; i>=0; i--){
            reverse=reverse+str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println(str+"is a palindrome string");
        }
        else{
            System.out.println(str+"is not a palindrome string");
        }
    }
}
