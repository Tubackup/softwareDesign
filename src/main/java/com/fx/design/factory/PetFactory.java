package com.fx.design.factory;

import com.fx.design.pojo.Color;
import com.fx.design.pojo.Pet;

/**
 * 描述:
 * 宠物抽象工厂
 *
 * @author Fx
 * @create 2020-12-25 14:52
 */
public interface PetFactory {
    /**
     * 获取宠物
     * @param name 宠物别名
     * @param col 颜色
     * @return 结果
     */
    Pet getPet(String name, Color col);
}
