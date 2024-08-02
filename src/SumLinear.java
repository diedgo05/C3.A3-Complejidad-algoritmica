import java.util.HashSet;

public class SumLinear {

    public static void searchIndexsLinear(int[] data, int num) {
        HashSet<Integer> seen = new HashSet<>();
        int iterations = 0;

        long inicio = System.currentTimeMillis();
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                int complement = num - data[i] - data[j];
                iterations++;
                if (seen.contains(complement)) {
                    System.out.println("Algoritmo O(n):");
                    System.out.println("Elementos sumados: " + data[i] + ", " + data[j] + ", " + complement);
                    long fin = System.currentTimeMillis();
                    double tiempo = (double) (fin - inicio) / 1000f;
                    System.out.println("Tiempo de ejecución: " + tiempo + " segundos");                   
                    System.out.println("Número de iteraciones: " + iterations);
                    return;
                }
            }
            seen.add(data[i]);
        }
        System.out.println("Algoritmo O(n):");
        System.out.println("No se encontraron elementos");
        System.out.println("Número de iteraciones: " + iterations);
    }
}

