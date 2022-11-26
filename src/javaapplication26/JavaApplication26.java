/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class JavaApplication26
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String nama;
    int umur;
    Scanner input = new Scanner(System.in);
    System.out.print("nama=");
    nama= input.nextLine();
    System.out.print("umur=");
    umur= input.nextInt();
    
    if(umur>=60)
            {
                System.out.print("kakek "+nama+" apakah anda sudah pensiun");
            }
    else if(umur<60 && umur>=25)
            {
                System.out.print("saudara "+nama+" apakah anda masih aktif bekerja?");
            }
            else 
            {
                    System.out.print("adik "+nama+" apakah anda masih sekolah?");
                    }
    
}
}

