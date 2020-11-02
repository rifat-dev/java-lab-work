/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahmudul.hasan;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MahmudulHasan {
    static int searchelement(int[]arr,int n,int value){
     for(int i=0;i<n;i++)
     {
     if (value==arr[i]){
     return i+1;
     }
     }
     return -1;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[]arr = new int[50];
        int n, value;
        Scanner s= new Scanner(System.in);
        System.out.print("enter number of elements:");
        n=s.nextInt();
        System.out.println("enter the elements one by one");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("enter the value to be searched");
        value=s.nextInt();
        
        int pos= searchelement(arr, n, value);
        if (pos== -1){
        System.out.println("not found");
        }
        else{
            System.out.println("element found " +pos);
        }
       
    }
    
}
