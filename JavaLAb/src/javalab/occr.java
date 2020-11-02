/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class occr {
public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
 String ab = inp.next();
    char c [] = ab.toCharArray();
    int temp=0,storage;
    storage =0;
    for(int i=0;i<c.length ;i++)
    {
        int count =0;
        for(int j=0;j<c.length ;j++)
        {
            if(c[i]==c[j])
            {
                count++ ;
            }
        }
        if(count>storage)
        {
            storage =count;
            temp =c[i]-'0';
        }

    }
    System.out.println(temp);
    }
}
