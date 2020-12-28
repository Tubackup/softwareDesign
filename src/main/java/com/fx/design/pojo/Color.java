package com.fx.design.pojo;

/**
 * 描述:
 * 颜色享元抽象类
 *
 * @author Fx
 * @create 2020-12-25 12:46
 */
public abstract class Color {
    protected int useNum = 0;

    /**
     * 获取使用次数
     * @return 次数
     */
    public int getUseNum() {
        return useNum;
    }

    /**
     * 添加使用次数
     */
    public abstract void addUseNum();

    /**
     * 获取颜色
     * @return 颜色
     */
    public abstract String getCol();
}
