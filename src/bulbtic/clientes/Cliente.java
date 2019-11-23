//declaracion de packete
package bulbtic.clientes;

//declaracion de impots
import java.util.List;

//declaracion de clase
public class Cliente {
    
    

    //declaracion de atributos
    private String nombre;
    private String direccion;
    private List<String> facturas;

    //declaracion de constructor
    public Cliente(String nombre, String direccion, List<String> facturas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.facturas = facturas;
    }

    //declaracion de metodos
    //setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<String> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<String> facturas) {
        this.facturas = facturas;
    }

}
