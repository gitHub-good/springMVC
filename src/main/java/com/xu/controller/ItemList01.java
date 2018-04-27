package com.xu.controller;

import com.xu.po.Items;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 处理器的开发（HttpRequestHandlerAdapter适配器）
 * 处理器必须实现HttpRequestHandler接口
 */
public class ItemList01 implements HttpRequestHandler {
    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Items> itemsList = new ArrayList<>();
        Items items = new Items();
        items.setName("雷神笔记本");
        items.setPrice(8000f);
        items.setDetail("16G内存 显卡为1050");
        itemsList.add(items);
        request.setAttribute("itemsList",itemsList);
        request.getRequestDispatcher("/WEB-INF/jsp/itemsList.jsp").forward(request,response);
    }
}
