package empresacanios;

import java.util.*;

public class EmpresaCanios {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Cantidad de productos a registrar: ");
        int cant = s.nextInt();
        
        Producto p = new Producto(cant);
        
        //- Carga de datos
        for (int i = 0; i < p.materiales.length; i++) {
            System.out.println("Ingrese la descripción del producto " + (i + 1));
            String d = s.nextLine();
            p.setDescripcion(d);
            s.nextLine();
            System.out.println("Ingrese la descripción del material del producto " + (i + 1));
            String dM = s.nextLine();
            System.out.println("Ingrese el código del material del producto " + (i + 1));
            int c = s.nextInt();
            System.out.println("Ingrese el valor unitario del material del producto " + (i + 1));
            double v = s.nextDouble();
            p.materiales[i] = new Material(dM,c,v);
        }
        
        System.out.println("*************************************************************************************************");
        System.out.println("* Ingrese: 1 - Para agregar un nuevo material...                                                *");
        System.out.println("*          2 - Para obtener el costo total de los materiales...                                 *");
        System.out.println("*          3 - Para ingresar un código de material y verificar si forma parte de un Producto... *");
        System.out.println("*          4 - Para obtener la cantidad de materias por precio...                               *");
        System.out.println("*************************************************************************************************");
        
        int num = s.nextInt();
        switch (num){
            case 1: 
                System.out.println("Ingrese la descripción del material del producto: ");
                String dM = s.nextLine();
                System.out.println("Ingrese el código del material del producto: ");
                int c = s.nextInt();
                System.out.println("Ingrese el valor unitario del material del producto: ");
                double v = s.nextDouble();
                Material mat = new Material(dM,c,v);
                p.agregarMaterial(mat);
                break;
            case 2:
                System.out.println(p.costoTotalMateriales());
                break;
            case 3:
                System.out.println("Ingrese el código: ");
                int cod = s.nextInt();
                if (p.esDelProducto(cod) == true) 
                    System.out.println("Si forma parte del producto");
                else
                    System.out.println("No forma parte del producto");
                break;
            case 4:
                System.out.println(Arrays.toString(p.cantidadMaterialesXPrecio()));
                break;
        }
    }
    
}
