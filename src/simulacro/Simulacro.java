/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacro;
import simulacro.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Antonio Jesus
 */
public class Simulacro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       HashMap<String, Producto> tienda = new HashMap<String, Producto>();
        boolean salir=false;
        int op=0;
        int stocknuevo=0;
        boolean repetir=false;
        String intcodigo="";
        int op2=0;
        String cod="";
        String nombrenuevo="";
        String nom="";
        double pre=0;
        double prenue=0;
        double total=0;
        int stock=0;
        Scanner s = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido  a   T I E N D E S I T A ");
        
        do {
            System.out.println("1 -->Insertar producto");
            System.out.println("2 -->listado");
            System.out.println("3 -->Modificar producto");
            System.out.println("4 -->Eliminar producto");
            System.out.println("5 -->SALIR");
            op=s.nextInt();
            switch (op) {
                case 1:
                    do {
                        
                    repetir=true;
                    
                    System.out.println("Introduzca codigo");
                    cod=sc.nextLine();
                    System.out.println("Introduzca nombre");
                    nom=sc.nextLine();
                    System.out.println("Introduzca precio");
                    pre=s.nextDouble();
                    System.out.println("Introduzca un stock");
                    stock=s.nextInt();
                    
                    if (tienda.containsKey(cod)) {
                        System.out.println("Lo siento no se puede crear el producto por que ya esta en la tienda");
                        repetir=false;
                    }else{
                            tienda.put(cod, new Producto(cod,nom,pre,stock));
                        }
                    } while (repetir==false);
                    
                    break;
                case 2:
                    System.out.println("- - - -----------Listado--------- - - -\n\n");
                    int i =1;
                    for (Map.Entry valor: tienda.entrySet()) {
                        System.out.println(i+" "+valor.getValue());
                        i++;
                       }
                    Producto.total();
                    
                    
                    
                    break;
                case 3:
                    System.out.println("Has seleccionado modificar");
                    System.out.println("1 --> Añadir al stock");
                    System.out.println("2 --> Venta");
                    System.out.println("3 --> Cambiar nombre");
                    System.out.println("4 --> Cambiar precio");
                    System.out.println("Intrduzca la opcion");
                    op2=s.nextInt();
                    System.out.println("- - - -----------Listado--------- - - -\n\n");
                    int j =1;
                    for (Map.Entry valor: tienda.entrySet()) {
                        System.out.println(j+" "+valor.getValue());
                        j++;
                       }
                    
                    switch (op2) {
                        case 1:
                            System.out.println("Introduzca el codigo del producto: ");
                            intcodigo=sc.nextLine();
                            System.out.println("El producto seleccionado es: "+tienda.get(intcodigo).toString());
                            System.out.println("El numero de Stock que tiene es: "+tienda.get(intcodigo).getStock() );
                            System.out.println("Introduzca el stock que desea introducir");
                            stocknuevo=s.nextInt();
                            tienda.get(intcodigo).setStock(stocknuevo);
                            System.out.println("Se ha establecido el nuevo estock a: "+tienda.get(intcodigo).getStock());
                               
                            break;
                        case 2:
                            System.out.println("En la venta por defecto se decrementara 1 al stock");
                            System.out.println("Introduce el codigo viendo la lista de arriba");
                            intcodigo=sc.nextLine();
                            
                            System.out.println("El producto que as seleccionado es "+tienda.get(intcodigo).toString());
                            System.out.println("Tiene como estock "+tienda.get(intcodigo).getStock());
                            tienda.get(intcodigo).setStock(tienda.get(intcodigo).getStock()-1);
                            System.out.println("El stock se ha quedado en la cantidad de :"+tienda.get(intcodigo).getStock());
                            break;
                            
                        case 3:
                            
                            System.out.println("Introduce el codigo viendo la lista de arriba para cambiarle el nombre");
                            intcodigo=sc.nextLine();
                            
                            System.out.println("El producto que as seleccionado es "+tienda.get(intcodigo).getNombre());
                            System.out.println("Introduce el nombre nuevo");
                            nombrenuevo=sc.nextLine();
                            tienda.get(intcodigo).setNombre(nombrenuevo);
                            System.out.println("El stock se ha quedado en la cantidad de :"+tienda.get(intcodigo).getNombre());
                            
                            break;
                        case 4:
                            System.out.println("Introduce el codigo viendo la lista de arriba para cambiarle el nombre");
                            intcodigo=sc.nextLine();
                            
                            System.out.println("El producto que as seleccionado es "+tienda.get(intcodigo).getNombre()+" que tiene el precio de: "+tienda.get(intcodigo).getPrecio());
                            System.out.println("Introduce el precio nuevo");
                            prenue=sc.nextDouble();
                            tienda.get(intcodigo).setPrecio(prenue);
                            System.out.println("El precio se ha quedado a la cantidad de :"+tienda.get(intcodigo).getPrecio());
                            break;
                            
                            
                        default:
                            System.out.println("Por favor introduzca un numero correcto");
                    }
                    break;
                case 4:
                    System.out.println("Introduzca el codigo del producto que desea borrar");
                    intcodigo=sc.nextLine();
                    System.out.println("Has seleccionado el producto "+tienda.get(intcodigo).toString());
                    tienda.remove(intcodigo);
                    System.out.println("Se ha borrado con exito");
                    break;
                    
                case 5:
                    System.out.println("Saliendo....");
                    salir=true;
                    break;
                    
                    
                default:
                    System.out.println("Introduzca un numero correcto porfavor");
                    
                            
                    
            }
            
        } while (salir ==false);
        
    }
    
}
