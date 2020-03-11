public class Tax {
    int Salary;
    
    public Tax (int s){
        Salary=s;
    }
    
    public double CalculateTax(){
    double taxAmount;
    taxAmount=Salary*0.05;
    return taxAmount;  
}
    public String DetermineBooleanTax(){
        String Ans;
        if (Salary > 3000)    
        Ans="Yes, you should pay tax";
        else
            Ans="No, oyu shouldn't pay tax";
            return Ans;
        }
    }

