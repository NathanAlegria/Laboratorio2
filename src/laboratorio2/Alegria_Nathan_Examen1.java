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
public class Alegria_Nathan_Examen1 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("****Menú****");
            System.out.println("1.Piramide");
            System.out.println("2.Clave");
            System.out.println("3.Juego de Piedra,Papel y Tijera");
            System.out.println("4.Adivinar");
            System.out.println("5.Salir");
            System.out.println("************");
            System.out.print("Ingresar opcion:");
            opcion = lea.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingresar cantidad de filas en piramide:");
                    int filas = lea.nextInt();
                    int numero = 1;
                    for (int i = 1; i <= filas; i++) {
                        int suma = 0;
                        for (int j = 1; j <= i; j++) {
                            System.out.print(numero + " ");
                            suma += numero;
                            numero += 2;
                        }
                        System.out.println("=" + suma);
                    }

                    break;
                case 2:
                    System.out.print("Ingresar mensaje a cifrar o descifrar:");
                    String mensaje = lea.next();
                    String resultado = "";
                    for (int i = 0; i < mensaje.length(); i++) {
                        char letra=mensaje.charAt(i);
                        if(letra>='a'&&letra<='z'){
                            resultado+=(char)('z'-(letra-'a'));
                        }else if(letra>='A'&&letra<-'Z'){
                            resultado+=(char)('Z'-(letra-'A'));
                        }else{
                            resultado+=letra;
                        }
                    }
                    System.out.println("Resultado:"+resultado);

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        } while (opcion != 5);
    }
}
