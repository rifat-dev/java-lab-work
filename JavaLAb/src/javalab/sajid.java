/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Md Rifat
 */
public class sajid {
    public static void main(String[] args) {
                Scanner inp =  new Scanner(System.in);
        	int[] dx = {0, 0, 1, -1};
	        int[] dy = {1, -1, 0, 0};
	        int c,r = 0;
	        c = inp.nextInt();
	        r = inp.nextInt();
	

	        char [][] arr = new char [c+2][r+2];
	        int total_ct = 0;
	        for(int i = 0; i<= c+1; i++){
	            Arrays.fill(arr[i],'0'); // making a safety box
	        }
	

	        for (int i = 1; i <= c; i++) {
	            String a = inp.next();
	            int k = 0;
	            for (int j = 1; j <= r; j++) {  //directly putting data into tha safety box
	                arr[i][j] = a.charAt(k);
	                k++;
	            }
	        }
	        for (int i = 1; i <= c; i++) {
	            for (int j = 1; j <= r; j++) {
	                if (arr[i][j] != '*') {
	                    int ct = 0;
	                    for (int k = 0; k < 4; k++) {
	                     int cx = i + dx[k];
	                     int cy = j + dy[k];
	                     if (arr[cx][cy] =='*'){
	                         ct++;
	                     }

	                    }
	                    if (ct == 0){
	                        total_ct++;
	                    }
	                }
	            }
	        }
	        System.out.println(total_ct);

    }
 
}
