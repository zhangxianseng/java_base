package com.example.java_base.reflect;

import java.lang.reflect.Field;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2019/5/24 17:54
 */
public class ReflectTest {
    public static void main(String [] args){
        //1、加载类 ，指定类的完全限定名：包名+类名
        Class c1 = null;
        try {
            c1 = Class.forName("com.example.java_base.reflect.Animal");
            System.out.println(c1);//打印c1，发现值和字节码中的类的名称一样
            Animal animal = (Animal)c1.newInstance();
            Field[] fields = c1.getDeclaredFields();
            for(Field field :fields){
                //System.out.println(field + "##########" + field.getType());
                if(field.getType().equals(String.class)){
                    String name = (String)field.get(animal);
                    System.out.println(name);
                }
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }


    }
}
