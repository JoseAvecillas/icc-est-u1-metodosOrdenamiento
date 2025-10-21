public class SortBubble {
    
    public SortBubble(){
        System.out.println("-------------------------------------");
    }

    public void sortAscendente(int[] numeros){
        int contCambios = 0;
        int contPreguntas = 0;
        for (int i = 0; i < numeros.length - 1; i++) {
            boolean hayCambio = false;
            for(int j=0; j <numeros.length -1 - i; j++){
                contPreguntas++;
                if (numeros[j] > numeros [j+1]) {
                    int temp= numeros[j];
                    numeros[j]= numeros[j+1];
                    numeros[j+1]= temp;
                    contCambios++;
                    hayCambio= true;
                }
            }
            if (!hayCambio) {
                break;
            }
        }
        System.out.println("Preguntas= " + contPreguntas);
        System.out.println("Cambios= " + contCambios);
    }

    public void sortDescendente(int[] numeros){
        int contCambios= 0;
        int contPreguntas= 0;
        for (int i = 0; i < numeros.length - 1; i++) {
            boolean swampper= false;
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                contPreguntas++;
                if (numeros[j] < numeros[j+1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                    contCambios++;
                    swampper= true;
                }
            }
            if (!swampper) {
                break;
            }
        }
        System.out.println("Preguntas= " + contPreguntas);
        System.out.println("Cambios= " + contCambios);
    }
    
    public void printArray(int[] numeros){
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length-1) {
                System.out.print(numeros[i]);
            }else{
                System.out.print(numeros[i]+", ");
            }
        }
        System.out.println("]");
    }
}
