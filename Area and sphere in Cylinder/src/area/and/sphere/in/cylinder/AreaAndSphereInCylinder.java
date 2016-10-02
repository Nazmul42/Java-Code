/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.and.sphere.in.cylinder;
import java.io.*;
/**
 *
 * @author Md. Nazmul
 */
public class AreaAndSphereInCylinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
      /* BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
       System.out.println("Enter the radius");
       String input1 =br.readLine();
       System.out.println("Enter the height");
       String input2 =br.readLine();
       double radius=Double.parseDouble(input1);
       double height =Double.parseDouble(input2);
       double pi=3.14;
       double area=2*pi*radius*(radius+height);
       System.out.println(area);*/
         BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
       System.out.println("Enter the radius");
       String input1 =br.readLine();
       System.out.println("Enter the height");
       String input2 =br.readLine();
       double radius=Double.parseDouble(input1);
       double height =Double.parseDouble(input2);
       double pi=3.14;
       double volume=pi*radius*radius*height;
       System.out.println(volume);
    }
    
}
