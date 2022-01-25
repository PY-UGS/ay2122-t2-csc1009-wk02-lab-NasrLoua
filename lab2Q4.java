package lab2;

import java.util.Scanner;

public class lab2Q4 {

    public static void main(String[] args){

        String array[] = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a year: ");
        int year = input.nextInt();

        int i = year % 12;

        System.out.print(array[i]);

        input.close();
        
    }
    
}
