/**
 * Represents a binary tree built from an array representation. Each element in
 * the array
 * corresponds to a node, where -1 indicates a null node. The class includes
 * methods for
 * creating the tree, performing a pre-order traversal, and calculating the
 * tree's height.
 */
class Arbol {
    public NodoArbol raiz; // Root node of the tree
    private String[] arbolString; // Array representing the tree structure
    private int posArray = 0; // Tracks the current position in the array while building the tree

    /**
     * Constructs a binary tree from an array of strings. Each element in the array
     * represents a node, with -1 indicating a null node.
     *
     * @param arbolString Array of strings representing the tree nodes.
     */
    public Arbol(String[] arbolString) {
        raiz = null;
        this.arbolString = arbolString;
        this.crearArbol(); // Initialize the tree structure based on the array
    }

    /**
     * Initiates a pre-order traversal of the tree, starting from the root node.
     */
    public void recorridoPreorden() {
        ayudantePreorden(raiz, "");
    }

    /**
     * Helper method for pre-order traversal. Prints the tree structure with
     * indentation
     * to represent depth.
     *
     * @param nodo The current node in the traversal.
     * @param tab  Indentation to visually represent tree depth.
     */
    private void ayudantePreorden(NodoArbol nodo, String tab) {
        if (nodo == null) {
            System.out.println(tab + "null");
            return;
        }

        System.out.println(tab + nodo.datos); // Print the current node's data
        tab += "\t"; // Increase indentation for child nodes
        ayudantePreorden(nodo.nodoIzq, tab); // Traverse left subtree
        ayudantePreorden(nodo.nodoDer, tab); // Traverse right subtree
    }

    /**
     * Builds the binary tree from the `arbolString` array, starting with the root
     * node.
     */
    private void crearArbol() {
        // The root node is at arbolString[0]
        int dato = Integer.parseInt(arbolString[0]);
        if (dato == -1) { // Check for an empty tree
            raiz = null;
        } else {
            raiz = new NodoArbol(dato); // Initialize root node
            ayudanteCrearArbol(raiz); // Build the tree recursively
        }
    }

    /**
     * Recursive helper method to build the tree, attaching left and right children
     * for each node based on the array.
     *
     * @param padre The current parent node for which children are added.
     */
    private void ayudanteCrearArbol(NodoArbol padre) {
        // Process left subtree of the parent node
        posArray++;
        int dato = Integer.parseInt(arbolString[posArray]);
        if (dato != -1) { // If -1, left child remains null
            padre.nodoIzq = new NodoArbol(dato);
            ayudanteCrearArbol(padre.nodoIzq);
        }

        // Process right subtree of the parent node
        posArray++;
        dato = Integer.parseInt(arbolString[posArray]);
        if (dato != -1) { // If -1, right child remains null
            padre.nodoDer = new NodoArbol(dato);
            ayudanteCrearArbol(padre.nodoDer);
        }
    }

    /**
     * Calculates the height of the tree, defined as the number of edges on the
     * longest
     * path from the root to a leaf.
     *
     * @return The height of the tree.
     */
    public int altura() {
        return ayudanteAltura(raiz);
    }

    /**
     * Helper method to calculate the height of the tree.
     *
     * @param nodo The current node from which height is calculated.
     * @return The height of the subtree rooted at `nodo`.
     */
    private int ayudanteAltura(NodoArbol nodo) {
        if (nodo == null) {
            return 0; // Base case: a null node has a height of 0
        } else {
            // Recursively calculate the height of left and right subtrees
            return 1 + Math.max(ayudanteAltura(nodo.nodoIzq), ayudanteAltura(nodo.nodoDer));
        }
    }
}
