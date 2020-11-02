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
public class problem4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write something in lowercase:");
        String str = in.nextLine();
        char ch[] = str.toCharArray();
        int size=ch.length;
        
        
        for (int i = 0; i <size; i++) {
            ch[i] = (char)(ch[i]-32);
            
        }
        System.out.println();
        System.out.println("Upper case :");
        System.out.println(ch);
    }
}
