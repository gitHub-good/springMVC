package com.xu.controller;

import com.xu.po.Items;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * 处理器的开发（Controller控制器）
 * 处理器必须实现Controller接口
 */
public class ItemList implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<Items> itemsList = new ArrayList<>();
        Items items = new Items();
        items.setName("雷神笔记本");
        items.setPrice(8000f);
        items.setDetail("16G内存 显卡为1050");
        itemsList.add(items);

        //创建ModelAndView准备填充数据，设置视图
        ModelAndView modelAndView = new ModelAndView();
        //addObject()使用方法与setAttribute()一样,填充数据
        modelAndView.addObject("itemsList",itemsList);
        //指定视图
        modelAndView.setViewName("WEB-INF/jsp/itemsList.jsp");
        return modelAndView;
    }
}
