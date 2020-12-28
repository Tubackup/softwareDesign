package com.fx.design.util;

import com.fx.design.flyweight.ColorFlyweightFactory;
import com.fx.design.pojo.Color;
import com.fx.design.pojo.Pet;
import com.fx.design.singleton.SystemInScanner;

import java.lang.reflect.Constructor;
import java.util.List;

/**
 * 描述:
 *
 * @author Fx
 * @create 2020-12-26 15:50
 */
public class ShopUtil {

    public static Pet buyPet(List<Pet> pets) {
        System.out.println("\n目前有以下" + Constant.NAME + "：");
        String petListStr = getPetListStr(pets, false);
        int size = pets.size();
        while (true) {
            System.out.print(petListStr);
            System.out.printf("%d：%s", size + 1, "返回上层");
            System.out.print("\n\n请选择购买哪个：");
            int i = SystemInScanner.getInstance().nextInt() - 1;
            if (i < size) {
                Pet pet = pets.get(i);
                Pet customPet = getCustomPet(pet);
                if (null != customPet) {
                    System.out.printf("您的%s购买成功", customPet.getFullName());
                    ConsoleUtil.pause();
                    return customPet;
                }
                break;

            } else if (i == size) {
                break;
            } else {
                System.out.println("输入有误，请重新输入");
            }
        }
        return null;
    }

    public static void showPet(List<Pet> pets) {
        System.out.println("\n目前有以下" + Constant.NAME + "：");
        String petListStr = getPetListStr(pets, false);
        while (true) {
            System.out.print(petListStr);
            int size = pets.size();
            System.out.printf("%d：%s", size + 1, "返回上层");
            System.out.print("\n\n请选择浏览哪个：");
            int i = SystemInScanner.getInstance().nextInt() - 1;
            if (i < size) {
                Pet pet = pets.get(i);
                System.out.println(pet.getAttribute());
                ConsoleUtil.pause();
            } else if (i == size) {
                break;
            } else {
                System.out.println("输入有误，请重新输入");
            }
        }
    }

    private static Pet getCustomPet(Pet pet) {
        Pet currentPet = null;
        System.out.println("本店" + Constant.NAME + "支持任意颜色定制，请输入您想要的颜色：");
        Color color = ColorFlyweightFactory.getColor(SystemInScanner.getInstance().next());
        try {
            Constructor<? extends Pet> constructor = pet.getClass().getDeclaredConstructor(Color.class);
            currentPet = constructor.newInstance(color);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return currentPet;
    }

    private static String getPetListStr(List<Pet> pets, boolean fullName) {
        StringBuilder builder = new StringBuilder();
        int size = pets.size();
        for (int i = 1; i <= size; i++) {
            Pet pet = pets.get(i - 1);
            builder.append(String.format("%d：%s%n", i, fullName ? pet.getFullName() : pet.getName()));
        }
        return builder.toString();
    }
}
