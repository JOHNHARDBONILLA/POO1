
package Herencia;

public class Persona {
  //atributos

private String nombre;
private String apellido;
private int edad;

//constructor

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    
    
    
}
