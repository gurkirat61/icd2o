/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author 981834
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    int radius;
    int height;
    Scanner sc = new Scanner (System.in);
    System.out.println("radius is ");
    height = sc.nextInt();
    System.out.println("height is ");
    radius = sc.nextInt();
    System.out.println(Math.PI*(radius * radius )* height);
    }
    
}
