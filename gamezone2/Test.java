/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone2;

/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[] args) {
        FiveDice3 user= new FiveDice3();
        FiveDice3 comp=new FiveDice3();
        
        System.out.println("El usuario tiene "+user.getCombinacion()+"veces el num "+user.getValormay());
        System.out.println("La computadora tiene "+comp.getCombinacion()+"veces el num "+comp.getValormay());
        FiveDice3.ganar(user, comp);
    }
}
