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
public class PatternMatching {
    public static int search(String text,String pat){
        int M=text.length();
        int N=pat.length();
        int index=-1;
        for (int i = 0; i <M-N; i++) {
            int j;
            
            for ( j = 0; j <N; j++) {
                if(text.charAt(i+j)!=pat.charAt(j)){
                    break;
                }
            }
           if(j==N){
               index=i;
           } 
        }
        return index;
    }
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input text : ");
        String text=input.nextLine();
        System.out.println("Input word to search : ");
        String pat=input.nextLine();
        int ans=search(text,pat);
        if(ans==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Index Position : "+(ans+1));
        }
        
    }
}
