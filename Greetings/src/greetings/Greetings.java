/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greetings;
import java.util.Scanner;
/**
 *
 * @author Md. Nazmul
 */
public class Greetings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int m,n,p;
        m = a.nextInt();
        for(int i=1; i<=m; i++){
            n=a.nextInt();
            p=a.nextInt();
            System.out.println("Case "+i+": "+(n+p));
        }
    }
    
}/*
Name:Nazmul Huda
ID:2015100000052
*/

