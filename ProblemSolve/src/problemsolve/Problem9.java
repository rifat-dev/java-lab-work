/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolve;

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class Problem9 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n; 
        int size=30;
        int array[]=new int[size];
        n=input.nextInt();
        for (int i = 0; i <n; i++) {
            array[i]=input.nextInt();
        }
        for (int i = 0; i <n; i++) {
            if(array[i]==n){
            System.out.println("Yes");
        }
        }
        
    }
    
    
}
