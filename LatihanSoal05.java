/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemrogamanfunction;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class LatihanSoal05 {
    
    public static void hasil(int a, int b, int c){
        if (a > b && a > c){
            System.out.println("Nilai Terbesar adalah : " + a);
        }else if (b > a && b > c){
            System.out.println("Nilai Terbesar adalah : " + b);
        }else if (c > a && c > b){
            System.out.println("Nilai Terbesar adalah : " + c);
        } 
                
    }
    
    public static void main(String[] args){
        Scanner dell = new Scanner(System.in);
        System.out.print("Masukkan Bilangan I : ");
        int x = dell.nextInt();
        System.out.print("Masukkan Bilangan II : ");
        int y = dell.nextInt();
        System.out.print("Masukkan Bilangan III : ");
        int z = dell.nextInt();
        hasil(x,y,z);
    }
}
