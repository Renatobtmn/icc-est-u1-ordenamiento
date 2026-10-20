public class App {
    public static void main(String[] args) throws Exception {
        int[]original={5,4,1,2,3,6};
        int[]b=original.clone();
        int[]c= original;

        // USAR EL METODO DEL ARCHIVO(CLASE)BUBBLE
        //INSTANCIAR el archivo BUBBLE
        //INSTANCIA la clase Bubble
        Bubble bubble=new Bubble();  
        System.out.println();
        printArreglo(b);
        bubble.sort(b);
        printArreglo(b);
        

    }
    public static void printArreglo(int[] arr) {
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]+" - ");
        System.out.println();



        
    }    
    }
