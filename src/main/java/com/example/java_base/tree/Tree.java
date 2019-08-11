package com.example.java_base.tree;

import java.util.Stack;

/**
 * @author zzq 2019/8/5 21:58
 * @description
 */
public class Tree {
    private Node root;

    public Tree(Node root) {
        this.root = root;
    }

    //public void travel(INodeHandler nh) {
    //    this.travel(nh, root);
    //}

    //private Tree travel(INodeHandler nh, Node node) {
    //
    //}

    public static void main(String[] args) {
        //以数组形式生成一棵完全二叉树
        String[] str = new String[]{"a","b","c","d","e","f","g","h"};
        Node[] node = new Node[8];
        for (int i = 0; i < 8; i++) {
            node[i] = new Node(str[i]);
        }
        for (int i = 0; i < 8; i++) {
            if (i * 2 + 1 < 8) {
                node[i].left = node[i * 2 + 1];
            }
            if (i * 2 + 2 < 8) {
                node[i].right = node[i * 2 + 2];
            }
        }
        preOrderRe(node[0]);
        preOrder(node[0]);
    }

    public static void preOrderRe(Node biTree)
    {//递归实现
        System.out.print(biTree.data);
        Node leftTree = biTree.left;
        if(leftTree != null)
        {
            preOrderRe(leftTree);
        }
        Node rightTree = biTree.right;
        if(rightTree != null)
        {
            preOrderRe(rightTree);
        }
    }

    public static void preOrder(Node biTree)
    {//非递归实现
        Stack<Node> stack = new Stack<Node>();
        while(biTree != null || !stack.isEmpty())
        {
            while(biTree != null)
            {
                System.out.print(biTree.data);
                stack.push(biTree);
                biTree = biTree.left;
            }
            if(!stack.isEmpty())
            {
                biTree = stack.pop();
                biTree = biTree.right;
            }
        }
    }

}