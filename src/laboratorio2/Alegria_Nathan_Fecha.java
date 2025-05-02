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
public class Alegria_Nathan_Fecha {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        System.out.println("Ingresar la primera fecha(Día/Mes/Año):");
        String fecha1=lea.nextLine();
        System.out.println("Ingresar la segunda fecha(Día/Mes/Año):");
        String fecha2=lea.nextLine();
        int dia1=Integer.parseInt(fecha1.substring(0,2));
        int mes1=Integer.parseInt(fecha1.substring(3,5));
        int año1=Integer.parseInt(fecha1.substring(6));
        int dia2=Integer.parseInt(fecha2.substring(0,2));
        int mes2=Integer.parseInt(fecha2.substring(3,5));
        int año2=Integer.parseInt(fecha2.substring(6)); 
        int totalDias1=año1*360+mes1*30+dia1;
        int totalDias2=año2*360+mes2*30+dia2;
        int diferencia=Math.abs(totalDias1-totalDias2);
        System.out.println("La diferencia en días entre las dos fechas es:"+diferencia+"días");
    }
}
