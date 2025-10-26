public class SortInsertion {
    

    public SortInsertion(){

    }

    public void sortAscendente(int[] numeros){
        for (int i = 1; i < numeros.length ; i++) {
            int j = i;
            int aux = numeros[j];
            while (j > 0 && aux < numeros[j-1]) {
                numeros[j] = numeros[j-1];
                j = j-1;
                numeros[j] = aux;
            }
        }
    }

    public void sortDescendente(int[] numeros, boolean pasos){
        for (int i = 1; i < numeros.length ; i++) {
            int j = i;
            int aux = numeros[j];
            if (pasos) {
                System.out.println("i: " + i + ", j: " + j + ", aux: " + aux);
            }
            while (j > 0 && aux > numeros[j-1]) {
                if(pasos){
                    System.out.println("Compara aux: " + aux + " con numeros[" + (j-1) + "]: "  + numeros[j-1]);
                }
                numeros[j] = numeros[j-1];   
                if(pasos){
                    printArray(numeros);
                }
                if(pasos){
                    System.out.println("Mueve numeros[" + (j-1) + "] a numeros[" + j + "]");
                }
                j--;
            }
            numeros[j] = aux;
            if (pasos) {
                System.out.println("Inserta aux: " + aux + " en la posicion " + j);
                System.out.println("Estado Actual");
                printArray(numeros);
            }
        }
    }

    public void sortByName(String[] nombres, boolean pasos){
        for (int i = 1; i < nombres.length ; i++) {
            int j = i;
            String aux = nombres[j];
            if (pasos) {
                System.out.println("i: " + i + ", j: " + j + ", aux: " + aux);
            }
            while (j > 0 && aux.compareTo(nombres[j-1]) > 0) {
                if(pasos){
                    System.out.println("Compara aux: " + aux + " con nombres[" + (j-1) + "]: "  + nombres[j-1]);
                }
                nombres[j] = nombres[j-1];
                if(pasos){
                    printArrayNombres(nombres); // <- versión para String[]
                }
                if(pasos){
                    System.out.println("Mueve nombres[" + (j-1) + "] a nombres[" + j + "]");
                }
                j--;
            }
            nombres[j] = aux;
            if (pasos) {
                System.out.println("Inserta aux: " + aux + " en la posicion " + j);
                System.out.println("Estado Actual");
                printArrayNombres(nombres);
            }
        }
    }

    public void printArrayNombres(String[] palabras){
        System.out.print("[");
        for (int i = 0; i < palabras.length; i++) {
            if (i == palabras.length-1) {
                System.out.print(palabras[i]);
            }else{
                System.out.print(palabras[i] + ", ");
            }
        }
        System.out.println("]");
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

    public void printArrayPersonas(Persona[] personas){
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Nombre: " + personas[i].getNombre() + ", Edad: " + personas[i].getEdad());
        }
    }

    public void sortPersonasByAge(Persona[] personas){
        for (int i = 0; i < personas.length; i++) {
            int j = i-1;
            Persona aux = personas[i];
            while (j >=0 && aux.getEdad() < personas[j].getEdad()) {
                personas[j+1] = personas[j];
                j--;
            }
            personas[j+1] = aux;
        }
    }

    public void sortPersonasByName(Persona[] personas){
        for (int i = 0; i < personas.length; i++) {
            int j = i - 1;
            Persona aux = personas[i];
            while (j >= 0 && aux.getNombre().compareTo(personas[j].getNombre()) < 0) {
                personas[j+1] = personas[j];
                j--;
            }
            personas[j+1] = aux;
        }
    }














}
