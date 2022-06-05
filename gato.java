public class gato extends Animal{
    public gato(String nombre, int year){
        super(nombre,year);
    }
    
    @Override
    public void eat(){
        System.out.println("El gato " + nombre + " esta comiendo");
    }
    public void jugando(){
        System.out.println("El gato " + nombre + " esta jugando");
    } 
}