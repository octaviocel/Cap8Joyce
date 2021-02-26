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
public class FiveDice3 {
    private Die[] dados;
    private Integer combinacion;
    private Integer valormay;
    
    public FiveDice3(){
        this.dados= new Die[5];
        this.lanzar();
    }

    public Integer getCombinacion() {
        return combinacion;
    }

    public Integer getValormay() {
        return valormay;
    }
    
    public static void ganar(FiveDice3 uno, FiveDice3 dos){
        if(uno.combinacion==dos.combinacion){
            if(uno.valormay==dos.valormay){
                System.out.println("Empate");
            }else if(uno.valormay>dos.valormay){
                System.out.println("Gano el usuario");
            }else{
                System.out.println("Gano la computer");
            }
        }else if(uno.combinacion>dos.combinacion){
            System.out.println("Gano el usuario");
        }else{
            System.out.println("Gano la computer");
        }
    }
    
    private void combinacion(){
        int contador=0,mayor=0, valormayor=0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < 5; j++) {
                if(this.dados[j].getCara()==i){
                    contador++;
                }
            }
            if(contador>mayor){
                valormayor=i;
                mayor=contador;
            }
            contador=0;
        }
        this.valormay=valormayor;
        this.combinacion=mayor;
    }
    public void lanzar(){
        for (int i = 0; i < 5; i++) {
            this.dados[i]=new Die();
        }
        this.combinacion();
    }
    
    public void getDados(){
        for (int i = 0; i < 5; i++) {
            System.out.println(this.dados[i].getCara());   
        }
    }
}
