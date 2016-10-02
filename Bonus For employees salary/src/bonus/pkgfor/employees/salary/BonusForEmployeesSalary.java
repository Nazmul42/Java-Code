/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonus.pkgfor.employees.salary;
import java.io.*; 
/**
 *
 * @author Md. Nazmul
 */
public class BonusForEmployeesSalary {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args)throws Exception {
         BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter employee Salary: ");
        
        String input1=br.readLine();
        System.out.println("Enter the bonus %: ");
        String input2=br.readLine();
        double salary=Double.parseDouble(input1);
         double bonus=Double.parseDouble(input2);
        double total=salary+bonus/100*salary;
        System.out.println("Bonus  is "+total);
    }

    
    }
    

