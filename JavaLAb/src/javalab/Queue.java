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
public class Queue {
    public static int queue[]=new int[20];
    public static int size=5;
    public static int front=0;
    public static int rear=-1;
    public static Scanner input=new Scanner(System.in);
    
    public static void enqueue(){
        if((rear-front)+1==size){
            System.out.println("There Have no space");
        }
        else{
            rear++;
            System.out.println("Enqueue some element :");
            queue[rear]=input.nextInt();
            
        }
    }
    public static void dequeue(){
        if(rear==-1){
           
            System.out.println("There have no value to delete ");
        }
        else{
             
            System.out.println("Delete "+queue[front]);
            front++;
            if(front>rear){
                front=rear=-1;
            }
          
        }
        
        
    }
    public static void display(){
        if(rear==-1){
            System.out.println("There have no value");
        }
        else{
            for (int i =front; i <=rear; i++) {
                System.out.println("values : "+queue[i]);
            }
        }
        
    }
    public static void main(String[] args) {
        int choice;
        while(true){
            System.out.println("1.Enqueue\n2.Dequeue\n3.Display\n4.Exit");
            System.out.print("Enter Your Choice : ");
            choice=input.nextInt();
            switch(choice){
                case 1:
                    enqueue();
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    break;
            }
        }
    }
}
