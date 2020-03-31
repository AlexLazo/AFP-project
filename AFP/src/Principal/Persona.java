package Principal;
/**
 *
 * @author alexl
 */
public class Persona {
      protected String NombreCompleto;
      protected double Edad;
      protected double Dui;
      protected double Salario;
      protected double Descuento;
                       
    public Persona (
            String NombreCompleto, 
            double Edad, 
            double Dui, 
            double Salario, 
            double Descuento){
       this.NombreCompleto= NombreCompleto;
       this.Edad= Edad;
       this.Dui= Dui;
       this.Salario= Salario;
       this.Descuento= Descuento;
    }
    public String getNombreCompleto(){
        return NombreCompleto;
    }
    public double getEdad (){
        return Edad;
    }
    public double getDui(){
        return Dui;
    }
    public double getSalario(){
        return Salario;
    }
    public double getDescuento(){
        Descuento= Salario*0.13;
        return Descuento;
    }
    public String mostrarDatos(){
        return "Nombre: "+NombreCompleto+"Edad: "+Edad+"Dui: "+Dui+"Salario: "+Salario+"Descuento"+Descuento;
    }
}
