/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.greatlearning.service.oksumarray;

import java.util.LinkedList;


/**
 *
 * @author DELL
 */
public class bst {

//    Stack myStack = new Stack();
//    Stack myStack2 = new Stack();
    LinkedList ll =new LinkedList();

    public Node insert(Node node, int val) {
        if (node == null) {
            return createNewNode(val);
        }
        if (val < node.data) {
            node.left = insert(node.left, val);

        } else if (val > node.data) {
            node.right = insert(node.right, val);
        }
        return node;
    }
    
    public LinkedList inorder(Node node, int[] array) {
        if (node == null) {
            return null;
        }

        //myStack.push(node.data);
        inorder(node.left, array);
        ll.add(node.data);
        inorder(node.right, array);
        return ll; 
    }

    private Node createNewNode(int val) {
        Node a = new Node();
        a.data = val;
        a.left = null;
        a.right = null;
        return a;
    }

}
