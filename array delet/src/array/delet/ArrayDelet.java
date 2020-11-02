/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.delet;

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class ArrayDelet {
 static int searchelement(int[]arr,int n,int value){
     for(int i=0;i<n;i++)
     {
     if (value==arr[i]){
     return i;
     }
    }
     return -1;
    }
  static int removeElement(int[] arr,int n,int value){
      int pos;
      pos = searchelement(arr,n,value);
      
      if(pos==-1){
          System.out.println("Element not found");
          return n;
      }
      for(int i=pos; i<n-1;i++){
          arr[i]=arr[i+1];
      }
      return n-1;
  }
    
    public static void main(String[] args) {
        int[] arr=new int [50];
        int n, value;
        Scanner s= new Scanner(System.in);
        System.out.print("enter number of elements:");
        n=s.nextInt();
        System.out.println("enter the elements one by one");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("enter the remove element");
        value=s.nextInt();
        System.out.println("Befor removing ");
        for(int i=0;i<n;i++){
            
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        n = removeElement(arr,n,value);
        System.out.println("After Remove");
        for(int i=0;i<n;i++){
            
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        
      
    
 }
}
