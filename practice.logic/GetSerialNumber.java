package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author twinkle
 * @描述: 两个数组，一个限制取的个数，一个是数据源，即a数组中的值为限制，取数组值个b数组的连续的数字，否则为空
 * @作者: 冯烁
 * @日期: 2021/10/28 下午 03:20
 */
public class test2 {
    public static void main(String[] args) {
        // 定义一个数据数组
        Integer[] datas = {9,10,11,13,14,18,20,25,26,27,28,30};
        // 定义一个限度数组
        Integer[] limits = {3,4,5};
        // 循环遍历得到每个限制条件
        for (Integer limit : limits){
            // 创建一个列表用来存储数组
            List<List<Integer>> list = new ArrayList<>();
            // 循环每个数值
            for (Integer data : datas){
                // 创建临时存储列表
                List<Integer> temps = new ArrayList<>();
                // 循环限制条件
                for (int i = 0;i < limit;i++){
                    // 连续的数值
                    int temp = data + i;
                    // 判断连续的数值是否存在
                    if (Arrays.asList(datas).contains(temp)){
                        // 存在加入临时列表
                        temps.add(temp);
                    }else {
                        // 不存在跳出循环
                        break;
                    }
                }
                // 判断临时列表的长度是否满足条件
                if (temps.size() == limit){
                    // 是，则将临时列表存储到列表中
                    list.add(temps);
                }
            }
            System.out.println("当限制条件为 " + limit + " 个时，则可以获取到的数据为：");
            for (List<Integer> arr : list){
                System.out.println(arr.toString());
            }
        }
    }
}
