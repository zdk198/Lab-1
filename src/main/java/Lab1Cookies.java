import java.util.Scanner;
import javax.swing.JOptionPane;
//Zach Korte
public class Lab1Cookies {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String AmountOfCookiesAte = JOptionPane.showInputDialog("Please input how many cookies you ate.");
        // 40 cookies in a package so 10 servings is 4 cookies per serving and 300/4 is 75
        double CaloriesOfCookiesEaten = Double.parseDouble(AmountOfCookiesAte) * 75 ;
        JOptionPane.showMessageDialog(null, "Since you ate "+ AmountOfCookiesAte + " cookies you consumed " + CaloriesOfCookiesEaten + " calories.");
    }
}
