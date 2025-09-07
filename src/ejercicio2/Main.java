package ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero=scanner.nextInt();

        if (numero%2==0) {
           System.out.print("El numero es impar.El doble del numero es:"+(numero*2));
        } else {System.out.print("El numero es par.El triple del numero es:"+(numero*3));}
        
        scanner.close();
    }

}