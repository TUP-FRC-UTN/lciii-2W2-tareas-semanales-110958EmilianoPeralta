package ejercicio2g3;

import java.util.Scanner;

public class Ejercicio2G3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese a qué tipo de cuenta quiere acceder (1 - Caja de Ahorro; 2 - Cuenta Corriente): ");
        int n = s.nextInt();
        if (n == 1) {
            System.out.println("La cuenta elegida es caja de ahorro: ");
            
            CajaAhorro ca = new CajaAhorro(1, "Caja 1", 100);
            System.out.println(ca.toString());
            
            System.out.println("¿Qué quiere hacer? 1 - Extraer dinero, 2 - Depositar dinero");
            int op = s.nextInt();
            if (op == 1) {
                System.out.println("Eliga el monto a extraer de su Caja de Ahorro: ");
                double m = s.nextDouble();            
                System.out.println(ca.puedeExtraer(m));
            }
            else if (op == 2) {
                System.out.println("Eliga el monto a depositar en su Caja de Ahorro: ");
                double mon = s.nextDouble();
                ca.depositarAca(mon);
                System.out.println("El monto actual es de " + ca.getSaldo());
            }            
        }
        else if (n == 2) {
            CuentaCorriente cc = new CuentaCorriente((-2000), 2, "Cuenta 2", 10000);
            System.out.println(cc.toString());
            
            System.out.println("¿Qué quiere hacer? 1 - Extraer dinero, 2 - Depositar dinero");
            int op = s.nextInt();
            if (op == 1) {
                System.out.println("Eliga el monto a extraer de su Cuenta Corriente: ");
                double m = s.nextDouble();            
                System.out.println(cc.puedeExtraerLimite(m));
            }
            else if (op == 2) {
                System.out.println("Eliga el monto a depositar en su Cuenta Corriente: ");
                double mon = s.nextDouble();
                cc.depositarAca(mon);
                System.out.println("El monto actual es de $" + cc.getSaldo());
            }
        }
        else
            System.out.println("Ingrese un valor válido (1 o 2)");
    }    
}
