/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3;
import java.util.Scanner;
/**
 *
 * @author Nathan
 */
public class Alegria_Nathan_MenuOpciones {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        System.out.println("Menu");
        int contadoropciones=0;
        int opcion;
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
            switch(opcion){
                case 1:
                    //Palabra Alreves
                    contadoropciones++;
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
                 break;
               case 2:
                    contadoropciones++;
                    System.out.println("Ingresar numero para determinar si es perfecto:");
                    int numero=lea.nextInt();
                    int suma=0;
                    for(int i=1;i<numero;i++){
                        if(numero%i==0){
                        suma+=1;
                        }
                    }
                    if(suma==numero){
                    System.out.println(numero+"Es un numero perfecto");
                    }else{
                    System.out.println(numero+"No es un numero perfecto");
                    }
                    }
                    break;
                case 3:
                    
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }while(opcion!=5);

}
}
