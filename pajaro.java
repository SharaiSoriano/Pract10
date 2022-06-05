class Pajaro extends Animal{
    public Pajaro(String nombre, int edad){
        super(nombre, edad);
    }
    
    @Override
    public void eat(){
        System.out.println("El pajaro" + nombre + "está comiendo calcio");
    }
    public void cantar(){
        System.out.println(nombre + "esta haciendo pio pio");
    } 
}