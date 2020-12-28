package com.fx.design.pojo.pet.dog;

import com.fx.design.pojo.Color;
import com.fx.design.pojo.pet.AbstractDog;

/**
 * 描述:
 * 哈士奇
 *
 * @author Fx
 * @create 2020-12-25 13:14
 */
public class SiberianHusky extends AbstractDog {
    public SiberianHusky(Color col) {
        super(col);
    }

    @Override
    public String getName() {
        return "哈士奇";
    }

    @Override
    public String getFullName() {
        return col.getCol() + "的" + getName();
    }

    @Override
    public String getAttribute() {
        return "名称：" + getName() +
                "\n颜色：" + col.getCol() +
                "\n特点：聪明，活泼，性情优良，极易近人，是一种忠实的犬种。非常敏捷，聪明而优雅的狗，正方形结构、比例匀称，步伐有力而自信。";
    }
}

