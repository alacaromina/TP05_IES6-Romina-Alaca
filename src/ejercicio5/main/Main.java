package ejercicio5.main;

import java.time.LocalDate;

import ejercicio5.model.Persona;

public class Main {
    public static void main(String[] args) {
        
        // carga de datos
        Persona persona1 = new Persona();
        persona1.setDni("46598229");;
        persona1.setNombre("Romina");;
        persona1.setFechaNac(LocalDate.of(2005, 06, 22));
        persona1.setProvincia("Salta");

        // constructor por defecto 
        Persona persona2 = new Persona(
             "46471391",
             "Camila",
            LocalDate.of(2005, 4, 07),
            "Buenos Aires"
            
        );

        // constructor parametrizado 
        Persona persona3 = new Persona(
             "37644744",
             "Franco",
            LocalDate.of(1995, 9, 16)
        );

        // constructor parametrizado
        persona1.mostraDatos();
        System.out.println("..............");

        persona2.mostraDatos();
        System.out.println("..............");

        persona3.mostraDatos();
    
    }
}
