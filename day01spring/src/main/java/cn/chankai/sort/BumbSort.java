package cn.chankai.sort;

/**
 * 冒泡排序
 */
public class BumbSort {

    public static int[] bumbSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {      //冒泡排序就是相邻进行比较,每一次比较都能把为排序最大数排至数组最后,共需要length - 1次排序
            for (int j = 0; j < arr.length - i - 1; j++) {  //在未排序的数组中进行排序,逐个进行比较
                if (arr[j] > arr[j+1]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }

            }

        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,9,8,99,88,23,16};
        int[] sort = bumbSort(arr);
        for (int i = 0; i < sort.length; i++) {
            System.out.println(sort[i]);

        }
    }
}
