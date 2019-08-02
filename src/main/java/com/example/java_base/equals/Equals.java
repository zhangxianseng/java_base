package com.example.java_base.equals;

import java.util.Objects;

/**
 * @author zzq 2019/7/25 15:30
 * @description
 */
public class Equals {
    private String id;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Equals(String id,String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equals)) return false;
        Equals equals = (Equals) o;
        return Objects.equals(getId(), equals.getId()) &&
                Objects.equals(getName(), equals.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getName());
    }

    @Override
    public String toString() {
        return "Equals{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
