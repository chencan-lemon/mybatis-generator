package com.chencan.collection.map;


import java.util.*;

public class S01_HashMap {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);

        //遍历
        Set<String> keys = map.keySet();
        for(String key : keys) {
            System.out.println(key + "--->" + map.get(key));
        }

        //只获取map的值
        Collection<Integer> values = map.values();
        for (int val : values) {
            System.out.print(val + " ");
        }

        //迭代器
        Set<String> keys2 = map.keySet();
        Iterator<String> iterator = keys2.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + "--->" + map.get(key));
        }

        //Map.Entry
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();//每一个实体
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }
    }
}
