package com.example.java_base.reflect;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashSet;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2019/5/24 17:54
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        /**
         * 使用Class类的newInstance方法(反射机制)
         */
        Class c1 = null;
        c1 = Class.forName("com.example.java_base.reflect.Animal");
        System.out.println(c1);//打印c1，发现值和字节码中的类的名称一样
        Animal animal = (Animal) c1.newInstance();
        Field[] fields = c1.getDeclaredFields();
        for (Field field : fields) {
            if (field.getType().equals(String.class)) {
                String name = (String) field.get(animal);
                System.out.println(name);
            }
        }
        /**
         * 通过构造方法的反射创建对象
         * new Animal(age,name);
         */
        Constructor constructor = Animal.class.getConstructor(String.class, int.class);
        Animal animal1 = (Animal) constructor.newInstance("cat", 5);

        /**
         * 通过成员方法的反射
         */
        Animal animal3 = new Animal();
        Method method = Animal.class.getMethod("sayName", String.class);
        System.out.println(method);
        //方法的执行
        Object response = method.invoke(animal3, "张三");
        System.out.println(response);

        String[] array = new String[]{"123", "234", "345"};
        int[] a = new int[]{1, 2, 3};
        printObaject(a);

        /**
         * set集合是无序集合，不允许有重复数据，存数据慢(需要比对每个数据的hash值是否相等)，取数据比较快
         * list集合是有序集合，允许有重复数据，存储快，取数据比较慢
         */
        Collection collection = new HashSet();
        Animal a1 = new Animal("11", 1);
        Animal a2 = new Animal("22", 2);
        Animal a3 = new Animal("11", 1);
        Animal a4 = new Animal("11", 1);

        collection.add(a1);
        collection.add(a2);
        collection.add(a3);
        collection.add(a4);

        System.out.println(collection.size());
        a1.name = "13";

        collection.remove(a1);
        System.out.println(collection.size());

    }

    /**
     * 通过反射拿到对象中的成员变量
     * eg.可以反射拿到框架中的配置文件
     *
     * @throws Exception
     */
    public void getFieldObj() throws Exception {
        //1、加载类 ，指定类的完全限定名：包名+类名
        Class c1 = Class.forName("com.example.java_base.reflect.Animal");
        System.out.println(c1);//打印c1，发现值和字节码中的类的名称一样
        Animal animal = (Animal) c1.newInstance();
        Field[] fields = c1.getDeclaredFields();
        for (Field field : fields) {
            //System.out.println(field + "##########" + field.getType());
            if (field.getType().equals(String.class)) {
                String name = (String) field.get(animal);
                System.out.println(name);
            }
        }

        // 使用Constructor类的newInstance方法(反射机制)
        Constructor<Animal> constructor = Animal.class.getConstructor(String.class);

        constructor.newInstance("张三");
    }


    public void field() throws Exception {
        /**
         * 通过成员变量的反射
         */
        Animal animal2 = new Animal("dog", 3);
        Field fieldName = animal2.getClass().getField("name");
        System.out.println("fieldName=" + fieldName);
        Object name = fieldName.get(fieldName.toString());
        System.out.println("name=" + name);
    }

    /**
     * 数组的反射
     *
     * @param obj
     */
    public static void printObaject(Object obj) {
        Class clazz = obj.getClass();
        if (clazz.isArray()) {
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                System.out.println(Array.get(obj, i));
            }
        } else {
            System.out.println(obj);
        }

    }

}