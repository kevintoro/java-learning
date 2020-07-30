/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treenode;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author matias
 */
public class TreeSet<E extends Comparable<? super E>> {

    private TreeNode<E> root = null;
    private int count = 0;
    
    public int size() {
        return count;
    }
    
    public boolean isEmpty() {
        return count == 0;
    }
    
    public boolean add(E value) {
        if (root == null) {
            root = new TreeNode<>(value);           
        } else {
            TreeNode<E> current = root;
            while (true) {
                if (value.compareTo(current.value) == 0) {
                    return false;
                }
                if (value.compareTo(current.value) < 0) {
                    if (current.left == null) {
                        current.left = new TreeNode<>(value);
                        break;
                    } else {
                        current = current.left;
                    }
                } else { // value.compareTo(current.value) > 0
                    if (current.right == null) {
                        current.right = new TreeNode<>(value);
                        break;
                    } else {
                        current = current.right;
                    }                   
                }
            }           
        }
        count++;
        return true;
    }
    
    public boolean addAll(Collection<E> c) {
        boolean result = false;
        for (E elem: c) {
            if (add(elem)) {
                result = true;
            }
        }       
        return result;
    }
    
    public String toStringInOrder() {
        return inOrder(root);
    }
    
    private String inOrder(TreeNode<E> current) {
        if (current == null) {
            return "";
        }
        return inOrder(current.left) + current.value + " " + inOrder(current.right);
    }
    
    public String toStringPreOrder() {
        return preOrder(root);
    }
    
    private String preOrder(TreeNode<E> current) {
        if (current == null) {
            return "";
        }
        return current.value + " " + preOrder(current.left) + preOrder(current.right);
    }
    
    public String toStringPostOrder() {
        return postOrder(root);
    }
    
    private String postOrder(TreeNode<E> current) {
        if (current == null) {
            return "";
        }
        return  postOrder(current.left) + postOrder(current.right) + current.value + " ";
    }
    
    public boolean contains(E value) {
        TreeNode<E> current = root;
        while (current != null) {
            if (value.compareTo(current.value) == 0) {
                return true;
            }
            if (value.compareTo(current.value) < 0) {
                current = current.left;
            } else { // value.compareTo(current.value) > 0
                current = current.right;
            }
        }
        return false;
    }
    
    public void clear() {
        root = null;
        count = 0;
    }
    
    public Iterator<E> inOrderIterator() {
        return new TreeSetInOrderIterator<>(root);
    }   
    /*Devuelve la altura de este árbol binario. Devuelve -1 si el árbol está vacío. Devuelve 0 si el árbol sólo tiene un nodo.*/
    public int height(){
        return 0;
    }
    
    /*Devuelve true si este árbol binario está lleno, o false en caso contrario. Un árbol binario lleno es aquel en el que cada nodo tiene cero o dos hijos. Como caso especial, un árbol vacío se considera lleno.*/
    public boolean isFull(){
        return true;
    }
    
    /*Devuelve el número de hojas con las que cuenta este árbol binario.*/
    public int leafCount(){
        return 0;
    }
    
    /*Devuelve true si este árbol binario es perfecto, o false en caso contrario. Se dice que un árbol binario es perfecto si está lleno y si además todas sus hojas están al mismo nivel.*/
    public boolean isPerfect(){
        return true;
    }
    
    /*Devuelve true si este árbol binario es un árbol degenerado, o false en caso contrario. Se dice que un árbol es degenerado si por cada nodo padre existe solamente un nodo hijo asociado. En términos de eficiencia, un árbol degenerado se comporta exactamente como una lista encadenada.*/
    public boolean isDegenerate(){
    return true;    
    }
}
