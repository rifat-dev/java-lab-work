/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab;

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class StringLength2 {
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         int length=0;
        System.out.println("write something :");
        String str=in.nextLine();
        str=str.concat("\0");
        char ch[]=str.toCharArray();
        for (int i = 0; ch[i]!='\0'; i++) {
            length++;
        }
        System.out.println("Length is : "+length);
    }
}
