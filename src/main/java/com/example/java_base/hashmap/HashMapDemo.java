package com.example.java_base.hashmap;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2019/6/21 14:56
 */
public class HashMapDemo {

    private String name;
    private String age;

    public static void main(String[] args){
        Map<String,String> mapStr = new HashMap<>();
        mapStr.put("4","姓名");
        mapStr.put("5","年龄");
        String data = JSON.toJSONString(mapStr);
        System.out.println(data);


        System.out.println("=======================================");


        String s ="{\"语文1\":1,\"语文2\":2,\"语文3\":3}";
        JSONObject jsonObj = JSON.parseObject(s);
        System.out.println(jsonObj);
        Object strObj = jsonObj.get("语文1");
        System.out.println(strObj);

        String str="[{\"数学1\":1,\"数学2\":2},{\"英语1\":1,\"英语2\":2}]";
        JSONArray array = JSONArray.parseArray(str);
        System.out.println(array);


    }

}
