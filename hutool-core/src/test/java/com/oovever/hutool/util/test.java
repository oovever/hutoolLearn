package com.oovever.hutool.util;

        import java.util.Arrays;

/**
 * @Author OovEver
 * @Date 2017/12/24 17:31
 */
public class test {

    public static void main(String[] args) {

        int a[] = {1, 2, 3};
        System.out.println(Arrays.toString(a));
        int b[][] = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.deepToString(b));
    }
}
