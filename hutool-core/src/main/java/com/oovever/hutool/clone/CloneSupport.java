package com.oovever.hutool.clone;

/**
 * 克隆支持类，提供默认的克隆方法
 * @Author OovEver
 * @Date 2017/12/24 17:58
 *  @param <T> 继承类的类型
 */
public class CloneSupport<T> implements Cloneable<T> {
    @SuppressWarnings("unchecked")
    @Override
    public T clone() {
        try {
            return (T) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new CloneRuntimeException(e);
        }
    }
}
