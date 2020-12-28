package com.fx.design;

import com.fx.design.factory.CatFactory;
import com.fx.design.factory.DogFactory;
import com.fx.design.factory.PetFactory;
import com.fx.design.flyweight.ColorFlyweightFactory;
import com.fx.design.pojo.Pet;
import com.fx.design.proxy.SystemOutProxy;
import com.fx.design.singleton.SystemInScanner;
import com.fx.design.util.ConsoleUtil;
import com.fx.design.util.Constant;
import com.fx.design.util.ShopUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 描述:
 *
 * @author Fx
 * @create 2020-12-25 12:26
 */
public class Main {
    /**
     * 库存
     */
    private final static Map<String, List<Pet>> PET_MAP = new HashMap<>();
    /**
     * 本次已购买清单
     */
    private final static List<Pet> PURCHASED_LIST = new ArrayList<>();

    /**
     * 类别列表
     */
    private static List<String> CATEGORY_LIST;


    public static void main(String[] args) {
        // 初始化
        init();
        main:
        while (true) {
            System.out.println("\n欢迎光临 “学号姓名” 的" + Constant.NAME + "店");
            System.out.println("1：浏览" + Constant.NAME + "");
            System.out.println("2：购买" + Constant.NAME + "");
            System.out.println("3：查看已购买" + Constant.NAME + "");
            System.out.println("4：离开");
            System.out.print("\n请选择：");
            switch (SystemInScanner.getInstance().nextInt()) {
                case 1:
                    ShopUtil.showPet(getSelectPets());
                    break;
                case 2:
                    Pet customPet = ShopUtil.buyPet(getSelectPets());
                    if (customPet != null) {
                        // 加入已购买清单
                        PURCHASED_LIST.add(customPet);
                    }
                    break;
                case 3:
                    System.out.print(showPurchasedList());
                    ConsoleUtil.pause();
                    break;
                case 4:
                    System.out.print(showPurchasedList());
                    System.out.println("欢迎下次光临");
                    break main;
                default:
                    System.out.println("选择无效");
                    break;
            }
        }
    }

    private static String showPurchasedList() {
        StringBuilder builder = new StringBuilder();
        if (PURCHASED_LIST.size() == 0) {
            builder.append("没有购买" + Constant.NAME + "\n");
        } else {
            builder.append("已购买如下" + Constant.NAME + "：\n");
            for (Pet pet : PURCHASED_LIST) {
                builder.append(pet.getFullName()).append("\n");
            }
        }
        return builder.toString();
    }


    private static void init() {
        List<Pet> cats = new ArrayList<>();
        List<Pet> dogs = new ArrayList<>();

        // 首次开店进货
        // 猫工厂进猫
        PetFactory catFactory = new CatFactory();
        Pet catPersian = catFactory.getPet("Persian", ColorFlyweightFactory.getColor("白色"));
        Pet catRagdoll = catFactory.getPet("Ragdoll", ColorFlyweightFactory.getColor("黑色"));
        Pet catShorthair = catFactory.getPet("Shorthair", ColorFlyweightFactory.getColor("灰色"));
        cats.add(catPersian);
        cats.add(catRagdoll);
        cats.add(catShorthair);
        PET_MAP.put(Constant.CATEGORY_CAT, cats);
        // 狗工厂进狗
        PetFactory dogFactory = new DogFactory();
        Pet dogLabrador = dogFactory.getPet("Labrador", ColorFlyweightFactory.getColor("灰色"));
        Pet dogSiberianHusky = dogFactory.getPet("SiberianHusky", ColorFlyweightFactory.getColor("白色"));
        Pet dogToyPoodle = dogFactory.getPet("ToyPoodle", ColorFlyweightFactory.getColor("黑色"));
        dogs.add(dogLabrador);
        dogs.add(dogSiberianHusky);
        dogs.add(dogToyPoodle);
        PET_MAP.put(Constant.CATEGORY_DOG, dogs);

        // 类别更新
        refreshCategoryList();
        SystemOutProxy.out("初始化成功");
        ConsoleUtil.pause();
    }

    private static void refreshCategoryList() {
        CATEGORY_LIST = new ArrayList<>(PET_MAP.keySet());
    }

    private static List<Pet> getSelectPets() {
        System.out.println("目前有以下几类" + Constant.NAME + "：");
        int size = CATEGORY_LIST.size();
        for (int i = 1; i <= size; i++) {
            System.out.printf("%d：%s\n", i, CATEGORY_LIST.get(i - 1));
        }
        while (true) {
            System.out.print("请选择：");
            int i = SystemInScanner.getInstance().nextInt() - 1;
            if (i < size) {
                return PET_MAP.get(CATEGORY_LIST.get(i));
            } else {
                System.out.print("输入无效，");
            }
        }

    }

}
