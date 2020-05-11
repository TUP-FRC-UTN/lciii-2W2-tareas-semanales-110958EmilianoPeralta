package ejerciciobiblioteca;

public class Prestamo {
    String solicitante;
    int cantidadDias;
    boolean devuelto;
    
    public Prestamo(){}
    public Prestamo(String solicitante, int cantidadDias, boolean devuelto) {
        this.solicitante = solicitante;
        this.cantidadDias = cantidadDias;
        this.devuelto = devuelto;
    }

    public String getSolicitante() {
        return solicitante;
    }
    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }
    public int getCantidadDias() {
        return cantidadDias;
    }
    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }
    public boolean getDevuelto() {
        return devuelto;
    }
    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }    
}
