public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        int[] numeros = {10, 0, -5, 5, 15, 2};
        SortBubble sortBubble = new SortBubble();

        System.out.println("Lista principal");
        sortBubble.printArray(numeros);
        System.out.println("Lista Ordenanda Ascendentemente");
        sortBubble.sortAscendente(numeros);
        sortBubble.printArray(numeros);
        System.out.println("-----------------------------------");
        System.out.println("Lista Ordenada Descendentemente");
        sortBubble.sortDescendente(numeros);
        sortBubble.printArray(numeros);
        System.out.println("---------------------------------");
    }
}
