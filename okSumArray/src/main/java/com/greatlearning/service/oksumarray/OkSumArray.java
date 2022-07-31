/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.greatlearning.service.oksumarray;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class OkSumArray {

    public static void main(String[] args) {
        bst a = new bst();
        Node root = null;

        System.out.println("enter ok to stop");
        Scanner sc = new Scanner(System.in);
        
        int pp;
        for (int i = 0; i < 10; i++) {
            String ar = sc.next();
            if ("ok".equals(ar)) {
                System.out.println("Thanks for entering array");
                break;
            } else {
                pp = Integer.parseInt(ar);
                root = a.insert(root, pp);
            }
        }
        int array[] = null;
        LinkedList inorderLL = a.inorder(root, array);
        array = new int[inorderLL.size()];
        
        int inorderArray[] = new int[inorderLL.size()];
        System.out.println("The Right skew tree is");
        for (int i = 0; i < inorderLL.size(); i++) {
            inorderArray[i] = (int) inorderLL.get(i);
            System.out.print(inorderLL.get(i)+"  ");
        }
       

    }
}
