import java.util.Scanner;

import models.Libreria;
import models.Libro;

public class App {
    static Scanner tcld = new Scanner(System.in);
    static Libreria libreria = new Libreria();
    public static void main(String[] args) throws Exception {
       menu();
    }
    
    public static void menu() {
        int option = 0;
        
        do {
            System.out.println("""
                    1. Agregar libro
                    2. Eliminar libro
                    3. Mostrar catálogo
                    4. Salir
                    """);
            option = tcld.nextInt();
            tcld.nextLine();
            switch (option) {
                case 1:
                    agregarLibro();
                    break;

                case 2:
                    eliminarLibro();
                    break;
                case 3:
                    mostrarLibros();
                    break;
                case 4:
                    System.out.println("Gracias por usar e");
                    break;
                default:
                    System.out.println("Valor incorrecto ingresado, ingrese un valor de 1 a 4");
                    break;
            }
        } while (option != 4);
    }
    public static void agregarLibro(){
        String titulo, autor;
        int isbn;
        System.out.println("Ingrese nombre del libro");
        titulo = tcld.nextLine();
        System.out.println("Ingrese autor del libro:");
        autor = tcld.nextLine();
        System.out.println("Ingrese ISBN del libro:");
        isbn = tcld.nextInt();
        tcld.nextLine();
        Libro nuevoLibro = new Libro(titulo, autor, isbn);
        libreria.agregarLibro(nuevoLibro);
        System.out.println("Libro agregado");
    }
    public static void eliminarLibro(){
        int isbn;
        System.out.println("Ingrese el isbn");
        isbn = tcld.nextInt();
        libreria.eliminarLibro(isbn);
    }
    public static void mostrarLibros(){
        libreria.mostrarCatalogo();
    }

}
