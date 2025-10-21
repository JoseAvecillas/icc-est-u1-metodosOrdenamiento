public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = {10, 0, -5, 5, 15, 2};
        SortBubble sortBubble = new SortBubble();
        SortSeleccion sortSeleccion = new SortSeleccion();
        System.out.println("Estudiante: Jose Avecillas");
        System.out.println("Lista principal");
        sortBubble.printArray(numeros);
        //System.out.println("Lista Ordenanda Ascendentemente");
        //sortBubble.sortAscendente(numeros);
        //sortBubble.printArray(numeros);
       // System.out.println("-----------------------------------");
        //System.out.println("Lista Ordenada Descendentemente");
        //sortBubble.sortDescendente(numeros);
        //sortBubble.printArray(numeros);
        System.out.println("---------------------------------");
        System.out.println("Selecction Sort");
        System.out.println("Lista Ordenanda Ascendentemente");
        sortSeleccion.sortAscendente(numeros);
        sortSeleccion.printArray(numeros);
        System.out.println("-----------------------------------");
        System.out.println("Lista Ordenada Descendentemente");
        sortSeleccion.sortDescendente(numeros);
        sortSeleccion.printArray(numeros);
    }
}
