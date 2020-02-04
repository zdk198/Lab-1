import java.util.Scanner;
import javax.swing.JOptionPane;
//Zach Korte
public class Lab1 {
    //Sales Tax Question
    public static void main(String[] args) { 
        Scanner keyboard = new Scanner(System.in);
         String AmountOfPurchase = JOptionPane.showInputDialog("Please input purchase price.");
         double CountyTaxRate = .02 ;
         double StateTaxRate= .04; 
         double CountyTotalTax = Double.parseDouble(AmountOfPurchase)*  CountyTaxRate ;
         double StateTotalTax = Double.parseDouble(AmountOfPurchase)* StateTaxRate;
         double TotalTaxCharged = StateTotalTax + CountyTotalTax ;
         double TotalSalePrice = Double.parseDouble(AmountOfPurchase)+ TotalTaxCharged;
         JOptionPane.showMessageDialog(null, "The amount of the purchase is  " + AmountOfPurchase + "\n The State Sales Tax is $" + StateTotalTax + "\n The County Sales Tax is $" + CountyTotalTax + "\n The Total Tax Charged is $" + TotalTaxCharged + "\n The Total Sale Price is $" + TotalSalePrice );
              
    }
    
}
