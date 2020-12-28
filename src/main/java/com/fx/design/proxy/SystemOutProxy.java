package com.fx.design.proxy;

import com.fx.design.util.ConsoleUtil;

import java.io.PrintStream;


/**
 * 描述:
 * 输出代理
 *
 * @author Fx
 * @create 2020-12-26 15:36
 */
public class SystemOutProxy {
    private final static PrintStream OUT = System.out;

    public static void out(Object param) {
        ConsoleUtil.startAnnotation();
        OUT.println(param);
        ConsoleUtil.endAnnotation();
    }

    public static void outf(String format, Object... args) {
        ConsoleUtil.startAnnotation();
        OUT.printf(format, args);
        ConsoleUtil.endAnnotation();
    }
}
