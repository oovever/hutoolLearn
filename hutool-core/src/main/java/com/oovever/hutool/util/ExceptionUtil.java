package com.oovever.hutool.util;

import sun.plugin.extension.ExtensionUtils;

/**
 * 异常工具类
 * @Author OovEver
 * @Date 2017/12/23 23:48
 */
public final class ExceptionUtil {
    private ExceptionUtil(){};
    /**
     * 获得完整消息，包括异常名
     *
     * @param e 异常
     * @return 完整消息
     */
    public static String getMessage(Throwable e) {
        return StrUtil.format("{}:{}", e.getClass().getSimpleName(), e.getMessage());
    }
}
