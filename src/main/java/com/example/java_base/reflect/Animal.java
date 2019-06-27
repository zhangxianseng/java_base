package com.example.java_base.reflect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2019/5/24 17:53
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Animal {
    public String name ="Dog";
    public int   age  =30 ;

    //公开 方法  返回类型和参数均有
    public String sayName(String name){
        return "Hello,"+name;
    }

}
