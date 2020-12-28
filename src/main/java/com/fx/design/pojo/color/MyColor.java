package com.fx.design.pojo.color;

import com.fx.design.pojo.Color;

/**
 * 描述:
 *  颜色
 * @author Fx
 * @create 2020-12-25 13:48
 */
public class MyColor extends Color {

    protected final String col;

    public MyColor(String col) {
        this.col = col;
    }

    @Override
    public void addUseNum()  {
        this.useNum++;
    }

    @Override
    public String getCol() {
        return col;
    }
}
