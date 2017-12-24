package com.oovever.hutool.exceptions;

import com.oovever.hutool.util.ExceptionUtil;


/**
 * @Author OovEver
 * @Date 2017/12/24 17:19
 */
public class UtilException extends RuntimeException {
    private static final long serialVersionUID = 8247610319171014183L;
    public UtilException(Throwable e) {
        super(ExceptionUtil.getMessage(e), e);
    }
}
