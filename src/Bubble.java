import models.Estudiante;

public class Bubble {
    
    public int[] sort (int[] arreglo){
        int comparaciones=0;
        for(int i=0;i<arreglo.length;i++){
            System.out.println("pasada" +i);
            boolean combinaciones = false;
   
            for (int j=1; j < arreglo.length-i; j++){
                comparaciones++;
                
                if (arreglo[j-1]> arreglo[j]){

                    combinaciones =true;
                    
                    int aux = arreglo[j-1];
                    arreglo[j-1]= arreglo[j];
                    arreglo[j]=  aux;

                }
            }
            if(!combinaciones){
                break;
            }
        }    
        System.out.println("comparaciones" +comparaciones);
        return null;
        }
    public void sortEstudiantes(Estudiante[] estudiantes){
        for ( int i = 0 ; i<estudiantes.length;i++){ 
            boolean cambio = false;
            for(int j=0;j<estudiantes.length-1-i;j++){
                if (Double.compare(estudiantes[j].getNota(),estudiantes[j+1].getNota()) > 0){

                // intercambio
                Estudiante aux= estudiantes[j];
                estudiantes[j] = estudiantes[j+1];
                estudiantes[j+1]= aux;

                cambio=true;
            }    
                     

                
        }
        if (!cambio)
            break;

        }
    }

    }
    
