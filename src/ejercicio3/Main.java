package ejercicio3;

import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int factorial = 1;
        int contador = 1;
        System.out.println("Ingresar un numero del 1 al 10");
        numero = scanner.nextInt();

        if (numero >=1 & numero <=10) {
            while (contador <=numero) {
                factorial = factorial*contador;
                contador ++;
            }
            System.out.println("El numero factorial es: " + factorial);

            
        } else {System.out.println("El numero que ingreso es Incorrecto");}

        
    }

}
