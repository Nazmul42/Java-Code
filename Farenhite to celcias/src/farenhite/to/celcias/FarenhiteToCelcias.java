/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farenhite.to.celcias;

import java.io.*;

/**
 *
 * @author Md. Nazmul
 */
public class FarenhiteToCelcias {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args)throws Exception {
       System.out.println("Enter the Tempareture is F : ");
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        String input=br.readLine();
        double farenhite=Double.parseDouble(input);
       
        double celcias=(farenhite-32)*5/9;
        System.out.println("Celcias is "+celcias);
    }
    
}
