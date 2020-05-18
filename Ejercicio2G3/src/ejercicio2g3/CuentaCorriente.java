package ejercicio2g3;

public class CuentaCorriente extends Cuenta {
    double acuerdo;

    public double getAcuerdo() {
        return acuerdo;
    }
    public void setAcuerdo(double acuerdo) {
        this.acuerdo = acuerdo;
    }
    
    public String puedeExtraerLimite(double monto){
        String t = "";
        if (super.getSaldo() - monto >= acuerdo){
            super.extraer(monto);
            t = "Extracción correcta. Su saldo actual es: $" + super.getSaldo();
        }
        else
            t = "No se puede extraer esa cantidad. Su saldo actual es: $";
        return t;
    }
    
    public void depositarAca(double d){
        super.depositar(d);
    }
    
    public CuentaCorriente(double acuerdo, int numero, String nombre, double saldo){
        super(numero,nombre,saldo);
        this.acuerdo = acuerdo;
    }

    @Override
    public String toString() {
        return super.toString() + "CuentaCorriente{" + "acuerdo=" + acuerdo + '}';
    }    
}
