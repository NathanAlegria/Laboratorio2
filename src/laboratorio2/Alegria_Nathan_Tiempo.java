/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio2;
import java.util.Scanner;

/**
 *
 * @author Nathan
 */
public class Alegria_Nathan_Tiempo {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        System.out.print("Ingresar un número en segundos:");
        int segundos=lea.nextInt();
        String resultado=(segundos>0)?"convertirSegundos":"No se permite ese valor.";
        System.out.println(resultado);
            int horas=segundos/3600;
            int minutos=segundos/60;
            System.out.println("Horas:"+horas+"\nMinutos:"+minutos+"\nSegundos:"+segundos);
    }
}
    
