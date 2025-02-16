import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nombre = "Kayder Murillo";
        byte edad = 21;
        short numeroDepartamento = 40;
        int cedula = 1756396;
        long telefono = 123456789L;
        float temperatura = 36.5f;
        double altura = 1.67;
        char genero = 'M';
        boolean esResidente = false;

        System.out.println("\n\tRegistro del Visitante");
        System.out.println("Nombre y apellido: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Numero de departamento: " + numeroDepartamento);
        System.out.println("Cedula o Pasaporte: " + cedula);
        System.out.println("Telefono o Celular: " + telefono);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Altura: " + altura);
        System.out.println("Genero: " + genero);
        System.out.println("¿Es usted un Residente?: " + (esResidente ? "Si" : "No"));

    }
}