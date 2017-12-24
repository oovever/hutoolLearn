package com.oovever.hutool.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author OovEver
 * @Date 2017/12/23 23:17
 */
public class StrUtilTest {
    @Test
    public void isBlankTest(){
        String blank = "	  　";
        Assert.assertTrue(StrUtil.isBlank(blank));
    }

    public static void main(String[] args) {
        String s = "this is \\{} for {}";
        System.out.println(s.getClass());


    }
}
