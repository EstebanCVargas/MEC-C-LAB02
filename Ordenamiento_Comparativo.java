import java.util.Arrays;
import java.util.Random;

public class Ordenamiento_Comparativo {

    public static void main(String[] args) {
       
        int[] tamaños = {100, 500, 1000, 5000, 10000};
       
        for (int tamaño : tamaños) {
           
            double[] arr = new double[tamaño];
            Random random = new Random();
           
            for (int i = 0; i < tamaño; i++) {
                arr[i] = random.nextDouble();
            }
           
            double[] copia = Arrays.copyOf(arr, arr.length);
           
            long start, end;
           
            start = System.nanoTime();
            burbuja(arr);
            end = System.nanoTime();
            System.out.println("Burbuja - " + tamaño + " elementos: " + (end - start) + " nanosegundos");
           
            arr = Arrays.copyOf(copia, copia.length);
           
            start = System.nanoTime();
            insercion(arr);
            end = System.nanoTime();
            System.out.println("Insercion - " + tamaño + " elementos: " + (end - start) + " nanosegundos");
           
            arr = Arrays.copyOf(copia, copia.length);
           
            start = System.nanoTime();
            seleccion(arr);
            end = System.nanoTime();
            System.out.println("Seleccion - " + tamaño + " elementos: " + (end - start) + " nanosegundos");
           
            arr = Arrays.copyOf(copia, copia.length);
           
            start = System.nanoTime();
            mergesort(arr, 0, arr.length - 1);
            end = System.nanoTime();
            System.out.println("Mergesort - " + tamaño + " elementos: " + (end - start) + " nanosegundos");
           
            System.out.println();
           
        }
       
    }
   
    public static void burbuja(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
   
    public static void insercion(double[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            double key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
   
    public static void seleccion(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            arr[min_idx] = arr[i];

    private static void mergesort(double[] arr, int i, int par1) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
