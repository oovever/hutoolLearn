package com.oovever.hutool.util;

import com.oovever.hutool.exceptions.UtilException;

import java.util.Arrays;

/**
 * 数组工具类
 * @Author OovEver
 * @Date 2017/12/23 23:52
 */
public class ArrayUtil {

    // ---------------------------------------------------------------------- isEmpty
    /**
     * 数组是否为空
     *
     * @param <T> 数组元素类型
     * @param array 数组
     * @return 是否为空
     */
    @SuppressWarnings("unchecked")
    public static <T> boolean isEmpty(final T... array) {
        return array == null || array.length == 0;
    }
    /**
     * 对象是否为数组对象
     *
     * @param obj 对象
     * @return 是否为数组对象，如果为{@code null} 返回false
     */
    public static boolean isArray(Object obj) {
        if (null == obj) {
//			throw new NullPointerException("Object check for isArray is null");
            return false;
        }
//        反射 获得类型
        return obj.getClass().isArray();
    }
    /**
     * 数组或集合转String
     *
     * @param obj 集合或数组对象
     * @return 数组字符串，与集合转字符串格式相同
     */
    public static String toString(Object obj) {
        if (null == obj) {
            return null;
        }
        if (ArrayUtil.isArray(obj)) {
            try {
                return Arrays.deepToString((Object[]) obj);
            } catch (Exception e) {
                final String className = obj.getClass().getComponentType().getName();
                switch (className) {
                    case "long":
                        return Arrays.toString((long[]) obj);
                    case "int":
                        return Arrays.toString((int[]) obj);
                    case "short":
                        return Arrays.toString((short[]) obj);
                    case "char":
                        return Arrays.toString((char[]) obj);
                    case "byte":
                        return Arrays.toString((byte[]) obj);
                    case "boolean":
                        return Arrays.toString((boolean[]) obj);
                    case "float":
                        return Arrays.toString((float[]) obj);
                    case "double":
                        return Arrays.toString((double[]) obj);
                    default:
                        throw new UtilException(e);
                }
            }
        }
        return obj.toString();
    }
}
