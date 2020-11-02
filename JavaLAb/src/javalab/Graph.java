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
public class Graph {
    public static int matrix[][]=new int [20][20];
    public static void eddAge(int src,int dst){
        matrix[src][dst]=1;
        matrix[dst][src]=1;
    }
    public static void view(int vertex){
        System.out.println("Graph Matrix ");
        for (int i =1; i <=vertex; i++) {
            for (int j =1; j <=vertex; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        
    }
    
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int vertex,edges;
        System.out.println("Enter the number of vertex :");
        vertex=input.nextInt();
        System.out.println("Enter the number of edges : ");
        edges=input.nextInt();
        for (int i =1; i <=edges; i++) {
            System.out.println("Enter the sourc node : ");
            int src=input.nextInt();
            System.out.println("Enter the destination node : ");
            int dst=input.nextInt();
            eddAge(src,dst);
            
        }
        
        view(vertex);
        
    }
}
