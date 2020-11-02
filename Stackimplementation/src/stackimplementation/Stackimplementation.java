/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackimplementation;

import java.util.Scanner;

public class Stackimplementation {

public static int[] stack = new int [30];
public static int size = 5;
public static int top = -1;
public static Scanner in = new Scanner(System.in);

public static void push()
{
    if(top==size-1){
        System.out.println("Stack over flow");
    }
    else{
       top++; 
           
        System.out.println("Enter the Element : ");
            stack[top]=in.nextInt();
    }
}

public static void pop()
{
    if(top==-1){
        System.out.println("Stack overflow");
    }
    else{
        System.out.println("The value to delete "+stack[top]);
        top--;         
    }
}
public static void topElement()
{
    if(top==-1){
        System.out.println("Stack overflow");
    }
    else{
         System.out.println("Top Element is : "+stack[top]);
    }
}
public static void Display()
{
    if(top==-1){
        System.out.println("Overflow");
    }
    else{
        
        for (int i = 0; i <=top; i++) {
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        int choice;
        while(true){
        System.out.println("1. push \n 2. pop \n 3. top\n 4.Display\n 5. Exit");
        System.out.println("choice number ");
        choice=in.nextInt();
        if(choice==1){
            push();
        }
        else if(choice==2){
            pop();
        }
        else if(choice==3)
        {
            topElement();
        }
        else if(choice==4)
        {
            Display();
        }
        else if(choice==5){
            break;
        }
        else{
            System.out.println("Try Again");
        }
        
        }
                
        
        
    }
}
