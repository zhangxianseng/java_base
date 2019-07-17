package com.example.java_base.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2019/5/24 17:54
 */
public class ReflectTest {
    public static void main(String [] args){
        //使用Class类的newInstance方法(反射机制)
        Class c1 = null;
        try {
            c1 = Class.forName("com.example.java_base.reflect.Animal");
            System.out.println(c1);//打印c1，发现值和字节码中的类的名称一样
            Animal animal = (Animal)c1.newInstance();
            Field[] fields = c1.getDeclaredFields();
            for(Field field :fields){
                if(field.getType().equals(String.class)){
                    String name = (String)field.get(animal);
                    System.out.println(name);
                }
            }

            // 使用Constructor类的newInstance方法(反射机制)
                Constructor<Animal> constructor = Animal.class.getConstructor(String.class);

                constructor.newInstance("张三");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
