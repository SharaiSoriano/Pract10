import java.util.ArrayList;


public class Zoo {
    private ArrayList<Animal> animales = new ArrayList<>();
    private Veterinarian v = new Veterinarian(Entrada.capturaCadena("Nombre del veterinario"),Entrada.capturaDoble("edad"));
    public void agregar(String animal){
        animal = animal.trim().toLowerCase();
        Animal a = null;
        switch(animal){
            case "perro": 
                a = new perro(Entrada.capturaCadena("Nombre"),Entrada.capturaEntero("Edad"));
                break;
            
            case "gato" :
                a = new gato(Entrada.capturaCadena("Nombre"),Entrada.capturaEntero("Edad"));
                break;
            
            case "pajaro":
                a = new Pajaro(Entrada.capturaCadena("Nombre"),Entrada.capturaEntero("Edad"));
                break;
            
            default :
                System.out.println("Error, volver al intentar");
            
        }
        if(a != null){
            animales.add(a);
        } 
    }
    public void imprimir(){
        for(Animal a: animales){
        a.eat();
        v.vacunar(a);
        v.revisar(a);
        if(a instanceof perro){
        ((perro)a).ladrar();
        }
        else if(a instanceof gato){
            ((gato)a).jugando();
        }
        else if(a instanceof Pajaro){
            ((Pajaro)a).cantar();
        }
        
        System.out.println();
        } 
    }
    public void quitar(){
        int i = 1, op;
    for(Animal a: animales){
        System.out.println("Numero de animal: " + i);
        System.out.print(a.nombre + "\n");
        i++;
    }
        op = Entrada.capturaEntero("Introducir el numero: ");
        animales.remove((op-1));
        System.out.println("Animal borrado.");
    } 
}