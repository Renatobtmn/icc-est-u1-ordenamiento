import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import models.Estudiante;

public class App {
    public static void main(String[] args) throws Exception{
        // runEjeplosPrimitivos
        //runEjemplosObjetos
        runComparators();
        runComparatorsObj2();


        runEjemplosPrimitivos();
        runEjemplosObjetos();
        
    }
    private static void runComparatorsObj(){
        List<Integer>numeros=new ArrayList<>(List.of(5,6,4,1,2,3));
        
        //orden de menor a mayor
        numeros.sort(Comparator.naturalOrder());
        numeros.sort(null);
        System.out.println(numeros);

        //ordenar de mayor a menor




    }
    private static void runComparatorsObj2() {
    Estudiante e1 = new Estudiante("Juan", 10.0); // Declarar o instanciar e1
    Estudiante[] estudiantes = {
        e1,
        new Estudiante("maria", 7.0), // Faltaba la coma aquí
        new Estudiante("pedro", 7.0), // Faltaba la coma aquí
        new Estudiante("juan", 7.0)
    };
};
    Comparator.naturalOrder();
 Comparator.reverseOrder();
Comparator<Estudiiante>compNota=Comparator.comparing(null)
        
     
    


    public static void PrintArreglo(Estudiante[] arr, String title) {
        System.out.println(title);
        for(int i=0; i<arr.length;i++)
            System.out.println(arr[i] + " - ");
        System.out.println();
        
    }

    private static void runComparaciones(){
        Integer[] original ={5,6,4,1,3};
        Arrays.sort(original);
        for(int i = 0 ;i <original.length;i++){

        }
    }
    




    private static void runEjemplosObjetos() {
        Estudiante e1= new Estudiante("Juan" , 10);
        
        Estudiante[] estudiantes = {e1,
                new  Estudiante("Maria" , 7.0),
                new Estudiante("Diego" , 3.5),
                new Estudiante("Pedro" , 3.8),
        };     
        

        
                                    
        

        Bubble bubble = new Bubble();
        bubble.sortEstudiantes(estudiantes);
        




        

        
    }





    private static void runEjemplosPrimitivos() {
        int[] numeros = {5, 2, 8, 1, 9};
        printArreglo(numeros, "Arreglo primitivo original:");
        Arrays.sort(numeros);
        printArreglo(numeros, "Arreglo primitivo ordenado:");
    }





    public static void printArreglo(int[] arr,String title) {
        System.out.println(title);
        for(int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i] + " - ");
            
        }
        System.out.println();

    }


    public static void printArreglo(int[] arr) {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" - ");
        System.out.println();





        
    }  
    private static void runComparators(){
        Integer[] original= {5,6,4,1,2,3};
        //arrays sort
        Arrays.sort(original);
    }
      
    }
