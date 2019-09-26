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
public class LatihanSoal04 {
 
    public static double kecepatan(int jarak, int WaktuTempuh){
        
        int hasil = jarak / WaktuTempuh;
        return hasil;
        
    }
    public static void main(String[] args){
        
        double x;
        int jarak = 100, WaktuTempuh=2;
       
        x = (int) kecepatan(jarak, WaktuTempuh);
        
        
        System.out.println("Masukkan Jarak : "+ jarak);
        System.out.println("Masukkan Waktu Tempuh :"+WaktuTempuh);
        System.out.println("Kecepatan : "+ x + "km/jam");
    }
}