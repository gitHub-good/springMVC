package com.xu.controller;

import com.xu.po.Items;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * 处理器的开发（注解开发Handler）
 * 处理器必须实现Controller接口
 */

@Controller
public class ItemList02 {
    @RequestMapping("/itemsList.action")
    public ModelAndView itemsList() throws Exception{
        // 商品列表
        List<Items> itemsList = new ArrayList<Items>();

        Items items_1 = new Items();
        items_1.setName("联想笔记本");
        items_1.setPrice(6000f);
        items_1.setDetail("ThinkPad T430 联想笔记本电脑！");

        Items items_2 = new Items();
        items_2.setName("苹果手机");
        items_2.setPrice(5000f);
        items_2.setDetail("iphone6苹果手机！");

        itemsList.add(items_1);
        itemsList.add(items_2);



        //创建ModelAndView准备填充数据，设置视图
        ModelAndView modelAndView = new ModelAndView();
        //addObject()使用方法与setAttribute()一样,填充数据
        modelAndView.addObject("itemsList",itemsList);
        //指定视图
        modelAndView.setViewName("WEB-INF/jsp/itemsList.jsp");
        return modelAndView;

    }
}
