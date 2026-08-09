package ui;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Bienvenido, "+nombre);
        System.out.println("RESTO DEL SISTEMA WIP, PRESIONAR ENTER PARA FINALIZAR");
        sc.nextLine();
        System.out.println("Adios, "+nombre);
    }
}