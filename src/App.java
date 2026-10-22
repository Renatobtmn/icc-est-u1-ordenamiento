import java.util.Comparator;
import java.util.Arrays;

import models.Estudiante;

public class App {
    public static void main(String[] args) throws Exception{
        runEjemplosPrimitivos();
        runEjemplosObjetos();
        
    }
    public static void PrintArreglo(Estudiante[] arr, String title) {
        System.out.println(title);
        for(int i=0; i<arr.length;i++)
            System.out.println(arr[i] + " - ");
        System.out.println();
        
    }

    private static void runComparaciones(){
        Integer original ={5,6,4,1,3};
        Arrays.sort(original);
        for(int i = 0 ;i <original.length){

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
        




        

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'runEjemplosObjetos'");
    }





    private static void runEjemplosPrimitivos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'runEjemplosPrimitivos'");
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
      
    }
