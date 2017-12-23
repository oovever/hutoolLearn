package com.oovever.hutool.clone;

/**
 * @Author OovEver
 * @Date 2017/12/23 22:53
 * 克隆接口
 * @param <T> 克隆的类型
 */
public interface Cloneable<T> extends java.lang.Cloneable {
    /**
     * 克隆当前对象，浅复制
     * @return 克隆后的对象
     */
    T clone();
}
