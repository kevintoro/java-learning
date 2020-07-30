/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treenode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

class TreeNode<E extends Comparable<? super E>> {
    public E value;
    public TreeNode<E> left;
    public TreeNode<E> right;
    public boolean deleted;
    public TreeNode(E value, TreeNode<E> left,TreeNode<E> right) {
        this.value = value;
        this.left = left;
        this.right = right;     
    }
    public TreeNode(E value) {
        this(value, null, null);
    }
}

class TreeSetInOrderIterator<E extends Comparable<? super E>> implements Iterator<E> {
    
    private Deque<Object> stack;
    
    public TreeSetInOrderIterator(TreeNode<E> root) {
        stack = new java.util.LinkedList<Object>();
        if (root != null) {
            stack.push(root);
        }
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @SuppressWarnings("unchecked")
    @Override
    public E next() {
        if (hasNext()) {
            while (true) {
                Object obj = stack.pop();
                if (obj instanceof TreeNode) {
                    TreeNode<E> current = (TreeNode<E>) obj;
                                        
                    if (current.right != null) {
                        stack.push(current.right);
                    }
                    
                    stack.push(current.value);
                                                        
                    if (current.left != null) {
                        stack.push(current.left);
                    }
                    
                } else {
                    return (E) obj;
                }
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();      
    }
    
}

