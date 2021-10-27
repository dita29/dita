/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ditaratna;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class Ditaratna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String awal;
        String balik = "";  
        String cek = "";
        Scanner masuk = new Scanner(System.in);
        System.out.println("Masukan kata atau kalimat yang akan dibalik : ");
        awal=masuk.nextLine();
        for (int i = awal.length() - 1; i >= 0; i--) {
           char kata = awal.charAt(i);
           cek += String.valueOf(kata);
           if (cek.equalsIgnoreCase("g")){
               char kar = awal.charAt(i-1);
               String cek1 = String.valueOf(kar);
               if (cek1.equalsIgnoreCase("n")){
                   balik += awal.charAt(i -1);
                   i -= 1;
               }
           }
           if (cek.equalsIgnoreCase("y")){
               char kar = awal.charAt(i-1);
               String cek1 = String.valueOf(kar);
               if (cek1.equalsIgnoreCase("n")){
                   balik += awal.charAt(i -1);
                   i -= 1;
               }
           }
           balik += kata;
        }
            
        System.out.println("Hasil kata yang dibalik :"+ balik);
        
	if(awal.equals(cek)){
            System.out.println("==== "+awal+" adalah Palindrome =====");
	}else{
            System.out.println("==== "+awal+" bukan Palindrome =====");
	}

    }
    
}
    
    

