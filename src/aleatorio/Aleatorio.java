/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import productsstream.Producto;
/**
 *
 * @author david
 */
public class Aleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = null;
        String[] codes = {"p1", "p2", "p3"};
        String[] descricion = {"parafusos", "cravos ", "tachas"};
        int[] prices = {3, 4, 5};

        char susti;
        String codigo="",descrip="";
        int p;
        
        
        
        try {
            RandomAccessFile escribir = new RandomAccessFile("C:/Users/david/Desktop/prueba clase file/aleatorio.txt", "rw");

            for (int i = 0; i < codes.length; i++) {
                a = String.format("%-3s", codes[i]).replace(' ', '+');
                escribir.writeChars(a);
                // System.out.println(a);

                a = String.format("%-10s", descricion[i]).replace(' ', '+');
                escribir.writeChars(a);
                escribir.writeInt(prices[i]);

                // System.out.println(a);
                // System.out.println(prices[i]);
            }
            
            
            
            escribir.seek((2-1)*30);
            
            for(int i=0;i<3;i++){
            susti=escribir.readChar();
            codigo=codigo+susti;
           
            
            
            }for (int i=0;i<10;i++){
                susti=escribir.readChar();
                descrip=descrip+susti;
                
                
                
            }
            
            
            
             codigo=codigo.replace('+',' ');
            System.out.println(codigo);
            descrip=descrip.replace('+',' ');
            System.out.println(descrip);
            p=escribir.readInt();
            System.out.println(p);

        } catch (IOException ex) {
            System.out.println("Error 1");
        }

    }

}
