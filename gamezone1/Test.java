/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Test {

    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        quiz.addPregunta("Equipo de futbol");
        quiz.addPregunta("Materia favorite");
        quiz.addPregunta("Prefiere: ");
        quiz.addPregunta("Serie preferida");
        quiz.addPregunta("Deporte preferido");
        quiz.addInciso(1, new Inciso("Barcelona", true));
        quiz.addInciso(1, new Inciso("Real Madrid", false));
        quiz.addInciso(1, new Inciso("Atletico", false));
        quiz.addInciso(2, new Inciso("Progra", true));
        quiz.addInciso(2, new Inciso("Ecuaciones", false));
        quiz.addInciso(2, new Inciso("Sistemas Operativos", false));
        quiz.addInciso(3, new Inciso("Estar en casa", false));
        quiz.addInciso(3, new Inciso("Viajar", true));
        quiz.addInciso(3, new Inciso("Ir a fiestas", false));
        quiz.addInciso(4, new Inciso("La casa de papel", false));
        quiz.addInciso(4, new Inciso("Sex education", false));
        quiz.addInciso(4, new Inciso("Wanda Vision", true));
        quiz.addInciso(5, new Inciso("Futbol", true));
        quiz.addInciso(5, new Inciso("Americano", false));
        quiz.addInciso(5, new Inciso("Beisbol", false));

        //quiz.imprimir();
        int n=3;
        Scanner pen= new Scanner(System.in);
        System.out.println("Responde cada pregunta correctamente");
        for (int i = 0; i < quiz.size(); i++) {
            quiz.imprimir(i);
            quiz.verificaPregunta(i,pen.nextInt());
            n++;
        }
        quiz.calificacion();
            
        
        
    }
}
