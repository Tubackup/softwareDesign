package com.fx.design.flyweight;

import com.fx.design.pojo.Color;
import com.fx.design.pojo.color.MyColor;
import com.fx.design.proxy.SystemOutProxy;

import java.util.HashMap;

/**
 * 描述:
 * 颜色享元工厂
 *
 * @author Fx
 * @create 2020-12-25 14:03
 */
public class ColorFlyweightFactory {
    private static final HashMap<String, Color> COLOR_HASH_MAP = new HashMap<>();

    public static Color getColor(String col) {
        Color color;
        String msg;
        if (COLOR_HASH_MAP.containsKey(col)) {
            msg = "目前享元池已有“" + col + "”，直接提取";
            color = COLOR_HASH_MAP.get(col);
            color.addUseNum();
        } else {
            msg = "目前享元池暂无“" + col + "”，进行创建";
            color = new MyColor(col);
            color.addUseNum();
            COLOR_HASH_MAP.put(col, color);
        }
        SystemOutProxy.out(msg);
        return color;
    }
}
