// Dosya oluşturma

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author MONSTER
 */
public class NewMain3 {
// girilecek olan dosya adına göre o dosyanın txt uzantısı ile klasör içinde var olup olmadığını yazan
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
String ad,soyad;
ad="Baktemur";
soyad="Feyzullah";
int yas=20;
        try {
            
            FileWriter yaz=new FileWriter("c:\\ornekklasor\\deneme2.txt",false);
            yaz.write(ad);
            yaz.write(soyad);
            yaz.write(String.valueOf(yas));
            yaz.write("**********");
            yaz.close();
            System.out.println("Dosya Oluşturuldu");
            
            
        } catch (Exception e) {
            {
            
                System.out.println("Dosya Oluşumunda Hata var");
            
            
            }
        
        
        
        }
    
    }
    
}	

