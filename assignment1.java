/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.lang.Math;
import java.lang.Integer;
import java.util.Scanner;

/**
 *
 * @author 981834
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    int length;
    int width; 
    Scanner sc = new Scanner (System.in);
    System.out.println("length is ");
    width = sc.nextInt();
    System.out.println("width is ");
    length = sc.nextInt();
    System.out.println(length * width);
    }
    
}
