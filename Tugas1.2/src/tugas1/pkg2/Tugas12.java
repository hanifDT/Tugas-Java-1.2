/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1.pkg2;

/**
 *
 * @author hanif
 */
public class Tugas12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int angka1= 10;
     int angka2= 23;
     int angka3= 5;
     int max=0;
     
     max= (angka2 > angka3)?(angka2 > angka1)? angka2:angka1:angka3;
     
        System.out.println("Number 1="+angka1);
        System.out.println("Number 2="+angka2);
        System.out.println("Number 3="+angka3);
        System.out.println("Nilai tertingginya adalah angka ="+max);
    }
    
}
