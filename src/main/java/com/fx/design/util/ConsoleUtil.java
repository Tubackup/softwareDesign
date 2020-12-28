package com.fx.design.util;

/**
 * 描述:
 *
 * @author Fx
 * @create 2020-12-25 19:31
 */
public class ConsoleUtil {
    public static void startAnnotation() {
        System.out.print("\033[37;3m");
    }

    public static void endAnnotation() {
        System.out.print("\033[30;0m");
    }

    public static void pause() {
        System.out.println("按任意键继续");
        try {
            System.in.read();
        } catch (Exception ignored) {
        }
    }
}
