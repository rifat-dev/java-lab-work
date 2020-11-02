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
public class stringLength {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("write something :");
        String str=in.nextLine();
        int length=0;
        for(char c:str.toCharArray()){
            length++;
        }
        System.out.println("Length is : "+length);
        
    }
}
