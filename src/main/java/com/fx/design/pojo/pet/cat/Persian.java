package com.fx.design.pojo.pet.cat;

import com.fx.design.pojo.Color;
import com.fx.design.pojo.pet.AbstractCat;

/**
 * 描述:
 * 波斯猫
 *
 * @author Fx
 * @create 2020-12-25 13:14
 */
public class Persian extends AbstractCat {
    public Persian(Color col) {
        super(col);
    }

    @Override
    public String getName() {
        return "波斯猫";
    }

    @Override
    public String getFullName() {
        return col.getCol() + "的" + getName();
    }

    @Override
    public String getAttribute() {
        return "名称：" + getName() +
                "\n颜色：" + col.getCol() +
                "\n特点：波斯猫甜美、温柔，它们喜欢安定的环境，并且喜欢被温柔的对待。它们不爱动、不爱玩耍、安静，主要靠它们的大眼睛来交流。它们不会过多地需要人的关注，能在家中独处，胆子比较小";
    }
}
