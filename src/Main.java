public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(15);
        System.out.println("edad: " + cliente.edad);
        cliente.setTelefono(232332342);
        System.out.println("Numero de telefono: "+ cliente.telefono );
        cliente.setNombre("Nelson");
        System.out.println("Nombre: "+ cliente.nombre);
        cliente.setCredito((float) 300.00);
        System.out.println("Credito del cliente: $"+ cliente.credito);
        Trabajador trabajador = new Trabajador();
        trabajador.setSalario((float) 600.55);
        System.out.println("Salario del trabajador: $"+trabajador.salario);




    }

}
abstract class Persona {
    int edad;
    String nombre;
    int telefono;

    //Getters
    abstract public int getEdad();
    abstract public String getNombre();
    abstract public int getTelefono();

    //setters
    abstract public void setEdad(int edad);
    abstract public void setNombre(String nombre);
    abstract public void setTelefono(int telefono);


}
class Cliente extends Persona{
    float credito;
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getTelefono(){
        return this.telefono;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public void setCredito(float credito){
        this.credito = credito;
    }


}
class Trabajador extends Persona{
    float salario;
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getTelefono(){
        return this.telefono;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }
}