# Binary Tree Project

This Java project builds and traverses a binary tree from an array-based representation. The tree is constructed from a space-separated input string where each integer represents a node, and `-1` signifies a `null` (empty) node. The project includes functionality to perform a **pre-order traversal** with indentation to represent the tree structure visually, and calculates the height of the tree.

## Table of Contents

- [Overview](#overview)
- [Purpose](#purpose)
- [Features](#features)
- [Input Format](#input-format)
- [Example Input and Output](#example-input-and-output)
- [Explanation](#explanation)

---

## Overview

The project demonstrates a basic binary tree, constructed from an array of node values provided as input. The array representation follows a specific order to populate each node’s left and right children. After creating the tree, it performs a **pre-order traversal** to display each node’s value, structured with tabs to illustrate the depth of each node. It also includes a method to calculate the **height of the tree**.

## Purpose

This project serves as a **learning exercise** focused on:
- Understanding binary tree structures and recursive methods for tree traversal and height calculation.
- Using arrays to represent hierarchical data structures.
- Implementing tree traversal techniques to visualize and explore the structure of binary trees.

## Features

- **Binary Tree Construction**: Builds a binary tree from an array where each element represents a node, and `-1` signifies a null (empty) node.
- **Pre-order Traversal**: Prints each node’s value in a pre-order sequence, using indentation to indicate depth, which helps visualize the tree’s structure.
- **Height Calculation**: Calculates the height of the tree, defined as the number of edges on the longest path from the root to a leaf node.

## Input Format

The input is a single line containing a space-separated sequence of integers. Each integer represents a node in the tree, following an order to populate left and right children. The value `-1` indicates that a particular position in the tree is `null`.

For example:
```plaintext
10 5 -1 -1 15 12 -1 -1 20 -1 -1
```

In this example:
- `10` is the root.
- `5` is the left child of `10`.
- `-1` following `5` indicates that `5` has no left child, and the next `-1` indicates no right child.
- `15` is the right child of `10`, and so forth.

## Example Input and Output

### Input

```plaintext
10 5 -1 -1 15 12 -1 -1 20 -1 -1
```

### Output

```plaintext
recorrido preorden con TABS
10
	5
		null
		null
	15
		12
			null
			null
		20
			null
			null
```

### Explanation

In the example above:
1. The pre-order traversal starts from the root node (`10`) and proceeds to its left and right children, continuing recursively.
2. Each level of depth in the tree is represented by an additional tab character (`\t`), visually indicating parent-child relationships.
3. `null` nodes (representing `-1` values) are printed as leaf endpoints to indicate where branches terminate.

## Explanation

The project uses three main classes:

- **`Arbol`**: Represents the binary tree. Constructs the tree from an array representation, performs pre-order traversal, and calculates the tree’s height.
- **`NodoArbol`**: Represents each node in the binary tree, storing data, and references to left and right child nodes.
- **`Main`**: Demonstrates how to create an `Arbol` from input and performs a pre-order traversal, outputting the tree structure.
