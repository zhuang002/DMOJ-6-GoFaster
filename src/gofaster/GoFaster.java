/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofaster;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class GoFaster {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int on0=sc.nextInt();
        int off0=sc.nextInt();
        int current=0;
        int max=on0;
        int min=on0;
        for (int i=1;i<n-1;i++) {
            int on=sc.nextInt();
            int off=sc.nextInt();
            current-=off;
            if (current<0) max+=current;
            current+=on;
            min-=off;
        }
        if (min<0) min=0;
        if (max<0) max=0;
        System.out.println(min+"\n"+max);
    }
    
}
