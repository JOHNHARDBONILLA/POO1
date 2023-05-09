package metodo;

public class Persona {
    String nombre;
    int edad;
    String cedula;
    //metodos 

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String cedula) {
        this.cedula = cedula;
    }
    public void resultado(){
        System.out.println("su nombre es: "+nombre);
        System.out.println("su edad es: "+edad);
        
    }
public void imprimir(){
    System.out.println("el numero del documento es: "+cedula);
}
        
        
        
    }

