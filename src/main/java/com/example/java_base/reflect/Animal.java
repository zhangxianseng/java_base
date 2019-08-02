package com.example.java_base.reflect;

import lombok.Data;

import java.util.Objects;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2019/5/24 17:53
 */
@Data
public class Animal {
    public String name;
    public int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name) {
        this.name = name;
    }

    //公开 方法  返回类型和参数均有
    public String sayName(String name){
        return "Hello,"+name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        if (!super.equals(o)) return false;
        Animal animal = (Animal) o;
        return getAge() == animal.getAge() &&
                Objects.equals(getName(), animal.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getName(), getAge());
    }
}
