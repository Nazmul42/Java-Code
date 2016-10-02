/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miles.to.kilometers;
import java.io.*;
/**
 *
 * @author Md. Nazmul
 */
public class MilesToKilometers {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args)throws Exception {
        System.out.println("Enter the distance in miles: ");
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        String input=br.readLine();
        double miles=Double.parseDouble(input);
        double kms=1.609*miles;
        System.out.println("Kilometers is "+kms);
    }
    
}
