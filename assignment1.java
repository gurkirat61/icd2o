/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;
import java.util.Scanner;
/**
 *
 * @author 981834
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the rectangles length");
        System.out.print("Input the rectangles wigth");
        length = sc.nextInt();
        wigth=sc.nextInt();
        System.out.print("Area is : %d x %d = %d\n", length, wigth, length,* wigth);
        sc.close();
    }
    
}
