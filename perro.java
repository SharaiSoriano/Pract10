public class perro extends Animal{
    public perro(String nombre, int year){
        super(nombre,year);
    }
    
    @Override
    
    public void eat(){
        System.out.println("El perro " + nombre + " esta comiendo");
    }
    public void jugar(){
        System.out.println(nombre + " esta jugando");
    }
    public void ladrar(){
        System.out.println(nombre + " ladra");
    } 
}