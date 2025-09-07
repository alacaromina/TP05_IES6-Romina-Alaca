package ejercicio1;

public class Main{
     public static void main(String[] args) {
        String pais = "Argentina";
        int edadPersona = 27;
        double alturaEdificio = 125.9;
        double precioProducto = 569.99;
        String numeroTelefono = "3886006478";
        double coseno = Math.cos(0.5);

        System.out.println("País: " + pais);
        System.out.println("Edad de la persona: " + edadPersona);
        System.out.println("Altura del edificio: " + alturaEdificio + " metros");
        System.out.println("Precio del producto: " + precioProducto);
        System.out.println("Número de teléfono: " + numeroTelefono);
        System.out.println("Cálculo de cos(0.5): " + coseno);
        
        int num1 = 8, num2 = 5, num3 = 1, num4 = 20, num5 = 9;
        double promedio = (num1 + num2 + num3 + num4 + num5) / 5.0;
        System.out.println("Valores: " + num1 + ", " + num2 + ", " + num3 + ", " + num4
        +  ", " + num5);
        System.out.println("El promedio es: " + promedio);
      }
   }
