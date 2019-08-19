package com.example.java_base.algorithm;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @program: JavaSpecialityDeep
 * @author: Mr.Zerah
 * @create: 2018-10-25 22:52
 * @description: 冒泡排序
 * 冒泡排序只会操作相邻的两个数据。每次冒泡操作都会对相邻的两个元素进行比较，看是否满足大小关系要求。
 * 如果不满足就让它俩互换。一次冒泡会让至少一个元素移动到它应该在的位置，重复n 次，
 * 就完成了 n 个数据的排序工作。
 **/
public class BubbleSort {

    /**
     *  普通版
     * @param arr
     * @param n
     */
    public void bubbleSort1(Integer[] arr, int n) {
        int a =0;
        //1.双重for循环。(外循环控制轮数)
        for(int i=0; i< n-1; ++i){
            //2.指定轮数和次数（内循环控制次数）
            for(int j=0; j < n-1; ++j){
                //3.判断是否符合标准。如果符合标准交换位置。
                //从小到大排列顺滑，如果前面的比后面的大，那么交换位置。
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.println(JSON.toJSONString(arr) + a++);
            }
        }
    }


    /**
     * 每轮比较少比较一次。（每一轮都会比较出一个最大值，然后后一轮没有必要再比较了，所以没比较一轮，就少比较一次。。。）
     * @param arr
     * @param n
     */
    public void bubbleSort2(Integer[] arr, int n) {
        int a =0;
        //1.双重for循环。(外循环控制轮数)
        for(int i=0; i< n-1; ++i){
            //2.指定轮数和次数（内循环控制次数）
            for(int j=0; j < n-i-1; ++j){
                //3.判断是否符合标准。如果符合标准交换位置。
                //从小到大排列顺滑，如果前面的比后面的大，那么交换位置。
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.println(JSON.toJSONString(arr) + a++);
            }
        }
    }

    /**
     * 终极版
     * @param arr
     * @param n
     */
    public void bubbleSort3(Integer[] arr, int n) {
        int a = 0;
        //如果只有一个元素就不用排序了
        if (n <= 1){
            return;
        }
        for (int i = 0; i < n; ++i) {
            // 提前退出冒泡循环的标志位,即一次比较中没有交换任何元素，这个数组就已经是有序的了
            boolean flag = false;
            //此处你可能会疑问的j<n-i-1，因为冒泡是把每轮循环中较大的数飘到后面，
            // 数组下标又是从0开始的，i下标后面已经排序的个数就得多减1，总结就是i增多少，j的循环位置减多少
            for (int j = 0; j < n - i - 1; ++j) {
                //即这两个相邻的数是逆序的，交换
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
                System.out.println(JSONObject.toJSONString(arr) + a++);
            }
            if (!flag){
                break;//没有数据交换，数组已经有序，退出排序
            }
        }
    }



    public static void main(String[] args) {
        Integer arr[] = {2, 4, 7, 6, 8, 5, 9};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort1(arr, arr.length);
    }
}