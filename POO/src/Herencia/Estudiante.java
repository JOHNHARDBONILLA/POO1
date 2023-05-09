
package Herencia;

public class Estudiante extends Persona {

   private int cod_est;
   private float nota_final;
   
   //constructor

    public Estudiante(int cod_est, float nota_final, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.cod_est = cod_est;
        this.nota_final = nota_final;
    }
   
public void resultado(){
    System.out.println("el nombre del estudiante es: "+getNombre()+
            "\nEl apellido es: "+getApellido()+
            "\nLa edad es: "+ getEdad()+
            "\nel código es: "+cod_est+
            "\nla nota final es: "+nota_final);
}
    
}
