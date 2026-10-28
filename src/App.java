import java.util.Arrays;
import java.util.Comparator;

import models.Estudiante;

public class App {
    public static void main(String[] args) throws Exception {
        runComparaciones();
        runComparatorsObj2();
        runEjemplosPrimitivos();
        runEjemplosObjetos();
    }

    private static void runComparaciones() {
        Integer[] original = {5, 6, 4, 1, 2, 3};
        Arrays.sort(original);
        for (int i = 0; i < original.length; i++) {
            System.out.println(original[i]);
        }
        Arrays.sort(original, Comparator.reverseOrder());
    }

    private static void runComparatorsObj2() {
        Estudiante e1 = new Estudiante("Juan", 8.5);

        Estudiante[] estudiantes = {
            e1,
            new Estudiante("Maria", 7.0),
            new Estudiante("Pedro", 6.5),
            new Estudiante("Diego", 9.0)
        };

        Comparator<Estudiante> compNota = Comparator.comparingDouble(e -> e.getNota());

        Arrays.sort(estudiantes, compNota);
        printArreglo(estudiantes, "Arreglo ordenado por nota (menor a mayor):");

        // ordenar de mayor a menor
        Arrays.sort(estudiantes, compNota.reversed());
        printArreglo(estudiantes, "Arreglo ordenado por nota (mayor a menor):");
    }

    private static void runEjemplosObjetos() {
        Estudiante e1 = new Estudiante("Juan", 10);

        Estudiante[] estudiantes = {
            e1,
            new Estudiante("Maria", 7.0),
            new Estudiante("Diego", 3.5),
            new Estudiante("Pedro", 3.8),
        };

        Bubble bubble = new Bubble();
        printArreglo(estudiantes, "Arreglo de estudiantes antes de ordenar");
        bubble.sortEstudiantes(estudiantes);
        printArreglo(estudiantes, "Arreglo de estudiantes despues de ordenar");
    }

    private static void runEjemplosPrimitivos() {
        int[] numeros = {5, 2, 8, 1, 9};
        printArreglo(numeros, "Arreglo primitivo original:");
        Arrays.sort(numeros);
        printArreglo(numeros, "Arreglo primitivo ordenado:");
    }

    public static void printArreglo(Estudiante[] arr, String title) {
        System.out.println(title);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " - ");
        }
        System.out.println();
    }

    public static void printArreglo(int[] arr, String title) {
        System.out.println(title);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " - ");
        }
        System.out.println();
    }

    public static void printArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " - ");
        }
        System.out.println();
    }
}