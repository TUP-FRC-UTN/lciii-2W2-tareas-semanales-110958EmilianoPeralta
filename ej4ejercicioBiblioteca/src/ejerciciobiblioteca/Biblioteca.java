package ejerciciobiblioteca;

public class Biblioteca {
    Libro[] libros;
    
    public Biblioteca(int cantidadLibros){
        libros = new Libro[cantidadLibros];
    }
    
    public void agregarLibro(Libro l){
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] == null) {
                libros[i] = l;
                break;
            }            
        }
    }
    
    public int cantidadLibros(int estado){
        int c = 0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                if (libros[i].getEstado() == estado)                 
                    c++;
            }            
        }
        return c;
    }
    
    public int[] cantidadLibrosPorEstado(){
        int[] c = new int[3];
        int c1 = 0, c2 = 0, c3 = 0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                if (libros[i].getEstado() == 1)
                    c1++;
                if (libros[i].getEstado() == 2)
                    c2++;
                if (libros[i].getEstado() == 3)
                    c3++;
            }            
        }
        c[0] = c1; c[1] = c2; c[2] = c3;
        return c;
    }
    
    public String listadoSolicitantes(String titulo){
        String listado = "";
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null && libros[i].getTitulo() == titulo) {
                listado += " " + libros[i].listadoSolicitantes();
            }
        }
        return listado;
    }
    
    public float promedioPrestamos(){
        float promedio = 0;
        int contador = 0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null && libros[i].getEstado() == 2) {
                contador++;
            }            
        }
        promedio = (contador/libros.length);
        return promedio;
    }
    
    public float sumaPrecioExtraviados(){
        float suma = 0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null && libros[i].getEstado() == 3) {
                suma += libros[i].getPrecio();
            }            
        }
        return suma;
    }
}
