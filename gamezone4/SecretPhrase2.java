/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone4;

/**
 *
 * @author DELL
 */
public class SecretPhrase2 {

    private final String[] palabras={"el nino juega juegos", "raul es un bebe", "mi mama me mima", "lasalle es la mejor",
                                "ingenieria de software", "juegos del hambre"};
    private String frase;
    private Integer letras;
    private String fraseus;

    public SecretPhrase2() {
        this.frase = palabras[(int) (Math.random() * palabras.length)];
        this.letras = frase.length() - 1;
        this.ayuda();
    }

    public String getFrase() {
        return frase;
    }

    public Integer getLetras() {
        return letras;
    }

    public String getFraseus() {
        return fraseus;
    }

    private void ayuda(){        
        String nuevo = "";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)==' ') {
                nuevo += " ";
            } else {
                nuevo += "*";
            }
        }
        this.fraseus=nuevo;
       
    }
    
    public void verificaLetra(String a) {
        String nuevo = "";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == a.charAt(0)) {
                nuevo += a.charAt(0);
            } else if (fraseus.charAt(i) != '*') {
                nuevo += frase.charAt(i);
            } else {
                nuevo += "*";
            }
        }
        this.fraseus=nuevo;
    }
    
    public Boolean ganar(){
        if(frase.equals(fraseus)){
            return true;
        }else{
            System.out.println("Sigue intentando\n Frase "+ this.getFraseus());
            return false;
        }
    }
}
