package tree;

import java.util.Arrays;
import java.util.Scanner;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2025/7/27 下午8:26
 **/
public class solve3 {


    public void PrintArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        str = "918273465";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
