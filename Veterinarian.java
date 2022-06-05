public class Veterinarian {
    private String nombre;
    private double edad;
    public Veterinarian(String nombre, double edad){
        setedad(edad);
        setNombre(nombre);
        }
        public void setedad(double edad){
            this.edad = edad;
        }
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public double getedad(){
            return edad;
        }
        public String getNombre(){
            return nombre;
        }
        public void vacunar(Animal a){
            a.setVacuna(true);
        }
        public void revisar(Animal a){
            if(a.vacuna){
            System.out.println(a.nombre + " esta vacunado");
        }
        else{
            System.out.println(a.nombre + " no esta vacunado");
        } 
    } 
}