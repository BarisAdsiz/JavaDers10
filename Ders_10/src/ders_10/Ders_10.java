/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ders_10;

import java.util.Scanner;

/**
 *
 * @author Barış Adsız
 */
public class Ders_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner input = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int number = input.nextInt();
         
         if(number > 100)
             number = number / 2;
         else
             number = number * 2;
         
         System.out.println(number);
    }
    
}
