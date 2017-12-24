package com.oovever.hutool.util;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @Author OovEver
 * @Date 2017/12/24 17:38
 */
public class ArrayUtilTest {
    @Test
    public void toStringTest() {
        int[][] keys = {{1, 3, 2}, {4}};
        System.out.println(ArrayUtil.toString(keys));
    }

}