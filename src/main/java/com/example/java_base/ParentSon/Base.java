package com.example.java_base.ParentSon;


public class Base {
    private String baseName = "base";
    public Base() {
        System.out.println("1我是父类构造方法！");
        callName();
    }

    public void callName() {
        System. out. println("我是父类的callname：" + baseName);
    }

    static class Sub extends Base {
        private String baseName = "sub";
        public void callName() {
            System. out. println ("我是子类的callname：" + baseName) ;
        }
    }
    public static void main(String[] args) {
        Base b = new Sub();
    }
}
