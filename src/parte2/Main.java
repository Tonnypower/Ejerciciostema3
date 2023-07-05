
package parte2;

public class Main {
    public static void main(String [] args){
        coche miCoche = new coche();
        int puertas = miCoche.incrementarPuertas(1);
        System.out.println("El total de puertas del coche es: " + puertas);
    }
}
