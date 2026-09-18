package co.edu.udec.estructuradatosindividual;

/**
 * Ejercicio 23: Simulador de Semáforo Inteligente
 * @author Tu Nombre
 */
public class EstructuraDatosIndividual {

    public static void main(String[] args) {
        // 1. Arreglo con los estados del semáforo
        String[] estados = {"VERDE", "AMARILLO", "ROJO"};
        
        // Arreglo paralelo con los tiempos de duración en segundos para cada estado
        int[] tiemposSegundos = {5, 2, 4};

        System.out.println("==============================================");
        System.out.println("   SIMULADOR DE SEMÁFORO INTELIGENTE (EJ 23)  ");
        System.out.println("==============================================\n");

        // Simulación de 3 ciclos completos del semáforo
        int ciclosTotales = 3;

        for (int ciclo = 1; ciclo <= ciclosTotales; ciclo++) {
            System.out.println("--- Inicia Ciclo No. " + ciclo + " ---");

            // Recorrido del arreglo de estados
            for (int i = 0; i < estados.length; i++) {
                String estadoActual = estados[i];
                int duracion = tiemposSegundos[i];

                System.out.println("\n[ESTADO]: Semáforo en " + estadoActual);
                
                // Mostrar la cuenta regresiva en consola
                for (int seg = duracion; seg > 0; seg--) {
                    System.out.println("   -> " + estadoActual + " (Quedan " + seg + " segundos)");
                    try {
                        // Pausa de 1 segundo (1000 milisegundos) para simular tiempo real
                        Thread.sleep(1000); 
                    } catch (InterruptedException e) {
                        System.out.println("Error en la simulación de tiempo.");
                    }
                }
            }
            System.out.println("\n----------------------------------------------\n");
        }

        System.out.println("Simulación finalizada con éxito.");
    }
}
