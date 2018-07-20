package insertion_sorf;


public class Insertion_sorf {

    public static void main(String[] args) {
        int arr_desordenado[] = {412,12,123,1,2324,3,155,23412,2};
        
        int arr_ordenado[] = insertion_sorf(arr_desordenado);
        
        for(int arr : arr_ordenado){
            System.out.print("[" + arr + "]");
        }        
        System.out.println();        
    }
    
    static int [] insertion_sorf(int arreglo[]){
         for(int i = 1; i < arreglo.length; i++){
             int j = i;
             while(j > 0 && arreglo[j-1] > arreglo[j]){
                 swap(j-1,j,arreglo);
                 j--;
             }
         }         
         return arreglo;
    }
    
    static void swap(int previo,int actual, int arr[]){
        int copia = arr[actual];
        
        arr[actual] = arr[previo];
        arr[previo] = copia;
    }
    
}

    