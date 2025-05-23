/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio2;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Nathan
 */
public class Alegria_Nathan_Examen1 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in).useDelimiter("\n");
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
                    System.out.println("-----PIRAMIDE-----");
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
                    System.out.println("------------------");
                    break;
                case 2:
                    System.out.println("-----CLAVE-----");
                    String descifrar = "";
                    String resultado = "";
                    String mensaje = "";
                    String descifrarresultado = "";
                    boolean descifrado=false;

                    System.out.print("Ingresar mensaje a cifrar:");
                    mensaje = lea.next();

                    for (int i = 0; i < mensaje.length(); i++) {
                        char letra = mensaje.charAt(i);
                        if (letra >= 'a' && letra <= 'z') {
                            resultado += (char) ('z' - (letra - 'a'));
                        } else if (letra >= 'A' && letra <= -'Z') {
                            resultado += (char) ('Z' - (letra - 'A'));
                        } else {
                            resultado += letra;

                        }
                    }
                    System.out.println("Mensaje Cifrado:" + resultado);

                    System.out.println("¿Deseas descifrar este mensaje? (si/no): ");
                    String respuesta = lea.next().toLowerCase();
                    
                    if(respuesta.equals("si")){
                        descifrado=true;
                    }else if(respuesta.equals("no")){
                        descifrado=false;
                    }
                    while (descifrado) {
                        for (int i = 0; i < resultado.length(); i++) {
                            char letra = resultado.charAt(i);
                            if (letra >= 'a' && letra <= 'z') {
                                descifrarresultado += (char) ('z' - (letra - 'a'));
                            } else if (letra >= 'A' && letra <= -'Z') {
                                descifrarresultado += (char) ('Z' - (letra - 'A'));
                            } else {
                                descifrarresultado += letra;
                            }
                        }
                        System.out.println("Mensaje Descifrado:" + descifrarresultado);
                        break;
                    }
                    System.out.println("---------------");
                    break;
                case 3:
                    System.out.println("-----PIEDRA,PAPEL,TIJERA-----");
                    Random random = new Random();
                    boolean seguir = true;
                    String eleccion;
                    System.out.println("Bienvenido al Juego de Piedra,Papel y Tijera");
                    while (seguir) {
                        do {
                            System.out.print("Seleccione una opcion(piedra,papel,tijera):");
                            eleccion = lea.next();
                        } while (!eleccion.equals("piedra") && !eleccion.equals("papel") && !eleccion.equals("tijera"));
                        int opcionsistema = random.nextInt(3);
                        String eleccionsistema = "";
                        switch (opcionsistema) {
                            case 0:
                                eleccionsistema = "piedra";
                                break;
                            case 1:
                                eleccionsistema = "papel";
                                break;
                            case 2:
                                eleccionsistema = "tijera";
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }
                        System.out.println("Eleccion del sistema:" + eleccionsistema);
                        if (eleccion.equals(eleccionsistema)) {
                            System.out.println("Empate");
                        } else if (eleccion.equals("piedra") && eleccionsistema.equals("tijera")) {
                            System.out.println("Ganaste");
                        } else if (eleccion.equals("papel") && eleccionsistema.equals("piedra")) {
                            System.out.println("Ganaste");
                        } else if (eleccion.equals("tijera") && eleccionsistema.equals("papel")) {
                            System.out.println("Ganaste");
                        } else {
                            System.out.println("Perdiste");
                        }
                        System.out.print("Quieres seguir jugando(si/no):");
                        String respuestaU = lea.next().toLowerCase();
                        if (respuestaU.equals("si")) {
                            seguir = true;
                        } else if (respuestaU.equals("no")) {
                            seguir = false;
                        }

                    }
                    System.out.println("---------------");
                    break;
                case 4:
                    System.out.println("-----ADIVINAR-----");
                    Random numrandom = new Random();
                    int numerorandom = numrandom.nextInt(100) + 1;
                    int intentos = 10;
                    boolean correcto = false;
                    for (int i = 1; i <= intentos; i++) {
                        System.out.print("Intento" + i + ":");
                        int intento = lea.nextInt();
                        if (intento == numerorandom) {
                            System.out.println("Correcto Total de Intentos:" + i);
                            correcto = true;
                            break;
                        } else if (intento < numerorandom) {
                            System.out.println("El numero es mayor");
                        } else if (intento > numerorandom) {
                            System.out.println("El numero es menor");
                        }
                    }
                    if (!correcto) {
                        System.out.println("Intentos maximos alcanzados" + "El numero Correcto es:" + numerorandom);
                    }
                    System.out.println("---------------");
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
