/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.count;

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class ArrayCount {
    static int count=0;
    static void countElement(int arr[],int n){
        for(int i=0;i<n;i++){
            count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    if(arr[j]!=-1){
                        arr[j]=-1;
                        count++;
                        
                    }
                }
            }
            if(arr[i]>-1){
                System.out.println(arr[i]+" Repeatde "+count+" Times");
            }
            count=0;
        }
    }

    
    public static void main(String[] args) {
       int arr[]=new int[50];
       Scanner input = new Scanner(System.in);
       int n;
        System.out.println("Enter Array Size: ");
        n=input.nextInt();
        System.out.println("Enter array elements :");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        
        countElement(arr,n);
    }
    
}
