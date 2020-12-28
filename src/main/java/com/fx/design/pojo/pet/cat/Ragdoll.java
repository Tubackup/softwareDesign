package com.fx.design.pojo.pet.cat;

import com.fx.design.pojo.Color;
import com.fx.design.pojo.pet.AbstractCat;

/**
 * 描述:
 * 布偶猫
 *
 * @author Fx
 * @create 2020-12-25 13:14
 */
public class Ragdoll extends AbstractCat {
    public Ragdoll(Color col) {
        super(col);
    }

    @Override
    public String getName() {
        return "布偶猫";
    }

    @Override
    public String getFullName() {
        return col.getCol() + "的" + getName();
    }

    @Override
    public String getAttribute() {
        return "名称：" + getName() +
                "\n颜色：" + col.getCol() +
                "\n特点：布偶猫放松、开心、就像小孩子的玩偶一样。它们友爱、安静、看起来比较懒散。它们不是很活跃、也不太爱叫。布偶猫以它们的忍受力著称，它们能忍受穿上衣服，并且被抱着走动，不会反抗。因为它们的友好和聪慧，它们经常被拿到与狗进行类比。";
    }
}
