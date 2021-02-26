/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone4;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[] args) {
        SecretPhrase2 frase=new SecretPhrase2();        
        Boolean gana= false;
        Scanner pen= new Scanner(System.in);
        
        System.out.println("Welcome");        
        System.out.println("Adivina la siguiente frase: "+ frase.getFraseus());

        do{
            System.out.println("Dame una letra");            
            frase.verificaLetra(pen.next());
            gana= frase.ganar();
        }while(gana!=true);
        System.out.println("Felicidades adivinaste la palabra "+ frase.getFrase());
    }
}
