import java.util.Arrays;

public class SumLogarithmic {

    public static void searchIndexsLogarithmic(int[] data, int num) {
        Arrays.sort(data);
        int iterations = 0;

        long inicio = System.currentTimeMillis();
        for (int i = 0; i < data.length - 2; i++) {
            int left = i + 1;
            int right = data.length - 1;

            while (left < right) {
                iterations++;
                int sum = data[i] + data[left] + data[right];

                if (sum == num) {
                    System.out.println("Algoritmo O(n log n):");
                    System.out.println("Elementos sumados: " + data[i] + ", " + data[left] + ", " + data[right]);
                    long fin = System.currentTimeMillis();
                    double tiempo = (double) (fin - inicio) / 1000f;
                    System.out.println("Tiempo de ejecución: " + tiempo + " segundos");                   
                    System.out.println("Número de iteraciones: " + iterations);
                    return;
                } else if (sum < num) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        System.out.println("Algoritmo O(n log n):");
        System.out.println("No se encontraron elementos");
        System.out.println("Número de iteraciones: " + iterations);
    }
}
