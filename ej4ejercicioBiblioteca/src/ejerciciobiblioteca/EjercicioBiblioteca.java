package ejerciciobiblioteca;

import java.util.*;

public class EjercicioBiblioteca {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bienvenido a la biblioteca");
        System.out.println("--------------------------");
        System.out.println("Ingrese la cantidad de libros de la biblioteca: ");
        int cant = s.nextInt();
        
        Biblioteca b = new Biblioteca(cant);
        Libro l = new Libro(cant);
        
        for (int i = 0; i < b.libros.length; i++) {
            System.out.println("Ingrese el título del libro " + (i + 1));
            String t = s.nextLine();
            s.nextLine();
            System.out.println("Ingrese el precio del libro " + (i + 1));
            int precio = s.nextInt();
            System.out.println("Ingrese el estado del libro " + (i + 1) + " ((1: disponible, 2: prestado, 3:\n" +
"extraviado)");
            int e = s.nextInt();
            System.out.println("Indique el nombre del solicitante del préstamo del libro " + (i + 1));
            String nombre = s.nextLine();
            s.nextLine();
            System.out.println("Indique la cantidad de días del préstamo del libro " + (i + 1));
            int c = s.nextInt();
            System.out.println("Indique si el libro " + (i + 1) + " fue devuelto o no (1-Si, 2-No): ");
            int num = s.nextInt();
            boolean d = false;
            if (num == 1) 
                d = true;
            else if (num == 2)
                d = false;
            
            b.libros[i] = new Libro(t,precio,e);
            l.prestamo[i] = new Prestamo(nombre,c,d);
        }
        
        
        System.out.println("La cantidad de libros en cada estado es: " + Arrays.toString(b.cantidadLibrosPorEstado()));
        System.out.println("La sumatoria del precio de reposición de todos los libros extraviados es: " + b.sumaPrecioExtraviados());
        System.out.println("Nombre de todos los solicitantes de un libro en particular identificado por su título ");
        System.out.println("Ingrese el título: ");
        String titulo = s.nextLine();
        s.nextLine();                
        System.out.println(b.listadoSolicitantes(titulo));
        System.out.println("Promedio de veces que fueron prestados los libros de la biblioteca: " + b.promedioPrestamos());         
    }
    
}
