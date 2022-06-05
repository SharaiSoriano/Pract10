public class App {
    public static void main(String[] args) {
        int op;
        Zoo zoo = new Zoo();
        do{
            System.out.println("Elegir opcion \n");
            System.out.println("1) Anadir");
            System.out.println("2) Eliminar");
            System.out.println("3) Mostrar");
            System.out.println("4) Salir");
            op = Entrada.capturaEntero("Opcion: ");
            switch(op){
            case 1:{
            zoo.agregar(Entrada.capturaCadena("Agregar"));
            break;
            }
            case 2:{
                zoo.quitar();
                break;
            }
            case 3:{
                zoo.imprimir();
                break;
            }
        }
        }
        while(op!=4);
    } 
}