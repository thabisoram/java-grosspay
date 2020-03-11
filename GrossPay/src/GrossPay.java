/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thabiso
 */
import java.util.Scanner;
public class GrossPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your income: R");
        int s=sc.nextInt();
        
        GrossCalc g=new GrossCalc(s);
        Tax t=new Tax(s);
          
        System.out.println("Gross pay: R "+g.getGrossPay());
        System.out.println("Amount of tax you should pay: R "+t.CalculateTax());
        System.out.println("Should you pay tax? "+t.DetermineBooleanTax());
    }
    
}
