import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] data = {1, 2, 5, 8, 9, 7, 3, 11, 6,12,11,17,20,4,21,22,23,33,19};
        int number = 19; // podemos cambiar el numero de k para ver mas a detalle el comportamiento del los algoritmos

        Scanner scanner = new Scanner(System.in);
        boolean continueRunning = true;

        while (continueRunning) {
            System.out.println("Array: ");
            for (int value : data) {
                System.out.print(value + " ");
            }
            System.out.println();
            System.out.println("K: " + number);

            System.out.println("Seleccione el algoritmo:");
            System.out.println("1. Algoritmo O(n^2) (Cuadrático)");
            System.out.println("2. Algoritmo O(n log n) (Logarítmico)");
            System.out.println("3. Algoritmo O(n) (Lineal)");
            System.out.println("4. Salir");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                   SumQuadratic.searchIndexsQuadratic(data, number);
                    break;
                case 2:
                   SumLogarithmic.searchIndexsLogarithmic(data, number);
                    break;
                case 3:
                    SumLinear.searchIndexsLinear(data, number);
                    break;
                case 4:
                    continueRunning = false;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }

            if (continueRunning) {
                System.out.println();
            }
        }

        scanner.close();
    }
}
