public class Insertion {

    public static void sort(int[] arreglo) {
        int comparaciones=0;
        int desplazamientos=0;
        
    
        for (int i=1;i<arreglo.length;i++){
        int key = arreglo[i];
        int j=i-1;
        while (j>=0 && arreglo[j] > key){
            comparaciones++;
            desplazamientos++;
            arreglo[j+1] = arreglo[j];
            j--;
        }
        if (j>=0){
            comparaciones++;
        }
        arreglo[j+1] = key;
        
    }
    System.out.println("desplazamientos: " +desplazamientos);
    System.out.println("comparaciones:" +comparaciones);
    
}
}
