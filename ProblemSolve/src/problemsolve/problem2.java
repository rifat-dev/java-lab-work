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
public class problem2 {
    
    static void count(int arr[],int n){
        int count=0;
        for (int i = 0; i <n; i++) {
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                 if(arr[j]!=-1){
                     arr[j]=-1;
                     count++;
                 }
                }
            }
            if(arr[i]>-1){
                count++;
                System.out.println(arr[i]+" = "+count);
            }
            count=0;
        }
        
    }
    public static void main(String[] args) {
        int arr[]=new int[30];
        Scanner input= new Scanner(System.in);
        int n;
        System.out.println("Array size : ");
        n=input.nextInt();
        System.out.println("Enter value One by one : ");
        for (int i = 0; i <n; i++) {
            arr[i]=input.nextInt();
        }
        
        count(arr,n);
    }
}
