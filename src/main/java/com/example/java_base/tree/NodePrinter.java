package com.example.java_base.tree;

/**
 * @author zzq 2019/8/5 21:58
 * @description
 */
public class NodePrinter implements INodeHandler {
    @Override
    public void handle(Node n){
        // 在控制台上打印出节点，无回车换行。
        System.out.print(n.data);
    }

}
