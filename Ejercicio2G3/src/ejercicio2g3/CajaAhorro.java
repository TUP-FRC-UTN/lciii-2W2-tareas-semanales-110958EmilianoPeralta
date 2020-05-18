package ejercicio2g3;

public class CajaAhorro extends Cuenta {

    public String puedeExtraer(double valor){
        String t = "";
        if (valor < saldo) {
            super.extraer(valor);
            t = "Su saldo ahora es: $" + saldo;
        }
        else
            t = "No posee saldo suficiente para esa extracción...";
        return t;
    }
    
    public void depositarAca(double d){
        super.depositar(d);
    }
    
    public CajaAhorro(int numero, String nombre, double saldo){
        super(numero,nombre,saldo);
    }

    @Override
    public String toString() {
        return super.toString();
    }    
}
