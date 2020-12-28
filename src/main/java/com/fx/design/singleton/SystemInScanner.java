package com.fx.design.singleton;


import java.util.Scanner;

/**
 * 描述:
 * 单例模式
 *
 * @author Fx
 * @create 2020-12-25 20:27
 */
public class SystemInScanner {
    private final static Scanner SC = new Scanner(System.in);

    public static Scanner getInstance() {
        return SC;
    }

}
