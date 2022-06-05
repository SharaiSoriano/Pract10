public class Animal {
    String nombre;
    int year;
    boolean vacuna;
    public Animal(String nombre, int year){
        this.nombre = nombre;
        this.year = year;
    }
    public void eat(){
        System.out.println(nombre +" esta comiendo");
    }
    public void sleep(){
        System.out.println(nombre + " esta durmiendo");
    }
    public void setVacuna(boolean vacuna){
        this.vacuna = vacuna;
    } 
}