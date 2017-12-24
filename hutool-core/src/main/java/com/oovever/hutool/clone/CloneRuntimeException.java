package com.oovever.hutool.clone;

import com.oovever.hutool.util.ExceptionUtil;
import com.oovever.hutool.util.StrUtil;
import org.omg.CORBA.LongSeqHelper;
import sun.plugin.extension.ExtensionUtils;

/**
 * @Author OovEver
 * @Date 2017/12/23 22:55
 */
public class CloneRuntimeException extends RuntimeException {
    private static final long serialVersionUID = 6774837422188798989L;
    public CloneRuntimeException(Throwable e) {
        //ExceptionUtil.getMessage(e) 异常
        //e 原因
        super(ExceptionUtil.getMessage(e), e);
    }
    public CloneRuntimeException(String message) {
        super(message);
    }
    public CloneRuntimeException(String messageTemplate, Object... params) {
        super(StrUtil.format(messageTemplate, params));
    }
    public CloneRuntimeException(String message, Throwable throwable) {
        super(message, throwable);
    }
    public CloneRuntimeException(Throwable throwable, String messageTemplate, Object... params) {
        super(StrUtil.format(messageTemplate, params), throwable);
    }
}
