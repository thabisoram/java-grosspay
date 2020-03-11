/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thabiso
 */
public class GrossCalc {
    int Salary;
    
    public GrossCalc(int s){
        Salary=s;
    }
    
    public double getGrossPay(){
        double grossPay;
        if(Salary > 2999)
            grossPay=Salary-(Salary*0.05);
        else
            grossPay = Salary;
            return grossPay;
        }
    
        
        
    }
    

