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
public class Die {
    private Integer cara;
    
    public Die(){
        this.lanzar();
    }
    
    public void lanzar(){
        this.cara = ((int)(Math.random() * 100) % 6 + 1);
    }

    public Integer getCara() {
        return cara;
    }    
    
}
