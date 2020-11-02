/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arry2;

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class ARRY2 {

    static int [] insertElrment(int arr[],int n,int value,int pos){
        int newarr[]=new int [n+2];
        for (int i = 0; i <=n; i++) {
           if(i<pos-1){
               newarr[i]=arr[i];
           } 
          else if(i==pos-1){
               newarr[i]=value;
           }
          else{
              newarr[i]=arr[i-1];
          }
        }
        return newarr;
        
    }
    public static void main(String[] args) {
         int arr[]=new int[50];
        Scanner input = new Scanner(System.in);
        int n,value,pos;
        System.out.println("Enter Arr Size : ");
        n=input.nextInt();
        System.out.println("Enter Your Value : ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Enter The New Element ");
        value=input.nextInt();
        System.out.println("Enter Position");
        pos=input.nextInt();
        System.out.println("Befor :");
        for (int i = 0; i<n; i++) {
            System.out.print(arr[i]+" ");
            
        }
        System.out.println("");
        
        System.out.println("After Add new value :");
        arr = insertElrment(arr,value,n,pos);
         for (int i = 0; i<=n; i++) {
            System.out.print(arr[i]+" ");
            
        }
        System.out.println("");
    }
    
}
