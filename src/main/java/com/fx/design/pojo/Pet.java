package com.fx.design.pojo;

/**
 * 描述:
 * 宠物接口
 *
 * @author Fx
 * @create 2020-12-25 12:55
 */
public interface Pet {
    /**
     * 获取种类
     * @return 结果
     */
    String getCategory();
    /**
     * 获取名称
     * @return 结果
     */
    String getName();

    /**
     * 获取属性
     * @return 结果
     */
    String getAttribute();

    /**
     * 获取全程
     * @return 结果
     */
    String getFullName();
}
