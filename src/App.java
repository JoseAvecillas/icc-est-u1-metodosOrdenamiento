public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = {10, 0, -5, 5, 15, 2};
        String[] nombres = {"Pedro", "Ana", "Maria", "Luis", "Juan"};
        Persona[] personas = new Persona[]{
            new Persona("Pedro", 30),
            new Persona("Ana", 25),
            new Persona("Maria", 28)
        };

        //SortBubble sortBubble = new SortBubble();
        //SortSeleccion sortSeleccion = new SortSeleccion();
        SortInsertion sortInsertion = new SortInsertion();
        System.out.println("Estudiante: Jose Avecillas");
        System.out.println("Lista principal");
        //System.out.println(numeros);
        //sortBubble.printArray(numeros);
        //System.out.println("Lista Ordenanda Ascendentemente");
        //sortBubble.sortAscendente(numeros);
        //sortBubble.printArray(numeros);
       // System.out.println("-----------------------------------");
        //System.out.println("Lista Ordenada Descendentemente");
        //sortBubble.sortDescendente(numeros);
        //sortBubble.printArray(numeros);
        System.out.println("---------------------------------");
        // System.out.println("Selecction Sort");
        // System.out.println("Lista Ordenanda Ascendentemente");
        // sortSeleccion.sortAscendente(numeros);
        // sortSeleccion.printArray(numeros);
        // System.out.println("-----------------------------------");
        // System.out.println("Lista Ordenada Descendentemente");
        // sortSeleccion.sortDescendente(numeros);
        // sortSeleccion.printArray(numeros);
        //System.out.println("---------------------------------");
        // System.out.println(" Insertion Sort");
        // System.out.println("Ascendente:");
        // sortInsertion.sortAscendente(numeros);
        // sortInsertion.printArray(numeros);
        // System.out.println("Descendente");
        // sortInsertion.sortDescendente(numeros, false);
        // sortInsertion.printArray(numeros);
        //  System.out.println("Ordenar por nombre: ");
        //  System.out.println(" Lista Original");
        //  sortInsertion.printArrayNombres(nombres);
        //  System.out.println("Ordenado: ");
        //  sortInsertion.sortByName(nombres, false);
        //  sortInsertion.printArrayNombres(nombres);
        System.out.println("Array de Personas Original:");
        sortInsertion.printArrayPersonas(personas);
        System.out.println("\nOrdenado por Edad de Personas");
        sortInsertion.sortPersonasByAge(personas);
        sortInsertion.printArrayPersonas(personas);
        System.out.println("---------------------------");
        System.out.println("Ordenar personas por Nombre: ");
        sortInsertion.sortPersonasByName(personas);
        sortInsertion.printArrayPersonas(personas);
        System.out.println("--------------------------");
    }
}
