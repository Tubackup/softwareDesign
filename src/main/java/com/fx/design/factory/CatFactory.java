package com.fx.design.factory;

import com.fx.design.pojo.Color;
import com.fx.design.pojo.Pet;
import com.fx.design.pojo.pet.cat.Persian;
import com.fx.design.pojo.pet.cat.Ragdoll;
import com.fx.design.pojo.pet.cat.Shorthair;
import com.fx.design.proxy.SystemOutProxy;
import com.fx.design.util.Constant;

/**
 * 描述:
 * 猫工厂
 * @author Fx
 * @create 2020-12-25 15:00
 */
public class CatFactory implements PetFactory {

    @Override
    public Pet getPet(String name, Color col) {
        Pet pet;
        switch (name) {
            case "Ragdoll":
                pet = new Ragdoll(col);
                break;
            case "Shorthair":
                pet = new Shorthair(col);
                break;
            default:
                pet = new Persian(col);
        }
        SystemOutProxy.outf("%s工厂产出%s\n", Constant.CATEGORY_CAT, pet.getFullName());
        return pet;
    }
}
