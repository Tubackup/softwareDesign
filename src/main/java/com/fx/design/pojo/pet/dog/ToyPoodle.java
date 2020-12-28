package com.fx.design.pojo.pet.dog;

import com.fx.design.pojo.Color;
import com.fx.design.pojo.pet.AbstractDog;

/**
 * 描述:
 * 泰迪犬
 *
 * @author Fx
 * @create 2020-12-25 13:14
 */
public class ToyPoodle extends AbstractDog {
    public ToyPoodle(Color col) {
        super(col);
    }

    @Override
    public String getName() {
        return "泰迪犬";
    }

    @Override
    public String getFullName() {
        return col.getCol() + "的" + getName();
    }

    @Override
    public String getAttribute() {
        return "名称：" + getName() +
                "\n颜色：" + col.getCol() +
                "\n特点：哈士奇犬的典型性格为友好，温柔，警觉并喜欢交往。哈士奇犬不会呈现出护卫犬强烈的领地占有欲，不会对陌生人产生过多的怀疑，也不会攻击其它犬类。成年哈士奇犬应该具备一定程度的谨慎和威严。";
    }
}

