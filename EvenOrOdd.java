//Java Program to check if the accepted number is odd or even
import java.util.Scanner;
class Solution{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    if(number%2==0){
      //If remainder after division by 2 is 0 then number is even
      System.out.println("Number is even");
    }
    else{
      System.out.println("Number is odd");
    }
  }
}
