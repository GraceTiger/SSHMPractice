package com.zxc.view;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        int count = 0;
        String[] num = new String[1000];
        for (int i=0;i<n;i++){
            num[i] = sc.next();
        }
        for (int i=0;i<n;i++){
            if ()
        }
    }

    boolean compare (String s1,String s2,String s){
        for (int i=0;i<9;i++){
            if (s1.charAt(i)!='*') {
                if (s1.charAt(i) != s.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}
