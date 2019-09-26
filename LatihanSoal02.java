/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemrogamanfunction;

/**
 *
 * @author User
 */
public class LatihanSoal02 {
    
    public static int hitung(int a, int b){
        int c = a + b;
        return c;
        
        
    }
    public static void main (String[] args){
        
        int x;
        int bil1 = 3, bil2 = 83;
        // Mengganti nomor bilangan menjadi sebuah nomor absensi dan bilangan ke 2 digit akhir NIS
        x = hitung(bil1, bil2);
        
        System.out.println("Hasil : "+ x);
    }
}
