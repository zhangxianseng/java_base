package com.example.java_base.algorithm;

public class OneSelf {


    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 6, 7,10};
        System.out.println(recursionBinarySearch(arr,7,0,arr.length-1));
        System.out.println(binarySearch(arr,7));
    }

    // 递归实现阶乘
    public static int jiecheng(int num) {
        if (num <= 1) {
            return 1;
        }
        return num * jiecheng(num - 1);
    }

    // 斐波纳契数列，又称黄金分割数列，指的是这样一个数列：1、1、2、3、5、8、13、21、……
    public static int feibolaqi(int n) {
        if (n <= 2) {
            return 1;
        }
        return feibolaqi(n - 1) + feibolaqi(n - 2);
    }

    /**
     * 使用递归的二分查找
     *title:recursionBinarySearch
     *@param arr 有序数组
     *@param key 待查找关键字
     *@return 找到的位置
     * 【二分查找要求】：1.必须采用顺序存储结构 2.必须按关键字大小有序排列
     */
    public static int recursionBinarySearch(int[] arr,int key,int low,int high){
        if(key < arr[0] || key > arr[arr.length-1] || low > high){
            return -1;
        }
        int middle = (low + high) / 2;			//初始中间位置
        if(arr[middle] > key){
            //比关键字大则关键字在左区域
            return recursionBinarySearch(arr, key,low,middle-1);
        }else if(arr[middle] < key){
            //比关键字小则关键字在右区域
            return recursionBinarySearch(arr, key,middle+1,high);
        }else {
            return middle;
        }
    }


    /**
     * * 二分查找算法 * *
     *
     * @param srcArray
     *            有序数组 *
     * @param des
     *            查找元素 *
     * @return des的数组下标，没找到返回-1
     */
    public static int binarySearch(int[] srcArray, int des){

        int low = 0;
        int high = srcArray.length-1;
        while(low <= high) {
            int middle = (low + high)/2;
            if(des == srcArray[middle]) {
                return middle;
            }else if(des <srcArray[middle]) {
                high = middle - 1;
            }else {
                low = middle + 1;
            }
        }
        return -1;
    }

}
