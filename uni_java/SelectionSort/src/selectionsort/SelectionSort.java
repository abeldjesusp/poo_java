package selectionsort;

public class SelectionSort {
    
    public static void main(String[] args) {
       int [] original_array = {412,12,123,3,155,23412,2};       
       
       for(int i : original_array){
           System.out.print(i);
           System.out.print(" ");
       }       
       System.out.println();
       
       int [] ordered_array = selection_sort(original_array);
       
       for(int i : ordered_array){
           System.out.print(i);
           System.out.print(" ");
       }
    }
    
    private static int [] selection_sort(int[] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            int  minimo_encontrado = arreglo[i];
            int posicion_minimo = i;
            int valor_original = arreglo[i];
            
            //Encontrar el minimo en la parte desordenada
            for(int j = i+1; j< arreglo.length; j++){
                int valor_comparacion = arreglo[j];
                
                if(valor_comparacion < minimo_encontrado){
                    minimo_encontrado = valor_comparacion;
                    posicion_minimo = j;
                }
            }
            
            if(minimo_encontrado != valor_original){
                //Intercambio del minimo con el primer elemento del arreglo desordenado\
                arreglo[i] = minimo_encontrado;
                arreglo[posicion_minimo] = valor_original;
            }
        }
        
        return arreglo;
    }
    
}
