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
public class Problem12 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N;
        int a[]=new int[100];
        N=in.nextInt();
        int i=0;
        while(N!=0){
            a[i]=N%10;
            N=N/10;
            i++;
        }
        for (int j =i-1; j>=0; j--) {
            System.out.print(a[j]+" ");
        }
    }
}
