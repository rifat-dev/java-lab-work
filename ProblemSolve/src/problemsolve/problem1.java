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
public class problem1 {
static int search(int arr[],int n,int value){
    for (int i = 0; i <n; i++) {
        if(value==arr[i]){
            return i+1;
        }
           
    }
    return -1;
}
    public static void main(String[] args) {
        int arr[]=new int [20];
        Scanner input = new Scanner(System.in);
        int n,value,pass;
        System.out.println("Enter Array Size : ");
        n=input.nextInt();
        System.out.println("Enput Value one by one : ");
        for (int i = 0; i <n; i++) {
            arr[i]=input.nextInt();
            
        }
        System.out.println("Enter Value To Find Position : ");
        value=input.nextInt();
        
        pass=search(arr,n,value);
        if(pass==-1){
            System.out.println("not found");
        }
        else{
            System.out.println(value+" Has been found at podition "+pass);
        }
    }
    
}
