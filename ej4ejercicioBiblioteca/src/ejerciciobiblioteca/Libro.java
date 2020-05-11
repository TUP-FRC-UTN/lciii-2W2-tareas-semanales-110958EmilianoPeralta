package ejerciciobiblioteca;

public class Libro {
    String titulo;
    int precio;
    int estado;
    Prestamo[] prestamo;
    
    public Libro(int cantidadPrestamos){
        prestamo = new Prestamo[cantidadPrestamos];
    }   

    public Libro(){}
    
    public Libro(String titulo, int precio, int estado) {
        this.titulo = titulo;
        this.precio = precio;
        this.estado = estado;
    }
    
    public void agregarPrestamo(Prestamo nuevo){
        for (int i = 0; i < prestamo.length; i++) {
            if (prestamo[i] == null) {
                prestamo[i] = nuevo;
                break;
            }            
        }
    }
    
    public String listadoSolicitantes(){
        String l = "";
        for (int i = 0; i < prestamo.length; i++) {
            if (prestamo[i] != null) {
                l += prestamo[i].getSolicitante() + " ";
            }            
        }
        return l;
    }
    
    public int cantidadPrestamos(){
        int c = 0;
        for (int i = 0; i < prestamo.length; i++) {
            if (prestamo[i] != null) {
                c++;
            }            
        }
        return c;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Prestamo[] getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo[] prestamo) {
        this.prestamo = prestamo;
    }
    
    
}
