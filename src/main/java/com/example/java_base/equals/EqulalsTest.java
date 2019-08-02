package com.example.java_base.equals;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author zzq 2019/7/25 13:20
 * @description
 */
public class EqulalsTest {
    public static void main(String[] args) {
        Equals a1 =  new Equals("11","2");
        Equals a2 =  new Equals("11","2");

        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));


        String s1 = new String("222");
        String s2 = new String("222");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        //Equals a1 = new Equals("11","11");
        //Equals a2 = new Equals("11","11");

        System.out.println(a1.equals(a2));

        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());

        Collection map = new HashSet();
        map.add(a1);
        map.add(a2);
        System.out.println(map);


    }

}
