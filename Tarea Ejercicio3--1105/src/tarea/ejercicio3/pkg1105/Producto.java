/*
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
-       Desarrolle en la clase producto un método que retorne un vector donde cada
casillero contenga la cantidad de materiales por precio, siguiendo las siguiente
regla: Si 0 < precio ≤ 10 contarlo en el primer casillero. Si 10 < precio ≤ 20
contarlo en el segundo casillero. Si 20 < precio ≤ 30 contarlo en el tercer
casillero. Si precio > 30 contarlo en el cuarto casillero. */
package tarea.ejercicio3.pkg1105;

public class Producto {

    public Producto(int cantMateriales) {
        this.materiales = new Material[cantMateriales];
        //example Producto producto = new Producto(10); => Material[10];
    }

    public Producto() {
    }

    public Producto(String descripcion, Material[] materiales) {
        this.descripcion = descripcion;
        this.materiales = materiales;
    }
    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Material[] getMateriales() {
        return materiales;
    }

    public void setMateriales(Material[] materiales) {
        this.materiales = materiales;
    }

    public boolean agregarMaterial(Material material) {
        boolean respuesta = false;
        int i = 0;
        for (Material mat : this.materiales) {
            if (mat == null) {
                this.materiales[i] = material;
                respuesta = true;
                break;
            }
            i++;
        }

        return respuesta;
    }

    public double costoTotal() {
        double costoTotal = 0;
        for (Material mat : this.materiales) {

            costoTotal = costoTotal + mat.getValorUnitario();
        }
        return costoTotal;
    }

    public boolean formaParte(int codigoMaterial) {
        boolean formaParte = false;
        for (Material mat : this.materiales) {

            if (codigoMaterial == mat.getCodigo()) {
                formaParte = true;
                break;
            }
        }

        return formaParte;
    }

    public Material[] nuevoVector(double valor) {
        int i = 0;
        Material[] mat2 = new Material[this.materiales.length];
        for (Material mat : this.materiales) {
            if (mat.getValorUnitario() < valor) {
                mat2[i] = mat;
            }
            i++;
        }
        return mat2;
    }

    /*-       Desarrolle en la clase producto un método que retorne un vector donde cada
casillero contenga la cantidad de materiales por precio, siguiendo las siguiente
regla: Si 0 < precio ≤ 10 contarlo en el primer casillero. Si 10 < precio ≤ 20
contarlo en el segundo casillero. Si 20 < precio ≤ 30 contarlo en el tercer
casillero. Si precio > 30 contarlo en el cuarto casillero. */
    public int[] nuevoVector2() {
        int cont0 = 0;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int[] mat3 = new int[4];
        for (Material mat : this.materiales) {
            if (mat.getValorUnitario() > 0 && mat.getValorUnitario() < 10) {
                cont0++;
                mat3[0] = cont0;
            } else {
                if (mat.getValorUnitario() < 10 && mat.getValorUnitario() >= 20) {
                    cont1++;
                    mat3[1] = cont1;
                } else {
                    if (mat.getValorUnitario() < 20 && mat.getValorUnitario() >= 30) {
                        cont2++;
                        mat3[2] = cont2;
                    } else {
                        cont3++;
                        mat3[3] = cont3;
                    }
                }
            }

        }

        return mat3;
    }

    private String descripcion;
    private Material[] materiales;
}
