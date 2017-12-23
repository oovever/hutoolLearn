package com.oovever.hutool.util;

/**
 * 字符串工具类
 * @Author OovEver
 * @Date 2017/12/23 22:59
 */
public class StrUtil {
    public static final int INDEX_NOT_FOUND = -1;

    public static final char C_SPACE = ' ';
    public static final char C_TAB = '	';
    public static final char C_DOT = '.';
    public static final char C_SLASH = '/';
    public static final char C_BACKSLASH = '\\';
    public static final char C_CR = '\r';
    public static final char C_LF = '\n';
    public static final char C_UNDERLINE = '_';
    public static final char C_COMMA = ',';
    public static final char C_DELIM_START = '{';
    public static final char C_DELIM_END = '}';
    public static final char C_BRACKET_START = '[';
    public static final char C_BRACKET_END = ']';
    public static final char C_COLON = ':';

    public static final String SPACE = " ";
    public static final String TAB = "	";
    public static final String DOT = ".";
    public static final String DOUBLE_DOT = "..";
    public static final String SLASH = "/";
    public static final String BACKSLASH = "\\";
    public static final String EMPTY = "";
    public static final String CR = "\r";
    public static final String LF = "\n";
    public static final String CRLF = "\r\n";
    public static final String UNDERLINE = "_";
    public static final String COMMA = ",";
    public static final String DELIM_START = "{";
    public static final String DELIM_END = "}";
    public static final String BRACKET_START = "[";
    public static final String BRACKET_END = "]";
    public static final String COLON = ":";

    public static final String HTML_NBSP = "&nbsp;";
    public static final String HTML_AMP = "&amp";
    public static final String HTML_QUOTE = "&quot;";
    public static final String HTML_LT = "&lt;";
    public static final String HTML_GT = "&gt;";

    public static final String EMPTY_JSON = "{}";
    // ------------------------------------------------------------------------ Blank

    /**
     * charSequence是一个接口，表示char值的一个可读序列。此接口对许多不同种类的char序列提供统一的自读访问。此接口不修改该equals和hashCode方法的常规协定，因此，通常未定义比较实现 CharSequence 的两个对象的结果。他有几个实现类：CharBuffer、String、StringBuffer、StringBuilder。
     *  字符串是否为空白 空白的定义如下： <br>
     * 1、为null <br>
     * 2、为不可见字符（如空格）<br>
     * 3、""<br>
     * @param str 被检测字符串
     * @return 字符串是否为空
     */
    public static boolean isBlank(CharSequence str) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return true;
        }
        for(int i=0;i<length;i++) {
            // 只要有一个非空字符即为非空字符串
            if (false==NumberUtil.isBlankChar(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
