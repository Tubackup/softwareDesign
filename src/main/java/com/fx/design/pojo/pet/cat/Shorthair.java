package com.fx.design.pojo.pet.cat;

import com.fx.design.pojo.Color;
import com.fx.design.pojo.pet.AbstractCat;

/**
 * 描述:
 * 中华田园猫
 *
 * @author Fx
 * @create 2020-12-25 13:14
 */
public class Shorthair extends AbstractCat {
    public Shorthair(Color col) {
        super(col);
    }

    @Override
    public String getName() {
        return "短毛猫";
    }

    @Override
    public String getFullName() {
        return col.getCol() + "的" + getName();
    }

    @Override
    public String getAttribute() {
        return "名称：" + getName() +
                "\n颜色：" + col.getCol() +
                "\n特点：天性良善、随和、在家庭中很受欢迎。它们耐受小孩子，可以表现得十分沉着冷静。母猫往往比公猫更加活泼，而公猫性格往往更加随和。总体上看，它们非常聪明，并对周边事物都很感兴趣。";
    }
}
