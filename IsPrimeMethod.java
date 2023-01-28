
package assignment5;

import java.util.Scanner;

public class IsPrimeMethod {

    public static void main(String[] args) {
      
         Scanner keyboard = new Scanner(System.in);
         
         int number;
         boolean result;
         
         System.out.println("Enter an integer number: ");
         number = keyboard.nextInt();
         
         while ( number <= 0){
             
             System.out.println("Please enter a valid number");
             number = keyboard.nextInt();
         }
         
       result = isPrime(number);
         
        if(result){
             
            System.out.println("The number " + number + " is prime");
        } 
        
        else
        System.out.println("The number " + number + " is not prime");
           
    }
    
    
    public static boolean isPrime(int num){
 
        for(int i = 2; i <= num-1; ++i){
            
            if(num % i == 0)
                return false;
        }
      return true;
    }
 }   
    

