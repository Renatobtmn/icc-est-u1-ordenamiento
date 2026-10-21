public class Selection {
    public static void ordenarSeleccion(int[] arreglo) {
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {
            int posMenor = i;

            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[posMenor]) {
                    posMenor = j;
                }
            }
            if (posMenor != i) {
                System.out.println("Pasada= " + i + 
                " | cambio " + arreglo[i] + "<->" + arreglo[posMenor]);
                 int temporal = arreglo[i];
            arreglo[i] = arreglo[posMenor];
            arreglo[posMenor] = temporal;


            
        }
    }
 }    
}







