package com.fx.design.factory;

import com.fx.design.pojo.Color;
import com.fx.design.pojo.Pet;
import com.fx.design.pojo.pet.dog.Labrador;
import com.fx.design.pojo.pet.dog.SiberianHusky;
import com.fx.design.pojo.pet.dog.ToyPoodle;
import com.fx.design.proxy.SystemOutProxy;
import com.fx.design.util.Constant;

/**
 * 描述:
 * 狗工厂
 * @author Fx
 * @create 2020-12-25 15:00
 */
public class DogFactory implements PetFactory {

    @Override
    public Pet getPet(String name, Color col) {
        Pet pet;
        switch (name) {
            case "Labrador":
                pet = new Labrador(col);
                break;
            case "SiberianHusky":
                pet = new SiberianHusky(col);
                break;
            default:
                pet = new ToyPoodle(col);
        }
        SystemOutProxy.outf("%s工厂产出%s\n", Constant.CATEGORY_DOG, pet.getFullName());
        return pet;
    }
}
