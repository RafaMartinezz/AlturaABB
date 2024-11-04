import java.util.Scanner;

/**
 * Main class that demonstrates the creation and traversal of a binary tree.
 * Reads a space-separated line of integers to represent nodes in an array
 * format.
 * Builds a binary tree from this array and then performs a pre-order traversal,
 * printing the tree structure.
 */
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Read a line of input, split it by spaces, and use it to initialize the binary
        // tree
        String[] arbolString = sc.nextLine().split(" ");
        Arbol arbol = new Arbol(arbolString);

        // Perform and display a pre-order traversal with indentation
        System.out.println("recorrido preorden con TABS");
        arbol.recorridoPreorden();

        sc.close(); // Close the scanner
    }
}
