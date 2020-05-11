package empresacanios;

public class Material {
    String descripcion;
    int codigo;
    double valorUnitario;
    
    public String getDescripcion(){
        return descripcion;
    }
    public int getCodigo(){
        return codigo;
    }
    public double getValorUnitario(){
        return valorUnitario;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Material(String descripcion, int codigo, double valorUnitario) {
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.valorUnitario = valorUnitario;
    }
    
    
}
