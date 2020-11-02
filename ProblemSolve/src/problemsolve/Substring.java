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
public class Substring {
    public static void search(String text,String patt){
        int M=text.length();
        int N=patt.length();
        int index=-1;
        for (int i = 0; i <M-1; i++) {
            int j;
            for ( j = 0; j <N; j++) {
                if(text.charAt(i+j)!=patt.charAt(j)){
                    break;
                }
            }
            if(j==N){
                index=i;
            }
            
        }
        if(index!=-1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Input string : ");
        String text=s.nextLine();
        System.out.println("Input Substring : ");
        String patt=s.nextLine();
        search(text,patt);
    }
    
}
