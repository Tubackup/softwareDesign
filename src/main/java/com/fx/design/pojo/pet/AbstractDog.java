package com.fx.design.pojo.pet;

import com.fx.design.pojo.AbstractAnimal;
import com.fx.design.pojo.Color;
import com.fx.design.pojo.Pet;
import com.fx.design.proxy.SystemOutProxy;
import com.fx.design.util.Constant;

/**
 * 描述:
 *  狗
 * @author Fx
 * @create 2020-12-25 13:01
 */
public abstract class AbstractDog extends AbstractAnimal implements Pet {
    public AbstractDog(Color col) {
        super(col);
        SystemOutProxy.outf("%s有颜色了，桥接颜色：%s\n",getName(),col.getCol());
    }
    @Override
    public String getCategory() {
        return Constant.CATEGORY_DOG;
    }
}
