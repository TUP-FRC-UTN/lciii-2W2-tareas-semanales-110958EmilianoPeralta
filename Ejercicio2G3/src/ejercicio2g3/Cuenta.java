package ejercicio2g3;

public class Cuenta {
    protected int numero;
    protected String nombre;
    protected double saldo;
    
    private int getNumero(){
        return numero;
    }
    private void setNumero(int numero){
        this.numero = numero;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double deposito){
        saldo += deposito;
    }
    public void extraer(double valor){
        saldo = saldo - valor;
    }

    public Cuenta(int numero, String nombre, double saldo) {
        this.numero = numero;
        this.nombre = nombre;
        this.saldo = saldo;
    }    

    @Override
    public String toString() {
        return "Cuenta{" + "numero=" + numero + ", nombre=" + nombre + ", saldo=" + saldo + '}';
    } 
}
