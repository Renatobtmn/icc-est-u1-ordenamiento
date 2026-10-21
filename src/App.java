public class App {
    public static void main(String[] args) throws Exception {
        int[]original={5,4,1,2,3,6};
        int[]b=original.clone();
        int[]c= original;
        int[]d=original;

        // USAR EL METODO DEL ARCHIVO(CLASE)BUBBLE
        //INSTANCIAR el archivo BUBBLE
        //INSTANCIA la clase Bubble
        Bubble bubble=new Bubble();  
        System.out.println();
        printArreglo(b);
        bubble.sort(b);
        printArreglo(b);

        //instanciar insertion
        ///
         System.out.println("\n\n---Selection Sort---")
         Insertion insertion= new Insertion();
         printArreglo(d,: "original");
         Insertion.sort(d);
         printArreglo(d,:"Ordenado Asc");

        
        

    }

    public static void printArreglo(int[] arr,String title) {
        System.out.println(title);
        for(int i = 0 ;i<arr.length;i++){
            System.out.println(arr[i] + " - ");
            System.out.println();
        }

    }


    public static void printArreglo(int[] arr) {
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]+" - ");
        System.out.println();





        
    }  
      
    }
