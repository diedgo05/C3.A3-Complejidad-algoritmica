public class  SumQuadratic {
     public static void searchIndexsQuadratic(int[] data, int num) {
        int iterations = 0; // Contador de iteraciones

        long inicio = System.currentTimeMillis();
        for (int i = 0; i < data.length - 2; i++) {
            for (int j = i + 1; j < data.length - 1; j++) {
                for (int k = j + 1; k < data.length; k++) {
                    iterations++;
                    if (data[i] + data[j] + data[k] == num) {
                        System.out.println("Algoritmo O(n^2):");
                        System.out.println("Elementos sumados: " + data[i] + ", " + data[j] + ", " + data[k]);
                        long fin = System.currentTimeMillis();
                        double tiempo = (double) (fin - inicio) / 1000f;
                        System.out.println("Tiempo de ejecución: " + tiempo + " segundos");                        
                        System.out.println("Número de iteraciones: " + iterations);
                        return;
                    }
                }
            }
        }

        System.out.println("Algoritmo O(n^2):");
        System.out.println("No se encontraron elementos");
        System.out.println("Número de iteraciones: " + iterations);
    }
}


