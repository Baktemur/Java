package javaapplication1;

import java.io.File;
public class NewMain2 {
    public static void main(String[] args) {
        File f= new File("C:\\ornekklasor\\program2.txt");
        if (f.exists())
        
            System.out.println("dosya var");
            
        else
            System.out.println("dosya yok");
        
    }
    
}
