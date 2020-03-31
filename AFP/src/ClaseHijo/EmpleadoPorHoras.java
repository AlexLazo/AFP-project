
package ClaseHijo;

import Principal.Persona;

/**
 *
 * @author alexl
 */
public class EmpleadoPorHoras extends Persona{
    double HorasTrabajadas;
    double PagoPorHora=10;
    
    public EmpleadoPorHoras(String NombreCompleto, double Edad, double Dui, double Salario, double Descuento) {
        super(NombreCompleto, Edad, Dui, Salario, Descuento);
    this.Salario= Salario;
    this.Descuento= Descuento;
    
    }
    public int getHorasTrabajadas(){
        return (int)(getHorasTrabajadas()*PagoPorHora);
    }
    @Override
    public double getDescuento(){
       Descuento= Salario*0.13;
        return Descuento;
}
     public String mostrarDatos(){
         System.out.println ("Nombre: "+NombreCompleto+
                 "\nEdad: "+Edad+
                 "\nDui: "+Dui+
                 "\nSalario: "+Salario+
                 "\nDescuento"+Descuento);
        return null;
     }
}
