package com.fx.design.pojo.pet.dog;

import com.fx.design.pojo.Color;
import com.fx.design.pojo.pet.AbstractDog;

/**
 * 描述:
 * 拉布拉多
 *
 * @author Fx
 * @create 2020-12-25 13:14
 */
public class Labrador extends AbstractDog {
    public Labrador(Color col) {
        super(col);
    }

    @Override
    public String getName() {
        return "拉布拉多";
    }

    @Override
    public String getFullName() {
        return col.getCol() + "的" + getName();
    }

    @Override
    public String getAttribute() {
        return "名称：" + getName() +
                "\n颜色：" + col.getCol() +
                "\n特点：性情温和，非常敏捷。鼻子长得很美观，嘴唇皮肤细腻；喜欢水。适应性强，可作为忠诚家庭伴侣犬。聪明，热情而温顺，具有强烈的取悦人的愿望。生性温和，无进攻的迹象或者过于害羞。";
    }
}

