/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vize_hazirlik;

import java.util.Scanner;


public class beşSayininToplamiVeOrtalamasi {
    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);
       
       int s , toplam =0 , ortalama;
       
        for (int i = 0; i < 5; i++) {
            
            System.out.println("lütfen " + (i+1) + ". sayıyı girin" );
            s=scan.nextInt();
            
            toplam += s;
            
        }
        ortalama = toplam/5;
        
        System.out.println("toplam : " + toplam);
        System.out.println("ortalama : " + ortalama);
       
    }
}
