package com.example.java_base.tree;

/**
 * @author zzq 2019/8/5 21:57
 * @description
 */
public class Node {
    public Node parent;
    public Node left;
    public Node right;
    // “a”, “b”, “c”, …等各个节点的各自具体的值。
    public String data;

    Node(String data){
        this.data = data;
    }

}
