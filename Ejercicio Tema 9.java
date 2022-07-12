public class Main {
    
    public static void main(String[] args){
        Cliente cliente = new Cliente ();
        Trabajador trabajador = new Trabajador();
        
        cliente.nombre = "Agustin";
        cliente.edad = 34;
        cliente.telefono = 517362980;
        cliente.credito = 1025.50;
        System.out.println("Soy " + cliente.nombre + ", tengo " + cliente.edad + " años. Mi numero de telefono es " + cliente.telefono + ". Mi credito es $" + cliente.credito + ".");
        
        trabajador.nombre = "Nicolas";
        trabajador.edad = 42;
        trabajador.telefono = 514558462;
        trabajador.salario = 50521.99;
        System.out.println("Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años. Mi numero de telefono es " + trabajador.telefono + ". Mi salario es $" + trabajador.salario + ".");
    }
}
class Persona{
    String nombre;
    int edad;
    int telefono;
}
    
class Cliente extends Persona{
    double credito;
}
    
class Trabajador extends Persona{
    double salario;
}

