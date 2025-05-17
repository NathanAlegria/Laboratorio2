/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Nathan
 */
public class Alegria_Nathan_MenuOpciones {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        System.out.println("Menu");
        int[] contadoropciones=new int[4];
        int opcion;
        Random random=new Random();
        
        do{
            //Menu
            System.out.println("****Menú de Opciones****");
            System.out.println("1.Palabra Alreves");
            System.out.println("2.Número perfecto");
            System.out.println("3.Primos");
            System.out.println("4.Votaciones");
            System.out.println("5.Salir");
            System.out.println("Seleccione una opción:");
            opcion=lea.nextInt();
            if(opcion==1){
             //Palabra Alreves
             contadoropciones[0]++;
             System.out.println("Cuantas palabras ingresara");
             int num=lea.nextInt();
             String palabramaslarga="";
              boolean espalindromo=false;
             for(int i=1;i<=num;i++){
                    System.out.println("Palabra"+i+":");
                    String palabra=lea.next();
                    String invertida="";
                        for(int j=palabra.length()-1;j>=0;j--){
                            invertida+=palabra.charAt(j);
                        }
                        if(palabra.length()>palabramaslarga.length()){
                            palabramaslarga=palabra;
                        }
                        if (palabra==invertida){
                            espalindromo=true;
                        }
                        System.out.println("Palabra más Larga:"+palabramaslarga);
                        System.out.print("Hay alguna palindroma:"+(espalindromo?"Sí":"No"));
                    } 
            }
            if(opcion==2){

                    //Determinar si es perfecto
                    contadoropciones[1]++;
                    System.out.println("Ingresar numero para determinar si es perfecto:");
                    int numero=lea.nextInt();
                    int suma=0;
                    for(int i=1;i<numero;i++){
                        if(numero%i==0){
                        suma+=i;
                        }
                    }
                    if(suma==numero){
                    System.out.println(numero+"Es un numero perfecto");
                    }else{
                    System.out.println(numero+"No es un numero perfecto");
                    }
            }
            if(opcion==3){

                    //Generar numero y determinar si es primo o no
                    contadoropciones[2]++;
                    int aleatorio=random.nextInt(100)+1;
                    for(int i=1;i<=aleatorio;i++){
                        boolean primo;
                        int num1=aleatorio/i;
                        if(num1==aleatorio){
                            primo=true;
                        }else{
                            primo=false;
                        }
                        System.out.println("El numero es Primo:"+(primo?"Sí":"No"));
            }
            }
                if(opcion==4){
                   //Votaciones
                    contadoropciones[3]++;
                    System.out.println("Cuantos votantes hay en el país:");
                    int numvotantes=lea.nextInt();
                    int azul=0;
                    int rojo=0;
                    int amarillo=0;
                    int negro=0;
                    int nulos=0;
                    int mayorvotos=0;
                    for(int i=1;i<=numvotantes;i++){
                        System.out.println("Ingrese el voto#"+i+"(Azul,Rojo,Negro,Amarillo):");
                        String voto=lea.next();
                        switch(voto){
                            case "Azul":azul++;
                            break;
                            case "Rojo":rojo++;
                            break;
                            case "Negro":negro++;
                            break;
                            case "Amarillo":amarillo++;
                            break;
                            default:nulos++;
                            break;
                        }
                        int votosvalido=rojo+azul+amarillo+negro;
                        double porcentajevalido=votosvalido/numvotantes*100;
                        if(porcentajevalido<60){
                            System.out.println("Votación Fallida");
                        }else{
                            String ganador="";
                            if(azul>mayorvotos){
                                mayorvotos=azul;
                                ganador="Azul";
                            }
                            if(rojo>mayorvotos){
                                mayorvotos=rojo;
                                ganador="Rojo";
                            }
                            if(negro>mayorvotos){
                                mayorvotos=negro;
                                ganador="Negro";
                            }
                            if(amarillo>mayorvotos){
                                mayorvotos=amarillo;
                                ganador="Amarillo";
                            }
                            System.out.println("La planilla ganadora es:"+ganador);
                        }
                    }
                    
               }
               if(opcion==5){
                   //salida de pantalla
                   System.out.println("****Menú de Opciones****");
            System.out.println("1.Palabra Alreves:"+contadoropciones[0]+"veces");
            System.out.println("2.Número perfecto:"+contadoropciones[1]+"veces");
            System.out.println("3.Primos:"+contadoropciones[2]+"veces");
            System.out.println("4.Votaciones:"+contadoropciones[3]+"veces");
            break;
        }
               if(opcion>=6){
                   System.out.println("Opción Invalida");
               }
}while(opcion!=5);
}
}

