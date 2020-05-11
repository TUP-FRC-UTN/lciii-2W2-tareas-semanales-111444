/*
3. Una empresa que fabrica caños de diferentes tipos, materiales y medidas está
desarrollando un sistema para automatizar la planificación y control de su circuito
productivo. Suponga que usted es parte del equipo de desarrollo y le asignan la
siguiente tarea:
- Desarrolle la clase Material de manera que contenga en su interior los
atributos: descripción (String) código(int) valorUnitario (float).
- Desarrolle la clase Producto de manera que contenga en su interior los
atributos descripción (String) y Materiales (Material[]).
- Desarrolle en la clase Producto un constructor que reciba por parámetro una
cantidad de elementos y dimensione el vector de materiales.
- Desarrolle en la clase Producto un método que permita agregar un Material
recibido por parámetro al vector.
- Desarrolle en la clase Producto un método que retorne el costo total. Dicho
valor se calcula sumando todos los valores unitarios de los Materiales que
componen el Producto.
- Desarrolle en la clase Producto un método que reciba por parámetro un código
de material y retorne true si dicho material forma parte del Producto.
- Desarrolle en la clase producto un método que retorne un vector con todos los
materiales que tengan un valor unitario menor a un parámetro.
- Desarrolle en la clase producto un método que retorne un vector donde cada
casillero contenga la cantidad de materiales por precio, siguiendo las siguiente
regla: Si 0 < precio ≤ 10 contarlo en el primer casillero. Si 10 < precio ≤ 20
contarlo en el segundo casillero. Si 20 < precio ≤ 30 contarlo en el tercer
casillero. Si precio > 30 contarlo en el cuarto casillero.
-   Desarrolle un programa principal que permita ingresar los datos de un
producto, cree un objeto de esa clase y luego posibilite mediante un menú
llamar a los métodos de los puntos 4 a 8 todas las veces y en el orden que el
usuario quiera.
 */
package tarea.ejercicio3.pkg1105;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TareaEjercicio31105 {


    public static void main(String[] args) {
        // TODO code application logic here
      Scanner sn = new Scanner(System.in);
        
        Producto producto;
        Producto productoCargado = new Producto();
        Material material;
        
        boolean productoIngresado = true;
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        
        while (!salir) {

            System.out.println("1. Nuevo Producto");
            System.out.println("2. Calcular Costo Total");
            System.out.println("3. Verificar Material");
            System.out.println("4. Materiales con cierto valor unitario");
            System.out.println("5. Cantidad de materiales por precio");
            System.out.println("6. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        productoIngresado = false;
                        System.out.println("Ingresar la cantidad de materiales del producto:");
                        producto = new Producto(sn.nextInt());
                        System.out.println("Ingresar Descripcion");
                        producto.setDescripcion(sn.nextLine());
                        System.out.println("Ingresar los materiales:");
                        
                        for (int i = 0; i < producto.getMateriales().length; i++) {
                            int cantidad = 0;
                            material  = new Material();
                            System.out.println("Cantidad Ingresada ("+cantidad+"/"+producto.getMateriales().length+").");
                            System.out.println("Material "+cantidad+"º");
                            System.out.println("Ingrese el codigo del producto");
                            material.setCodigo(sn.nextInt());
                            sn.nextLine();
                            System.out.println("Ingrese la descripcion:");
                            material.setDescripcion(sn.nextLine());
                            System.out.println("Ingrese el valor unitario:");
                            material.setValorUnitario(sn.nextFloat());
                            i++;
                            producto.agregarMaterial(material);
                                
                        }
                        productoCargado = producto;
                        System.out.println("Materiales ingresados");
                        break;
                    case 2:
                        if(productoIngresado){
                            System.out.println("Debe ingresar primeramente un producto");
                            break;
                        }
                        System.out.println("Costo Total:");
                        System.out.println("$"+productoCargado.costoTotal());
                        break;
                    case 3:
                        if(productoIngresado){
                            System.out.println("Debe ingresar primeramente un producto");
                            break;
                        }
                        System.out.println("Verificar Material:");
                        System.out.println("Ingrese el codigo del material:");
                        if(productoCargado.formaParte(sn.nextInt())){
                            System.out.println("El producto forma parte del producto");
                        }else{
                            System.out.println("El producto no forma parte del producto");
                        }
                        break;
                    case 4:
                        if(productoIngresado){
                            System.out.println("Debe ingresar primeramente un producto");
                            break;
                        }
                        System.out.println("Materiales precio menor:");
                        System.out.println("Ingrese el valor:");
                        productoCargado.nuevoVector(sn.nextFloat());
                        break;
                    case 5:
                        if(productoIngresado){
                            System.out.println("Debe ingresar primeramente un producto");
                            break;
                        }
                        System.out.println("Cantidad de productos por precio:");
                        System.out.println("Las cantidades son las siguientes:");
                        int[] cantidades = productoCargado.nuevoVector2();
                        System.out.println(cantidades[0]+"/"+cantidades[14]+"/"+cantidades[2]+"/"+cantidades[3]+"/");
                        break;
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 6");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }

        }

    }
}
