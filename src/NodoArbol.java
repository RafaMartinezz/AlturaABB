/**
 * Represents a node in a binary tree. Each node contains integer data and
 * references
 * to its left and right child nodes. This class is used to construct binary
 * trees.
 */
class NodoArbol {
    NodoArbol nodoIzq; // Reference to the left child node
    int datos; // Data stored in the node
    NodoArbol nodoDer; // Reference to the right child node

    /**
     * Constructs a tree node with the specified data. Initially, both child nodes
     * are set to null,
     * indicating that the node has no children.
     *
     * @param datosNodo The integer data to store in the node.
     */
    public NodoArbol(int datosNodo) {
        datos = datosNodo;
        nodoIzq = nodoDer = null; // New nodes start with no children
    }
}
